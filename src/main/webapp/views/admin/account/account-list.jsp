<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Quản lý tài khoản</title>
</head>
<body>
<span style="color: red;">${msg}</span>
<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="header">
                        <h4 class="title">TÀI KHOẢN</h4>
                        <p class="category">Bảng danh sách các tài khoản trong hệ thống</p>
                    </div>
                    <div class="header">
                        <button class="ti-trash" id="btnDeleteUser" disabled >Xóa</button>
                        <a class="ti-pencil" href='<c:url value="/admin-edit-account?action=edit"/>'> Thêm mới</a>
                    </div>
                    <div class="content table-responsive table-full-width">
                        <table class="table table-striped">
                            <thead>
                            <th><input type="checkbox" id="checkAll"></th>
                            <th>ID</th>
                            <th>Hình</th>
                            <th>UserName</th>
                            <th>FullName</th>
                            <th>Ngày Tham gia</th>
                            <th>Quyền truy cập</th>
                            <th class="ti-settings"> Thao Tác</th>
                            </thead>
                            <tbody>
                            <c:forEach var="u" items="${userModels}">
                                <tr>
                                    <td><input type="checkbox" id="checkbox_${u.id}" value="${u.id}"></td>
                                    <td>${u.id}</td>
                                    <td><img src="/template/thuvien/hinhanh/huong-dan-icon.png" class="hinhbaihoc"></td>
                                    <td>${u.userName}</td>
                                    <td>${u.fullName}</td>
                                    <td>${u.createdDate}</td>
                                    <td>${u.role.name}</td>
                                    <td>
                                        <a class="ti-eye" href="<c:url value="/user?userId=${u.id}"/> "> Xem Trang </a>
                                        <a class="ti-pencil" href="<c:url value="/admin-edit-account?action=edit&userId=${u.id}"/> "> Sửa </a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>

</html>