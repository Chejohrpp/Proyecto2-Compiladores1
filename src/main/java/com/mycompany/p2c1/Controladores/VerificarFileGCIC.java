/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1.Controladores;

import com.mycompany.p2c1.ReglasGram.gcic.LexerGCIC;
import com.mycompany.p2c1.ReglasGram.gcic.ParserGCIC;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


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
            Reader inputString = new StringReader(utf8EncodedString);
            BufferedReader reader = new BufferedReader(inputString);
            LexerGCIC lexer = new LexerGCIC(reader);
            ParserGCIC parser = new ParserGCIC(lexer);
            try{
                parser.parse();
            }catch(Exception e){
                System.out.println("Error al parsear: " + e.getMessage());
            }
            List listaErrores = parser.getListaErrores();
            List ErrorLexer = lexer.getErroresLexicos();
            for (Object listaErrore : listaErrores) {
                System.out.println(listaErrore);
            }
            for (Object object : ErrorLexer) {
                System.out.println(object);
            }
            if (listaErrores.size()==0) {
                System.out.println("Todo esta correcto");
            }
        }catch(Exception e){
            System.out.println("Error al convertir : " + e.getMessage());
        }
        request.setAttribute("texto", utf8EncodedString);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}
