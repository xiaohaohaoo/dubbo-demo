/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2013-04-01 03:54:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.member.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005fappend_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/includes/page_inc.jsp", Long.valueOf(1364442956656L));
  }

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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"x-ua-compatible\" content=\"ie=7\" />\r\n");
      out.write("\t\t<title>产品附加图片</title>\r\n");
      out.write("\t\t<link href=\"/css/member/mian.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"/css/member/index.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/member/club.css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/js/gen.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/jquery-1.8.0.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(\"document\").ready(function(){\r\n");
      out.write("\t  setTimeout(function(){\r\n");
      out.write("     \t\tif ($.browser.msie) {\r\n");
      out.write("\t\t\t\t\t//alert(\"这是IE\" + $.browser.version);\r\n");
      out.write("\t\t\t\t\t$(parent.document.body).find(\"#iframeId\").attr(\"height\",\r\n");
      out.write("\t\t\t\t\t\t\t$(\"body\").outerHeight()+250);\r\n");
      out.write("\t\t\t\t} else if ($.browser.mozilla) {\r\n");
      out.write("\t\t\t\t\t//alert(\"这是火狐浏览器\" + $.browser.version);\r\n");
      out.write("\t\t\t\t\t$(parent.document.body).find(\"#iframeId\").attr(\"height\",\r\n");
      out.write("\t\t\t\t\t\t\t500);\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t//alert(\"这是谷歌或者其他浏览器\")\r\n");
      out.write("\t\t\t\t\t$(parent.document.body).find(\"#iframeId\").attr(\"height\",\r\n");
      out.write("\t\t\t\t\t500);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t  },1000);\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function JHshNumberText()\r\n");
      out.write("{\r\n");
      out.write("if ( !(((window.event.keyCode >= 48) && (window.event.keyCode <= 57))\r\n");
      out.write("|| (window.event.keyCode == 13) || (window.event.keyCode == 46)\r\n");
      out.write("|| (window.event.keyCode == 45)))\r\n");
      out.write("{\r\n");
      out.write("window.event.keyCode = 0 ;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("#product_info tr td {\r\n");
      out.write("\tborder-top-style: none;\r\n");
      out.write("\tborder-right-style: none;\r\n");
      out.write("\tborder-bottom-style: none;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("            $(\"document\").ready(function(){\r\n");
      out.write("               // alert(\"ff\")\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            function addUploadFile(){\r\n");
      out.write("              \r\n");
      out.write("                $(\"#tableA\").append(\"<tr>\" + \r\n");
      out.write("                          \"<td  width='15%' align=center><input type='file' name='pic' size='6'/></td>\" + \r\n");
      out.write("                          \"<td  width='15%' align=center><span class='style1' onclick='delete_file(this);' style='cursor: hand;'>删除 </span></td>\" + \r\n");
      out.write("                          \"</tr>\")\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            function delete_file(obj){\r\n");
      out.write("                  $(obj).parent().parent().remove();\r\n");
      out.write("            }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write(" <!-------------------会员区右侧------------------------->\r\n");
      out.write(" <form name=\"addform\" action=\"/product/addProductAppend.do\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write(" \r\n");
      out.write("   <div class=\"club_right r\">\r\n");
      out.write("     \t\t<div class=\"now_wz\">当前位置：网站首页>商家中心><span class=\"cloth\">添加/修改产品附加小图</span></div>\r\n");
      out.write("       \t\t<div class=\"my_guanzhu\">\r\n");
      out.write("            \t<div class=\"club_month\">\r\n");
      out.write("     \t\t\t<div  class=\"gz_tips\"><span class=\"go_back\"><a href=\"list_product.jsp\">返回商品列表</a>\r\n");
      out.write("\t\r\n");
      out.write("     \t\t\t</span>添加/修改产品小图 </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <!--------------添加新产品---------------------->\r\n");
      out.write("                <div class=\"news_tips\">\r\n");
      out.write("                \t<div class=\"shangpu_title\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"base_info\">\r\n");
      out.write("                <div class=\"member_pro\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("                        <li class=\"news_sty1\">\r\n");
      out.write("                        \r\n");
      out.write("                                <div class=\"shangpu_title\">[附加图片]</div>\r\n");
      out.write("                                <div class=\"shangpu_info\">\r\n");
      out.write("                                \t<div class=\"sp_border\">\r\n");
      out.write("                                        \r\n");
      out.write("<span class=\"prompt\">(点击添加按钮新增多个产品图片)</span>\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"news_sales\">\r\n");
      out.write("        <div style=\"margin-top:5px; margin-bottom:5px;\"><input name=\"button\" type=\"button\" onClick=\"addUploadFile();\" value=\"添  加\"></div>\r\n");
      out.write("        <TABLE width=\"100%\" border='1' align=center id='tableA'  name='tableA'>\r\n");
      out.write("          <TR id=fileUploadID>\r\n");
      out.write("            <TD width=\"15%\" align=center><span class=\"style1\"> 图片 </span></TD>\r\n");
      out.write("            <TD width=\"15%\" align=center><span class=\"style1\">删除 </span></TD>\r\n");
      out.write("          </TR>\r\n");
      out.write("        </TABLE>\r\n");
      out.write("        </div>  \r\n");
      out.write("                                \t</div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("              </div> \r\n");
      out.write("               </div>\r\n");
      out.write("                  <div class=\"base_info_button\">\r\n");
      out.write("                  \r\n");
      out.write("                 \r\n");
      out.write("\t\t\t\t  <input type=\"hidden\" name=\"productId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t  <input type=\"image\" src=\"/images/button_bc11.jpg\" onClick=\"return dosubmit()\"> \r\n");
      out.write("                                  &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                  \r\n");
      out.write("                                  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"/images/button_fh.jpg\" onClick=\"javascript:history.go(-1);\">\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("    \t  </div>\r\n");
      out.write("    \t\t\t\t\r\n");
      out.write("             \r\n");
      out.write("            \r\n");
      out.write("     \t\t</div>\r\n");
      out.write("         \r\n");
      out.write("   \r\n");
      out.write("</div>\r\n");
      out.write("   </form>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}