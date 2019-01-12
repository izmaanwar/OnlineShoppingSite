package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addwomen_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("function validate() { \r\n");
      out.write(" \r\n");
      out.write("\t var x = document.forms[\"myForm\"][\"name\"].value;\r\n");
      out.write("    if (x == \"\") {\r\n");
      out.write("        alert(\"Name must be filled out\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write(" var x = document.forms[\"myForm\"][\"ty\"].value;\r\n");
      out.write("    if (x == \"\") {\r\n");
      out.write("        alert(\"type must be filled out\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("     var x = document.forms[\"myForm\"][\"qa\"].value;\r\n");
      out.write("    if (x == \"\") {\r\n");
      out.write("        alert(\"quantiy must be filled out\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("     var x = document.forms[\"myForm\"][\"pr\"].value;\r\n");
      out.write("    if (x == \"\") {\r\n");
      out.write("        alert(\"price must be filled out\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"login-page\">\r\n");
      out.write("         <div class=\"form\">\r\n");
      out.write("           <form name =\"myForm\" action=\"/session/wdb.jsp\" method=\"post\"  onsubmit=\"return validate()\" >\r\n");
      out.write("            <input type=\"text\" name=\"name\"  placeholder=\"name\"/>\r\n");
      out.write("           <input type=\"text\" name=\"ty\" placeholder=\"type\"/>\r\n");
      out.write("           <input type=\"text\"  name=\"qa\" placeholder=\"quantity\"/>\r\n");
      out.write("             <input type=\"text\"  name=\"pr\" placeholder=\"price\"/>\r\n");
      out.write("                <button>ADD</button>\r\n");
      out.write("                 </form>\r\n");
      out.write("      </body>\r\n");
      out.write("</html>\r\n");
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
