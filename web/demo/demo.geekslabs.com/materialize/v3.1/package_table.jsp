<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="controller.DatabaseClass"%>
<!DOCTYPE html>
<html lang="en">

<!--================================================================================
  Item Name: Materialize - Material Design Admin Template
  Version: 3.1
  Author: GeeksLabs
  Author URL: http://www.themeforest.net/user/geekslabs
================================================================================ -->

 <%@include file="saidebar.jsp" %>
<!-- Mirrored from demo.geekslabs.com/materialize/v3.1/form-layouts.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 12 Sep 2017 10:28:19 GMT -->
<head>
     
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="msapplication-tap-highlight" content="no">
  <meta name="description" content="Materialize is a Material Design Admin Template,It's modern, responsive and based on Material Design by Google. ">
  <meta name="keywords" content="materialize, admin template, dashboard template, flat admin template, responsive admin template,">
  <title>Forms Layouts | Materialize - Material Design Admin Template</title>

  <!-- Favicons-->
  <link rel="icon" href="images/favicon/favicon-32x32.png" sizes="32x32">
  <!-- Favicons-->
  <link rel="apple-touch-icon-precomposed" href="images/favicon/apple-touch-icon-152x152.png">
  <!-- For iPhone -->
  <meta name="msapplication-TileColor" content="#00bcd4">
  <meta name="msapplication-TileImage" content="images/favicon/mstile-144x144.png">
  <!-- For Windows Phone -->


  <!-- CORE CSS-->
  
  <link href="css/materialize.min.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="css/style.min.css" type="text/css" rel="stylesheet" media="screen,projection">
    <!-- Custome CSS-->    
    <link href="css/custom/custom.min.css" type="text/css" rel="stylesheet" media="screen,projection">


  <!-- INCLUDED PLUGIN CSS ON THIS PAGE -->
  <link href="js/plugins/prism/prism.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="js/plugins/perfect-scrollbar/perfect-scrollbar.css" type="text/css" rel="stylesheet" media="screen,projection">
  <link href="js/plugins/chartist-js/chartist.min.css" type="text/css" rel="stylesheet" media="screen,projection">
</head>

<body>
  
  <!-- End Page Loading -->

  <!-- //////////////////////////////////////////////////////////////////////////// -->


  <!-- //////////////////////////////////////////////////////////////////////////// -->

  <!-- START MAIN -->
  <div id="main">
    <!-- START WRAPPER -->
    <div class="wrapper">
<!--breadcrumbs start-->
        <div id="breadcrumbs-wrapper">
            <!-- Search for small screen -->
            <div class="header-search-wrapper grey hide-on-large-only">
                <i class="mdi-action-search active"></i>
                <input type="text" name="Search" class="header-search-input z-depth-2" placeholder="Explore E-tenders">
            </div>
          <div class="container">
            <div class="row">
              <div class="col s12 m12 l12">
                <h5 class="breadcrumbs-title">Package_Table</h5>
                <ol class="breadcrumbs">
                  <li><a href="index.html">Add_Package</a>
                  </li>
                  <li class=active">Package_Table
                  </li>
                </ol>
                <div class="divider"></div>
                <p><a class="btn waves-effect waves-light blue" href="add_package_form.jsp">Add_Package form</a></p>
                 
              </div>
            </div>
          </div>
        </div>
        <!--breadcrumbs end-->



                  
           <div id="borderless-table">
              
              <div class="row">
                <div class="col s12 m4 l3">
                 
                </div>
                <div class="col s12 m8 l9">
                  <table>
                  </tbody>
                    <thead>
                      <tr>
                        <th data-field="id">Pkg_id</th>
                         <th data-field="name">Pkg_Name</th>
                        <th data-field="name">Pkg_Strat_Date</th>
                        <th data-field="price">Pkg_Duration</th>
                        <th data-field="id">Pkg_description</th>
                        <th data-field="id">Pkg_url</th>
                        <th data-field="id">Op1</th>
                        <th data-field="id">Op2</th>
                      </tr>
                    </thead>
                    <%
                     DatabaseClass dc=new DatabaseClass();
                    Connection con=dc.getconnection();
                    Statement stmt = con.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT * FROM `package`");//SQl Query
                       while (rs.next()) {
                       %>
                        <tr>
                        <td><%= rs.getInt(1)%></td>
                        <td><%= rs.getString(2)%></td>
                        <td><%= rs.getString(3)%></td>
                        <td><%= rs.getString(4)%></td>
                        <td><%= rs.getString(5)%></td>
                        <td><%= rs.getString(6)%></td>
                        <td><a href="Edit_Package">Edit</td>
                        <td><a href="Delete_Package">Delete</td>
                       </tr>
                      
<%}%>
                   
                      
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
            
            <div class="divider"></div>
            
            <!--Bordered Table-->
     
      <!-- //////////////////////////////////////////////////////////////////////////// -->

  
  </div>
  <!-- END WRAPPER -->

  </div>
  <!-- END MAIN -->



  <!-- //////////////////////////////////////////////////////////////////////////// -->

 

