/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.28
 * Generated at: 2013-07-24 01:33:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.sysadm.mall;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class copyCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/doqian.tld", Long.valueOf(1374628177312L));
    _jspx_dependants.put("/includes/page_inc.jsp", Long.valueOf(1374628177578L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <title>会员列表</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/sysadm/css/base.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\" src=\"/js/xheditor/xheditor-1.1.14-zh-cn.min.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction checkForm(){\r\n");
      out.write("\t\tif($(\"#fromModuleid\").val() == -1){\r\n");
      out.write("\t\t\talert(\"模块必选！\")\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body leftmargin=\"8\" topmargin=\"8\" background='/sysadm/images/allbg.gif'>\r\n");
      out.write("\r\n");
      out.write("<!--  快速转换位置按钮  -->\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#D1DDAA\" align=\"center\">\r\n");
      out.write("<tr>\r\n");
      out.write(" <td height=\"26\" background=\"/sysadm/images/newlinebg3.gif\">\r\n");
      out.write("  <table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td>\r\n");
      out.write("   <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/category/toEditCategoryUI.do?moduleid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${moduleid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\" value='添加分类' />\r\n");
      out.write("    <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/category/categoryList.do?moduleid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${moduleid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\" value='分类管理' />\r\n");
      out.write("    <input type='button' class=\"coolbg np\" onClick=\"location='/sysadm/category/toCopyCategoryUI.do?moduleid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${moduleid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\" value='分类复制' />\r\n");
      out.write("   \r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<!--  内容列表   -->\r\n");
      out.write("<form name=\"form\" action=\"/sysadm/category/copyCategory.do\" method=\"get\" onsubmit=\"return checkForm()\">\r\n");
      out.write("<table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\" >\r\n");
      out.write("  <tr bgcolor=\"#EEF4EA\">\r\n");
      out.write("    <td colspan=\"2\" background=\"/sysadm/images/wbg.gif\" class='title'><span>添加商品</span></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <td width=\"30%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font><strong>来源模块</strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("    \t<select name=\"fromModuleid\" id=\"fromModuleid\">\r\n");
      out.write("    \t\t<option value=\"-1\">\r\n");
      out.write("    \t\t\t来源模块\r\n");
      out.write("    \t\t</option>\r\n");
      out.write("    \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t</select>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("   <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("  <td width=\"30%\" bgcolor=\"#FFFFFF\"><font  color=\"red\" >*</font><strong>当前模块分类数据</strong></td>\r\n");
      out.write("    <td width=\"70%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("    \t<label><input type=\"radio\" name=\"isDelete\" checked=\"checked\" value=\"0\"/>保留</label>\r\n");
      out.write("    \t<label><input type=\"radio\" name=\"isDelete\" value=\"1\"/>删除</label>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("   <td bgcolor=\"#FFFFFF\" colspan=\"2\" align=\"center\">\r\n");
      out.write("   \t<input type=\"submit\" value=\"确定\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"button\" value=\"返回\" onclick=\"history.go(-1)\"/>\r\n");
      out.write("   </td>\r\n");
      out.write("   \r\n");
      out.write("  </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   <input type=\"hidden\" name=\"moduleid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${moduleid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("   </form>\r\n");
      out.write("<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align=\"center\" style=\"margin-top:8px\">\r\n");
      out.write("  <tr bgcolor='#EEF4EA'>\r\n");
      out.write("    <td background='/sysadm/images/wbg.gif' align='center'>\r\n");
      out.write("      \r\n");
      out.write("\t<font color=\"red\">*</font>号为必填项目\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/sysadm/mall/copyCategory.jsp(60,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/sysadm/mall/copyCategory.jsp(60,6) '${moduleList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${moduleList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/sysadm/mall/copyCategory.jsp(60,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("module");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    \t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${module.moduleid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("    \t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${module.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("    \t\t\t</option>\r\n");
          out.write("    \t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}