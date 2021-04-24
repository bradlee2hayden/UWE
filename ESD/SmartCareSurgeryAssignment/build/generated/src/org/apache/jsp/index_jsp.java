package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            @import url(\"https://fonts.googleapis.com/css?family=Sacramento&display=swap\");\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                font-size: calc(5px + 5vh);\n");
      out.write("                line-height: calc(5px + 5vh);\n");
      out.write("                /*   text-shadow: 0 0 5px #f562ff, 0 0 15px #f562ff, 0 0 25px #f562ff,\n");
      out.write("                    0 0 20px #f562ff, 0 0 30px #890092, 0 0 80px #890092, 0 0 80px #890092;\n");
      out.write("                  color: #fccaff; */\n");
      out.write("                text-shadow: 0 0 5px #CCCCFF, 0 0 15px #CCCCFF, 0 0 20px #CCCCFF, 0 0 40px #CCCCFF, 0 0 60px #CCCCFF, 0 0 10px #ff8d00, 0 0 98px #ff0000;\n");
      out.write("                color: #6495ED;\n");
      out.write("                font-family: \"Sacramento\", cursive;\n");
      out.write("                text-align: center;\n");
      out.write("                animation: blink 12s infinite;\n");
      out.write("                -webkit-animation: blink 12s infinite;\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Full-width input fields */\n");
      out.write("            input[type=text], input[type=password] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 5px 0 22px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: none;\n");
      out.write("                background: #f1f1f1;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=text]:focus, input[type=password]:focus {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Overwrite default styles of hr */\n");
      out.write("            hr {\n");
      out.write("                border: 1px solid #f1f1f1;\n");
      out.write("                margin-bottom: 25px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Set a style for the submit button */\n");
      out.write("            .btn {\n");
      out.write("                background-color: #696969;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;                \n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            .bottomleft {\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 100px;\n");
      out.write("                left: 16px;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: 35px;\n");
      out.write("                left: 16px;   \n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>SmartCare Login</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("            ");
 if (request.getAttribute("setMessage") != null) {
                    String getMessage = (String) request.getAttribute("setMessage");
                    out.println(getMessage);
                }
      out.write("\n");
      out.write("            <h1>SmartCare Surgery</h1>\n");
      out.write("            <br>\n");
      out.write("            <form action=\"loginServlet.do\" name=\"login\" method=\"post\">\n");
      out.write("                <div class=\"textbox\">\n");
      out.write("                    <i class=\"fas fa-user\"></i>\n");
      out.write("                    <label><b>Enter Username: </b></label>\n");
      out.write("                    <hr>\n");
      out.write("                    <input type =\"text\" placeholder=\"Username\" name=\"uName\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"textbox\">\n");
      out.write("                    <i class=\"fas fa-lock\"  ></i>\n");
      out.write("                    <label><b>Enter Password: </b></label>   \n");
      out.write("                    <hr>\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" name=\"passwd\" required>\n");
      out.write("                </div>\n");
      out.write("                <input class=\"btn\" name=\"login\" type=\"submit\" value=\"Login\">\n");
      out.write("                <a href=\"registrationPage.jsp\">\n");
      out.write("                    <input class=\"btn\" name=\"register\" type=\"button\" value=\"Register\">\n");
      out.write("                </a>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("  <div class=\"bottomleft\">In partnership with: </div>\n");
      out.write("      <img src=\"nhslogo.jpg\" width=\"130\" height=\"50\" alt=\"nhslogo\"/>\n");
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
}
