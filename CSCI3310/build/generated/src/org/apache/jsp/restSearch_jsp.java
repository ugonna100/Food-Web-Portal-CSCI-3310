package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class restSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Register Search</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Oswald|Slabo+27px|Vollkorn|Yellowtail\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Bungee+Inline|Exo\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" id=\"navbar\" style=\"font-size: 1.5em;\">\n");
      out.write("\t<div class=\"container-fluid font2\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                <li><a href=\"dashboard.html\" style=\"margin-left: -10%;\">EbolaDragons</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                    <img class=\"logo\" id=\"navBarIcon\" style=\"margin-left: -70%;\" src=\"logo.png\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li style=\"padding-top: 10px;\">\n");
      out.write("                    <form action=\"ListCartServlet\" method=\"get\">\n");
      out.write("                        <button type=\"submit\" name=\"cart\" value=\"cart\" class=\"buttonColor\"><i class=\"fa fa-shopping-cart\"></i> Cart</button>\n");
      out.write("                    </form>\n");
      out.write("                </li>\n");
      out.write("                <li style=\"margin-right: -10px;\"><a href=\"changeSettings.jsp\"><i class=\"fa fa-cog\"></i> Settings</a></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"restSearch.jsp\"><i class=\"fa fa-search-plus\"></i> Search</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\t</div>\n");
      out.write("    </nav>\n");
      out.write("    <body class=\"login font2\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8 col-sm-offset-2\" style=\"margin-top:5%;\">\n");
      out.write("                        <img src=\"logo.png\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4 col-sm-offset-4\">\n");
      out.write("                        <div class=\"form-box\">\n");
      out.write("                            <div class=\"form-top\">\n");
      out.write("                                <div class=\"left\">\n");
      out.write("                                    <h3 style=\"padding-bottom: 15px;\">Search</h3>\n");
      out.write("                                    <p>Enter a restaurant name or category of food:</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"right\" style=\"margin-top: 10px;\">\n");
      out.write("                                    <i class=\"fa fa-search-plus\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-bottom\">\n");
      out.write("                                <form action=\"SearchRestaurantServlet\" method=\"post\" class=\"text-center\">\n");
      out.write("                                    <input style=\"color: black; font-size: 1.5em; margin-bottom: 20px;\" class=\"searchBar\" id=\"searchBar\" type=\"text\" name=\"searchBar\" placeholder=\"Category or Name...\"><br>\n");
      out.write("                                    <input type=\"radio\" name=\"decision\" value=\"name\" checked> Name \n");
      out.write("                                    <input type=\"radio\" name=\"decision\" value=\"category\" style=\"margin-left: 20px; margin-bottom: 20px;\"> Category\n");
      out.write("                                    <button type=\"submit\" class=\"btn buttonColor\" value=\"Submit\" id=\"rsubmit\">Search</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <p style=\"color: white; padding-top: 15px;\">--------------- Head on back? ---------------</p>\n");
      out.write("                        <a href=\"dashboard.html\"<button type=\"button\" class=\"btn buttonColor\">Back</button></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
}
