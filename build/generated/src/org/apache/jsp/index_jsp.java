package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-dark bg-primary\">\n");
      out.write("           <h2 style=\"color:white\" >Student Management System</h2>\n");
      out.write("        </nav>\n");
      out.write("        </br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form id=\"formStudent\" name=\"formStudent\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\" align=\"left\">\n");
      out.write("                            <label>Student Name</label>\n");
      out.write("                            <input type=\"text\" name=\"stname\" id=\"stname\" class=\"form-control\" placeholder=\"studentname\" size=\"30px\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Course</label>\n");
      out.write("                            <input type=\"text\" name=\"course\" id=\"course\" class=\"form-control\" placeholder=\"course\" size=\"30px\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Fee</label>\n");
      out.write("                            <input type=\"text\" name=\"fee\" id=\"fee\" class=\"form-control\" placeholder=\"fee\" size=\"30px\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-info\" id=\"save\" onclick=\"addStudents()\">Add</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-warning\" id=\"reset\" onclick=\"reset()\">Reset</button>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <table id=\"tbl-student\" class=\"table table-bordered\" cellpading=\"0\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        <script src=\"component/jquery-3.6.0.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"component/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"component/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            getall();\n");
      out.write("            var isNew = true;\n");
      out.write("            var studentID = null;\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function addStudents()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                if($(\"#formStudent\").valid())\n");
      out.write("                {\n");
      out.write("                    var url=\"\";\n");
      out.write("                    var data = \"\";\n");
      out.write("                    var method;\n");
      out.write("                    \n");
      out.write("                    if(isNew==true)\n");
      out.write("                    {\n");
      out.write("                        alert(\"Record Added\");\n");
      out.write("                        url='addRecords';\n");
      out.write("                        data = $(\"#formStudent\").serialize();\n");
      out.write("                        method = 'POST';\n");
      out.write("                    }\n");
      out.write("                    else{\n");
      out.write("                        alert(\"Record Updated\");\n");
      out.write("                        url='updateRecords';\n");
      out.write("                        data = $(\"#formStudent\").serialize() + \"&studentID=\" + studentID;\n");
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
      out.write("                            getall();\n");
      out.write("                          \n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function getall()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("               $('#tbl-student').dataTable().fnDestroy();\n");
      out.write("                \n");
      out.write("                $.ajax({\n");
      out.write("                        \n");
      out.write("                        url : \"getRecords\",\n");
      out.write("                        type : \"GET\",\n");
      out.write("                        dataType : \"JSON\",\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        success:function(data) \n");
      out.write("                        {\n");
      out.write("                           $('#tbl-student').dataTable({\n");
      out.write("                               \"aaData\" : data,\n");
      out.write("                               \"scrollX\" :true,\n");
      out.write("                               \"aoColumns\" :\n");
      out.write("                                       [\n");
      out.write("                                            {\"sTitle\": \"Student Name\", \"mData\":\"name\" },\n");
      out.write("                                            {\"sTitle\": \"Course\", \"mData\":\"course\" },\n");
      out.write("                                            {\"sTitle\": \"Fee\", \"mData\":\"fee\" },\n");
      out.write("                                            \n");
      out.write("                                           {\"sTitle\": \"Edit\", \"mData\":\"id\",\n");
      out.write("                                              \"render\": function(mData,type,row,meta)\n");
      out.write("                                              {\n");
      out.write("                                                  return '<button class=\"btn btn-success\" onclick=\"get_details('+ mData +')\">Edit</button>'\n");
      out.write("                                              }\n");
      out.write("                                            },\n");
      out.write("                                            \n");
      out.write("                                            {\"sTitle\": \"Delete\", \"mData\":\"id\",\n");
      out.write("                                              \"render\": function(mData,type,row,meta)\n");
      out.write("                                              {\n");
      out.write("                                                  return '<button class=\"btn btn-danger\" onclick=\"get_delete('+ mData +')\">Delete</button>'\n");
      out.write("                                              }\n");
      out.write("                                            }, \n");
      out.write("                                   \n");
      out.write("                                       ]\n");
      out.write("                               \n");
      out.write("                           });\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function get_details(id){\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url : \"edit_return\",\n");
      out.write("                    data : {\"id\":id},\n");
      out.write("                    \n");
      out.write("                    success : function(data){\n");
      out.write("                        isNew = false\n");
      out.write("                        var obj = JSON.parse(data);\n");
      out.write("                        studentID = obj[0].id\n");
      out.write("                        $('#stname').val(obj[0].stname);\n");
      out.write("                        $('#course').val(obj[0].scourse);\n");
      out.write("                        $('#fee').val(obj[0].sfee);\n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function get_delete(id){\n");
      out.write("                \n");
      out.write("                alert(\"Record Deleted\");\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url : \"deleteRecords\",\n");
      out.write("                    dataType : \"JSON\",\n");
      out.write("                    data : {\"id\":id},\n");
      out.write("                    \n");
      out.write("                    success : function(data)\n");
      out.write("                    {\n");
      out.write("                        \n");
      out.write("                        getall();\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
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
