package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class givePrescriptionPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            .getPrescrip {\n");
      out.write("                background-color: #696969;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 30%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("            .getPrescrip{\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            textArea{ \n");
      out.write("            font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            width: 30%;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Order Prescription</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Enter prescription: </h1>\n");
      out.write("        ");
 if (request.getAttribute("setMessage") != null) {
                String setMessage = (String) request.getAttribute("setMessage");
                out.println(setMessage);
            }
      out.write("\n");
      out.write("        <form action=\"prescriptionServlet.do\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"eName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newUser.uName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <input type=\"hidden\" name=\"pID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <textarea rows=\"10\" cols=\"35\" name=\"prescription\" placeholder=\"Prescription\"></textarea><br /> <br />\n");
      out.write("            <input type=\"submit\" value=\"Submit Prescription\" name=\"givePrescription\" class=\"getPrescrip\">\n");
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
