/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1.Controladores;

import com.mycompany.p2c1.ReglasGram.gcic.LexerGCIC;
import com.mycompany.p2c1.ReglasGram.gcic.ParserGCIC;
import com.mycompany.p2c1.objetos.ReportError;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author sergi
 */
@WebServlet(name = "VerificarFileGCIC", urlPatterns = {"/VerificarFileGCIC"})
@MultipartConfig
public class VerificarFileGCIC extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String texto = request.getParameter("txt");
        byte[] bytes = texto.getBytes(StandardCharsets.UTF_8);
        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);;        
        try{
            boolean isParserGood = false;
            Reader inputString = new StringReader(utf8EncodedString);
            BufferedReader reader = new BufferedReader(inputString);
            LexerGCIC lexer = new LexerGCIC(reader);
            ParserGCIC parser = new ParserGCIC(lexer);
            try{
                parser.parse();
                isParserGood= true;
            }catch(Exception e){
                System.out.println("Error al parsear: " + e.getMessage());
            }
            List<ReportError> listaErrores = parser.getListaErrores();
            /*for (ReportError listaErrore : listaErrores) {
                System.out.println(listaErrore.toString());
            }*/
            if (listaErrores.size()==0 && isParserGood) {
                request.setAttribute("ID", parser.getId());               
               /* request.setAttribute("success", 1);
                request.setAttribute("mostrar", 1);                
                request.setAttribute("texto", utf8EncodedString);                
                request.getRequestDispatcher("/index.jsp").forward(request, response);*/
               //request.getRequestDispatcher("/ShowCaptcha").forward(request, response);                
                redireccionar(request,response,1,1,utf8EncodedString);
            }else{
                request.setAttribute("listaErrores", listaErrores);
                redireccionar(request,response,0,1,utf8EncodedString);
            }
        }catch(Exception e){
            System.out.println("Error -- : " + e.getMessage());            
            redireccionar(request,response,0,1,utf8EncodedString);
        }       
    }
    
    private void redireccionar(HttpServletRequest request, HttpServletResponse response, int success, int mostrar, String utf8EncodedString){
        request.setAttribute("success", success);
        request.setAttribute("mostrar", mostrar);
        request.setAttribute("texto", utf8EncodedString);              
        try{
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }catch(Exception e){
            e.printStackTrace();
        }        
    }

}
