/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaume.p01cs;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jaume monzonis
 */
public class tabla extends HttpServlet {

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
            out.println("<title>Servlet tabla</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ejercicio servlet</h1>");
            
            int ancho= Integer.parseInt(request.getParameter("ancho"));
            int alto= Integer.parseInt(request.getParameter("alto"));
            int i,j = 0;
            
            List<List<Integer>> array = new ArrayList<>();
               
            out.println("<table>");
            for (i=1; i < alto; i++){
             out.println("<tr>"); 
            
              
                array.add(new ArrayList <Integer>());
                
                
		    for (j=1 ; j < ancho ; j++){
		    	
                     out.println("<td>");
                     out.println(j*i);  
                     out.println("</td>");
                     array.get(i-1).add(j*i);
		  }
   
               out.println("</tr>"); 
            } 
          out.println("</table>");

             
        for (i=1 ; i < array.size() ; i++){
            for (j=0 ; j < array.get(i).size() ; j++){}
        }
             out.println(array.get(i).get(j));
            
            }
  
         out.println("</body>");
        out.println("</html>")  ;
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
        processRequest(request, response);
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
        processRequest(request, response);
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
