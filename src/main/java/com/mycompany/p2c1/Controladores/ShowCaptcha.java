/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p2c1.Controladores;

import com.mycompany.p2c1.Almacenamiento;
import com.mycompany.p2c1.objetos.Captcha;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sergi
 */
@WebServlet(name = "ShowCaptcha", urlPatterns = {"/ShowCaptcha"})
public class ShowCaptcha extends HttpServlet {
    private Almacenamiento almacenamiento = new Almacenamiento();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Captcha no Encontrado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>No se encontro el captcha " + request.getParameter("id") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        List<Captcha> lista = almacenamiento.getListCaptchas();
        boolean isEncontrado =  false;
        for (Captcha captcha : lista) {
            if (captcha.getId().equals(id)) {
                isEncontrado = true;
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
                    out.println("<!DOCTYPE html>");
                    out.print(captcha.getCodigoHTML());
                }
                captcha.setCantUtilizados(captcha.getCantUtilizados() + 1);
                Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
                String strDate = dateFormat.format(date);  
                captcha.setLastFecha(strDate);
                almacenamiento.setListCaptchas(lista);
                break;
            }
        }
        if (isEncontrado ==  false) {
            processRequest(request,response);
        }
    }

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
        String html = (String) request.getAttribute("texto");        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.print(html);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
