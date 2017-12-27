/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fb.api;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class myServlet extends HttpServlet {

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
       // processRequest(request, response);
       String VERIFY_TOKEN = "Shantha";
       
       if(request.getParameter("btnPost")!=null){
           String message = request.getParameter("StrPost");
           String status = Activities.makePost(message);
           
           request.setAttribute("status", status);
           request.getRequestDispatcher("/RedirectJsp.jsp").forward(request, response);
       }
       if(request.getParameter("btnGetMsg")!= null){
           String conv = Activities.getConversations();
         
           request.setAttribute("conv", conv);
           request.getRequestDispatcher("/RedirectJsp.jsp").forward(request, response);
       }
//       if(request.getParameter("btnSendMsg")!=null){
//           String msg = request.getParameter("StrMsg");
//           SendMessage.sendMsg(request.getParameter(msg));
//          
//       }
       if(request.getParameter("btnGetCmt")!=null){
           
           String cmnts = Activities.getComments();
           request.setAttribute("cmnts", cmnts);
           request.getRequestDispatcher("/RedirectJsp.jsp").forward(request, response);
           
       }
//       if(request.getParameter("hub.mode") == "subscribe" && request.getParameter("hub.token") == VERIFY_TOKEN) {
//           response.getWriter().write(request.getParameter("hub.challenge"));
//       }
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
