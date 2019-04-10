<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<!-- ##### Header Area Start ##### -->
<header class="header-area">

    <!-- Top Header Area -->
    <div class="top-header-area d-flex justify-content-between align-items-center">
        <!-- Contact Info -->
        <div class="contact-info">
            <a href="#"><span>Phone:</span> 0965439069</a>
            <a href="#"><span>Email:</span> hongsonflute@gmail.com</a>
        </div>
        <!-- Follow Us -->
        <div class="follow-us">
            <span>Follow us</span>
            <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
            <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
            <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
        </div>
    </div>

    <!-- Navbar Area -->
    <div class="clever-main-menu">
        <div class="classy-nav-container breakpoint-off">
            <!-- Menu -->
            <nav class="classy-navbar justify-content-between" id="cleverNav">

                <!-- Logo -->
                <a class="nav-brand" href="index.html"><img src="img/core-img/logo.png" alt=""></a>

                <!-- Navbar Toggler -->
                <div class="classy-navbar-toggler">
                    <span class="navbarToggler"><span></span><span></span><span></span></span>
                </div>

                <!-- Menu -->
                <div class="classy-menu">

                    <!-- Close Button -->
                    <div class="classycloseIcon">
                        <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                    </div>

                    <!-- Nav Start -->
                    <div class="classynav">
                        <ul>
                            <li><a href='<c:url value="/trang-chu"/>'>Trang Chủ</a></li>
                            <li><a href='<c:url value="/user?userId=${USERMODEL.id}"/>'>Trang cá nhân</a></li>
                            <li><a href='<c:url value="/lien-he?action=about"/>'>Liên Hệ</a></li>
                        </ul>

                        <!-- Search Button -->
                        <div class="search-area">
                            <form action="#" method="post">
                                <input type="search" name="search" id="search" placeholder="Search">
                                <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                            </form>
                        </div>
                        <c:if test="${empty USERMODEL}"> <%--//nếu chưa đăng nhập--%>
                        <!-- Register / Login -->
                        <div class="register-login-area">
                            <a href='<c:url value="/dang-ky?action=register"/>' class="${activeBtnRegister}">Đăng Ký</a>
                            <a href='<c:url value="/dang-nhap?action=login"/>' class="${activeBtnLogin}">Đăng Nhập</a>
                        </div>
                        </c:if>

                        <c:if test="${not empty USERMODEL}">
                            <!-- Register / Login -->
                            <div class="login-state d-flex align-items-center">
                                <div class="user-name mr-30">
                                    <div class="dropdown">
                                        <a class="dropdown-toggle" href="#" role="button" id="userName" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${USERMODEL.userName}</a>
                                        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userName">
                                            <a class="dropdown-item" href='<c:url value="/user?userId=${USERMODEL.id}"/>'>Trang cá nhân</a>
                                            <c:if test="${USERMODEL.roleId ==1||USERMODEL.roleId ==1 }">
                                                <a class="dropdown-item" href='<c:url value="/admin-home"/>'>Trang quản trị</a>
                                            </c:if>
                                            <a class="dropdown-item" href='<c:url value="/dang-xuat?action=logout"/>'>Đăng Xuất</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="userthumb">
                                    <img src="/template/web/img/bg-img/t1.png" alt="">
                                </div>
                            </div>
                        </c:if>

                    </div>
                    <!-- Nav End -->
                </div>
            </nav>
        </div>
    </div>
</header>
<!-- ##### Header Area End ##### -->