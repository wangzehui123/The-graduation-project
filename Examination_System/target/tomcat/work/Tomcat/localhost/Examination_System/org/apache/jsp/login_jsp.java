/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-29 14:21:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<!-- 引入bootstrap -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\">\n");
      out.write("\t<!-- 引入JQuery  bootstrap.js-->\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\tbody{\n");
      out.write("\t   background: url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/a.jpg\")repeat;\n");
      out.write("\t}\n");
      out.write("\t#login-box {\n");
      out.write("\t\t/*border:1px solid #F00;*/\n");
      out.write("\t\tpadding: 35px;\n");
      out.write("\t\tborder-radius:15px;\n");
      out.write("\t\tbackground: #56666B;\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\" id=\"top\">\n");
      out.write("\t\t<div class=\"row\" style=\"margin-top: 280px; \">\n");
      out.write("\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t\t<div class=\"col-md-4\" id=\"login-box\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login\" id=\"from1\" method=\"post\">\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t    <label for=\"firstname\" class=\"col-sm-4 control-label\">用户名</label>\n");
      out.write("\t\t\t\t    <div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t      <input type=\"text\" class=\"form-control\" id=\"userID\" placeholder=\"请输入名字\" name=\"username\">\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t    <label for=\"lastname\" class=\"col-sm-4 control-label\">密码</label>\n");
      out.write("\t\t\t\t    <div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t      <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"请输入密码\" name=\"password\">\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t\t    ");
      out.write("\n");
      out.write("\t\t\t\t      ");
      out.write("\n");
      out.write("\t\t\t\t        ");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t      ");
      out.write("\n");
      out.write("\t\t\t\t    ");
      out.write("\n");
      out.write("\t\t\t\t  ");
      out.write("\n");
      out.write("\t\t\t\t  <div class=\"form-group pull-right\" style=\"margin-right: 15px;\">\n");
      out.write("\t\t\t\t    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("\t\t\t\t      <button type=\"submit\" class=\"btn btn-default btn-info\">登录</button>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
