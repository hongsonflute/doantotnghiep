<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin Home</title>
</head>
<body>
<span style="color: red;">${msg}</span>
<div class="row">
    <div class="col-md-12">
        <h5>Thêm bài test</h5>
    </div>
    <form method="post" action="">
        <div class="col-md-12">
            <label>Chọn tên bài học học</label>
            <select name="lessionid">
                <c:forEach var="les" items="${lessionModels}">
                <option value="${les.id}" >${les.title}</option>
                </c:forEach>
            </select>
        </div>
    <div class="col-md-12">
        <label>Chọn bài trắc nghiệm</label>
        <select name="idBaiTracNghiem">
            <option value="1" >Bài trắc nghiệm 1</option>
            <option value="2">Bài trắc nghiệm 2</option>
            <option value="3">Bài trắc nghiệm 3</option>
        </select>
    </div>
        <div class="col-md-12">
            <label>Nhập nội dung câu hỏi</label>
            <input name="content" type="text" value="" style="width: 500px">
        </div>
        <div class="col-md-12">
            <label>Nhập đáp án A</label>
            <input name="answerA" type="text" value="" style="width: 200px">
            <label>Chọn là đúng</label>
            <input type="radio" name="answerTrue" value="a">
        </div>
        <div class="col-md-12">
            <label>Nhập đáp án B</label>
            <input name="answerB" type="text" value="" style="width: 200px">
            <label>Chọn là đúng</label>
            <input type="radio" name="answerTrue" value="b">
        </div>
        <div class="col-md-12">
            <label>Nhập đáp án C</label>
            <input name="answerC" type="text" value="" style="width: 200px">
            <label>Chọn là đúng</label>
            <input type="radio" name="answerTrue" value="c">
        </div>
        <div class="col-md-12">
            <label>Nhập đáp án D</label>
            <input name="answerD" type="text" value="" style="width: 200px">
            <label>Chọn là đúng</label>
            <input type="radio" name="answerTrue" value="d">
        </div>
    <button type="submit">Thêm bài trắc nghiệm</button>
    </form>
</div>

</body>
