/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-19 05:40:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class banner_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>Swiper demo</title>\r\n");
      out.write("    <meta\r\n");
      out.write("      name=\"viewport\"\r\n");
      out.write("      content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1\"\r\n");
      out.write("    />\r\n");
      out.write("    <!-- Link Swiper's CSS -->\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/board/bannerFinal.css\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <!-- Demo styles -->\r\n");
      out.write("    <style>\r\n");
      out.write("     \r\n");
      out.write("     html{\r\n");
      out.write("     margin:0;\r\n");
      out.write("     padding:0;\r\n");
      out.write("     \r\n");
      out.write("      body {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        height: 374px;\r\n");
      out.write("       \r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      body {\r\n");
      out.write("        font-family: Helvetica Neue, Helvetica, Arial, sans-serif;\r\n");
      out.write("        font-size: 14px;\r\n");
      out.write("        color: #000;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .swiper {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 330px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .swiper-slide {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        background: #fff;\r\n");
      out.write("\r\n");
      out.write("        /* Center slide text vertically */\r\n");
      out.write("        display: -webkit-box;\r\n");
      out.write("        display: -ms-flexbox;\r\n");
      out.write("        display: -webkit-flex;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        -webkit-box-pack: center;\r\n");
      out.write("        -ms-flex-pack: center;\r\n");
      out.write("        -webkit-justify-content: center;\r\n");
      out.write("        justify-content: center;\r\n");
      out.write("        -webkit-box-align: center;\r\n");
      out.write("        -ms-flex-align: center;\r\n");
      out.write("        -webkit-align-items: center;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .swiper-slide img{\r\n");
      out.write("        display: block;\r\n");
      out.write("        width: 100% !important;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        object-fit: contain;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .swiper-pagination-bullets.swiper-pagination-horizontal{\r\n");
      out.write("      position:absolute;\r\n");
      out.write("      display: block;\r\n");
      out.write("      height:24px;\r\n");
      out.write("      bottom: -84px;\r\n");
      out.write("      }\r\n");
      out.write("	\r\n");
      out.write("	.swiper-horizontal>.swiper-pagination-bullets .swi\\per-pagination-bullet, \r\n");
      out.write("	.swiper-pagination-horizontal.swiper-pagination-bullets .swiper-pagination-bullet {\r\n");
      out.write("    margin: 0 var(--swiper-pagination-bullet-horizontal-gap,10px);\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write(" .swiper-pagination-bullet {\r\n");
      out.write("    width: var(--swiper-pagination-bullet-width,var(--swiper-pagination-bullet-size,9px));\r\n");
      out.write("    height: var(--swiper-pagination-bullet-height,var(--swiper-pagination-bullet-size,9px));\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <!-- Swiper -->\r\n");
      out.write("    <div class=\"swiper mySwiper\">\r\n");
      out.write("      <div class=\"swiper-wrapper\">\r\n");
      out.write("        <div class=\"swiper-slide\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/banner/banner2.png\" alt=\"\"></div>\r\n");
      out.write("        <div class=\"swiper-slide\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/banner/banner1.png\" alt=\"\"><!-- onclick=\"movePage()\" --></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- <div class=\"swiper-button-next\"></div>\r\n");
      out.write("      <div class=\"swiper-button-prev\"></div> -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"swiper-pagination\"></div>\r\n");
      out.write("    <!-- Swiper JS -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Initialize Swiper -->\r\n");
      out.write("    <script>\r\n");
      out.write("      var swiper = new Swiper(\".mySwiper\", {\r\n");
      out.write("        spaceBetween: 30,\r\n");
      out.write("        centeredSlides: true,\r\n");
      out.write("        autoplay: {\r\n");
      out.write("          delay: 2500,\r\n");
      out.write("          disableOnInteraction: false,\r\n");
      out.write("        },\r\n");
      out.write("        pagination: {\r\n");
      out.write("          el: \".swiper-pagination\",\r\n");
      out.write("          clickable: true,\r\n");
      out.write("        },\r\n");
      out.write("        navigation: {\r\n");
      out.write("          nextEl: \".swiper-button-next\",\r\n");
      out.write("          prevEl: \".swiper-button-prev\",\r\n");
      out.write("        },\r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("      function movePage(){\r\n");
      out.write("          location.href=\"introducePage.jsp\"\r\n");
      out.write("        }\r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
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
