package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container\">\n");
      out.write("                    <form id=\"form-reg\" name=\"form-reg\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\" >\n");
      out.write("                            <label>UserName</label>\n");
      out.write("                            <input type=\"text\" name=\"name\" id=\"name\" class=\"form-control\"  placeholder=\"name\" size=\"30px\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Email</label>\n");
      out.write("                            <input type=\"text\" name=\"email\" id=\"email\" class=\"form-control\"  placeholder=\"email\" size=\"30px\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Password</label>\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\"  placeholder=\"password\" size=\"30px\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-info\" id=\"save\" onclick=\"register()\">Register</button></br>\n");
      out.write("                            <a href=\"Login.jsp\">Already have an account?</a>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("        <script src=\"component/jquery-3.6.0.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"component/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"component/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            var isNew = true;\n");
      out.write("            \n");
      out.write("            function register()\n");
      out.write("            {\n");
      out.write("                if($(\"#form-reg\").valid())\n");
      out.write("                {\n");
      out.write("                    var url=\"\";\n");
      out.write("                    var data = \"\";\n");
      out.write("                    var method;\n");
      out.write("                    \n");
      out.write("                    if(isNew==true)\n");
      out.write("                    {\n");
      out.write("                        url='register';\n");
      out.write("                        data = $(\"#form-reg\").serialize();\n");
      out.write("                        method = 'POST';\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    $.ajax({\n");
      out.write("                        type : method,\n");
      out.write("                        url : url,\n");
      out.write("                        dataType : 'JSON',\n");
      out.write("                        data : data,\n");
      out.write("                        \n");
      out.write("                        success:function(data) \n");
      out.write("                        {\n");
      out.write("                            if(isNew==true)\n");
      out.write("                            {\n");
      out.write("                                alert(\"Registation Successful\");\n");
      out.write("                                \n");
      out.write("                                window.location.replace(\"Login.jsp\");\n");
      out.write("                                \n");
      out.write("                            }\n");
      out.write("                          \n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                    });\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
