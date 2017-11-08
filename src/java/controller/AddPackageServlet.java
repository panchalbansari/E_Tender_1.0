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
public class AddPackageServlet extends HttpServlet {

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
        String Packagename=request.getParameter("package_name");
        String packagestartdate=request.getParameter("package_date");
        int packageduration=Integer.parseInt(request.getParameter("package_duration"));
        String packagedesc=request.getParameter("package_desc");
        String packageurl=request.getParameter("package_URL");
        
        System.out.println("Package Name: "+Packagename);
        System.out.println("Package Start Date: "+packagestartdate);
               
        
         DatabaseClass dc=new DatabaseClass();
        Connection con=dc.getconnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql;
            //sql = "INSERT INTO `package` (`pkg_name`,`pkg_start_date`) VALUES ('"+Packagename+","+packagestartdate+" ');";
            sql="INSERT INTO `package` (`pkg_id`, `pkg_name`, `pkg_start_date`, `pkg_duration`, `pkg_description`, `pkg_url`) VALUES (NULL, '"+Packagename+"', '"+packagestartdate+"', '"+packageduration+"', '"+packagedesc+"', '"+packageurl+"');";
            System.out.println("Package insert0 query: - "+sql);
            int check=0;
            check=stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(addpackagesevlet_old.class.getName()).log(Level.SEVERE, null, ex);
        }
 
            if(true)
            {
                    response.sendRedirect("http://localhost:8084/E_Tender_1.0/demo/demo.geekslabs.com/materialize/v3.1/package_table.jsp");
            }
        else{
                response.sendRedirect("http://localhost:8084/E_Tender_1.0/demo/demo.geekslabs.com/materialize/v3.1/add_package_form.jsp");
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
