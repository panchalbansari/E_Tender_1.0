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
  

  <!-- //////////////////////////////////////////////////////////////////////////// -->


  <!-- //////////////////////////////////////////////////////////////////////////// -->

  <!-- START MAIN -->
  <div id="main">
    <!-- START WRAPPER -->
    <div class="wrapper">

     
      <!-- //////////////////////////////////////////////////////////////////////////// -->

      <!-- START CONTENT -->
      <section id="content">

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
                <h5 class="breadcrumbs-title">Download_Tenders_Form</h5>
                <ol class="breadcrumbs">
                  <li><a href="index.html">Download tenders</a>
                  </li>
                  <li><a href="#">Download_tender_table</a>
                  </li>
                  <li class="active">Download_Tenders Form</li>
                </ol>
              </div>
            </div>
          </div>
        </div>
        <!--breadcrumbs end-->


        <!--start container-->
        <div class="container">
          <div class="section">

            
            <div class="divider"></div>
            <!--Basic Form-->
            <div id="basic-form" class="section">
              <div class="row">
                <div class="col s12 m12 l6">
                  <div class="card-panel">
                    <h4 class="header2">Download_tender form</h4>
                    <div class="row">
                      <form class="col s12"  action="http://localhost:8084/E_Tender_1.0/AddDownloadTenderServlet" method="get" >
                        <div class="row">

                               
              
                             <div class="input-field col s12">
                            <input id="donload_tender_path" name="donload_tender_path" type="text">
                            <label for="first_name">Downloaded tenders</label>
                            <a class="btn waves-effect waves-light blue">Browse</a>
                          </div>
              
                             
                          </div>
                        </div>
                    <%-- <p><input class="btn waves-effect waves-light blue" type="submit" value="Add"></a> --%>
                    <button type="submit"  value="Submit">Submit</button>      
                    <a class="btn waves-effect waves-light blue">Cancle</a>
                          <a class="btn waves-effect waves-light blue" href="download_tender_table.jsp">view</a></p>
                          
                      </form>
                    </div>
                  </div>
                </div>
               
      </div>
  </section>
  <!-- END CONTENT -->

  <!-- //////////////////////////////////////////////////////////////////////////// -->
  
  </div>
  <!-- END WRAPPER -->

  </div>
  <!-- END MAIN -->



  <!-- //////////////////////////////////////////////////////////////////////////// -->

 



    <!-- ================================================
    Scripts
    ================================================ -->
    
    <!-- jQuery Library -->
    <script type="text/javascript" src="js/plugins/jquery-1.11.2.min.js"></script>    
    <!--materialize js-->
    <script type="text/javascript" src="js/materialize.min.js"></script>
    <!--prism-->
    <script type="text/javascript" src="js/plugins/prism/prism.js"></script>
    <!--scrollbar-->
    <script type="text/javascript" src="js/plugins/perfect-scrollbar/perfect-scrollbar.min.js"></script>
    <!-- chartist -->
    <script type="text/javascript" src="js/plugins/chartist-js/chartist.min.js"></script>   
    
    <!--plugins.js - Some Specific JS codes for Plugin Settings-->
    <script type="text/javascript" src="js/plugins.min.js"></script>
    <!--custom-script.js - Add your own theme custom JS-->
    <script type="text/javascript" src="js/custom-script.js"></script>
    
</body>


<!-- Mirrored from demo.geekslabs.com/materialize/v3.1/form-layouts.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 12 Sep 2017 10:28:19 GMT -->
</html>
