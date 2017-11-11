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
 * @author Meet
 */
public class contactusservlet extends HttpServlet {

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
        String companyname = request.getParameter("contactusname");
        System.out.println("Name: " + companyname);
        String address = request.getParameter("address");
        System.out.println("address: " + address);
        // pincode = Long.parseLong(request.getParameter("pincode"));
        String  pincode= request.getParameter("pincode");
        System.out.println("pincode: " + pincode);
        String state = request.getParameter("state");
        System.out.println("state: " + state);
        String city = request.getParameter("city");
        System.out.println("city: " + city);
        String area = request.getParameter("area");
        System.out.println("area: " + area);
        String email = request.getParameter("email");
        System.out.println("email: " + email);
        String phone_no = request.getParameter("Phone_no");
        System.out.println("Phone_no: " + phone_no);
        String website_url = request.getParameter("website-url");
        System.out.println("website_url: " + website_url);

        DatabaseClass dc = new DatabaseClass();
        Connection con = dc.getconnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql;
            sql = "INSERT INTO `contactus` (`Company_name`, `Address`, `Pincode`, `State`, `City`, `Area`, `Email`, `Phone_no`, `Website_url`)  VALUES ('" + companyname + "', '" + address + "', '" + pincode + "', '" + state + "', '" + city + "', '" + area + "', '" + email + "', '" + phone_no + "', '" + website_url + "');";
            System.out.println("Query:" + sql);
            int check = 0;
            check = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(contactusservlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (true) {
            response.sendRedirect("http://localhost:8084/E_Tender_1.0/demo/demo.geekslabs.com/materialize/v3.1/contact_us_table.jsp");
        } else {
            response.sendRedirect("http://localhost:8084/E_Tender_1.0/demo/demo.geekslabs.com/materialize/v3.1/add_contact_us.jsp");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
