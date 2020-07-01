/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-11 02:34:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teacher_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>**</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"teacherDg\" title=\"老师管理\" class=\"easyui-datagrid\" pagination=\"true\"\r\n");
      out.write("       url=\"/teacher/list\"\r\n");
      out.write("       toolbar=\"#teacher-toolbars\"\r\n");
      out.write("       rownumbers=\"true\" fitColumns=\"true\" pageSize=\"30\" singleSelect=\"true\" fit=\"true\">\r\n");
      out.write("    <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("        <th data-options=\"field:'id'\">教师编号</th>\r\n");
      out.write("        <th data-options=\"field:'cname'\">姓名</th>\r\n");
      out.write("        <th data-options=\"field:'ename'\"></th>\r\n");
      out.write("        <th data-options=\"field:'sex'\">性别</th>\r\n");
      out.write("        <th data-options=\"field:'status'\">身份</th>\r\n");
      out.write("        <th field=\"department\" data-options=\"formatter:formatDepartment,width:150\">院系</th>\r\n");
      out.write("        <th field=\"address\" data-options=\"formatter:formatAddress,width:200\" nowrap=\"flase\">地址</th>\r\n");
      out.write("        <th data-options=\"field:'email'\">邮箱</th>\r\n");
      out.write("        <th field=\"image\" data-options=\"formatter:formatImag\" height=\"160\" width=\"119\">照片</th>\r\n");
      out.write("        <th data-options=\"field:'postcode'\">邮编</th>\r\n");
      out.write("        <th field=\"research\" data-options=\"formatter:formatResearch,width:200\" nowrap=\"flase\">研究方向</th>\r\n");
      out.write("        <th field=\"projects\" data-options=\"formatter:formatProject,width:200\" nowrap=\"nowrap\">经历</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"teacher-toolbars\">\r\n");
      out.write("    <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\" onclick=\"addTeacher()\">添加</a>\r\n");
      out.write("    <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\" onclick=\"editTeacher()\">修改</a>\r\n");
      out.write("    <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\" onclick=\"destroyTeacher()\">删除</a>\r\n");
      out.write("\r\n");
      out.write("    <a href=\"#\" class=\"easyui-linkbutton\"  plain=\"true\" onclick=\"addTeacherImage()\">上传老师照片</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"imageTeacherDlg\" class=\"easyui-dialog\" style=\"width:300px;height:300px;padding:10px 20px\"\r\n");
      out.write("     closed=\"true\" buttons=\"#imageTeacherDlg-buttons\">\r\n");
      out.write("    <div class=\"ftitle\" align=\"center\">上传照片</div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <form  enctype=\"multipart/form-data\" method=\"post\" id=\"Addimage\">\r\n");
      out.write("        <input name=\"id\" class=\"easyui-validatebox\" required=\"true\" style=\"display:none;\">\r\n");
      out.write("        <input name=\"ename\" class=\"easyui-validatebox\" required=\"true\" style=\"display:none;\">\r\n");
      out.write("        <input type=\"file\" name=\"uploadFile\" accept=\"image/*\" multiple=\"multiple\"><br><br>\r\n");
      out.write("        <input type=\"button\" value=\"上传\" onclick=\"TeacherImageAdd()\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"imageTeacherDlg-buttons\">\r\n");
      out.write("    <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("       onclick=\"javascript:$('#imageTeacherDlg').dialog('close')\">取消</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"teacherDlg\" class=\"easyui-dialog\" style=\"width:500px;height:500px;padding:10px 20px\"\r\n");
      out.write("     closed=\"true\" buttons=\"#teacherDlg-buttons\">\r\n");
      out.write("    <div class=\"ftitle\" align=\"center\">老师编辑</div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <form id=\"teacherFm\" method=\"post\">\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>编号:</label>\r\n");
      out.write("            <input name=\"id\" class=\"easyui-validatebox\" required=\"true\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>名字:</label>\r\n");
      out.write("            <input name=\"cname\" class=\"easyui-validatebox\" required=\"true\" placeholder=\"中文名字\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>名字:</label>\r\n");
      out.write("            <input name=\"ename\" class=\"easyui-validatebox\" required=\"true\" placeholder=\"英文名字\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>性别:</label>\r\n");
      out.write("            <input name=\"sex\" class=\"easyui-validatebox\" required=\"true\" placeholder=\"男或女\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>身份:</label>\r\n");
      out.write("            <input name=\"status\" class=\"easyui-validatebox\" required=\"true\" placeholder=\"博导或硕导\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>院系:</label>\r\n");
      out.write("            <input name=\"department\" class=\"easyui-validatebox\" required=\"true\" placeholder=\"如西北大学计算机院\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>地址:</label>\r\n");
      out.write("            <input name=\"address\" class=\"easyui-validatebox\" required=\"true\" placeholder=\"填写地址\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>邮箱:</label>\r\n");
      out.write("            <input name=\"email\" class=\"easyui-validatebox\" required=\"true\" placeholder=\"填写邮箱\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>邮编:</label>\r\n");
      out.write("            <input name=\"postcode\" class=\"easyui-validatebox\" required=\"true\" placeholder=\"填写邮编\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label style=\"margin-bottom: 10%\">方向:</label>\r\n");
      out.write("            <textarea name=\"research\" class=\"easyui-validatebox\" required=\"true\" style=\"height: 150px\" ></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"fitem\">\r\n");
      out.write("            <label>经历:</label>\r\n");
      out.write("            <textarea name=\"projects\" class=\"easyui-validatebox\" required=\"true\" style=\"height: 150px\"></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"teacherDlg-buttons\">\r\n");
      out.write("    <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\" onclick=\"teacherSave()\">保存</a>\r\n");
      out.write("    <a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("       onclick=\"javascript:$('#teacherDlg').dialog('close')\">取消</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    /**经历换行*/\r\n");
      out.write("    function formatProject(value, row, index) {\r\n");
      out.write("        return '<div style=\"width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;\">' + value + '</div>';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**方向换行*/\r\n");
      out.write("    function formatResearch(value, row, index) {\r\n");
      out.write("        return '<div style=\"width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;\">' + value + '</div>';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**地址换行*/\r\n");
      out.write("    function formatAddress(value, row, index) {\r\n");
      out.write("        return '<div style=\"width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;\">' + value + '</div>';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**院系换行*/\r\n");
      out.write("    function formatDepartment(value, row, index) {\r\n");
      out.write("        return '<div style=\"width=250px;word-break:break-all;word-wrap:break-word;white-space:pre-wrap;\">' + value + '</div>';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /**得到照片*/\r\n");
      out.write("    function formatImag(val, row) {\r\n");
      out.write("        if (val)\r\n");
      out.write("            return \"<img src='\" + val + \"'alt='hah' height='160' width='119'> \";\r\n");
      out.write("        else\r\n");
      out.write("            return null;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    /**添加老师*/\r\n");
      out.write("    function addTeacher(){\r\n");
      out.write("        $('#teacherDlg').dialog('open').dialog('setTitle','添加老师');\r\n");
      out.write("        $('#teacherFm').form('clear');\r\n");
      out.write("        teacherUrl = '/teacher/save';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    /**删除老师*/\r\n");
      out.write("    function destroyTeacher() {\r\n");
      out.write("        var row = $('#teacherDg').datagrid('getSelected');\r\n");
      out.write("        if (row == null)\r\n");
      out.write("            $.messager.alert(\"系统提示\", \"请选中要删除的名单\");\r\n");
      out.write("        else {\r\n");
      out.write("            $.messager.confirm(\"警告\", \"您确定删除，删除后无法更改\", function (data) {\r\n");
      out.write("                if (data) {\r\n");
      out.write("                    $.post('/teacher/delete', {id: row.id}, function (data) {\r\n");
      out.write("                        if (data.success) {\r\n");
      out.write("                            $.messager.alert(\"系统提示\", \"删除成功\");\r\n");
      out.write("                            $(\"#teacherDg\").datagrid(\"reload\");\r\n");
      out.write("                        }\r\n");
      out.write("                    }, 'json');\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    var teacherUrl = \"\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    /**修改老师信息*/\r\n");
      out.write("    function editTeacher() {\r\n");
      out.write("        var row = $('#teacherDg').datagrid('getSelected');\r\n");
      out.write("        if (row) {\r\n");
      out.write("            $('#teacherDlg').dialog('open').dialog('setTitle', '修改教师');\r\n");
      out.write("            $('#teacherFm').form('load', row);\r\n");
      out.write("            teacherUrl = \"/teacher/update\";\r\n");
      out.write("        } else {\r\n");
      out.write("            $.messager.alert(\"系统提示\", \"请选中要修改的教师\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function teacherSave() {\r\n");
      out.write("\r\n");
      out.write("        /**添加用户*/\r\n");
      out.write("        if (teacherUrl == '/teacher/save') {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            $('#teacherFm').form('submit', {\r\n");
      out.write("                url: teacherUrl,\r\n");
      out.write("                onSubmit: function () {\r\n");
      out.write("                    return $(this).form('validate');\r\n");
      out.write("                },\r\n");
      out.write("                success: function (result) {\r\n");
      out.write("                    var result = eval('(' + result + ')');\r\n");
      out.write("                    if (result.success) {\r\n");
      out.write("                        $.messager.alert(\"系统提示\", \"操作成功！\");\r\n");
      out.write("                        //关闭对话框\r\n");
      out.write("                        $(\"#teacherDlg\").dialog(\"close\");\r\n");
      out.write("                        //刷新查询结果\r\n");
      out.write("                        $(\"#teacherDg\").datagrid(\"reload\");\r\n");
      out.write("                    } else {\r\n");
      out.write("                        $.messager.alert(\"系统提示\", result.error);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /**修改用户*/\r\n");
      out.write("        if (teacherUrl == '/teacher/update') {\r\n");
      out.write("\r\n");
      out.write("            /**若ID 没修改则通过此方法修改*/\r\n");
      out.write("            $('#teacherFm').form('submit', {\r\n");
      out.write("                url: teacherUrl,\r\n");
      out.write("                onSubmit: function () {\r\n");
      out.write("                    return $(this).form('validate');\r\n");
      out.write("                },\r\n");
      out.write("                success: function (result) {\r\n");
      out.write("                    var result = eval('(' + result + ')');\r\n");
      out.write("                    if (result.success) {\r\n");
      out.write("                        $.messager.alert(\"系统提示\", \"修改成功！\");\r\n");
      out.write("                        //关闭对话框\r\n");
      out.write("                        $(\"#teacherDlg\").dialog(\"close\");\r\n");
      out.write("                        //刷新查询结果\r\n");
      out.write("                        $(\"#teacherDg\").datagrid(\"reload\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    /**打开上传的页面*/\r\n");
      out.write("    function addTeacherImage() {\r\n");
      out.write("        var row = $('#teacherDg').datagrid('getSelected');\r\n");
      out.write("        if (row) {\r\n");
      out.write("            $('#Addimage').form('load', row);\r\n");
      out.write("            $('#imageTeacherDlg').dialog('open').dialog('setTitle', '添加照片');\r\n");
      out.write("        } else {\r\n");
      out.write("            $.messager.alert(\"系统提示\", \"请选中老师\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function TeacherImageAdd() {\r\n");
      out.write("        $('#Addimage').form('submit',{\r\n");
      out.write("            url: '/teacher/image',\r\n");
      out.write("            onSubmit: function(){\r\n");
      out.write("                return $(this).form('validate');\r\n");
      out.write("            },\r\n");
      out.write("            success: function(result){\r\n");
      out.write("                var result = eval('('+result+')');\r\n");
      out.write("                if (result.success){\r\n");
      out.write("                    $.messager.alert(\"系统提示\",\"操作成功！\");\r\n");
      out.write("\r\n");
      out.write("                    //关闭对话框\r\n");
      out.write("                    $(\"#imageTeacherDlg\").dialog(\"close\");\r\n");
      out.write("                    //刷新查询结果\r\n");
      out.write("                    $(\"#teacherDg\").datagrid(\"reload\");\r\n");
      out.write("                }else{\r\n");
      out.write("                    $.messager.alert(\"系统提示\",result.error);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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