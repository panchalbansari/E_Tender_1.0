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
public class AddSucessStoryServlet extends HttpServlet {

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
       
         String Publisher_Company_image=request.getParameter("publisher_company_image");
        String ComapnyName=request.getParameter("company_name");
        String TenderImage=request.getParameter("tender_image");
        String ProjectDescription=request.getParameter("project_desc");
        String  TendererOwnerImage=request.getParameter("tenderer_oner_image");
        String  OwnerOverview=request.getParameter("owner_review");
        String  PublisherImage=request.getParameter("publisher_image");
        String  PublisherOverview=request.getParameter("publisher_overview");
        
               
        
         DatabaseClass dc=new DatabaseClass();
        Connection con=dc.getconnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            String sql;
            //sql = "INSERT INTO `package` (`pkg_name`,`pkg_start_date`) VALUES ('"+Packagename+","+packagestartdate+" ');";
            sql="INSERT INTO `sucess_story` (`publisher_company_image`, `company_name`, `tenderer_iamge`, `project_description`, `tenderer_compnay_owner_image`, `owner_image`, `publisher_image`, `publisher_overview`) VALUES ('"+Publisher_Company_image+"', '"+ComapnyName+"', '"+TenderImage+"', '"+ProjectDescription+"', '"+TendererOwnerImage+"', '"+ OwnerOverview+"', '"+PublisherImage+"','"+PublisherOverview+"');";
            System.out.println("Package insert0 query: - "+sql);
            int check=0;
            check=stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AddSucessStoryServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
 
            if(true)
            {
                    response.sendRedirect("http://localhost:8084/E_Tender_1.0/demo/demo.geekslabs.com/materialize/v3.1/sucess_story_table.jsp");
            }
        else{
                response.sendRedirect("http://localhost:8084/E_Tender_1.0/demo/demo.geekslabs.com/materialize/v3.1/add_sucess_story.jsp");
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