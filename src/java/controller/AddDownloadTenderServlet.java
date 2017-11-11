/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class AddDownloadTenderServlet extends HttpServlet {

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
         String Download_tender=request.getParameter("donload_tender_path");

        DatabaseClass dc=new DatabaseClass();
        Connection con=dc.getconnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql;
            sql = "INSERT INTO `downloadtender` (`download_tender`) VALUES ('"+Download_tender+"');";
            
            int check=0;
            check=stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AddDownloadTenderServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
 
            if(true)
            {
                    response.sendRedirect("http://localhost:8084/E_Tender_1.0/demo/demo.geekslabs.com/materialize/v3.1/download_tender_table.jsp");
            }
        else{
                response.sendRedirect("http://localhost:8084/E_Tender_1.0/demo/demo.geekslabs.com/materialize/v3.1/download_tender_form.jsp");
             }
    }
    
    

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
   
}

