/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-20 02:32:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardStudy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>스터디 모집</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/board/boardStudy2.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style =\"overflow: auto;\">\r\n");
      out.write("    <div id=\"root\">\r\n");
      out.write("        <div class=\"studyContent_postWrapper\">\r\n");
      out.write("            <section class=\"studyContent_postHeader\">\r\n");
      out.write("                 <a href=\"../../app/main/index.jsp\">\r\n");
      out.write("          <svg stroke=\"currentColosr\" fill=\"currentColor\" stroke-width=\"0\"\r\n");
      out.write("        viewBox=\"0 0 448 512\" color=\"808080\" cursor=\"pointer\" height=\"30\" width=\"30\"\r\n");
      out.write("         xmlns=\"http://www.w3.org/2000/svg\" style=\"color: rgb(128, 128, 128);\" >\r\n");
      out.write("         <path d=\"M257.5 445.1l-22.2 22.2c-9.4 9.4-24.6 9.4-33.90L7\r\n");
      out.write("          273c-9.4-9.4-9.4-24.6 0-33.9L201.4 44.7c9.4-9.4 24.6-9.4 33.9 0l22.2 22.2c9.5 9.5\r\n");
      out.write("           9.3 25-.4 34.3L136.6 216H424c13.3 0 24 10.7 24 24v32c0 13.3-10.7 24-24 24H136.6l120.5 114.8c9.8 9.3 10 24.8.4 34.3z\"\r\n");
      out.write("           ></path>\r\n");
      out.write("       </svg>\r\n");
      out.write("       </a>\r\n");
      out.write("                <div class=\"studyContent_title\">자기개발 그룹 챌린지 앱 프론트엔드 개발자 2명 모집합니다!</div>\r\n");
      out.write("                <div class=\"studyContent_userAndDate\">\r\n");
      out.write("                    <img class=\"studyContent_userImg\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/images/fix/cosmosProfile.png\">\r\n");
      out.write("                <div class=\"studyContent_userName\">huyn</div>\r\n");
      out.write("                <div class=\"studyContent_registeredDate\">2022.09.28</div>\r\n");
      out.write("                </div>\r\n");
      out.write("             <!--    <section class=\"studyButtons_buttonWrapper\">\r\n");
      out.write("                    <button class=\"studyButtons_buttons1\">마감</button>\r\n");
      out.write("                    <button class=\"studyButtons_buttons2\">수정</button>\r\n");
      out.write("                    <button class=\"studyButtons_buttons3\">삭제</button>\r\n");
      out.write("                </section> -->\r\n");
      out.write("                <div class=\"recommendPost_totalWrapper\">\r\n");
      out.write("                    <div class=\"recommendPost_recommendWrapper\">\r\n");
      out.write("                        <div class=\"recommendPost_userInfoWrapper\">\r\n");
      out.write("                            <div class=\"recommendPost_bar\"></div>\r\n");
      out.write("                            <div class=\"recommendPost_userInfo\">\r\n");
      out.write("                                <span class=\"recommendPost_userName\">COSMOS</span>\r\n");
      out.write("                                최신글 목록\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <ul class=\"recommendPost_listWrapper\">\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">1.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">사이드 프로젝트 프론트엔드, 백엔드 개발자분 모집합니다</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">2.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">사이드 프로젝트를 진행하실 프론트엔드 2분 모집합니다</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">3.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">본격적으로 딴짓 사이드 프로젝트 프론트엔드 개발자 구인!</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">4.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">사이드 프로젝트 팀원 모집</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">5.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">(두개의 스터디 모집 중) 만들면서 배우는 클린 아키텍처 / Hibernate 만들어보기</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">6.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">[UI, UX 디자이너] 취업용 포트폴리오를 만드실 디자이너 한 분 충원합니다 !</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">7.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">태블릿펜을 통한 그림심리검사앱</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">8.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">신림역 주변 모각코 </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">9.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">[디스코드] 온라인 모각코 얼른 오세요 .. !</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"recommendPost_postList\">\r\n");
      out.write("                                <div class=\"recommendPost_index\">10.</div>\r\n");
      out.write("                                <div class=\"recommendPost_title\">채용혜택) 2022년 NH투자증권 빅데이터 경진대회</div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"studyGrid\">\r\n");
      out.write("                    <li class=\"studyInfo\">\r\n");
      out.write("                        <span class=\"studyInfo_title\">모집 구분</span>\r\n");
      out.write("                        <span class=\"studyInfo_content\">스터디</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"studyInfo\">\r\n");
      out.write("                        <span class=\"studyInfo_title\">진행방식</span>\r\n");
      out.write("                        <span class=\"studyInfo_content\">&nbsp;온라인</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"studyInfo\">\r\n");
      out.write("                        <span class=\"studyInfo_title\">모집 인원</span>\r\n");
      out.write("                        <span class=\"studyInfo_content\">8명</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"studyInfo\">\r\n");
      out.write("                        <span class=\"studyInfo_title\">지원 인원</span>\r\n");
      out.write("                        <span class=\"studyInfo_content\" style=\"color:red\">10명</span> \r\n");
      out.write("                        <a class =\"apply_list\" href=\"boardApply.jsp\" rel=\"noreferrer\" target=\"_blank\">\r\n");
      out.write("                            <span class = \"apply_info\">지원자 정보</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"studyInfo\">\r\n");
      out.write("                        <span class=\"studyInfo_title\">연락 방법</span>\r\n");
      out.write("                        <div class=\"contact_kakao\">\r\n");
      out.write("                            <a class =\"kakao_link\" href=\"https://open.kakao.com/o/sBFYxvEe\" rel=\"noreferrer\" target=\"_blank\">\r\n");
      out.write("                                <span class = \"chat\">카카오톡 오픈채팅</span>\r\n");
      out.write("                                <img class=\"contactPoint_linkImg\" src=\"https://holaworld.io/images/info/link.svg\" alt=\"\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"studyInfo\">\r\n");
      out.write("                        <span class=\"studyInfo_title\">예상 기간</span>\r\n");
      out.write("                        <span class=\"studyInfo_content\">1개월</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"studyInfo\">\r\n");
      out.write("                        <span class=\"studyInfo_title\">사용 언어</span>\r\n");
      out.write("                        <ul class=\"studyInfo_languageList\">\r\n");
      out.write("                            <li class=\"studyInfo_language\">\r\n");
      out.write("                                <img class=\"studyInfo_languageImage\" src=\"https://holaworld.io/images/languages/javascript.svg\" alt=\"language\">\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"studyInfo_language\">\r\n");
      out.write("                                <img class=\"studyInfo_languageImage\" src=\"https://holaworld.io/images/languages/typescript.svg\" alt=\"language\">\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                     <li class=\"studyInfo\">\r\n");
      out.write("                        <span class=\"studyInfo_title\">시작 예정</span>\r\n");
      out.write("                        <span class=\"studyInfo_content\">2022.10.24</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </section>\r\n");
      out.write("                <div class=\"studyContent_postContentWrapper\">\r\n");
      out.write("                    <h2 class=\"studyContent_postInfo\">프로젝트 소개</h2>\r\n");
      out.write("                    <div class=\"studyContent_postContent\">\r\n");
      out.write("                        <p>안녕하세요! </p>\r\n");
      out.write("                        <p>함께 하는 자기 개발 그룹 챌린지 '작심친구'의 프론트엔드 개발자를 모집합니다!</p>\r\n");
      out.write("                        <p><br></p>\r\n");
      out.write("                        <p>[팀 화수분 소개]</p>\r\n");
      out.write("                        <p>저희는 사이드 프로젝트이지만, 앱 런칭을 목표로 단순 앱 완성이 아닌 </p>\r\n");
      out.write("                        <p>사용자들이 유의미하게 서비스를 즐길 수 있도록 하여 매출을 발생시키는 것을 목표로 하고 있습니다</p>\r\n");
      out.write("                        <p><br></p>\r\n");
      out.write("                        <p>[모집 인원]</p>\r\n");
      out.write("                        <p>-프론트엔드 개발자 2명</p>\r\n");
      out.write("                        <p><br></p>\r\n");
      out.write("                        <p>[현재 구성 인원]</p>\r\n");
      out.write("                        <p>-기획자 1명</p>\r\n");
      out.write("                        <p>-UXUI 디자이너 1명</p>\r\n");
      out.write("                        <p>-백엔드 개발자 1명</p>\r\n");
      out.write("                        <p><br></p>\r\n");
      out.write("                        <p>[작심친구 프로젝트 소개]</p>\r\n");
      out.write("                        <p>누구나 자기 계발을 다짐하고 실패 또는 다짐이 사라지는 경험을 해보셨을 것입니다.</p>\r\n");
      out.write("                        <p>이러한 문제를 해결하기 위해 다양한 실천앱들이 등장하고 있습니다.</p>\r\n");
      out.write("                        <p>그러나 실천앱은 헬스케어 시장에 집중되어 역량 계발에는 키플레이어가 부재합니다.  </p>\r\n");
      out.write("                        <p>역량 계발을 중점적으로 실천하고 싶은 사람들에게 일반 대형 챌린지가 아닌, </p>\r\n");
      out.write("                        <p>소규모 그룹제, 팀원들간 이모티콘 전송, 게이미피케이션으로 차별화하여 </p>\r\n");
      out.write("                        <p>'함께 윈윈하는 자기 계발 그룹 챌린지' 앱 서비스를 만들고자 합니다.</p>\r\n");
      out.write("                        <p><br></p>\r\n");
      out.write("                        <p>[개발 단계]</p>\r\n");
      out.write("                        <p>자세한 사항은 https://melodious-fibula-29e.notion.site/eb93d566206e4c0c8b2a9effb99f4fb8</p>\r\n");
      out.write("                        <p>링크를 통해 확인해주시길 바랍니다.</p>\r\n");
      out.write("                        <p><br></p>\r\n");
      out.write("                        <p>[원하는 팀원]</p>\r\n");
      out.write("                        <p>- 프론트엔드 개발자 2명</p>\r\n");
      out.write("                        <p>- 사이드 프로젝트가 필요하신 분</p>\r\n");
      out.write("                        <p>- 2개월 단기적으로 MVP개발에 참여하고 싶으신 분</p>\r\n");
      out.write("                        <p>- (추후 MVP 결과에 따라 프로젝트 기간이 늘어날 수 있습니다.)</p>\r\n");
      out.write("                        <p>- 기획자, 디자이너,개발자와 협업해서 프로젝트를 완성 및 배포 해보고 싶으신 분</p>\r\n");
      out.write("                        <p>- 소통/피드백을 적극적으로 하시는 분</p>\r\n");
      out.write("                        <p>- 프로젝트가 종료될 때까지 책임감을 가지고 진행할 수 있으신 분</p>\r\n");
      out.write("                        <p>- 개발언어는 rn사용시 이미 어느정도 완성된 코드를 수정하시게 됩니다.</p>\r\n");
      out.write("                        <p>- 다른 언어를 사용하시면 처음부터 개발하실 수 있습니다! 둘 중 어느 케이스라도 상관없습니다.</p>\r\n");
      out.write("                        <p><br></p>\r\n");
      out.write("                        <p>[지원 방법]</p><p>- 화수분이 궁금하신 프론트엔드 개발자 분들은</p>\r\n");
      out.write("                        <p>- [Team Members](https://www.notion.so/f0c6965957c64b279c2c03c07df9a7e7)와 같이 간단한 포트폴리오를 보내주세요.</p>\r\n");
      out.write("                        <p>- 포트폴리오 제출 이메일 : gomdalsara1@naver.com</p><p>- 문의 카카오톡 : https://open.kakao.com/o/sEgZGQBe</p>\r\n");
      out.write("                        <p><br></p>\r\n");
      out.write("                        <p>지금 바로 프론트엔드 개발에 착수하고 싶으신 분, 책임감을 가지고 출시까지 달리실 분 모두모두 편하게 연락 주세요.</p>\r\n");
      out.write("                        <p> </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <section class=\"studyContent_commentAndViews\">\r\n");
      out.write("                        <div class=\"studyContent_postComment\">\r\n");
      out.write("                            <div class=\"commentInput_commentInput\">\r\n");
      out.write("                                <h1 class=\"commentInput_commentCount\">0개의 댓글이 있습니다.</h1><!-- 댓글 등록하면 count증가 -->\r\n");
      out.write("                                <textarea class=\"commentInput_commentText\" placeholder=\"댓글을 입력하세요.\"></textarea>\r\n");
      out.write("                                <div class=\"commentInput_buttonWrapper\">\r\n");
      out.write("                                    <button class=\"commentInput_buttonComplete\" name=\"register\">댓글 등록</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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