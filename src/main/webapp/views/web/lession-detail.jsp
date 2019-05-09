<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${lessionModel.title}</title>
</head>

<body>
<div class="single-course-content section-padding-100">
    <div class="container">
        <div class="row">
            <div class="col-12 col-lg-8">
                <div class="course--content">
                    <div class="clever-tabs-content">
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="tab--1" data-toggle="tab" href="#tab1" role="tab"
                                   aria-controls="tab1" aria-selected="false">NỘI DUNG</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="tab--2" data-toggle="tab" href="#tab2" role="tab"
                                   aria-controls="tab2" aria-selected="true">LUYỆN TẬP</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="tab--4" data-toggle="tab" href="#tab4" role="tab"
                                   aria-controls="tab4" aria-selected="true">KIỂM TRA NGỮ PHÁP</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="tab--3" data-toggle="tab" href="#tab3" role="tab"
                                   aria-controls="tab3" aria-selected="true">BÌNH LUẬN</a>
                            </li>
                        </ul>

                        <div class="tab-content" id="myTabContent">
                            <!-- Tab Text -->
                            <div class="tab-pane fade show active" id="tab1" role="tabpanel" aria-labelledby="tab--1">
                                <div class="clever-description">

                                    <!-- About Course -->
                                    <div class="about-course mb-30">
                                        <c:set var="video" value="/repository/${lessionModel.video}"/>
                                        <video width="600" controls>
                                            <source src="${video}" type="video/mp4">

                                        </video>
                                    </div>

                                </div>
                            </div>

                            <!-- Tab Text -->
                            <div class="tab-pane fade" id="tab2" role="tabpanel" aria-labelledby="tab--2">
                                <div class="clever-curriculum">

                                    <!-- About Curriculum -->
                                    <div class="about-curriculum mb-30">
                                        <h4 id="luyentap">Luyện Tập</h4>
                                        <p>Các em hãy làm bài luyện tập dưới đây để nắm vững kiến thức</p>
                                    </div>
                                    <div class="about-curriculum mb-30">
                                        <h4>TRÒ CHƠI LUYỆN NGHE 01</h4>
                                        <div class="khung-tro-choi">
                                            <div class="cauhoi">
                                                <div class="loa"
                                                     style="background-image: url(/template/thuvien/hinhanh/loa-icon.png)"
                                                     id="loa"></div>
                                                <div id="cogiao" class="cogiao"
                                                     style="background-image: url(/template/thuvien/hinhanh/huong-dan-icon.png)"></div>
                                                <div class="huongdan">
                                                    <p>Các em hãy nhấn vào loa để nghe câu hỏi. Rồi chọn đáp án
                                                        đúng!!! </p>
                                                </div>
                                            </div>
                                            <div class="dapandung"
                                                 style="background-image: url(/template/thuvien/hinhanh/hoi-cham-icon.png)"
                                                 id="dapandung"></div>
                                            <div class="dapan1"
                                                 style="background-image: url(/template/thuvien/hinhanh/chuso/so1.jpg)"
                                                 id="dapan1" onclick="myMove()">
                                                <button type="text" value="1" id="a"></button>
                                            </div>
                                            <div class="dapan2"
                                                 style="background-image: url(/template/thuvien/hinhanh/chuso/so2.jpg)"
                                                 id="dapan2" onclick="myMove2()">
                                                <button type="text" value="0" id="b"></button>
                                            </div>
                                            <div class="dapan3"
                                                 style="background-image: url(/template/thuvien/hinhanh/chuso/so3.jpg)"
                                                 id="dapan3" onclick="myMove3()">
                                                <button type="text" value="0" id="c"></button>
                                            </div>
                                            <div class="dapan4"
                                                 style="background-image: url(/template/thuvien/hinhanh/chuso/so4.jpg)"
                                                 id="dapan4" onclick="myMove4()">
                                                <button type="text" value="0" id="d"></button>
                                            </div>
                                            <button type="button" class="kiemtra" id="kiemtraketqua">Trả Lời</button>
                                            <button type="button" class="cautiep" id="cautiep" hidden>Câu Tiếp>>
                                            </button>
                                            <div hidden id="thongbaodung" class="thongbaodapan"
                                                 style="background-image: url(/template/thuvien/hinhanh/true.jpg)"></div>
                                            <div hidden id="thongbaosai" class="thongbaodapan"
                                                 style="background-image: url(/template/thuvien/hinhanh/false.jpg)"></div>
                                        </div>
                                    </div>

                                    <div class="clever-review">
                                        <!-- About Review -->
                                        <div class="about-review mb-30">
                                            <h4>THÀNH TÍCH CỦA: ${USERMODEL.userName}</h4>


                                            <table class="table">
                                                <thead>
                                                <tr>
                                                    <th>Tên Bài Nghe:</th>
                                                    <th>Số điểm lần cuối:</th>
                                                    <th>Số lần làm:</th>
                                                </tr>
                                                </thead>
                                                <c:forEach items="${thanhTichModels}" var="thanhtich">
                                                    <tbody>
                                                    <tr>
                                                        <td>Bài test số ${thanhtich.idBaiTracNghiem}</td>
                                                        <td>${thanhtich.diemString}</td>
                                                        <td>${thanhtich.soLanLam}</td>
                                                    </tr>
                                                    </tbody>
                                                </c:forEach>
                                            </table>

                                        </div>
                                    </div>

                                </div>
                            </div>

                            <!-- Tab Text -->
                            <div class="tab-pane fade" id="tab3" role="tabpanel" aria-labelledby="tab--3">
                                <div class="clever-review">

                                    <!-- About Review -->
                                    <div class="about-review mb-30">
                                        <h4>Bình luận</h4>
                                        <p>Phụ huynh và các em hãy để lại bình luận của mình về bài học để chúng tôi làm
                                            tốt hơn</p>
                                    </div>

                                    <!-- Ratings -->
                                    <div class="clever-ratings d-flex align-items-center mb-30">

                                        <div class="total-ratings text-center d-flex align-items-center justify-content-center">
                                            <div class="ratings-text">
                                                <h2>4.5</h2>
                                                <div class="ratings--">
                                                    <i class="fa fa-star" aria-hidden="true"></i>
                                                    <i class="fa fa-star" aria-hidden="true"></i>
                                                    <i class="fa fa-star" aria-hidden="true"></i>
                                                    <i class="fa fa-star" aria-hidden="true"></i>
                                                    <i class="fa fa-star-half-o" aria-hidden="true"></i>
                                                </div>
                                                <span>Rated 5 out of 3 Ratings</span>
                                            </div>
                                        </div>

                                        <div class="rating-viewer">
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>5 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 80%"
                                                         aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>80%</span>
                                            </div>
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>4 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 20%"
                                                         aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>20%</span>
                                            </div>
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>3 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 0%"
                                                         aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>0%</span>
                                            </div>
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>2 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 0%"
                                                         aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>0%</span>
                                            </div>
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>1 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 0%"
                                                         aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>0%</span>
                                            </div>
                                        </div>
                                    </div>

                                    <!-- Single Review -->
                                    <div class="single-review mb-30">
                                        <div class="d-flex justify-content-between mb-30">
                                            <!-- Review Admin -->
                                            <div class="review-admin d-flex">
                                                <div class="thumb">
                                                    <img src="img/bg-img/t1.png" alt="">
                                                </div>
                                                <div class="text">
                                                    <h4>Viết một bình luận</h4>
                                                </div>
                                            </div>
                                            <!-- Ratings -->
                                            <div class="ratings">
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                            </div>
                                        </div>
                                        <form method="post" action="/binhluan">
                                        <textarea rows="4" cols="80" name="content"></textarea>
                                        <button type="submit">Gửi bình luận</button>
                                            <input type="hidden" value="${USERMODEL.id}" name="userId">
                                            <input type="hidden" value="${lessionModel.id}" name="lessionId">
                                            <input type="hidden" name="createdBy" value="${USERMODEL.userName}">
                                            <input type="hidden" name="action" value="thembinhluan">
                                        </form>
                                    </div>
                                    <c:forEach var="itemsComment" items="${commentModels}">
                                    <!-- Single Review -->
                                    <div class="single-review mb-30">
                                        <div class="d-flex justify-content-between mb-30">
                                            <!-- Review Admin -->
                                            <div class="review-admin d-flex">
                                                <div class="thumb">
                                                    <img src="img/bg-img/t1.png" alt="">
                                                </div>
                                                <div class="text">
                                                    <h6>${itemsComment.createdBy}</h6>
                                                    <span>${itemsComment.createdDate}</span>
                                                </div>
                                            </div>
                                            <!-- Ratings -->
                                            <div class="ratings">
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                            </div>
                                        </div>
                                        <p>
                                            ${itemsComment.content}
                                        </p>
                                        <c:if test="${USERMODEL.id==itemsComment.userId}">
                                        <form method="post" action="/binhluan">
                                            <input type="hidden" value="xoabinhluan" name="action">
                                            <input type="hidden" value="${lessionModel.id}" name="lessionId">
                                            <input type="hidden" name="idCommentDelete" value="${itemsComment.id}">
                                            <button type="submit">Xóa bình luận</button>
                                        </form>
                                        </c:if>
                                    </div>
                                    </c:forEach>
                                </div>
                            </div>


                            <!-- Tab Text -->
                            <div class="tab-pane fade" id="tab4" role="tabpanel" aria-labelledby="tab--4">
                                <div class="clever-review">
                                    <!-- About Review -->
                                    <div class="about-review mb-30">
                                        <h4>Kiểm tra ngữ pháp</h4>
                                        <p>Các em hãy chọn đề thì và bắt đầu bài kiểm tra nào</p>
                                        <%--<ul>
                                            <li>
                                                <button id="baitest1">Bài kiểm tra số 1</button>
                                            </li>
                                        </ul>--%>
                                        <form method="get" action="/test-trac-nghiem">
                                            <h5>Chọn bài trắc nghiệm</h5>
                                            <select name="idBaiTracNghiem">
                                                <option value="1">BÀI TRẮC NGHIỆM 01</option>
                                                <option value="2">BÀI TRẮC NGHIỆM 02</option>
                                                <option value="3">BÀI TRẮC NGHIỆM 03</option>
                                            </select>
                                            <input type="hidden" value="${lessionModel.id}" name="lessionid">
                                            <button type="submit">LÀM BÀI</button>
                                        </form>
                                    </div>


                                    <div class="clever-review">
                                        <!-- About Review -->
                                        <div class="about-review mb-30">
                                            <h4>THÀNH TÍCH CỦA: ${USERMODEL.userName}</h4>


                                                <table class="table">
                                                    <thead>
                                                    <tr>
                                                        <th>Tên Bài Test:</th>
                                                        <th>Số điểm lần cuối:</th>
                                                        <th>Số lần làm:</th>
                                                    </tr>
                                                    </thead>
                                                    <c:forEach items="${thanhTichModels}" var="thanhtich">
                                                    <tbody>
                                                    <tr>
                                                        <td>Bài test số ${thanhtich.idBaiTracNghiem}</td>
                                                        <td>${thanhtich.diemString}</td>
                                                        <td>${thanhtich.soLanLam}</td>
                                                    </tr>
                                                    </tbody>
                                                    </c:forEach>
                                                </table>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-12 col-lg-4">
                <div class="course-sidebar">

                    <!-- Widget -->
                    <div class="sidebar-widget">
                        <h4>Thông Tin Bài Học</h4>
                        <ul class="features-list">
                            <li>
                                <b>Tên Bài Học</b> <h6></i>${lessionModel.title}</h6>
                            </li>
                            <li>
                                <b>Tạo Bởi</b> <h6></i>${lessionModel.createdBy}</h6>
                            </li>
                            <li>
                                <b>Ngày Tạo</b><h6></i>${lessionModel.createdDate}</h6>
                            </li>
                            <li>
                                <h6></i>${lessionModel.categoryModel.name}</h6>
                            </li>
                            <li>
                                <h6><i class="fa fa-thumbs-up" aria-hidden="true"></i>Thích</h6>
                                <h6>60</h6>
                            </li>
                            <li>
                                <h6><i class="fa fa-thumbs-down" aria-hidden="true"></i>Không Thích</h6>
                                <h6>5</h6>
                            </li>
                        </ul>
                    </div>

                    <!-- Widget -->

                    <!-- Widget -->
                    <div class="sidebar-widget">
                        <h4>Tổng Thành Tích</h4>
                        <ul class="features-list">
                            <li>
                                <b>Luyện Nghe</b> <h6>0%</h6>
                            </li>
                            <li>
                                <b>Test Ngữ Pháp</b> <h6>0%</h6>
                            </li>
                            <li>
                                <b>Luyện Viết</b> <h6>0%</h6>
                            </li>
                        </ul>
                    </div>

                    <!-- Widget -->

                    <div class="sidebar-widget">
                        <h4>Bài Học Cùng Chủ Đề</h4>
                        <c:forEach items="${lessionModels}" var="lsm">
                            <c:if test="${lsm.id!=lessionModel.id}">
                        <!-- Single Courses -->
                        <div class="single--courses d-flex align-items-center">
                            <div class="thumb">
                                <c:set var="img" value="/repository/${lsm.thumbnail}"/>
                                <a href="<c:url value='/lession-detail?action=detail&idLession=${lsm.id}'/> ">
                                <img src="${img}" alt="">
                                </a>
                            </div>
                            <div class="content">
                                <h5>${lsm.title}</h5>

                            </div>
                        </div>
                            </c:if>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
