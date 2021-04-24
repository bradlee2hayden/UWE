package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prescriptionPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            .prescriptionbtn {\n");
      out.write("                background-color: #696969;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("            .prescriptionbtn{\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            .prescriptionDeletebtn {\n");
      out.write("                background-color: #696969;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("            .prescriptionDeletebtn{\n");
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
      out.write("        </style>\n");
      out.write("        <title>Prescription Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"prescriptionServlet.do\" name=\"prescription\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Prescription: </h1>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <label for=\"sDate\"><b>Date: </b></label>\n");
      out.write("                <input type=\"date\" placeholder=\"Date\" name=\"sdate\" id=\"sdate\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"sTime\"><b>Time: </b></label>\n");
      out.write("                <input type=\"time\" placeholder=\"Time\" name=\"stime\" step=\"600\" id=\"stime\" >\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"prescription\"><b>Prescription: </b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Prescription\" name=\"prescription\" id=\"prescription\" >\n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                <hr>\n");
      out.write("                <button type=\"submit\" class=\"prescriptionbtn\">Submit Prescription</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"deleteTest.do\" name=\"prescription\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <label for=\"prescription\"><b>Delete Prescription: </b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"pID\" name=\"pID\" id=\"pID\" >\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                <hr>\n");
      out.write("                <button type=\"submit\" class=\"prescriptionDeletebtn\">Delete Prescription</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
