package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class electonics_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("function validate() { \n");
      out.write(" \n");
      out.write("\t var x = document.forms[\"myForm\"][\"name\"].value;\n");
      out.write("    if (x == \"\") {\n");
      out.write("        alert(\"Name must be filled out\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write(" var x = document.forms[\"myForm\"][\"ty\"].value;\n");
      out.write("    if (x == \"\") {\n");
      out.write("        alert(\"type must be filled out\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("     var x = document.forms[\"myForm\"][\"qa\"].value;\n");
      out.write("    if (x == \"\") {\n");
      out.write("        alert(\"quantiy must be filled out\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("     var x = document.forms[\"myForm\"][\"pr\"].value;\n");
      out.write("    if (x == \"\") {\n");
      out.write("        alert(\"price must be filled out\");\n");
      out.write("        return false;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-page\">\n");
      out.write("         <div class=\"form\">\n");
      out.write("           <form name =\"myForm\" action=\"/session/pdb.jsp\" method=\"post\"  onsubmit=\"return validate()\" >\n");
      out.write("            <input type=\"text\" name=\"name\"  placeholder=\"name\"/>\n");
      out.write("           <input type=\"text\" name=\"ty\" placeholder=\"type\"/>\n");
      out.write("           <input type=\"text\"  name=\"qa\" placeholder=\"quantity\"/>\n");
      out.write("             <input type=\"text\"  name=\"pr\" placeholder=\"price\"/>\n");
      out.write("                <button>ADD</button>\n");
      out.write("                 </form>\n");
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
