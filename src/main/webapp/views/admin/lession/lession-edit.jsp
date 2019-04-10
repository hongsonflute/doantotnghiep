<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit/Add Lession</title>
</head>
<body>
<div class="content">
    <span style="color: red;">${msg}</span>
    <div class="container-fluid">
        <div class="card">
            <div class="header">
                <c:if test="${lessionModel.id!=null}">
                    <h4 class="title">Sửa bài học: ${lessionModel.title}</h4>
                    <p class="category">Giáo viên sửa bài học tại đây</p>
                </c:if>
                <c:if test="${lessionModel.id==null}">
                    <h4 class="title">Thêm Bài Học</h4>
                    <p class="category">Giáo viên thêm bài học tại đây</p>
                </c:if>

            </div>
            <div class="content table-responsive table-full-width">
                <form method="post" action="/admin-edit-lession">
                    <table class="table table-striped">
                        <tr>
                            <th>Chủ Đề</th>
                            <td>
                                <select name="categoryId">
                                    <option value="1" <c:if test="${lessionModel.id==1}">selected</c:if>>Màu sắc</option>
                                    <option value="2" <c:if test="${lessionModel.id==2}">selected</c:if>>Động vật</option>
                                    <option value="3" <c:if test="${lessionModel.id==3}">selected</c:if>>Gia đình</option>
                                    <option value="4" <c:if test="${lessionModel.id==4}">selected</c:if>>Chữ cái</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th>Tên Bài Học</th>
                            <td><input type="text" name="title" value="${lessionModel.title}"></td>
                        </tr>
                        <tr>
                            <th>Anh đại diện</th>
                            <td><input type="file" name="thumbnail" id="uploadImage" ></td>
                        </tr>
                        <tr>
                            <th>Mô tả ngắn </th>
                            <td><input type="text" name="shortDescription" id="" value="${lessionModel.shortDescription}"></td>
                        </tr>
                        <tr>
                            <th>Nội dung</th>
                            <td><textarea id="ck1" name="content" value="${lessionModel.content}"></textarea></td>
                        </tr>
                        <tr>
                            <th>
                                <input type="hidden" name="createdBy" value="${USERMODEL.userName}">
                                <c:if test="${lessionModel.id!=null}">
                                    <input type="hidden" name="action" value="update">
                                    <button type="submit" id="btnSuaBaiHoc">Sửa Bài Học</button>
                                    <input type="hidden" value="${lessionModel.id}" name="id">
                                    <input type="hidden" value="${USERMODEL.userName}" name="modifiedBy">
                                </c:if>
                                <c:if test="${lessionModel.id==null}">
                                    <button type="submit" id="btnThemBaiHoc">Thêm bài học</button>
                                    <input type="hidden" name="action" value="addnew">
                                </c:if>
                            </th>
                            <td></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
    CKEDITOR.replace('ck1');
    CKEDITOR.instances['ck1'].setData("${lessionModel.title}");
</script>

</body>
