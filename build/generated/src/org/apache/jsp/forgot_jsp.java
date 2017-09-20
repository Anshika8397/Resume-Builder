package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import query.*;
import java.sql.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>LOGIN PAGE</title>\n");
      out.write("        <style>\n");
      out.write("             .d{\n");
      out.write("                font-size:25px;font-style:normal;font-weight:bolder \n");
      out.write("            }\n");
      out.write("            .input{\n");
      out.write("                height:40px;font-size:14pt;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       <form name=\"myform\" method=\"get\" action=\"forgotpassword.jsp\">\n");
      out.write("           <center>\n");
      out.write("               <br>   \n");
      out.write("               <br>\n");
      out.write("               <br>   \n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <center>\n");
      out.write("                   <font size=8px >Confirm your Password</font>\n");
      out.write("               </center>\n");
      out.write("               <br>\n");
      out.write("               <br>\n");
      out.write("               <font>\n");
      out.write("            <table cellspacing=\"20\">\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td class=\"d\">\n");
      out.write("                        User ID:\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"input\" type=\"text\" name=\"uid\"  />\n");
      out.write("                    </td>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"d\">\n");
      out.write("                        Security Question\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"ques\" class=\"input\">\n");
      out.write("                            <option selected> What is your pet name?</option selected>\n");
      out.write("                            <option>What is your favorite Color?\n");
      out.write("                            <option>What is  your Hobby?\n");
      out.write("                            <option>What is your nick name?\n");
      out.write("                            </option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"d\">\n");
      out.write("                        Answer:\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"input\" type=\"text\" name=\"ans\"  />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                        <input class=\"input\" type=\"submit\" value=\"confirm\" name=\"submit\">\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write(" \n");
      out.write("  </table>\n");
      out.write("        </font>    </center>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("  </html>\n");
      out.write("\n");
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
