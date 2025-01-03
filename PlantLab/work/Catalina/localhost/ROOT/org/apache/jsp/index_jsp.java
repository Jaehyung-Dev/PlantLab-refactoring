/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.25
 * Generated at: 2024-07-26 06:24:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>플랜트랩</title>\r\n");
      out.write("    <link rel=\"icon\" type=\"img/png\" href=\"/static/images/round_logo_whiteBack.svg\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/mainpage.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/nav.jsp", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <img src=\"/static/images/Header with image_메인페이지.svg\" alt=\"메인 헤더\">\r\n");
      out.write("    </header>\r\n");
      out.write("    <main>\r\n");
      out.write("        <div id=\"carouselExampleAutoplaying\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("            <div class=\"carousel-indicators\">\r\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("                <div class=\"carousel-item active\" data-bs-interval=\"3000\">\r\n");
      out.write("                    <img src=\"/static/images/캐러셀03.svg\" class=\"d-block w-100\" alt=\"carousel01\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\"  data-bs-interval=\"3000\">\r\n");
      out.write("                    <img src=\"/static/images/캐러셀02.svg\" class=\"d-block w-100\" alt=\"carousel02\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\"  data-bs-interval=\"3000\">\r\n");
      out.write("                    <img src=\"/static/images/캐러셀01.svg\" class=\"d-block w-100\" alt=\"carousel03\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleAutoplaying\" data-bs-slide=\"prev\">\r\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleAutoplaying\" data-bs-slide=\"next\">\r\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("            <div class=\"table-section\">\r\n");
      out.write("                <div class=\"table1\">\r\n");
      out.write("                    <div class=\"tablecaption-container\">\r\n");
      out.write("                        <h2>정보글</h2>\r\n");
      out.write("                        <!-- <caption align=\"top\">Q&A</caption> -->\r\n");
      out.write("                        <button type=\"button\" class=\"morebtn\" onclick=\"window.location.href='board_list.html'\">더 보기</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"table-title\">제목</th>\r\n");
      out.write("                            <th class=\"table-title\">작성자</th>\r\n");
      out.write("                            <th class=\"table-title\">작성일</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"table2\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <div class=\"tablecaption-container\">\r\n");
      out.write("                            <h2>Q&A</h2>\r\n");
      out.write("                            <button type=\"button\" class=\"morebtn\" onclick=\"window.location.href='board_list.html?tab=3'\">더 보기</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"table-title\">제목</th>\r\n");
      out.write("                            <th class=\"table-title\">작성자</th>\r\n");
      out.write("                            <th class=\"table-title\">작성일</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Project Name</td>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td>2022.00.00</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"section-title\">\r\n");
      out.write("                <h2>인기 친구들</h2>\r\n");
      out.write("                <p>다른 유저들의 반려식물들을 구경하세요.</p>\r\n");
      out.write("                <button type=\"button\" class=\"morebtn\" onclick=\"window.location.href='board_list.html?tab=4'\">더 보기</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"popular-container\">\r\n");
      out.write("                <div class=\"popular-post\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/01.svg\" alt=\"grid_item\">\r\n");
      out.write("                    <h5 class=\"contents\">책상에 놨더니 너무 뽀짝해요 </h5>\r\n");
      out.write("                    <p><img src=\"/static/images/profile_photo.svg\" alt=\"\">Karina  | 2024.06.28</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"popular-post\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/02.svg\" alt=\"grid_item\">\r\n");
      out.write("                    <h5 class=\"contents\">이쁜 저희 초록이좀 보고 가세요~!!</h5>\r\n");
      out.write("                    <p><img src=\"/static/images/profile_photo.svg\" alt=\"\">Karina  | 2024.06.28</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"popular-post\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/03.svg\" alt=\"grid_item\" style=\"width: 356px;\" style=\"height: 196px;\">\r\n");
      out.write("                    <h5 class=\"contents\">이쁜 저희 초록이좀 보고 가세요~!!</h5>\r\n");
      out.write("                    <p><img src=\"/static/images/profile_photo.svg\" alt=\"\">Karina  | 2024.06.28</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"popular-post\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/04.svg\" alt=\"grid_item\">\r\n");
      out.write("                    <h5 class=\"contents\">이쁜 저희 초록이좀 보고 가세요~!!</h5>\r\n");
      out.write("                    <p><img src=\"/static/images/profile_photo.svg\" alt=\"\">Karina  | 2024.06.28</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"popular-post\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/05.svg\" alt=\"grid_item\">\r\n");
      out.write("                    <h5 class=\"contents\">이쁜 저희 초록이좀 보고 가세요~!!</h5>\r\n");
      out.write("                    <p><img src=\"/static/images/profile_photo.svg\" alt=\"\">Karina  | 2024.06.28</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"popular-post\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/06.svg\" alt=\"grid_item\">\r\n");
      out.write("                    <h5 class=\"contents\">이쁜 저희 초록이좀 보고 가세요~!!</h5>\r\n");
      out.write("                    <p><img src=\"/static/images/profile_photo.svg\" alt=\"\">Karina  | 2024.06.28</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"section-title2\">\r\n");
      out.write("                <h2>할인전</h2>\r\n");
      out.write("                <p>할인된 인기상품을 만나보세요.</p>\r\n");
      out.write("                <button type=\"button\" class=\"morebtn\" onclick=\"window.location.href='shopping_main.html?sale=1'\">더 보기</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"discount-container\">\r\n");
      out.write("                <div class=\"products\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/mainpage_sale_img01.svg\" alt=\"Featured Product\">\r\n");
      out.write("                    <div class=\"textbox\">\r\n");
      out.write("                        <h5 class=\"discount-title\">1+1 독일토분 공기정화식물 마오리소포라 율마 몬스테라 유칼립투스</h5>\r\n");
      out.write("                        <p class=\"shop\">필플랜트</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"price-container\">\r\n");
      out.write("                        <p class=\"discount-price\"> <span  class=\"origin-price\">36,000원</span></p>\r\n");
      out.write("                        <p class=\"price\">50% <span class=\"final-price\">18,000</span><span style=\"font-weight: lighter; color:black;\"> 원</span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"products\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/mainpage_sale_img02.svg\" alt=\"Featured Product\">\r\n");
      out.write("                    <h5 class=\"discount-title\">프렌치 장미 조화_4colors</h5>\r\n");
      out.write("                    <p class=\"shop\">언제나 무드</p>\r\n");
      out.write("                    <div class=\"price-container\">\r\n");
      out.write("                        <p class=\"discount-price\"> <span class=\"origin-price\">10,000원</span></p>\r\n");
      out.write("                        <p class=\"price\">33% <span class=\"final-price\">10,800</span><span style=\"font-weight: lighter; color:black;\"> 원</span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"products\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"products\">\r\n");
      out.write("                    <img src=\"/static/images/mainpage/mainpage_sale_img03.svg\" alt=\"Featured Product\">\r\n");
      out.write("                    <h5 class=\"discount-title\">은은한 꽃 향기 오렌지자스민 + 독일토분</h5>\r\n");
      out.write("                    <p class=\"shop\">미플린</p>\r\n");
      out.write("                    <div class=\"price-container\">\r\n");
      out.write("                        <p class=\"discount-price\"> <span  class=\"origin-price\">18,000원</span></p>\r\n");
      out.write("                        <p class=\"price\">40% <span class=\"final-price\">10,800</span><span style=\"font-weight: lighter; color:black;\"> 원</span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </main>\r\n");
      out.write("    <div id=\"popup-icon1\">\r\n");
      out.write("        <img src=\"/static/images/챗봇아이콘.png\" alt=\"Popup Icon\" id=\"popup-image\" style=\"width: 60px; height: 60px;\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"popup-content1\" class=\"hidden\">\r\n");
      out.write("        <p>안녕하세요! 플랜트 봇 입니다!<br>궁금한 것은 모두 플랜트 봇에게 물어보세요!</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"popup-icon2\">\r\n");
      out.write("        <img src=\"/static/images/top아이콘.png\" alt=\"Popup Icon\" id=\"popup-image\" style=\"width: 60px; height: 60px;\">\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/chatbot.jsp", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/footer.jsp", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
