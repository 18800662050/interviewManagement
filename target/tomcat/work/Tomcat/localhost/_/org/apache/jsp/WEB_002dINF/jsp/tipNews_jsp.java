/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-11 02:57:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tipNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes\"/>\r\n");
      out.write("    <title>**</title>、\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("   <script type=\"text/javascript\" src=\"../../myjs/jquery.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"/ueditor.config.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"/editor/ueditor.all.js\"> </script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf-8\" src=\"/editor/lang/zh-cn/zh-cn.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("    <input id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"display: none\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label class=\"col-sm-1 control-label\">题目</label>\r\n");
      out.write("        <div class=\"col-sm-11\">\r\n");
      out.write("            <input class=\"form-control\" id=\"title\" type=\"text\"  placeholder=\"新闻题目\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group has-success\">\r\n");
      out.write("        <label class=\"col-sm-1 control-label\" for=\"author\">\r\n");
      out.write("            作者\r\n");
      out.write("        </label>\r\n");
      out.write("        <div class=\"col-sm-11\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"author\" placeholder=\"新闻作者\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.author}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group has-warning\">\r\n");
      out.write("        <label class=\"col-sm-1 control-label\" for=\"digest\">\r\n");
      out.write("            标记\r\n");
      out.write("        </label>\r\n");
      out.write("        <div class=\"col-sm-11\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"digest\" placeholder=\"如：学术内容\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.digest}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group has-error\">\r\n");
      out.write("        <label class=\"col-sm-1 control-label\" for=\"content\">\r\n");
      out.write("            新闻内容\r\n");
      out.write("        </label>\r\n");
      out.write("        <div class=\"col-sm-11\">\r\n");
      out.write("            <textarea type=\"text\"  id=\"content\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group has-error\">\r\n");
      out.write("        <label class=\"col-sm-1 control-label\" for=\"content\">\r\n");
      out.write("            内容介绍\r\n");
      out.write("        </label>\r\n");
      out.write("        <div class=\"col-sm-11\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"introduce\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${news.introduce}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\" align=\"center\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("                data-toggle=\"button\" onclick=\"xiuGaiNews()\"> 确认修改\r\n");
      out.write("        </button>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    var ue = UE.getEditor('content');\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    /**添加新闻*/\r\n");
      out.write("    function xiuGaiNews() {\r\n");
      out.write("        var id=$(\"#id\").val();\r\n");
      out.write("        var title=$(\"#title\").val();\r\n");
      out.write("        var author=$(\"#author\").val();\r\n");
      out.write("        var digest=$(\"#digest\").val();\r\n");
      out.write("        var content=UE.getEditor('content').getContent();\r\n");
      out.write("        var introduce=$(\"#introduce\").val();\r\n");
      out.write("        if (title==''||title==null||author==''||author==null||digest==''||digest==null||content==''||content==null||introduce==''||introduce==null)\r\n");
      out.write("        {\r\n");
      out.write("            alert(\"必要内容不可为空\");\r\n");
      out.write("        }\r\n");
      out.write("        else\r\n");
      out.write("        {\r\n");
      out.write("            $.post(\"/news/update\",{id:id,title:title,author:author,digest:digest,content:content,introduce:introduce},function (data) {\r\n");
      out.write("                alert(\"修改成功\");\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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
