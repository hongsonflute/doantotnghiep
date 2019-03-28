<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Bài học:</title>
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
                                <a class="nav-link active" id="tab--1" data-toggle="tab" href="#tab1" role="tab" aria-controls="tab1" aria-selected="false">NỘI DUNG</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="tab--2" data-toggle="tab" href="#tab2" role="tab" aria-controls="tab2" aria-selected="true">LUYỆN TẬP</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="tab--3" data-toggle="tab" href="#tab3" role="tab" aria-controls="tab3" aria-selected="true">BÌNH LUẬN</a>
                            </li>
                        </ul>

                        <div class="tab-content" id="myTabContent">
                            <!-- Tab Text -->
                            <div class="tab-pane fade show active" id="tab1" role="tabpanel" aria-labelledby="tab--1">
                                <div class="clever-description">

                                    <!-- About Course -->
                                    <div class="about-course mb-30">
                                        <h4>Nội dung bài học</h4>
                                        <p>nhúng video vào đây</p>
                                    </div>

                                </div>
                            </div>

                            <!-- Tab Text -->
                            <div class="tab-pane fade" id="tab2" role="tabpanel" aria-labelledby="tab--2">
                                <div class="clever-curriculum">

                                    <!-- About Curriculum -->
                                    <div class="about-curriculum mb-30">
                                        <h4>Luyện Tập</h4>
                                        <p>Các em hãy làm bài luyện tập dưới đây để nắm vững kiến thức</p>
                                    </div>
                                    <div class="about-curriculum mb-30">
                                        <h4>TRÒ CHƠI 1 TRẮC NGHIỆM</h4>
                                        <p>Nhúng trò chơi 1 vào đây</p>
                                    </div>
                                    <div class="about-curriculum mb-30">
                                        <h4>TRÒ CHƠI 2 </h4>
                                        <p>Nhúng trò chơi 2 vào đây</p>
                                    </div>
                                </div>
                            </div>

                            <!-- Tab Text -->
                            <div class="tab-pane fade" id="tab3" role="tabpanel" aria-labelledby="tab--3">
                                <div class="clever-review">

                                    <!-- About Review -->
                                    <div class="about-review mb-30">
                                        <h4>Bình luận</h4>
                                       <p>Phụ huynh và các em hãy để lại bình luận của mình về bài học để chúng tôi làm tốt hơn</p>
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
                                                    <div class="progress-bar" role="progressbar" style="width: 80%" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>80%</span>
                                            </div>
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>4 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>20%</span>
                                            </div>
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>3 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 0%" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>0%</span>
                                            </div>
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>2 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 0%" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
                                                </div>
                                                <span>0%</span>
                                            </div>
                                            <!-- Rating -->
                                            <div class="single-rating mb-15 d-flex align-items-center">
                                                <span>1 STARS</span>
                                                <div class="progress">
                                                    <div class="progress-bar" role="progressbar" style="width: 0%" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
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
                                                    <h6>Sarah Parker</h6>
                                                    <span>Sep 29, 2017 at 9:48 am</span>
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
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce enim nulla, mollis eu metus in, sagittis.</p>
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
                                                    <h6>Sarah Parker</h6>
                                                    <span>Sep 29, 2017 at 9:48 am</span>
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
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce enim nulla, mollis eu metus in, sagittis.</p>
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
                                <h6><i class="fa fa-clock-o" aria-hidden="true"></i> Duration</h6>
                                <h6>2 Weeks</h6>
                            </li>
                            <li>
                                <h6><i class="fa fa-bell" aria-hidden="true"></i> Lectures</h6>
                                <h6>10</h6>
                            </li>
                            <li>
                                <h6><i class="fa fa-file" aria-hidden="true"></i> Quizzes</h6>
                                <h6>3</h6>
                            </li>
                            <li>
                                <h6><i class="fa fa-thumbs-up" aria-hidden="true"></i> Pass Percentage</h6>
                                <h6>60</h6>
                            </li>
                            <li>
                                <h6><i class="fa fa-thumbs-down" aria-hidden="true"></i> Max Retakes</h6>
                                <h6>5</h6>
                            </li>
                        </ul>
                    </div>

                    <!-- Widget -->
                    <div class="sidebar-widget">
                        <h4>Bài Học Cùng Chủ Đề</h4>

                        <!-- Single Courses -->
                        <div class="single--courses d-flex align-items-center">
                            <div class="thumb">
                                <img src="img/bg-img/yml.jpg" alt="">
                            </div>
                            <div class="content">
                                <h5>Vocabulary</h5>
                                <h6>$20</h6>
                            </div>
                        </div>

                        <!-- Single Courses -->
                        <div class="single--courses d-flex align-items-center">
                            <div class="thumb">
                                <img src="img/bg-img/yml2.jpg" alt="">
                            </div>
                            <div class="content">
                                <h5>Expository writing</h5>
                                <h6>$45</h6>
                            </div>
                        </div>

                        <!-- Single Courses -->
                        <div class="single--courses d-flex align-items-center">
                            <div class="thumb">
                                <img src="img/bg-img/yml3.jpg" alt="">
                            </div>
                            <div class="content">
                                <h5>Vocabulary</h5>
                                <h6>$20</h6>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
