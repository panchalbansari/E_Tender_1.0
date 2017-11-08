package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class addpackagesevlet_old extends HttpServlet {

    /**
     * Processes requests for both HT2TP <code>GET</code> and <code>POST</code>
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
            String Packagename=request.getParameter("name1");

        DatabaseClass dc=new DatabaseClass();
        Connection con=dc.getconnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql;
            sql = "INSERT INTO `package` (`pkg_name`) VALUES ('"+Packagename+"');";
            
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
}

    