package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table width=\"100%\" height=\"100%\" border=\"0\" cellpadding =\"0\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" valign=\"middle\">\n");
      out.write("                        <table class=\"table-bordered\" cellpading=\"3\" cellspacing=\"3\" width=\"350\" border=\"0\" bgcolor=\"#FFFFFF\">\n");
      out.write("                            <form name=\"form-login\" id=\"form-login\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"25\" colspan=\"2\" align=\"left\" valign=\"middle\" bgcolor=\"#FF9900\" class= \"style2\">\n");
      out.write("                                        <div align=\"center\">\n");
      out.write("                                            <strong>Login</strong>\n");
      out.write("                                        </div>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                <div id=\"err\" style=\"color:red\">\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"118px\" align=\"left\" valign=\"middle\" class=\"style1\">\n");
      out.write("                                        Username\n");
      out.write("                                    </td>\n");
      out.write("                                    <td width=\"118px\" align=\"left\" valign=\"middle\" class=\"style1\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" size=\"10px\" id=\"username\" placeholder=\"username\" name=\"username\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"118px\" align=\"left\" valign=\"middle\" class=\"style1\">\n");
      out.write("                                        Password\n");
      out.write("                                    </td>\n");
      out.write("                                    <td width=\"118px\" align=\"left\" valign=\"middle\" class=\"style1\">\n");
      out.write("                                        <input type=\"password\" class=\"form-control\" size=\"10px\" id=\"password\" placeholder=\"password\" name=\"password\">\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"2\" valign=\"middle\" class=\"style1\" align=\"center\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-primary\" onclick=\"login()\">Sign In</button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-warning\" onclick=\"reset()\">Reset</button></br></br>\n");
      out.write("                                        <a href=\"Registration.jsp\">Go to Register</a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <p class=\"mb-0\">Don't have an account? <a href=\"/StockProject/jsp/SignIn.jsp\" class=\"text-white-50 fw-bold\">Sign Up</a></p>\n");
      out.write("                            </form>\n");
      out.write("                            \n");
      out.write("                        </table>  \n");
      out.write("                        \n");
      out.write("                    </td> \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"component/jquery-3.6.0.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"component/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"component/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            var msg = null;\n");
      out.write("            \n");
      out.write("            function login()\n");
      out.write("            {\n");
      out.write("                if($('#username').val()==\"\")\n");
      out.write("                {\n");
      out.write("                    $('#username').parent('td').addClass('has-error');\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if($('#password').val()==\"\")\n");
      out.write("                {\n");
      out.write("                    $('#password').parent('td').addClass('has-error');\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                var data=$(\"#form-login\").serialize();\n");
      out.write("                \n");
      out.write("                $.ajax({\n");
      out.write("                    type : 'POST',\n");
      out.write("                    url : 'LoginValidate',\n");
      out.write("                    dataType : 'JSON',\n");
      out.write("                    data : data,\n");
      out.write("                    \n");
      out.write("                    success:function(data) \n");
      out.write("                        {\n");
      out.write("                            msg = data[0].msg\n");
      out.write("                            \n");
      out.write("                            if(msg == 1)\n");
      out.write("                            {\n");
      out.write("                                window.location.replace(\"index.jsp\");\n");
      out.write("                            }\n");
      out.write("                            else if(msg==3)\n");
      out.write("                            {\n");
      out.write("                                $(\"#err\").hide().html(\"Username or Password Incorrect!\").fadeIn('slow');\n");
      out.write("                            }\n");
      out.write("                          \n");
      out.write("                        }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
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
