<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Đăng Nhập</title>
</head>

<body>
<h3>Đăng Nhập</h3>
<form class="form-horizontal" action="/dang-nhap" method="post">
    <div class="form-group">
        <label class="control-label col-sm-2">Tên Đăng Nhập:</label>
        <span id="showMsg_username" style="color: red"></span>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="username" name="userName" placeholder="Nhập tên đăng nhập">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-sm-2" >Mật khẩu:</label>
        <span id="showMsg_password" style="color: red"></span>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="password" name="password" placeholder="Nhập mật khẩu">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label><input type="checkbox"> Remember me</label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default" onclick=" return validateLogin()">Đăng Nhập</button>
            <c:if test="${not empty msg}">
                <span style="color: red"> ${msg}</span>
            </c:if>
        </div>
    </div>
</form>

</body>
</html>
