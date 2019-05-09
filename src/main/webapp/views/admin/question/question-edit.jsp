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
    <div class="container-fluid">
        <div class="card">
            <div class="header">
                <h4 class="title">Thêm Câu Hỏi</h4>
                <p class="category">Giáo viên thêm câu hỏi cho mỗi bài học tại đây</p>
            </div>

            <div class="content table-responsive table-full-width">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12"><h5 style="background-color:#F4F3EF">Chọn bài học:</h5></div>
                        <div class="col-md-2"><label>Chọn chủ đề</label></div>
                        <div class="col-md-2"><select>
                            <option>fsdfds</option>
                            <option>fsdfds</option>
                            <option>fsdfds</option>
                            <option>fsdfds</option>
                        </select></div>
                        <div class="col-md-2"><label>Chọn bài học</label></div>
                        <div class="col-md-2"><select>
                            <option>fsdfds</option>
                            <option>fsdfds</option>
                            <option>fsdfds</option>
                            <option>fsdfds</option>
                        </select></div>
                    </div>
                    <div class="row">
                        <div class="col-md-12"><h5 style="background-color:#F4F3EF">Thêm câu hỏi</h5></div>
                    </div>
                    <div class="row">
                        <div class="col-md-2"><label>Chọn kiểu câu hỏi</label></div>
                        <div class="col-md-10">
                            <select id="loaicauhoi">
                                <option id="luyennghe">Luyện Nghe</option>
                                <option>Luyện Nói</option>
                                <option value="3">Trắc Nghiệm</option>
                            </select>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-md-2"><label>Tên câu hỏi</label></div>
                        <div class="col-md-4"><input type="text"></div>
                        <div class="col-md-2"><label>Nội dung</label></div>
                        <div class="col-md-4"><textarea></textarea></div>

                    </div>
                    <div class="row">
                        <div class="col-md-1"><label>Ảnh</label></div>
                        <div class="col-md-4"><input type="file"></div>
                        <div class="col-md-2"><label>Âm thanh</label></div>
                        <div class="col-md-4"><input type="file"></div>
                    </div>

                    <div class="row">
                        <div class="col-md-12"><h5 style="background-color:#F4F3EF">Thêm đáp án</h5></div>
                    </div>
                    <div class="dapan">
                        <div class="row">
                            <div class="col-md-2"><b style="color: #0f74a8;">Đáp án A</b></div>
                            <div class="col-md-2"><label>Nội dung</label></div>
                            <div class="col-md-4"><textarea></textarea></div>

                        </div>
                        <div class="row">
                            <div class="col-md-1"><label>Ảnh</label></div>
                            <div class="col-md-4"><input type="file"></div>
                            <div class="col-md-2"><label>Âm thanh</label></div>
                            <div class="col-md-4"><input type="file"></div>
                        </div>
                    </div>
                    <div class="dapan">
                        <div class="row">
                            <div class="col-md-2"><b style="color: #0f74a8;">Đáp án B</b></div>
                            <div class="col-md-2"><label>Nội dung</label></div>
                            <div class="col-md-4"><textarea></textarea></div>

                        </div>
                        <div class="row">
                            <div class="col-md-1"><label>Ảnh</label></div>
                            <div class="col-md-4"><input type="file"></div>
                            <div class="col-md-2"><label>Âm thanh</label></div>
                            <div class="col-md-4"><input type="file"></div>
                        </div>
                    </div>

                    <div class="dapan">
                        <div class="row">
                            <div class="col-md-2"><b style="color: #0f74a8;">Đáp án C</b></div>
                            <div class="col-md-2"><label>Nội dung</label></div>
                            <div class="col-md-4"><textarea></textarea></div>

                        </div>
                        <div class="row">
                            <div class="col-md-1"><label>Ảnh</label></div>
                            <div class="col-md-4"><input type="file"></div>
                            <div class="col-md-2"><label>Âm thanh</label></div>
                            <div class="col-md-4"><input type="file"></div>
                        </div>
                    </div>
                    <div class="dapan">
                        <div class="row">
                            <div class="col-md-2"><b style="color: #0f74a8;">Đáp án D</b></div>
                            <div class="col-md-2"><label>Nội dung</label></div>
                            <div class="col-md-4"><textarea></textarea></div>

                        </div>
                        <div class="row">
                            <div class="col-md-1"><label>Ảnh</label></div>
                            <div class="col-md-4"><input type="file"></div>
                            <div class="col-md-2"><label>Âm thanh</label></div>
                            <div class="col-md-4"><input type="file"></div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <button id="themcauhoi">Thêm câu hỏi</button>

    </div>
</div>
</body>
