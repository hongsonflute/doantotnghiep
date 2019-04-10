<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Đăng Ký</title>

</head>

<body>
<h3>Đăng Ký</h3>

<form class="form-horizontal" action="/dang-ky" method="post">
    <div class="form-group">
        <label class="control-label col-sm-2">Họ và tên:</label>
        <span id="showMsg_fullname" style="color: red"></span>
        <div class="col-sm-7">
            <input type="text" class="form-control" id="fullname" name="fullName" placeholder="Nhập họ và tên">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Tên đăng nhập:</label>
        <span id="showMsg_username" style="color: red"></span>
        <div class="col-sm-7">
            <input type="text" class="form-control" id="username" name="userName" placeholder="Nhập tên đăng nhập">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2">Mật Khẩu:</label>
        <span id="showMsg_password" style="color: red"></span>
        <div class="col-sm-7">
            <input type="password" class="form-control" id="password" name="password" placeholder="Nhập mật khẩu">
        </div>
    </div>
    <input type="hidden" name="action" value="register">
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default" onclick=" return validateRegister()">Đăng Ký</button>
            <c:if test="${not empty msg}">
                <span style="color: red"> ${msg}</span>
            </c:if>
        </div>
    </div>
</form>
</body>