<%-- 
    Document   : home
    Created on : Jan 11, 2022, 10:02:33 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="keywords" content="Bootstrap, Landing page, Template, Business, Service">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="author" content="Grayrids">
        <title>Home</title>
        <!--====== Favicon Icon ======-->
        <link rel="shortcut icon" href="img/logo.png">
        <!-- Bootstrap CSS -->
        <!--        <link rel="stylesheet" href="css/bootstrap.min.css">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styleLogin.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/LineIcons.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/owl.theme.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/nivo-lightbox.css">
        <link rel="stylesheet" href="css/main.css">    
        <link rel="stylesheet" href="css/responsive.css">
    </head>
    <body>
        <!-- Header Section Start -->
        <header id="home" class="hero-area">    
            <div class="overlay">
                <span></span>
                <span></span>
            </div>
            <nav class="navbar navbar-expand-md bg-inverse fixed-top scrolling-navbar">
                <div class="container">
                    <a href="home.jsp" class="navbar-brand"><img style="
                                                                 filter: brightness(2);
                                                                 height: 100px;
                                                                 border-radius: 40%;
                                                                 " src="img/logo.png" alt=""></a>       
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="lni-menu"></i>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarCollapse">
                        <ul class="navbar-nav mr-auto w-100 justify-content-end">
                            <li class="nav-item">
                                <a class="nav-link page-scroll" href="#home">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link page-scroll" href="#services">About</a>
                            </li>  
                            <li class="nav-item">
                                <a class="nav-link page-scroll" href="#features">Achievements</a>
                            </li>   
                            <li class="nav-item">
                                <a class="nav-link page-scroll" href="#posts">Hot Posts</a>
                            </li>                           
                            <li class="nav-item">
                                <a class="nav-link page-scroll" href="#showcase">SlideShow</a>
                            </li>  
                            <li class="nav-item">
                                <a class="nav-link page-scroll" href="#blog">Blogs</a>
                            </li>  
                            <li class="nav-item">
                                <a class="nav-link page-scroll" href="#contact">Contact</a>
                            </li> 
                            <c:if test="${sessionScope.account==null}">
                                <li class="nav-item">
                                    <a class="btn btn-singin" href="#">Login</a>
                                </li>
                                <li class="nav-item">
                                    <a class="btn btn-singin" href="#">Register</a>
                                </li>
                            </c:if>
                            <c:if test="${sessionScope.account!=null}">
                                <li class="nav-item">
                                    <div class="dropdown">
                                        <img class="btn btn-singin" src="${sessionScope.account.image}" style="
                                             width: 70px;
                                             padding-bottom: 0px;
                                             padding-top: 0px;
                                             padding-right: 0px;
                                             padding-left: 0px;
                                             border-radius: 25%;
                                             transform: translateY(-15%);">
                                        <div class="dropdown-content" style="transform: translate(-7%,-5%);border-radius: 20px;">
                                            <a style="background-color: unset;color: unset;border-top-left-radius: 20px;border-top-right-radius: 20px;padding-bottom: 0px;">${sessionScope.account.fullName}</a>
                                            <a style="background-color: unset;color: unset;padding-top: 0px;padding-bottom: 0px;">${sessionScope.account.role} - ${sessionScope.account.status}</a>
                                            <a href="#">Profile</a>
                                            <a href="#">Dashboard</a>
                                            <a href="logout" style="border-bottom-left-radius: 20px;border-bottom-right-radius: 20px;">LogOut</a>
                                        </div>
                                    </div>
                                </li>
                            </c:if>

                        </ul>
                    </div>
                </div>
            </nav>  
            <div class="container">      
                <div class="row space-100">
                    <div class="col-lg-6 col-md-12 col-xs-12">
                        <div class="contents">
                            <h2 class="head-title">WorkflowBOX</h2>
                            <p>This web is a project management web for your company in the most professional and convenient way</p>
                            <div class="header-button">
                                <a href="#contact" rel="nofollow" class="btn btn-border-filled page-scroll">Hire Us</a>
                                <a href="#services" rel="nofollow" class="btn btn-border page-scroll">Learn More</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-12 col-xs-12 p-0">
                        <div class="intro-img">
                            <img src="img/intro.png" alt="" style="
                                 transform: translateY(10%);">
                        </div>            
                    </div>
                </div> 
            </div>             
        </header>
        <!-- Header Section End --> 
        <c:if test="${requestScope.msgCommon!=null}">
            <div style="text-align: center;">
                <p class="btn btn-singin">${requestScope.msgCommon}</p>
            </div>
        </c:if>
        <!-- Services Section Start -->
        <section id="services" class="section">
            <div class="container">

                <div class="row">
                    <!-- Start Col -->
                    <div class="col-lg-4 col-md-6 col-xs-12">
                        <div class="services-item text-center">
                            <div class="icon">
                                <i class="lni lni-fireworks"></i>
                            </div>
                            <h4>Fast</h4>
                            <p>Manage your project faster</p>
                        </div>
                    </div>
                    <!-- End Col -->
                    <!-- Start Col -->
                    <div class="col-lg-4 col-md-6 col-xs-12">
                        <div class="services-item text-center">
                            <div class="icon">
                                <i class="lni lni-certificate"></i>
                            </div>
                            <h4>Friendly</h4>
                            <p>Easy to use</p>
                        </div>
                    </div>
                    <!-- End Col -->
                    <!-- Start Col -->
                    <div class="col-lg-4 col-md-6 col-xs-12">
                        <div class="services-item text-center">
                            <div class="icon">
                                <i class="lni lni-clipboard"></i>
                            </div>
                            <h4>Track your work</h4>
                            <p>Combine calendar for you</p>
                        </div>
                    </div>
                    <!-- End Col -->

                </div>
            </div>
        </section>
        <!-- Services Section End -->



        <!-- Business Plan Section Start -->
        <section id="business-plan">
            <div class="container">

                <div class="row">
                    <!-- Start Col -->
                    <div class="col-lg-6 col-md-12 pl-0 pt-70 pr-5">
                        <div class="business-item-img">
                            <img src="img/business-img.png" class="img-fluid" alt="" 
                                 style="transform: translateY(-20%);">
                        </div>
                    </div>
                    <!-- End Col -->
                    <!-- Start Col -->
                    <div class="col-lg-6 col-md-12 pl-4">
                        <div class="business-item-info">
                            <h3>Live with dream works</h3>
                            <p>leading online project management software with built-in collaboration tools to work with your teams. Register now to use our features</p>

                            <!--<a class="btn btn-common" href="" id="show-login">Use</a>-->
                            <button class="btn btn-common" id="show-login" >Use</button>
                            <div class="popup" style="
                                 z-index: 10;
                                 transform: translate(-100%, -50%);">
                                <div class="close-btn">&times;</div>
                                <c:set var="cookie" value="${pageContext.request.cookies}"/>
                                <form action="login" method="post">
                                    <div class="form">
                                        <h2>Log in</h2>
                                        <div class="form-element">
                                            <label for="email">Account</label>
                                            <input type="text" id="account" placeholder="Enter account" name="account" value="${cookie.user.value}">
                                        </div>
                                        <div class="form-element">
                                            <label for="password">Password</label>
                                            <input type="password" id="password" placeholder="Enter password" name="password" value="${cookie.pass.value}">
                                        </div>
                                        <div class="form-element">
                                            <input type="checkbox" id="remember-me" name="remember" ${cookie.remember.value!=null?"checked":""}>
                                            <label for="remember-me">Remember me</label>
                                        </div>
                                        <div class="form-element">
                                            <button style="background: #7fc9fb;margin-left: 0px;" class="btn btn-singin">Sign in</button>
                                        </div>

                                    </div>
                                </form> 
                                <form action="newpass" method="post">
                                    <div class="form" >
                                        <br><h2>Forgot password</h2>
                                        <div class="form-element" style="display: flex; justify-content: space-between">
                                            <input type="text" placeholder="Enter account or email" name="account" required="" style="width: 60%;font-size: 0.9em;">
                                            <input type="submit" class="btn btn-singin" value="New password" style="font-size: 0.7em;">
                                        </div>     
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- End Col -->

                </div>
            </div>
        </section>
        <!-- Business Plan Section End -->



        <jsp:useBean id="a" class="dal.AchievementDAO"/>
        <!-- Cool Fetatures Section Start -->
        <section id="features" class="section">
            <div class="container">
                <!-- Start Row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="features-text section-header text-center">  
                            <div>   
                                <h2 class="section-title">Achievements</h2>
                                <div class="desc-text">
                                    <p>Below are our achievements</p>
                                </div>
                            </div> 
                        </div>
                    </div>

                </div>
                <!-- End Row -->
                <!-- Start Row -->
                <div class="row featured-bg">
                    <c:forEach items="${a.all}" var="item">
                        <!-- Start Col -->
                        <div class="col-lg-6 col-md-6 col-xs-12 p-0">
                            <!-- Start Fetatures -->
                            <div class="feature-item featured-border1">
                                <div class="feature-icon float-left">
                                    <i class="${item.icon}"></i>
                                </div>
                                <div class="feature-info float-left" style="width: 70%;">
                                    <h4>${item.name}</h4>
                                    <p>${item.description}</p>
                                </div>
                            </div>
                            <!-- End Fetatures -->
                        </div>
                        <!-- End Col -->
                    </c:forEach>

                </div>
                <!-- End Row -->
            </div>
        </section>
        <!-- Cool Fetatures Section End --> 

        <!-- Our Pricing Plan Section Start -->
        <section id="posts" class="section">
        </section>
        <!-- Our Pricing Plan Section End --> 

        <!-- Client Testimoninals Section Start -->
        <section id="testimonial" class="section"  style="transform: translateY(-25%);margin-bottom: 0px;">
            <div class="container right-position">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="features-text section-header text-center">  
                            <div style="transform: translateY(-150%);">   
                                <h2 class="section-title">Hot Posts</h2>
                                <div class="desc-text">
                                    <p>Below are our hot posts</p>
                                </div>
                            </div> 
                        </div>
                    </div>
                    <!-- Start Row -->
                    <div class="row">
                        <div class="col-md-12 col-sm-12">
                            <div class="video-promo-content text-center">

                            </div>
                        </div>
                    </div>
                    <!-- End Row -->
                    <!-- Start Row -->
                    <jsp:useBean id="post" class="dal.PostDAO"/>
                    <div class="row justify-content-center testimonial-area" style="transform: translateY(-45%);">
                        <div class="col-lg-10 col-md-12 col-sm-12 col-xs-12 pr-20 pl-20" style="overflow: hidden;padding-bottom: 60px">
                            <div id="client-testimonial" class="text-center owl-carousel" >

                                <c:forEach items="${post.all}" var="p">
                                    <div class="item">
                                        <div class="testimonial-item">
                                            <div class="content-inner">
                                                <h3>${p.title}</h3>
                                                <p class="description">${p.brief}</p>
                                                <div class="author-info">
                                                    <h5>${p.date} <span> ${p.fullName}</span></h5>
                                                </div>
                                            </div>
                                            <div class="client-thumb">
                                                <img src="${p.thumbnail}" alt="" style="width: 50%">
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>




                            </div>
                        </div>
                    </div>
                    <!-- End Row -->
                </div>
        </section>
        <!-- Client Testimoninals Section End --> 

        <!-- Recent Showcase Section Start -->
        <section id="showcase">
            <div class="container-fluid right-position">
                <!-- Start Row -->
                <div class="row gradient-bg">
                    <div class="col-lg-12">
                        <div class="showcase-text section-header text-center">  
                            <div>   
                                <h2 class="section-title">SlideShows</h2>
                                <div class="desc-text">
                                    <p>Below are the relevant posts</p>  
                                </div>
                            </div> 
                        </div>
                    </div>

                </div>
                <!-- End Row -->
                <!-- Start Row -->
                <div class="row justify-content-center showcase-area">
                    <div class="col-lg-12 col-md-12 col-xs-12 pr-0">
                        <div class="showcase-slider owl-carousel">

                            <c:forEach items="${post.all}" var="p2">
                                <div class="item">
                                    <div class="screenshot-thumb">
                                        <img src="${p2.thumbnail}" class="img-fluid" alt="" style="height: 24vh;"/>
                                        <div class="hover-content text-center">
                                            <div class="fancy-table" style="padding-top: 5%;">
                                                <div class="table-cell">
                                                    <div class="single-text">
                                                        <p>Icon , Web</p>
                                                        <h5>${p2.title}</h5>
                                                    </div>
                                                    <div class="zoom-icon">
                                                        <a class="lightbox" href="${p2.thumbnail}"><i class="lni-zoom-in"></i></a>
                                                        <a href="#"><i class="lni-link"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </c:forEach>

                        </div>
                    </div>
                </div>
                <!-- End Row -->
            </div>
        </section>
        <!-- Recent Showcase Section End --> 


        <!-- Blog Section -->
        <section id="blog" class="section">
            <!-- Container Starts -->
            <div class="container">
                <!-- Start Row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="blog-text section-header text-center">  
                            <div>   
                                <h2 class="section-title">Latest Blog Posts</h2>
                                <div class="desc-text">
                                    <p>Below are latest blog posts</p>
                                </div>
                            </div> 
                        </div>
                    </div>

                </div>
                <!-- End Row -->
                <!-- Start Row -->
                <div class="row">

                    <c:forEach items="${post.getLastN(3)}" var="p3">
                        <div class="col-lg-4 col-md-6 col-xs-12 blog-item">
                            <!-- Blog Item Starts -->
                            <div class="blog-item-wrapper">
                                <div class="blog-item-img">
                                    <a href="single-post.html">
                                        <img src="${p3.thumbnail}" class="img-fluid" alt="">
                                    </a>             
                                </div>
                                <div class="blog-item-text"> 
                                    <h3><a href="single-post.html">${p3.title}</a></h3>
                                    <p>${p3.brief}</p>
                                    <a href="" class="read-more">5 Min read</a>
                                </div>
                                <div class="author">
                                    <span class="name"><i class="lni-user"></i><a href="#">Posted by ${p3.fullName}</a></span>
                                    <span class="date float-right"><i class="lni-calendar"></i><a href="#">${p3.date}</a></span>
                                </div>
                            </div>
                            <!-- Blog Item Wrapper Ends-->
                        </div>
                    </c:forEach> 

                </div>
                <!-- End Row -->
            </div>
        </section>
        <!-- blog Section End -->

        <!-- Contact Us Section -->
        <section id="contact" class="section">
            <!-- Container Starts -->
            <div class="container">
                <!-- Start Row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="contact-text section-header text-center">  
                            <div>   
                                <h2 class="section-title">Get In Touch</h2>
                                <div class="desc-text">
                                    <p>Contact us for more information</p>
                                </div>
                            </div> 
                        </div>
                    </div>

                </div>
                <!-- End Row -->
                <!-- Start Row -->
                <div class="row">
                    <!-- Start Col -->
                    <div class="col-lg-6 col-md-12">
                        <form id="contactForm" action="contact">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="name" name="name" placeholder="Name" required data-error="Please enter your name">
                                        <div class="help-block with-errors"></div>
                                    </div>                                 
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input type="text" placeholder="Subject" id="msg_subject" class="form-control" name="msg_subject" required data-error="Please enter your subject">
                                        <div class="help-block with-errors"></div>
                                    </div> 
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="email" name="email" placeholder="Email" required data-error="Please enter your Email">
                                        <div class="help-block with-errors"></div>
                                    </div>                                 
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <input type="text" placeholder="Budget" id="budget" class="form-control" name="budget" required data-error="Please enter your Budget">
                                        <div class="help-block with-errors"></div>
                                    </div> 
                                </div>
                                <div class="col-md-12">
                                    <div class="form-group"> 
                                        <textarea class="form-control" id="message"  name="message" placeholder="Write Message" rows="4" data-error="Write your message" required></textarea>
                                        <div class="help-block with-errors"></div>
                                    </div>
                                    <div class="submit-button">
                                        <button class="btn btn-common" id="submit" type="submit">Submit</button>
                                        <div id="msgSubmit" class="h3 hidden"></div> 
                                        <div class="clearfix"></div> 
                                    </div>
                                    <p>${param.us}</p>
                                </div>
                            </div>            
                        </form>
                    </div>
                    <!-- End Col -->
                    <!-- Start Col -->
                    <div class="col-lg-1">

                    </div>
                    <!-- End Col -->
                    <!-- Start Col -->
                    <div class="col-lg-4 col-md-12">
                        <div class="contact-img">
                            <img src="img/01.png" class="img-fluid" alt="">
                        </div>
                    </div>
                    <!-- End Col -->
                    <!-- Start Col -->
                    <div class="col-lg-1">
                    </div>
                    <!-- End Col -->

                </div>
                <!-- End Row -->
            </div>
        </section>
        <!-- Contact Us Section End -->

        <!-- Footer Section Start -->
        <footer>
            <!-- Footer Area Start -->
            <section id="footer-Content">
                <div class="container">
                    <!-- Start Row -->
                    <div class="row">

                        <!-- Start Col -->
                        <div class="col-lg-3 col-md-6 col-sm-6 col-xs-6 col-mb-12">

                            <div class="footer-logo">
                                <img src="img/logo.png" alt="" style="
                                     filter: brightness(2);
                                     height: 200px;
                                     border-radius: 40%;
                                     transform: translateY(-20%);">
                            </div>
                        </div>
                        <!-- End Col -->
                        <!-- Start Col -->
                        <div class="col-lg-2 col-md-6 col-sm-6 col-xs-6 col-mb-12">
                            <div class="widget">
                                <h3 class="block-title">Company</h3>
                                <ul class="menu">
                                    <li><a href="home.jsp#services">  - About Us</a></li>
                                    <li><a href="home.jsp#features">- Achievements</a></li>
                                    <li><a href="home.jsp#blog">- Blog</a></li>
                                    <li><a href="home.jsp#contact">- Contact</a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- End Col -->
                        <!-- Start Col -->
                        <div class="col-lg-2 col-md-6 col-sm-6 col-xs-6 col-mb-12">
                            <div class="widget">
                                <h3 class="block-title">Product</h3>
                                <ul class="menu">
                                    <li><a href="#">- Dashboard</a></li>
                                    <li><a href="#">- Projects</a></li>
                                    <li><a href="#">- Task</a></li>
                                    <li><a href="#">- Calender</a></li>
                                    <li><a href="#">- Profile</a></li>
                                </ul>
                            </div>
                        </div>
                        <!-- End Col -->
                        <!-- Start Col -->
                        <div class="col-lg-5 col-md-6 col-sm-6 col-xs-6 col-mb-12">
                            <div class="widget">
                                <h3 class="block-title">Subscribe Now</h3>
                                <p>Subscribe to get notification about our updates, trends, jobs, ETC</p>
                                <form action="contact" method="post">
                                    <div class="subscribe-area" style="display: flex;">
                                        <input type="email" class="form-control" name="email" placeholder="Enter Email" required="">
                                        <input type="submit" value="Submit" class="btn btn-singin">
                                    </div>
                                </form>
                                <p>${param.fo}</p>
                            </div>
                        </div>
                        <!-- End Col -->
                    </div>
                    <!-- End Row -->
                </div>
                <!-- Copyright Start  -->

                <div class="copyright">
                    <div class="container">
                        <!-- Star Row -->
                        <div class="row">
                            <div class="col-md-12">
                                <div class="site-info text-center">
                                    <p>Recreated by <a href="" rel="nofollow">workflowBOX</a></p>
                                </div>              

                            </div>
                            <!-- End Col -->
                        </div>
                        <!-- End Row -->
                    </div>
                </div>
                <!-- Copyright End -->
            </section>
            <!-- Footer area End -->

        </footer>
        <!-- Footer Section End --> 


        <!-- Go To Top Link -->
        <a href="#" class="back-to-top">
            <i class="lni-chevron-up"></i>
        </a> 

        <!-- Preloader -->
        <div id="preloader">
            <div class="loader" id="loader-1"></div>
        </div>
        <!-- End Preloader -->

        <script>
            document.querySelector("#show-login").addEventListener("click", function () {
                document.querySelector(".popup").classList.add("active");
            });
            document.querySelector(".popup .close-btn").addEventListener("click", function () {
                document.querySelector(".popup").classList.remove("active");
            });
        </script>

        <!-- jQuery first, then Tether, then Bootstrap JS. -->
        <script src="js/jquery-min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/owl.carousel.js"></script>      
        <script src="js/jquery.nav.js"></script>    
        <script src="js/scrolling-nav.js"></script>    
        <script src="js/jquery.easing.min.js"></script>     
        <script src="js/nivo-lightbox.js"></script>     
        <script src="js/jquery.magnific-popup.min.js"></script>     
        <script src="js/form-validator.min.js"></script>
        <script src="js/contact-form-script.js"></script>   
        <script src="js/main.js"></script>

    </body>
</html>
