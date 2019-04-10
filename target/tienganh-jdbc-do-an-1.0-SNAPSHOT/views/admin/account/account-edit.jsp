<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit/Add Lession</title>
</head>
<body>

<span style="color: red;">${msg}</span>

<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="header">
                        <h4 class="title">Thêm tài khoản</h4>
                        <p class="category"> Admin Thêm tài khoản trên hệ thống tại đây</p>
                    </div>
                    <div class="content table-responsive table-full-width">
                        <form method="post" action="/admin-edit-account">
                            <table class="table table-striped">
                                <thead>
                                <th>Họ và tên</th>
                                <th>Loại quyền</th>
                                <th>Tên đăng nhập</th>
                                <th>Mật khẩu</th>
                                <th class="ti-settings"> Thao Tác</th>
                                </thead>
                                <tbody>
                                <tr>
                                    <td><input type="text" name="fullName" id="fullname" value="${userModel.fullName}"></td>
                                    <td><select name="roleId" id="roleid">
                                        <option value="">--------</option>
                                        <option value="1" <c:if test="${userModel.roleId==1}">selected</c:if>>Quản trị</option>
                                        <option value="2" <c:if test="${userModel.roleId==2}">selected</c:if>>Giáo viên</option>
                                        <option value="3" <c:if test="${userModel.roleId==3}">selected</c:if>>Học sinh</option>
                                    </select></td>
                                    <td><input type="text" name="userName" id="username" value="${userModel.userName}"></td>
                                    <td><input type="password" name="password" id="password" value="${userModel.userName}"></td>
                                    <td>
                                        <c:if test="${userModel==null}">
                                            <input type="hidden" name="action" value="themtaikhoan">
                                            <input type="hidden" name="createdBy" value="${USERMODEL.userName}">
                                        <button type="submit" onclick=" return validateAddUser()">Thêm tài khoản
                                        </button>
                                        </c:if>
                                        <c:if test="${userModel!=null}">
                                            <input type="hidden" name="id" value="${userModel.id}">
                                            <input type="hidden" name="modifiedBy" value="${USERMODEL.userName}">
                                            <input type="hidden" name="action" value="suataikhoan">
                                            <button type="submit" onclick=" return validateAddUser()">Sửa thông tin
                                            </button>
                                        </c:if>
                                    </td>


                                </tr>

                                <tr>
                                    <td><span style="color: red" id="showMsg_fullname"></span></td>
                                    <td><span class="hien-thi-loi" id="showMsg_role"></span></td>
                                    <td><span class="hien-thi-loi" id="showMsg_username"></span></td>
                                    <td><span class="hien-thi-loi" id="showMsg_password"></span></td>
                                    <td><span></span></td>
                                </tr>
                                </tbody>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
