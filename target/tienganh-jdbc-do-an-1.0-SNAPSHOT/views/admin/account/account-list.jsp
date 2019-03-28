<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Quản lý tài khoản</title>
</head>
<body>
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
                        <a class="ti-pencil" href="#"> Sửa</a>
                        <a class="ti-trash" href="#"> Xóa</a>
                        <a class="ti-pencil" href='<c:url value="/admin-edit-account?action=edit"/>'> Thêm mới</a>
                    </div>
                    <div class="content table-responsive table-full-width">
                        <table class="table table-striped">
                            <thead>
                            <th><input type="checkbox"></th>
                            <th>ID</th>
                            <th>FullName</th>
                            <th>Email</th>
                            <th>UserName</th>
                            <th class="ti-settings"> Thao Tác</th>
                            </thead>
                            <tbody>
                            <tr>
                                <td><input type="checkbox"></td>
                                <td>1</td>
                                <td>Dakota Rice</td>
                                <td>$36,738</td>
                                <td>Niger</td>
                                <td>
                                    <a class="ti-eye" href="#"> Xem Trang Cá Nhân</a>
                                </td>
                            </tr>
                            </tbody>
                        </table>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>

