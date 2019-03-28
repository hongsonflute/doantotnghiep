<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trang Cá Nhân</title>
</head>

<body>
<div class="row"  style="margin-top: 5%;">
    <div class="col-md-4">
        <!-- Widget -->
        <div class="clever-curriculum">
            <div class="about-curriculum mb-30">
                <%-- <div class="course-sidebar">
                     <div class="sidebar-widget">--%>
                <div class="row">
                    <div class="col-md-12">
                        <img src="/template/admin/img/faces/face-2.jpg">
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-12">
                        <ul class="features-list">
                            <li class="user-menu"><b class="ti-camera"></b><a href="#"> Thay đổi ảnh</a></li>
                            <li class="user-menu"><b class="ti-user"></b><a href="#"> Thông tin cá nhân</a></li>
                            <li class="user-menu"><b class="ti-eye"></b><a href="#"> Bài học của tôi</a></li>
                            <li class="user-menu"><b class="ti-book"></b><a href="#"> Thành tích học tập</a></li>
                            <li class="user-menu"><b class="ti-shift-right"></b><a href="#"> Thoát</a></li>
                        </ul>
                    </div>

                </div>


            </div>
        </div>

    </div>



    <div class="col-md-8">

        <!-- About Curriculum -->
        <div class="clever-curriculum">
            <div class="about-curriculum mb-30">
                <h5 style="text-align: center">Thông tin cá nhân</h5>
                <table width="100%">
                    <tr class="hang">
                        <th class="tieu-de">Họ và tên</th>
                        <td class="du-lieu"><input type="text" value="${userModel.fullName}" class="input-du-lieu"></td>
                    </tr>
                    <tr class="hang">
                        <th class="tieu-de">Địa chỉ Email</th>
                        <td class="du-lieu"><input type="text" value="${userModel.userName}" class="input-du-lieu"></td>
                    </tr>
                    <tr class="hang">
                        <th class="tieu-de">Ngày sinh</th>
                        <td class="du-lieu"><input type="text" value="${userModel.password}" class="input-du-lieu"></td>
                    </tr>
                    <tr class="hang">
                        <th class="tieu-de">Giới tính</th>
                        <td class="du-lieu"><input type="text" value="" class="input-du-lieu"></td>
                    </tr>
                    <tr class="hang">
                        <th class="tieu-de">Ngày tham gia</th>
                        <td class="du-lieu"><input type="text" value="" class="input-du-lieu"></td>
                    </tr>
                </table>
                <a class="ti-save" href="#" style="color: green"> Cập nhật thông tin</a>
            </div>
        </div>
    </div>



</div>


</body>