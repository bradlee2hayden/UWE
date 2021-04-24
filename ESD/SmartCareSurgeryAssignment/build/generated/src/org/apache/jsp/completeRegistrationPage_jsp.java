package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class completeRegistrationPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("             .confirmtBtn {\n");
      out.write("                background-color: #696969;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("            .confirmtBtn{\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            input[type=text] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 5px 0 22px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: none;\n");
      out.write("                background: #f1f1f1;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=text]:focus{\n");
      out.write("                background-color: #ddd;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Overwrite default styles of hr */\n");
      out.write("            hr {\n");
      out.write("                border: 1px solid #f1f1f1;\n");
      out.write("                margin-bottom: 25px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>SmartCare Surgery Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Complete the registration form: </h1>\n");
      out.write("        <form action=\"completeRegistrationServlet.do\" method=\"post\">\n");
      out.write("                Name: <br />\n");
      out.write("                <hr>\n");
      out.write("                <input type =\"text\" placeholder=\"Name\" name=\"name\" required>  <br />\n");
      out.write("                Address: <br />\n");
      out.write("                <hr>\n");
      out.write("                <input type =\"text\" placeholder=\"Address\" name=\"address\" required>  <br />\n");
      out.write("                Type <br />\n");
      out.write("                <input type =\"text\" placeholder=\"Type\" name=\"type\" required>  <br /><br />\n");
      out.write("                Date of Birth: <br />\n");
      out.write("                <hr>\n");
      out.write("                <input type =\"date\" placeholder=\"Date of Birth\" name=\"DOB\" required>  <br /><br />\n");
      out.write("                <input name=\"completeReg\" type=\"submit\" value=\"Confirm\" class=\"confirmtBtn\">\n");
      out.write("            </form>\n");
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
