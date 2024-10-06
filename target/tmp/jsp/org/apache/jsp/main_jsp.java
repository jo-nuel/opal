/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2024-10-06 23:04:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.User;
import uts.isd.model.AccessLog;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("uts.isd.model.AccessLog");
    _jspx_imports_classes.add("uts.isd.model.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Main</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Imports -->\r\n");
      out.write("        ");

            User user = (User) session.getAttribute("user");
        
      out.write("\r\n");
      out.write("        <!--End of Imports-->\r\n");
      out.write("        \r\n");
      out.write("        <!--IOTBay Header-->\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <p class=\"headerText\">Opal Management System</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header2\">\r\n");
      out.write("            <a href=\"main.jsp\" class=\"header2Button\">MAIN</a>\r\n");
      out.write("            <a href=\"ListOpalCardsServlet?userID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.ID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"header2Button\">CARDS</a>\r\n");
      out.write("            <a  class=\"header2Button\">TOP-UP</a>\r\n");
      out.write("            <a href=\"UserEventController\" class=\"header2Button\">EVENTS</a>\r\n");
      out.write("            <a  class=\"header2Button\">TRAVEL HISTORY</a>\r\n");
      out.write("            <a  class=\"header2Button\">TRIP PLANNER</a>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"logOut.jsp\" class=\"header2Button\">LOGOUT</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--End of IOTBay Header-->\r\n");
      out.write("        \r\n");
      out.write("        <!-- Content-->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div>\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            <table class=\"mainTable\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                <th colspan=\"2\" style=\"text-align: center;\">Account Information</th>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Name</td>\r\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Email</td>\r\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Password</td>\r\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>User ID</td>\r\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.ID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Account Status</td>\r\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.status}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Role</td>\r\n");
      out.write("                    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("             \r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"buttonContainer\">\r\n");
      out.write("                <a class=\"mainButton\" href=\"userEdit.jsp\">\r\n");
      out.write("                    <p>Edit details</p>\r\n");
      out.write("                </a>\r\n");
      out.write("                \r\n");
      out.write("          \r\n");
      out.write("                <form action=\"UserDeleteController\" method=\"post\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <button type=\"submit\" class=\"mainButton\">\r\n");
      out.write("                        <p>Delete account</p>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </form>\r\n");
      out.write("                 <form action=\"AccessLogServlet\">\r\n");
      out.write("                    <button type=\"submit\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"mainButton\">   Access Logs </button>\r\n");
      out.write("                </form>\r\n");
      out.write("                <a class=\"mainButton\" href=\"logOut.jsp\">\r\n");
      out.write("                    <p>Log out</p>\r\n");
      out.write("                </a>\r\n");
      out.write("    \r\n");
      out.write("            </div>           \r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body> \r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
