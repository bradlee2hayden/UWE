package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrationPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add padding to containers */\n");
      out.write("            .container {\n");
      out.write("                padding: 16px;\n");
      out.write("                background-color: white;\n");
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
      out.write("                width: 100%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Add a blue text color to links */\n");
      out.write("            a {\n");
      out.write("                color: dodgerblue;\n");
      out.write("            }\n");
      out.write("            select{\n");
      out.write("                 background-color: #f1f1f1;\n");
      out.write("                 color: black;\n");
      out.write("                 padding: 11px 20px;\n");
      out.write("                 margin: 8px 0;\n");
      out.write("                 border: none;\n");
      out.write("                 cursor: pointer;\n");
      out.write("                 width: 12%;\n");
      out.write("                 opacity: 0.9;\n");
      out.write("                 font-family: Arial, Helvetica, sans-serif;\n");
      out.write("             }\n");
      out.write("  \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>SmartCare Surgery User Registration Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-box\">\n");
      out.write("            ");
 if(request.getAttribute("setMessage") != null){ String setMessage = (String) request.getAttribute("setMessage"); out.println(setMessage);} 
      out.write("\n");
      out.write("            <h1>User Registration</h1>\n");
      out.write("            <form method=\"POST\" action=\"registrationServlet.do\" name=\"register_form\" >\n");
      out.write("                <div class=\"textbox\">\n");
      out.write("                    <i class=\"fas fa-user\"></i>\n");
      out.write("                    <input type =\"text\" placeholder=\"Username\" name=\"uName\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"textbox\">\n");
      out.write("                    <i class=\"fas fa-lock\"  ></i>\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" name=\"passwd\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"role-select\">\n");
      out.write("                    <i class=\"fas fa-user-tag\"></i>\n");
      out.write("                    <select class=\"login-select\" name=\"uRoles\" required>\n");
      out.write("                        <option value=\"client\">Client</option>\n");
      out.write("                        <option value=\"doctor\">Doctor</option>\n");
      out.write("                        <option value=\"nurse\">Nurse</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <input class=\"btn\" type=\"submit\" name=\"registration_form\" value=\"Register\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
