<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Quản lý bài học</title>

</head>
<body>
<span style="color: red;">${msg}</span>
<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="header">
                        <h4 class="title">QUẢN LÝ BÀI HỌC</h4>
                        <p class="category">Bảng danh sách các bài học trong hệ thống</p>
                    </div>
                    <div class="header">
                        <form action="/admin-edit-lession" method="get">
                            <select name="status">
                                <option value="1" <c:if test="${trangthai==1}">selected</c:if>>Đã duyệt</option>
                                <option value="0" <c:if test="${trangthai==0}">selected</c:if>>Chưa duyệt</option>
                            </select>
                            <input type="hidden" name="action" value="locbaihoc">
                            <button>Lọc bài học</button>
                        </form>
                        <br>
                        <c:if test="${trangthai==1}">
                            <p class="category" style="color: blue">CÁC BÀI HỌC ĐÃ ĐƯỢC DUYỆT</p>
                        </c:if>
                        <c:if test="${trangthai==0}">
                            <p class="category" style="color: blue">CÁC BÀI HỌC CHƯA ĐƯỢC DUYỆT</p>
                        </c:if>
                        <div class="header">

                            <button class="ti-trash" id="btnDeleteLession" disabled>Xóa</button>
                            <c:if test="${trangthai==0}">
                                <button class="ti-pencil" id="btnDuyet" disabled>Duyệt</button>
                            </c:if>
                            <c:if test="${trangthai==1}">
                                <button class="ti-pencil" id="btnHuyDuyet" disabled>Hủy Duyệt</button>
                            </c:if>
                        </div>

                    </div>
                    <div class="content table-responsive table-full-width">
                        <table class="table table-striped">
                            <thead>
                            <th><input type="checkbox" id="checkAll"></th>
                            <th>ID</th>
                            <th>Hình</th>
                            <th>Tiêu đề</th>
                            <th>Mô tả ngắn</th>
                            <th>Danh mục</th>
                            <th>Author</th>
                            <th class="ti-settings"> Thao Tác</th>
                            </thead>
                            <tbody>
                            <c:forEach var="les" items="${lessionModels}">
                                <tr>
                                    <td><input type="checkbox" id="checkbox_${les.id}" value="${les.id}"></td>
                                    <td>${les.id}</td>
                                    <c:set var="img" value="/repository/${les.thumbnail}"/>
                                    <td><img src="${img}" class="hinhbaihoc"></td>
                                        <%--<td>${les.thumbnail}</td>--%>
                                    <td>${les.title}</td>
                                    <td>${les.shortDescription}</td>
                                    <td>${les.categoryModel.name}</td>
                                    <td>${les.createdBy}</td>
                                    <td>
                                        <a class="ti-eye"
                                           href="<c:url value="/lession-detail?action=detail&idLession=${les.id}"/> ">
                                            Xem Trang </a>
                                        <a class="ti-pencil"
                                           href="<c:url value="/admin-edit-lession?action=edit&idLession=${les.id}"/> ">
                                            Sửa </a>
                                        <a class="ti-pencil"
                                           href="<c:url value="/admin-edit-account?action=edit&userId=${u.id}"/> "> Thêm
                                            câu hỏi </a>
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