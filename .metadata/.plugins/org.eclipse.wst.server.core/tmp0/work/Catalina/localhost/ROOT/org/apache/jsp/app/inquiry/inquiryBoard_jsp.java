/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-19 06:35:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.inquiry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inquiryBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>프로젝트 자료실</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/inquiry/inquiryBoard.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <main id=\"inquery_main\">\r\n");
      out.write("        <section class=\"community-body\">\r\n");
      out.write("            <nav class=\"community-body__navigation\">\r\n");
      out.write("                <ul class=\"community-aside\">\r\n");
      out.write("                    <li class=\"community-aside_group\">\r\n");
      out.write("                    \r\n");
      out.write("                    	<div>\r\n");
      out.write("                    	<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/app/main/index.jsp\">\r\n");
      out.write("						<img   src=\"/assets/images/fix/logo.png\" alt=\"logo\" class=\"logo\" style=\"width: 105px\" >\r\n");
      out.write("						</a>\r\n");
      out.write("                    	</div>\r\n");
      out.write("                        <ul class=\"community-aside__menu-list\">\r\n");
      out.write("                            <li class=\"community-aside__menu community-aside__menu--selected\">\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"community-aside__menu \">\r\n");
      out.write("                                <a href=\"\" class=\"question_wrap_atag\"><span>문의사항</span></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"community-body__content\">\r\n");
      out.write("                <div class=\"question-list-container\">\r\n");
      out.write("                    <div class=\"post-container-header\">\r\n");
      out.write("                        <h4 style=\"display: inline;\">문의사항</h4>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"question-list\">\r\n");
      out.write("                  <!--   <li class=\"question-container\">\r\n");
      out.write("                        <a href=\"\" class=\"question_wrap_atag\">\r\n");
      out.write("                            <div class=\"question\">\r\n");
      out.write("                                <div class=\"question-info\">\r\n");
      out.write("                                    <div class=\"question-title\">\r\n");
      out.write("                                        <h3 class=\"title-text\"><span class=\"question_number\">2</span>. 프로젝트 생성은 어떻게\r\n");
      out.write("                                            이용하나요?\r\n");
      out.write("\r\n");
      out.write("                                        </h3>\r\n");
      out.write("                                        <div class=\"question_status questionSuccess\">\r\n");
      out.write("                                            답변 완료\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <p class=\"question-body\">\r\n");
      out.write("                                        답변 : 새글쓰기에서 프로젝트 생성을 클릭합니다.\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"question-tag\"></div>\r\n");
      out.write("                                    <div class=\"question-info-footer\">\r\n");
      out.write("                                        <span class=\"question__info-user-name\">오메가호근몬</span>\r\n");
      out.write("                                        <span>&nbsp;·&nbsp;</span>\r\n");
      out.write("                                        <span>1시간 전</span>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"question-container\">\r\n");
      out.write("                        <a href=\"\" class=\"question_wrap_atag\">\r\n");
      out.write("                            <div class=\"question\">\r\n");
      out.write("                                <div class=\"question-info\">\r\n");
      out.write("                                    <div class=\"question-title\">\r\n");
      out.write("                                        <h3 class=\"title-text\"><span class=\"question_number\">1</span>. 프로젝트 생성은 어떻게\r\n");
      out.write("                                            이용하나요?\r\n");
      out.write("\r\n");
      out.write("                                        </h3>\r\n");
      out.write("                                        <div class=\"question_status questionWait\">\r\n");
      out.write("                                            답변 대기중\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <p class=\"question-body\">\r\n");
      out.write("                                        답변 대기중입니다. 최대한 빨리 답변해 드리도록 노력하겠습니다^^\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"question-tag\"></div>\r\n");
      out.write("                                    <div class=\"question-info-footer\">\r\n");
      out.write("                                        <span class=\"question__info-user-name\">오메가호근몬</span>\r\n");
      out.write("                                        <span>&nbsp;·&nbsp;</span>\r\n");
      out.write("                                        <span>1시간 전</span>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li> -->\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"side-banner\" width=\"196px\" height=\"296px\">\r\n");
      out.write("                <img id=\"inquery_side-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/banner/inquiryBoardBanner.jpg\" alt=\"\" width=\"100%\" height=\"100%\">\r\n");
      out.write("                <img id=\"inquery_side-img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/banner/inquiryBoardBanner1.png\" alt=\"\" width=\"100%\" height=\"100%\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("	listOk();\r\n");
      out.write("\r\n");
      out.write("	function listOk(){\r\n");
      out.write("		\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url: \"/inquiry/listOk.in\",\r\n");
      out.write("			type:\"get\",\r\n");
      out.write("			contentType: \"application/json; charset=utf-8\",\r\n");
      out.write("			success: showList\r\n");
      out.write("			\r\n");
      out.write("		})\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	function showList(result){\r\n");
      out.write("			  \r\n");
      out.write("	\r\n");
      out.write("			  var resultInquiry = JSON.parse(result);\r\n");
      out.write("		if(resultInquiry.length > 0){\r\n");
      out.write("			let text=\"\";\r\n");
      out.write("			var count=0;\r\n");
      out.write("			resultInquiry.forEach(result=>{\r\n");
      out.write("				var dateTime = new Date(result.inquiryDate);\r\n");
      out.write("				\r\n");
      out.write("				console.log(result.inquiryContent)\r\n");
      out.write("				count++;\r\n");
      out.write("				text+=	`<li class=\"question-container\">`;\r\n");
      out.write("				text+=	`<a href=\"\" class=\"question_wrap_atag\">`;\r\n");
      out.write("				text+=	`<div class=\"question\">`;\r\n");
      out.write("				text+=	 `<div class=\"question-info\">`;\r\n");
      out.write("				text+=	`<div class=\"question-title\">`;\r\n");
      out.write("				text+=	`<h3 class=\"title-text\"><span class=\"question_number\">`+count+`</span>.`+result.inquiryContent+`</h3>`;\r\n");
      out.write("				if(result.inquiryStatus==\"complete\"){\r\n");
      out.write("				text+=	`<div class=\"question_status questionSuccess\">답변 완료</div>`;\r\n");
      out.write("				}else{\r\n");
      out.write("				text+=	`<div class=\"question_status questionWait\">답변 대기중</div>`;\r\n");
      out.write("				}\r\n");
      out.write("				text+=  `</div>`;\r\n");
      out.write("				if(result.inquiryReply==\"\"){\r\n");
      out.write("				text+=	`<p class=\"question-body\">답변 대기중입니다. 최대한 빨리 답변해드리도록 노력하겠습니다^^</p>`;\r\n");
      out.write("				}else{\r\n");
      out.write("				text+=	`<p class=\"question-body\">답변 : `+ result.inquiryReply +`</p>`;\r\n");
      out.write("				}\r\n");
      out.write("				text+= 	`<div class=\"question-tag\"></div>`;\r\n");
      out.write("				text+=	`<div class=\"question-info-footer\">`;\r\n");
      out.write("				text+=	`<span class=\"question__info-user-name\">`+result.userNickname+`</span>`;\r\n");
      out.write("				text+=	`<span>&nbsp;·&nbsp;</span>`;\r\n");
      out.write("				text+=	 `<span>`+dateTime.getFullYear()+ \"년\"+ ( (dateTime.getMonth()+1) < 9 ? \"0\" + (dateTime.getMonth()+1) : (dateTime.getMonth()+1) )+ \"월\"+ ( (dateTime.getDate()) < 9 ? \"0\" + (dateTime.getDate()) : (dateTime.getDate()) ) + \"일\"+`</span>`;\r\n");
      out.write("				text+=	`</div>`;\r\n");
      out.write("				text+=	`</div>`;\r\n");
      out.write("				text+=	`</div>`;\r\n");
      out.write("				text+=	`</a>`;\r\n");
      out.write("				text+=	`</li>`;\r\n");
      out.write("               \r\n");
      out.write("			});\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("			$(\".question-list\").html(text);\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
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