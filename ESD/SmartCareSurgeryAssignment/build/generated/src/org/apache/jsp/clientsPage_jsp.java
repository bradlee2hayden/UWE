package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clientsPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            body {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            .submitBtn {\n");
      out.write("                background-color: #696969;\n");
      out.write("                color: white;\n");
      out.write("                padding: 16px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 25%;\n");
      out.write("                opacity: 0.9;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submitBtn:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }  \n");
      out.write("            .presBtn {\n");
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
      out.write("            .presBtn:hover {\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <title>Clients Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("            <c:choose>\n");
      out.write("                <c:when test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty param.cType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <h2>Select patient type:</h2>\n");
      out.write("                    <hr>\n");
      out.write("                    <form action=\"clientsServlet.do\" name=\"cTypeForm\" method=\"GET\">\n");
      out.write("                        <input type=\"radio\" name=\"cType\" value=\"all\"> All <br />\n");
      out.write("                        <hr>\n");
      out.write("                        <input type=\"radio\" name=\"cType\" value=\"private\"> Private <br />\n");
      out.write("                        <hr>\n");
      out.write("                        <input type=\"radio\" name=\"cType\" value=\"nhs\"> NHS <br /><br />\n");
      out.write("                        <hr>\n");
      out.write("                        <input type=\"submit\" name=\"submitcType\" value=\"Submit\" class=\"submitBtn\">\n");
      out.write("                    </form>\n");
      out.write("                </c:when>\n");
      out.write("                <c:otherwise>\n");
      out.write("                    <h2>Select client: </h2>\n");
      out.write("                    <form name=\"clientForm\" action=\"prescriptionServlet.do\" method=\"POST\">\n");
      out.write("                        <hr>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Client Type</th>\n");
      out.write("                                <th>Client Name</th>\n");
      out.write("                                <th>Client Address</th>\n");
      out.write("                                <th>Client</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientsList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"client\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                    <td><input type=\"checkbox\" name=\"cID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${client.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </c:forEach>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"4\"><input type=\"submit\" name=\"giveprescription\" value=\"Give Prescription\" class=\"presBtn\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </c:otherwise>\n");
      out.write("            </c:choose>\n");
      out.write("        </main>\n");
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
