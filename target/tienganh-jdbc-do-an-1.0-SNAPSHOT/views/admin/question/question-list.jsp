<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List lession</title>
</head>
<body>
<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="header">
                        <h4 class="title">Câu hỏi</h4>
                        <p class="category">Danh sách các câu hỏi</p>
                    </div>
                    <div class="header">
                        <a class="ti-trash" href="#"> Sửa</a>
                        <a class="ti-pencil" href="#"> Xóa</a>
                    </div>
                    <div class="content table-responsive table-full-width">
                        <table class="table table-striped">
                            <thead>
                            <th><input type="checkbox"></th>
                            <th>ID Câu Hỏi</th>
                            <th>Tên Câu Hỏi</th>
                            <th>Tên Bài Học</th>
                            <th>Tác Gỉa</th>
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
                                    <a class="ti-eye" href="#"> Xem Trước</a>
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

