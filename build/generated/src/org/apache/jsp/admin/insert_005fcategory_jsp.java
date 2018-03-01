package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.CategoryDAO;

public final class insert_005fcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quản lý danh mục</title>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <link href=\" ");
      out.print(request.getContextPath() );
      out.write("/css/mos-style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"rightContent\">\n");
      out.write("               \n");
      out.write("               \n");
      out.write("<!--                                          <div class=\"informasi\">\n");
      out.write("                                        ini adalah notifikasi pertanda informasi\n");
      out.write("                                    </div>\n");
      out.write("                \n");
      out.write("                                    <div class=\"gagal\">\n");
      out.write("                                        ini adalah notifikasi pertanda gagal\n");
      out.write("                                    </div>\n");
      out.write("                \n");
      out.write("                                    <div class=\"sukses\">\n");
      out.write("                                        ini adalah notifikasi pertanda sukses\n");
      out.write("                                    </div>-->\n");
      out.write("                    <h3>Thêm Danh Mục</h3>\n");
      out.write("                    <form action=\"../ManagerCategoryServlet\" method=\"post\">\n");
      out.write("                    <table width=\"95%\">\n");
      out.write("                          <tr>\n");
      out.write("                            <td style=\"float: right\"><b>ID danh mục </b></td>\n");
      out.write("                            <td><input type=\"text\" class=\"sedang\" name=\"idDanhMuc\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"float: right\"><b>Tên danh mục:</b></td>\n");
      out.write("                            <td><input type=\"text\" class=\"sedang\" name=\"tenDanhMuc\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr><td></td><td>\n");
      out.write("                                <input type=\"hidden\" name=\"command\" value=\"insert\">\n");
      out.write("                                <input type=\"submit\" class=\"button\" value=\"Lưu dữ liệu\">\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
