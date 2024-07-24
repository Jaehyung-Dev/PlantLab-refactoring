<%--
  Created by IntelliJ IDEA.
  User: publi
  Date: 2024-07-24
  Time: 오전 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>마이페이지</title>
        <link rel="icon" type="img/png" href="image/round_logo_whiteBack.svg">
        <!--bootstrap-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

<%--        <link rel="stylesheet" href="css/nav_header_footer.css">--%>
        <link rel="stylesheet" href="static/css/mypage.css">
        <script src="static/js/jquery-3.7.1.min.js"></script>
        <script src="static/js/weather.js"></script>
    </head>
    <body class="noto-sans-kr">
        <jsp:include page="nav.jsp"/>
        <nav>
            <div class="nav_left">
                <div>
                    <a href="mainpage01.html">
                        <img src="static/images/nav_logo.svg" alt="플랜트랩 로고">
                    </a>
                </div>
                <div>
                    <ul class="nav_menu">
                        <li><a href="board_list.html">커뮤니티</a></li>
                        <li><a href="shopping_main.html">스토어</a></li>
                        <div id="weather">
                            <li id="weatherList">
                                <img id="weatherImg" src="#" alt="날씨 이미지">
                                <img id="weatherLine" src="static/images/weatherLine.svg" alt="라인 이미지">
                                <p id="result"></p>
                            </li>
                        </div>
                    </ul>
                </div>
            </div>
            <div class="nav_right">
                <div class="nav_search">
                                    <span>
                                        <svg width="25" height="25.5" viewBox="0 0 30 34" fill="none" xmlns="http://www.w3.org/2000/svg">
                                            <path d="M28.9749 26.5226L23.9072 20.9181L20.0092 19.137C21.3071 17.0958 22.0025 14.6606 22 12.1652C22 5.45727 17.0654 0 11 0C4.93455 0 0 5.45727 0 12.1652C0 18.8731 4.93455 24.3304 11 24.3304C13.276 24.3333 15.4961 23.551 17.3511 22.0925L18.9574 26.3918L24.0249 31.9966C24.3499 32.3561 24.7358 32.6412 25.1604 32.8357C25.5851 33.0303 26.0402 33.1304 26.4998 33.1304C26.9595 33.1305 27.4146 33.0303 27.8393 32.8358C28.2639 32.6413 28.6498 32.3562 28.9748 31.9968C29.2998 31.6374 29.5576 31.2106 29.7335 30.741C29.9094 30.2714 30 29.7681 30 29.2597C30 28.7514 29.9095 28.2481 29.7336 27.7784C29.5577 27.3088 29.2999 26.8821 28.9749 26.5226ZM2 12.1652C2 6.67703 6.03749 2.21185 11 2.21185C15.9625 2.21185 20 6.67703 20 12.1652C20 17.6534 15.9625 22.1185 11 22.1185C6.03749 22.1185 2 17.6534 2 12.1652ZM27.5606 30.4326C27.2791 30.7433 26.8976 30.9177 26.4999 30.9177C26.1022 30.9177 25.7208 30.7433 25.4393 30.4326L20.6535 25.1399L19.1601 21.1424L22.7749 22.7939L27.5607 28.0866C27.8416 28.398 27.9993 28.8198 27.9993 29.2596C27.9993 29.6994 27.8415 30.1213 27.5606 30.4326Z" fill="#878787"/>
                                            </svg>
                                    </span>
                    <input type="text" id="search" placeholder="통합검색">
                </div>
                <div class="member">
                    <ul>
                        <li style="margin:0;">
                            <a href="_03_마이페이지_최종+재형님.html">
                                <img src="static/images/프로필사진.png" alt="임시 프로필사진" width="40px" height="40px">
                            </a>
                        </li>
                        <li style="margin-left: 10px; font-size: 1.1rem">
                            <script>
                                const nickname = sessionStorage.getItem("login");
                                document.write(`<a href="_03_마이페이지_최종+재형님.html" style="font-weight:400">${nickname}</a>`);
                            </script>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <header>
            <img src="static/images/Header with image_마이페이지.png" alt="마이페이지 헤더">
        </header>
        <div class="container">
            <div class="container-flex">
                <div class="profilebox">
                    <div class="profileicon">
                        <div class="shareicon">
                            <img src="static/images/shareicon.png" alt="">
                        </div>
                        <img src="static/images/프로필사진.png" class="profile" alt="" style="width: 182.69px;">
                        <div class="profilename">
                            <p style="font-size: 25px;">카리나</p>
                        </div>
                        <div class="profilemedal">
                            <img src="static/images/새싹레벨.png" alt="">
                        </div>
                        <div class="profilelevev">
                            <p style="font-size: 13px;">lv.1 새싹</p>
                        </div>
                    </div>
                    <div style="margin-top: 20px;">
                        <div class="heartbookmark">
                            <div class="heartpart">
                                <img src="static/images/filledgreenheart.png" alt="">
                                <p style="color: #0DA446; font-size: 20px; margin-bottom: 5px;">3</p>
                                <p>좋아요</p>
                            </div>
                            <div class="bookmarkpart">
                                <img src="static/images/littlefilledbookmarkicon.png" alt="">
                                <p style="color: #0DA446; font-size: 20px; margin-bottom: 5px;">25</p>
                                <p>스크랩북</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="categorybox">
                    <div class="mycontent" style="border-bottom: #B5B5B5 1px solid;"
                         id="mycontentbtn">
                        <div class="mycontenticon">
                            <img src="static/images/내가올린글.png" alt="">
                        </div>
                        <div class="mycontenttxt">
                            내가올린글
                        </div>
                    </div>
                    <div class="snscontent"  style="border-bottom: #B5B5B5 1px solid;"
                         id="snscontentbtn">
                        <div class="snscontenticon">
                            <img src="static/images/자랑 사진.png" alt="">
                        </div>
                        <div class="snspic">
                            그린톡
                        </div>
                    </div>
                    <div class="myshoppingcontent"
                         id="shopcontentbtn">
                        <div class="iconplace">
                            <div class="myshoppingicon">
                                <img src="static/images/마이 쇼핑.png" alt="" style="margin-left: -10px;">
                            </div>
                        </div>
                        <div class="myshopping">
                            마이 쇼핑
                        </div>
                    </div>
                </div>
                <div class="radio-group">
                    <input type="radio" id="contype" name="content">
                    <input type="radio" id="snstype" name="content">
                    <input type="radio" id="shoptype" name="content">
                </div>
            </div>
            <div class="contentbox"  id="content-a">
                <div class="titletext">Q&A
                    <table class="defaluttext">
                        <tr class="firstRow">
                            <td>제목</td>
                            <td>작성자</td>
                            <td>작성일</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                    </table>
                </div>
                <br><br>
                <div class="titletext">정보글
                    <table class="defaluttext">
                        <tr class="firstRow">
                            <td>제목</td>
                            <td>작성자</td>
                            <td>작성일</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                        <tr>
                            <td>Project Name</td>
                            <td>Name</td>
                            <td>2022.00.00</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="contentbox-sns" id="content-b" style="display: none;"> <!--클릭시 자랑글 모달 띄우게 가능할까요?-->
                <!-- <button id="createBragBtn" style="width: 300px; height: 250px; border: none; background-color: #ECECEC;"> -->
                <!-- <img style="margin-top: 30px;" src="images/bx_camera.png" alt="cameraLogo">
                <p style="margin-top: 10px;">올린 자랑글이 없습니다.</p> -->
                <div>
                    <img src="static/images/자랑글/rank1main.png" alt="" style="width: 300px; height: 250px; border: none;">
                </div>
                </button>
                <button id="moveBragBtn" onclick="window.location.href='board_list.html?tab=4'"
                        style="margin-top: 30px; width: 800px; height: 70px; background-color: #d1eada; border: #B8E2C8 solid 2px;">
                    <p style="margin-top: 20px; font-weight: bold; font-size: large; color: #27AF5A;">그린톡 바로가기</p>
                </button>
            </div>
            <div class="contentbox--shopping" id="content-c" style="display: none;">
                <div id="purchaseProcess">
                    <ul style="list-style: none; display: flex; margin-top: 20px;">
                        <li>입금대기
                            <br>
                            <span>0</span>
                        </li>
                        <img src="static/images/fluent_ios-arrow-24-filled.svg" alt="arrowImg">
                        <li>결제완료
                            <br>
                            <span>0</span>
                        </li>
                        <img src="static/images/fluent_ios-arrow-24-filled.svg" alt="arrowImg">
                        <li>배송준비
                            <br>
                            <span>0</span>
                        </li>
                        <img src="static/images/fluent_ios-arrow-24-filled.svg" alt="arrowImg">
                        <li>배송중
                            <br>
                            <span>0</span>
                        </li>
                        <img src="static/images/fluent_ios-arrow-24-filled.svg" alt="arrowImg">
                        <li>배송완료
                            <br>
                            <span>0</span>
                        </li>
                        <img src="static/images/fluent_ios-arrow-24-filled.svg" alt="arrowImg">
                        <li style="color: #27AF5A; font-weight: bold;">구매확정
                            <br>
                            <span>2</span>
                        </li>
                    </ul>
                </div>
                <div class="shoppingmenu">
                    <span style="font-size: 18px;">구매확정 목록</span>
                    <span>
                                    <div class="shoppingdrop">
                                        <select name="purchaseTime" id="purchaseTime" style="width: 100px; margin-top: -15px;">
                                            <option value="1개월 전">1개월 전</option>
                                            <option value="3개월 전" selected>3개월 전</option>
                                            <option value="6개월 전">6개월 전</option>
                                            <option value="1년 전">1년 전</option>
                                            <option value="2년 전">2년 전</option>
                                            <option value="3년 전">3년 전</option>
                                        </select>
                                    </div>
                                </span>
                </div>
                <div style="margin-top: 5px; width: 750px; height: 510px; background-color: #F5F7F6; border: solid #B5B5B5 1px;">
                    <!-- 1번 -->
                    <div style="margin-top: 20px; margin-left: 30px; display: flex; justify-content: space-between;">
                        <div>
                                            <span style="font-weight: bold; font-size: 15px; margin: 5px;">구매확정
                                            </span>
                            <img src="static/images/Ellipse 16.svg" alt="EllipseImg">
                            <span style="font-size: 15px; margin: 5px; ">6/13(목) 도착완료</span>
                        </div>
                        <button type="button" style="margin-right: 20px; color: #23C961;">배송 조회 ></button>
                    </div>
                    <div style="margin: 20px; display: flex; flex-direction: row; border-bottom: solid 1px gray;">
                                        <span style="margin: 10px; margin-top: 0px;">
                                            <button type="button" style="width: 170px; height: 130px; background-color: rgb(164, 161, 161); padding: 0%; border: none; border-radius: 7px;">
                                                <!-- 나중에 쇼핑목록 이미지를 연결하기 -->
                                                <img style="width: 100%; height: auto; object-fit: cover; border-radius: 7px;" src="static/images/purchaseEX01.svg" alt="purchaseEXImg">
                                            </button>
                                        </span>
                        <div style="width: 100%; height: 100%;">
                            <p style="font-weight: bold;">진한 꽃향기 오렌지 자스민 실내공기정화 식물 인테리어식물<br>플랜테리어 화분</p>
                            <p style="margin-bottom: 0px;">1차옵션:오렌지 자스민 소 / 2차옵션: 없음</p>
                            <p>8,900원</p>
                            <div style="display: flex; justify-content: end; margin-bottom: 15px;">
                                <button type="button" class="purbtn1" style="width: 130px; height: 40px; margin-right: 10px; border: 1px solid #23C961; border-radius: 5px;">문의</button>
                                <button type="button" class="purbtn2" style="width: 130px; height: 40px; margin-left: 10px; border: 1px solid #23C961; border-radius: 5px;">리뷰작성</button>
                            </div>
                        </div>
                    </div>
                    <!-- 2번 -->
                    <div style="margin-top: 20px; margin-left: 30px; display: flex; justify-content: space-between;">
                        <div>
                                            <span id="purchaseConfirm" style="font-weight: bold; font-size: 15px; margin: 5px;">구매확정
                                            </span>
                            <img src="static/images/Ellipse 16.svg" alt="EllipseImg">
                            <span style="font-size: 15px; margin: 5px; ">6/13(목) 도착완료</span>
                        </div>
                        <button type="button" style="margin-right: 20px; color: #23C961;">배송 조회 ></button>
                    </div>
                    <div style="margin: 20px; display: flex; flex-direction: row;">
                                        <span style="margin: 10px; margin-top: 0px;">
                                            <button type="button" style="width: 170px; height: 130px; background-color: rgb(164, 161, 161); padding: 0%; border: none; border-radius: 7px;">
                                                <!-- 나중에 쇼핑목록 이미지를 연결하기 -->
                                                <img style="width: 100%; height: auto; object-fit: cover; border-radius: 7px;" src="static/images/purchaseEX02.svg" alt="purchaseEXImg">
                                            </button>
                                        </span>
                        <div style="width: 100%; height: 100%;">
                            <p style="font-weight: bold;">진한 꽃향기 오렌지 자스민 실내공기정화 식물 인테리어식물<br>플랜테리어 화분</p>
                            <p style="margin-bottom: 0px;">1차옵션:오렌지 자스민 대 / 2차옵션: 없음</p>
                            <p class="price">28,900원</p>
                            <div style="display: flex; justify-content: end; margin-bottom: 15px;">
                                <button type="button" class="purbtn1" style="width: 130px; height: 40px; margin-right: 10px; border: 1px solid #23C961; border-radius: 5px;">문의</button>
                                <button type="button" class="purbtn2" style="width: 130px; height: 40px; margin-left: 10px; border: 1px solid #23C961; border-radius: 5px;">리뷰작성</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="popup-icon1">
            <img src="static/images/챗봇아이콘.png" alt="Popup Icon" style="width: 60px; height: 60px;">
        </div>
        <div id="popup-content1" class="hidden">
            <p>안녕하세요! 플랜트 봇 입니다!<br>궁금한 것은 모두 플랜트 봇에게 물어보세요!</p>
        </div>
        <div id="popup-icon2">
            <img src="static/images/top아이콘.png" alt="Popup Icon" style="width: 60px; height: 60px;">
        </div>
        <jsp:include page="footer.jsp"/>
        <script>
            document.addEventListener('DOMContentLoaded', () => {
                const popupIcon = document.getElementById('popup-icon1');
                const popupContent = document.getElementById('popup-content1');
                const popupIcon2 = document.getElementById('popup-icon2');

                popupIcon.addEventListener('mouseover', () => {
                    popupContent.classList.remove('hidden');
                });

                popupIcon.addEventListener('mouseleave', () => {
                    popupContent.classList.add('hidden');
                });

                popupIcon2.addEventListener('click', () => {
                    window.scrollTo({ top: 0, behavior: 'smooth' });
                });
            });

            $(() => {
                $("#mycontentbtn").addClass("active");
                $(".mycontenttxt").css("color", "white");
                $("#mycontentbtn").click((e) => {
                    $("#mycontentbtn").addClass("active");
                    $("#snscontentbtn").removeClass("active");
                    $("#shopcontentbtn").removeClass("active");
                    $("#contype").trigger("click");
                    $(".mycontenttxt").css("color", "white");
                    $(".snspic").css("color", "#27AF5A");
                    $(".myshopping").css("color", "#27AF5A");
                    $("#content-a").show();
                    $("#content-b").hide();
                    $("#content-c").hide();
                });

                $("#snscontentbtn").click((e) => {
                    $("#mycontentbtn").removeClass("active");
                    $("#snscontentbtn").addClass("active");
                    $("#shopcontentbtn").removeClass("active");
                    $("#snstype").trigger("click");
                    $(".mycontenttxt").css("color", "#27AF5A");
                    $(".snspic").css("color", "white");
                    $(".myshopping").css("color", "#27AF5A");
                    $("#content-a").hide();
                    $("#content-b").show();
                    $("#content-c").hide();
                });

                $("#shopcontentbtn").click((e) => {
                    $("#mycontentbtn").removeClass("active");
                    $("#snscontentbtn").removeClass("active");
                    $("#shopcontentbtn").addClass("active");
                    $("#shoptype").trigger("click");
                    $(".mycontenttxt").css("color", "#27AF5A");
                    $(".snspic").css("color", "#27AF5A");
                    $(".myshopping").css("color", "white");
                    $("#content-a").hide();
                    $("#content-b").hide();
                    $("#content-c").show();
                });
            });
        </script>
    </body>
</html>
