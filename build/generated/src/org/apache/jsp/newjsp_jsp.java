package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<!--\n");
      out.write("Template Name: Darkness\n");
      out.write("Author: <a href=\"http://www.os-templates.com/\">OS Templates</a>\n");
      out.write("Author URI: http://www.os-templates.com/\n");
      out.write("Licence: Free to use under our free template licence terms\n");
      out.write("Licence URI: http://www.os-templates.com/template-terms\n");
      out.write("-->\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"layout/styles/layout.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <div id=\"logo\">\n");
      out.write("      <h1><a href=\"index.html\">Resume Builder</a></h1>\n");
      out.write("      <p>One Step Closer To Your Future</p>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"topnav\">\n");
      out.write("      <ul>\n");
      out.write("        <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"pages/style-demo.html\">ABOUT US</a></li>\n");
      out.write("        <li><a href=\"login.jsp\">LOGIN</a></li>\n");
      out.write("        <li><a href=\"#\">SIGN UP</a></li>\n");
      out.write("       \n");
      out.write("   \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("  <div id=\"latest\">\n");
      out.write("    <div class=\"fl_left\"><a href=\"#\"><img src=\"1.jpg\" alt=\"h\" /></a></div>\n");
      out.write("    <div class=\"fl_right\">\n");
      out.write("      <h2>Resume Builder</h2>\n");
      out.write("      <p>Resume Builder is the best way to create a professional resume that will help you land your dream job,or at least get you one step closer to it.</p>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\"><img src=\"1.bmp\" alt=\"\" /></a></li>\n");
      out.write("        <li><a href=\"#\"><img src=\"2.bmp\" alt=\"\" /></a></li>\n");
      out.write("        <li class=\"last\"><a href=\"#\"><img src=\"3.bmp\" alt=\"\" /></a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("  <div id=\"intro\">\n");
      out.write("    <ul>\n");
      out.write("      <li>\n");
      out.write("        <h2>Create Your Resume</h2>\n");
      out.write("        <div class=\"imgholder\"><a href=\"#\"><img src=\"2.jpg\" alt=\"\" /></a></div>\n");
      out.write("       \n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <h2>Download Your Resume</h2>\n");
      out.write("        <div class=\"imgholder\"><a href=\"#\"><img src=\"3.jpg\" alt=\"\" /></a></div>\n");
      out.write("        \n");
      out.write("      </li>\n");
      out.write("      <li class=\"last\">\n");
      out.write("        <h2>Publish Your Resume</h2>\n");
      out.write("        <div class=\"imgholder\"><a href=\"#\"><img src=\"4.jpg\" alt=\"\" /></a></div>\n");
      out.write("        \n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <br class=\"clear\" />\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
