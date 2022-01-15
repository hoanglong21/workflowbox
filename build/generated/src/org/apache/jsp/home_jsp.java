package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"keywords\" content=\"Bootstrap, Landing page, Template, Business, Service\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <meta name=\"author\" content=\"Grayrids\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <!--====== Favicon Icon ======-->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/logo.png\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <!--        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styleLogin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/LineIcons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nivo-lightbox.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">    \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Header Section Start -->\n");
      out.write("        <header id=\"home\" class=\"hero-area\">    \n");
      out.write("            <div class=\"overlay\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navbar navbar-expand-md bg-inverse fixed-top scrolling-navbar\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a href=\"home.jsp\" class=\"navbar-brand\"><img style=\"\n");
      out.write("                                                                 filter: brightness(2);\n");
      out.write("                                                                 height: 100px;\n");
      out.write("                                                                 border-radius: 40%;\n");
      out.write("                                                                 \" src=\"img/logo.png\" alt=\"\"></a>       \n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\" aria-controls=\"navbarCollapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <i class=\"lni-menu\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                        <ul class=\"navbar-nav mr-auto w-100 justify-content-end\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link page-scroll\" href=\"#home\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link page-scroll\" href=\"#services\">About</a>\n");
      out.write("                            </li>  \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link page-scroll\" href=\"#features\">Achievements</a>\n");
      out.write("                            </li>   \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link page-scroll\" href=\"#posts\">Hot Posts</a>\n");
      out.write("                            </li>                           \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link page-scroll\" href=\"#showcase\">SlideShow</a>\n");
      out.write("                            </li>  \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link page-scroll\" href=\"#blog\">Blogs</a>\n");
      out.write("                            </li>  \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link page-scroll\" href=\"#contact\">Contact</a>\n");
      out.write("                            </li> \n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>  \n");
      out.write("            <div class=\"container\">      \n");
      out.write("                <div class=\"row space-100\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-12 col-xs-12\">\n");
      out.write("                        <div class=\"contents\">\n");
      out.write("                            <h2 class=\"head-title\">WorkflowBOX</h2>\n");
      out.write("                            <p>This web is a project management web for your company in the most professional and convenient way</p>\n");
      out.write("                            <div class=\"header-button\">\n");
      out.write("                                <a href=\"#contact\" rel=\"nofollow\" class=\"btn btn-border-filled page-scroll\">Hire Us</a>\n");
      out.write("                                <a href=\"#services\" rel=\"nofollow\" class=\"btn btn-border page-scroll\">Learn More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-12 col-xs-12 p-0\">\n");
      out.write("                        <div class=\"intro-img\">\n");
      out.write("                            <img src=\"img/intro.png\" alt=\"\" style=\"\n");
      out.write("                                 transform: translateY(10%);\">\n");
      out.write("                        </div>            \n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>             \n");
      out.write("        </header>\n");
      out.write("        <!-- Header Section End --> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Services Section Start -->\n");
      out.write("        <section id=\"services\" class=\"section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-xs-12\">\n");
      out.write("                        <div class=\"services-item text-center\">\n");
      out.write("                            <div class=\"icon\">\n");
      out.write("                                <i class=\"lni lni-fireworks\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h4>Fast</h4>\n");
      out.write("                            <p>Manage your project faster</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-xs-12\">\n");
      out.write("                        <div class=\"services-item text-center\">\n");
      out.write("                            <div class=\"icon\">\n");
      out.write("                                <i class=\"lni lni-certificate\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h4>Friendly</h4>\n");
      out.write("                            <p>Easy to use</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 col-xs-12\">\n");
      out.write("                        <div class=\"services-item text-center\">\n");
      out.write("                            <div class=\"icon\">\n");
      out.write("                                <i class=\"lni lni-clipboard\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <h4>Track your work</h4>\n");
      out.write("                            <p>Combine calendar for you</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Services Section End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Business Plan Section Start -->\n");
      out.write("        <section id=\"business-plan\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-6 col-md-12 pl-0 pt-70 pr-5\">\n");
      out.write("                        <div class=\"business-item-img\">\n");
      out.write("                            <img src=\"img/business-img.png\" class=\"img-fluid\" alt=\"\" \n");
      out.write("                                 style=\"transform: translateY(-20%);\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-6 col-md-12 pl-4\">\n");
      out.write("                        <div class=\"business-item-info\">\n");
      out.write("                            <h3>Live with dream works</h3>\n");
      out.write("                            <p>leading online project management software with built-in collaboration tools to work with your teams. Register now to use our features</p>\n");
      out.write("\n");
      out.write("                            <!--<a class=\"btn btn-common\" href=\"\" id=\"show-login\">Use</a>-->\n");
      out.write("                            <button class=\"btn btn-common\" id=\"show-login\" >Use</button>\n");
      out.write("                            <div class=\"popup\" style=\"\n");
      out.write("                                 z-index: 10;\n");
      out.write("                                 transform: translate(-100%, -50%);\">\n");
      out.write("                                <div class=\"close-btn\">&times;</div>\n");
      out.write("                                <form action=\"login\" method=\"post\">\n");
      out.write("                                    <div class=\"form\">\n");
      out.write("                                        <h2>Log in</h2>\n");
      out.write("                                        <div class=\"form-element\">\n");
      out.write("                                            <label for=\"email\">Account</label>\n");
      out.write("                                            <input type=\"text\" id=\"account\" placeholder=\"Enter account\" name=\"account\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-element\">\n");
      out.write("                                            <label for=\"password\">Password</label>\n");
      out.write("                                            <input type=\"password\" id=\"password\" placeholder=\"Enter password\" name=\"password\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-element\">\n");
      out.write("                                            <input type=\"checkbox\" id=\"remember-me\">\n");
      out.write("                                            <label for=\"remember-me\">Remember me</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-element\">\n");
      out.write("                                            <button>Sign in</button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-element\">\n");
      out.write("                                            <a href=\"#\">Forgot password?</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>  \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Business Plan Section End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      dal.AchievementDAO a = null;
      synchronized (_jspx_page_context) {
        a = (dal.AchievementDAO) _jspx_page_context.getAttribute("a", PageContext.PAGE_SCOPE);
        if (a == null){
          a = new dal.AchievementDAO();
          _jspx_page_context.setAttribute("a", a, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <!-- Cool Fetatures Section Start -->\n");
      out.write("        <section id=\"features\" class=\"section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Start Row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"features-text section-header text-center\">  \n");
      out.write("                            <div>   \n");
      out.write("                                <h2 class=\"section-title\">Achievements</h2>\n");
      out.write("                                <div class=\"desc-text\">\n");
      out.write("                                    <p>Below are our achievements</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End Row -->\n");
      out.write("                <!-- Start Row -->\n");
      out.write("                <div class=\"row featured-bg\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End Row -->\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Cool Fetatures Section End --> \n");
      out.write("\n");
      out.write("        <!-- Our Pricing Plan Section Start -->\n");
      out.write("        <section id=\"posts\" class=\"section\">\n");
      out.write("        </section>\n");
      out.write("        <!-- Our Pricing Plan Section End --> \n");
      out.write("\n");
      out.write("        <!-- Client Testimoninals Section Start -->\n");
      out.write("        <section id=\"testimonial\" class=\"section\"  style=\"transform: translateY(-25%);margin-bottom: 0px;\">\n");
      out.write("            <div class=\"container right-position\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"features-text section-header text-center\">  \n");
      out.write("                            <div style=\"transform: translateY(-150%);\">   \n");
      out.write("                                <h2 class=\"section-title\">Hot Posts</h2>\n");
      out.write("                                <div class=\"desc-text\">\n");
      out.write("                                    <p>Below are our hot posts</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Start Row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"video-promo-content text-center\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Row -->\n");
      out.write("                    <!-- Start Row -->\n");
      out.write("                    ");
      dal.PostDAO post = null;
      synchronized (_jspx_page_context) {
        post = (dal.PostDAO) _jspx_page_context.getAttribute("post", PageContext.PAGE_SCOPE);
        if (post == null){
          post = new dal.PostDAO();
          _jspx_page_context.setAttribute("post", post, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                    <div class=\"row justify-content-center testimonial-area\" style=\"transform: translateY(-45%);\">\n");
      out.write("                        <div class=\"col-lg-10 col-md-12 col-sm-12 col-xs-12 pr-20 pl-20\" style=\"overflow: hidden;padding-bottom: 60px\">\n");
      out.write("                            <div id=\"client-testimonial\" class=\"text-center owl-carousel\" >\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Row -->\n");
      out.write("                </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Client Testimoninals Section End --> \n");
      out.write("\n");
      out.write("        <!-- Recent Showcase Section Start -->\n");
      out.write("        <section id=\"showcase\">\n");
      out.write("            <div class=\"container-fluid right-position\">\n");
      out.write("                <!-- Start Row -->\n");
      out.write("                <div class=\"row gradient-bg\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"showcase-text section-header text-center\">  \n");
      out.write("                            <div>   \n");
      out.write("                                <h2 class=\"section-title\">SlideShows</h2>\n");
      out.write("                                <div class=\"desc-text\">\n");
      out.write("                                    <p>Below are the relevant posts</p>  \n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End Row -->\n");
      out.write("                <!-- Start Row -->\n");
      out.write("                <div class=\"row justify-content-center showcase-area\">\n");
      out.write("                    <div class=\"col-lg-12 col-md-12 col-xs-12 pr-0\">\n");
      out.write("                        <div class=\"showcase-slider owl-carousel\">\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- End Row -->\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Recent Showcase Section End --> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Blog Section -->\n");
      out.write("        <section id=\"blog\" class=\"section\">\n");
      out.write("            <!-- Container Starts -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Start Row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"blog-text section-header text-center\">  \n");
      out.write("                            <div>   \n");
      out.write("                                <h2 class=\"section-title\">Latest Blog Posts</h2>\n");
      out.write("                                <div class=\"desc-text\">\n");
      out.write("                                    <p>Below are latest blog posts</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End Row -->\n");
      out.write("                <!-- Start Row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End Row -->\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- blog Section End -->\n");
      out.write("\n");
      out.write("        <!-- Contact Us Section -->\n");
      out.write("        <section id=\"contact\" class=\"section\">\n");
      out.write("            <!-- Container Starts -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Start Row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"contact-text section-header text-center\">  \n");
      out.write("                            <div>   \n");
      out.write("                                <h2 class=\"section-title\">Get In Touch</h2>\n");
      out.write("                                <div class=\"desc-text\">\n");
      out.write("                                    <p>Contact us for more information</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End Row -->\n");
      out.write("                <!-- Start Row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-6 col-md-12\">\n");
      out.write("                        <form id=\"contactForm\" action=\"contact\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\" required data-error=\"Please enter your name\">\n");
      out.write("                                        <div class=\"help-block with-errors\"></div>\n");
      out.write("                                    </div>                                 \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Subject\" id=\"msg_subject\" class=\"form-control\" name=\"msg_subject\" required data-error=\"Please enter your subject\">\n");
      out.write("                                        <div class=\"help-block with-errors\"></div>\n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\" required data-error=\"Please enter your Email\">\n");
      out.write("                                        <div class=\"help-block with-errors\"></div>\n");
      out.write("                                    </div>                                 \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Budget\" id=\"budget\" class=\"form-control\" name=\"budget\" required data-error=\"Please enter your Budget\">\n");
      out.write("                                        <div class=\"help-block with-errors\"></div>\n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div class=\"form-group\"> \n");
      out.write("                                        <textarea class=\"form-control\" id=\"message\"  name=\"message\" placeholder=\"Write Message\" rows=\"4\" data-error=\"Write your message\" required></textarea>\n");
      out.write("                                        <div class=\"help-block with-errors\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"submit-button\">\n");
      out.write("                                        <button class=\"btn btn-common\" id=\"submit\" type=\"submit\">Submit</button>\n");
      out.write("                                        <div id=\"msgSubmit\" class=\"h3 hidden\"></div> \n");
      out.write("                                        <div class=\"clearfix\"></div> \n");
      out.write("                                    </div>\n");
      out.write("                                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.us}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>            \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-1\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                        <div class=\"contact-img\">\n");
      out.write("                            <img src=\"img/01.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("                    <!-- Start Col -->\n");
      out.write("                    <div class=\"col-lg-1\">\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Col -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End Row -->\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Contact Us Section End -->\n");
      out.write("\n");
      out.write("        <!-- Footer Section Start -->\n");
      out.write("        <footer>\n");
      out.write("            <!-- Footer Area Start -->\n");
      out.write("            <section id=\"footer-Content\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Start Row -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <!-- Start Col -->\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 col-sm-6 col-xs-6 col-mb-12\">\n");
      out.write("\n");
      out.write("                            <div class=\"footer-logo\">\n");
      out.write("                                <img src=\"img/logo.png\" alt=\"\" style=\"\n");
      out.write("                                     filter: brightness(2);\n");
      out.write("                                     height: 200px;\n");
      out.write("                                     border-radius: 40%;\n");
      out.write("                                     transform: translateY(-20%);\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Col -->\n");
      out.write("                        <!-- Start Col -->\n");
      out.write("                        <div class=\"col-lg-2 col-md-6 col-sm-6 col-xs-6 col-mb-12\">\n");
      out.write("                            <div class=\"widget\">\n");
      out.write("                                <h3 class=\"block-title\">Company</h3>\n");
      out.write("                                <ul class=\"menu\">\n");
      out.write("                                    <li><a href=\"home.jsp#services\">  - About Us</a></li>\n");
      out.write("                                    <li><a href=\"home.jsp#features\">- Achievements</a></li>\n");
      out.write("                                    <li><a href=\"home.jsp#blog\">- Blog</a></li>\n");
      out.write("                                    <li><a href=\"home.jsp#contact\">- Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Col -->\n");
      out.write("                        <!-- Start Col -->\n");
      out.write("                        <div class=\"col-lg-2 col-md-6 col-sm-6 col-xs-6 col-mb-12\">\n");
      out.write("                            <div class=\"widget\">\n");
      out.write("                                <h3 class=\"block-title\">Product</h3>\n");
      out.write("                                <ul class=\"menu\">\n");
      out.write("                                    <li><a href=\"#\">- Dashboard</a></li>\n");
      out.write("                                    <li><a href=\"#\">- Projects</a></li>\n");
      out.write("                                    <li><a href=\"#\">- Task</a></li>\n");
      out.write("                                    <li><a href=\"#\">- Calender</a></li>\n");
      out.write("                                    <li><a href=\"#\">- Profile</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Col -->\n");
      out.write("                        <!-- Start Col -->\n");
      out.write("                        <div class=\"col-lg-5 col-md-6 col-sm-6 col-xs-6 col-mb-12\">\n");
      out.write("                            <div class=\"widget\">\n");
      out.write("                                <h3 class=\"block-title\">Subscribe Now</h3>\n");
      out.write("                                <p>Appropriately implement calysts for change visa wireless catalysts for change. </p>\n");
      out.write("                                <form action=\"contact\" method=\"post\">\n");
      out.write("                                    <div class=\"subscribe-area\" style=\"display: flex;\">\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Enter Email\" required=\"\">\n");
      out.write("                                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-singin\">\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.fo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Col -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Copyright Start  -->\n");
      out.write("\n");
      out.write("                <div class=\"copyright\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <!-- Star Row -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"site-info text-center\">\n");
      out.write("                                    <p>Recreated by <a href=\"\" rel=\"nofollow\">workflowBOX</a></p>\n");
      out.write("                                </div>              \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Col -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Row -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Copyright End -->\n");
      out.write("            </section>\n");
      out.write("            <!-- Footer area End -->\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("        <!-- Footer Section End --> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Go To Top Link -->\n");
      out.write("        <a href=\"#\" class=\"back-to-top\">\n");
      out.write("            <i class=\"lni-chevron-up\"></i>\n");
      out.write("        </a> \n");
      out.write("\n");
      out.write("        <!-- Preloader -->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <div class=\"loader\" id=\"loader-1\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Preloader -->\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            document.querySelector(\"#show-login\").addEventListener(\"click\", function () {\n");
      out.write("                document.querySelector(\".popup\").classList.add(\"active\");\n");
      out.write("            });\n");
      out.write("            document.querySelector(\".popup .close-btn\").addEventListener(\"click\", function () {\n");
      out.write("                document.querySelector(\".popup\").classList.remove(\"active\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- jQuery first, then Tether, then Bootstrap JS. -->\n");
      out.write("        <script src=\"js/jquery-min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.js\"></script>      \n");
      out.write("        <script src=\"js/jquery.nav.js\"></script>    \n");
      out.write("        <script src=\"js/scrolling-nav.js\"></script>    \n");
      out.write("        <script src=\"js/jquery.easing.min.js\"></script>     \n");
      out.write("        <script src=\"js/nivo-lightbox.js\"></script>     \n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>     \n");
      out.write("        <script src=\"js/form-validator.min.js\"></script>\n");
      out.write("        <script src=\"js/contact-form-script.js\"></script>   \n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"btn btn-singin\" href=\"#\">Login</a>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"btn btn-singin\" href=\"#\">Register</a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <div class=\"dropdown\">\n");
        out.write("                                        <img class=\"btn btn-singin\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" style=\"\n");
        out.write("                                             width: 70px;\n");
        out.write("                                             padding-bottom: 0px;\n");
        out.write("                                             padding-top: 0px;\n");
        out.write("                                             padding-right: 0px;\n");
        out.write("                                             padding-left: 0px;\n");
        out.write("                                             border-radius: 25%;\n");
        out.write("                                             transform: translateY(-15%);\">\n");
        out.write("                                        <div class=\"dropdown-content\" style=\"transform: translate(-7%,-5%);border-radius: 20px;\">\n");
        out.write("                                            <a style=\"background-color: unset;color: unset;border-top-left-radius: 20px;border-top-right-radius: 20px;padding-bottom: 0px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                            <a style=\"background-color: unset;color: unset;padding-top: 0px;padding-bottom: 0px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" - ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                            <a href=\"#\">Profile</a>\n");
        out.write("                                            <a href=\"#\">Dashboard</a>\n");
        out.write("                                            <a href=\"#\" style=\"border-bottom-left-radius: 20px;border-bottom-right-radius: 20px;\">LogOut</a>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.all}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("item");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <!-- Start Col -->\n");
          out.write("                        <div class=\"col-lg-6 col-md-6 col-xs-12 p-0\">\n");
          out.write("                            <!-- Start Fetatures -->\n");
          out.write("                            <div class=\"feature-item featured-border1\">\n");
          out.write("                                <div class=\"feature-icon float-left\">\n");
          out.write("                                    <i class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.icon}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></i>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"feature-info float-left\">\n");
          out.write("                                    <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <!-- End Fetatures -->\n");
          out.write("                        </div>\n");
          out.write("                        <!-- End Col -->\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.all}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"item\">\n");
          out.write("                                        <div class=\"testimonial-item\">\n");
          out.write("                                            <div class=\"content-inner\">\n");
          out.write("                                                <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                                                <p class=\"description\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.brief}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                <div class=\"author-info\">\n");
          out.write("                                                    <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></h5>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"client-thumb\">\n");
          out.write("                                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 50%\">\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.all}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("p2");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"item\">\n");
          out.write("                                    <div class=\"screenshot-thumb\">\n");
          out.write("                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p2.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid\" alt=\"\" style=\"height: 24vh;\"/>\n");
          out.write("                                        <div class=\"hover-content text-center\">\n");
          out.write("                                            <div class=\"fancy-table\" style=\"padding-top: 5%;\">\n");
          out.write("                                                <div class=\"table-cell\">\n");
          out.write("                                                    <div class=\"single-text\">\n");
          out.write("                                                        <p>Icon , Web</p>\n");
          out.write("                                                        <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p2.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <div class=\"zoom-icon\">\n");
          out.write("                                                        <a class=\"lightbox\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p2.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"lni-zoom-in\"></i></a>\n");
          out.write("                                                        <a href=\"#\"><i class=\"lni-link\"></i></a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getLastN(3)}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("p3");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"col-lg-4 col-md-6 col-xs-12 blog-item\">\n");
          out.write("                            <!-- Blog Item Starts -->\n");
          out.write("                            <div class=\"blog-item-wrapper\">\n");
          out.write("                                <div class=\"blog-item-img\">\n");
          out.write("                                    <a href=\"single-post.html\">\n");
          out.write("                                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p3.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid\" alt=\"\">\n");
          out.write("                                    </a>             \n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"blog-item-text\"> \n");
          out.write("                                    <h3><a href=\"single-post.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p3.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p3.brief}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <a href=\"\" class=\"read-more\">5 Min read</a>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"author\">\n");
          out.write("                                    <span class=\"name\"><i class=\"lni-user\"></i><a href=\"#\">Posted by ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p3.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></span>\n");
          out.write("                                    <span class=\"date float-right\"><i class=\"lni-calendar\"></i><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p3.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></span>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <!-- Blog Item Wrapper Ends-->\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
