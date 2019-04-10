<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Trang chủ</title>
</head>

<body>


<!-- ##### Hero Area Start ##### -->
<section class="hero-area bg-img bg-overlay-2by5" style="background-image: url(/template/web/img/bg-img/bg1.jpg);">
    <div class="container h-100">
        <div class="row h-100 align-items-center">
            <div class="col-12">
                <!-- Hero Content -->
                <div class="hero-content text-center">
                    <h2>Let's Study Together</h2>
                    <a href="#" class="btn clever-btn">Khám Phá</a>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- ##### Hero Area End ##### -->


<!-- ##### Popular Courses Start ##### -->
<section class="popular-courses-area section-padding-100-0"
         style="background-image: url(/template/web/img/core-img/texture.png);">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="section-heading">
                    <h3>Bài Học Nổi Bật</h3>
                </div>
            </div>
        </div>


        <div class="accordion" id="accordionExample">
            <c:forEach var="item" items="${categoryModels}">
                <div class="card">
                    <div class="card-header" id="headingTwo_${item.code}" style="background-color:#E4596E">
                        <h5 class="mb-0">
                            <button class="btn btn-link collapsed" type="button" data-toggle="collapse"
                                    style=" color: white; text-align: center;width: 100%"
                                    data-target="#collapseTwo_${item.code}" aria-expanded="false"
                                    aria-controls="collapseTwo">
                                <b>${item.name}</b>
                            </button>
                        </h5>
                    </div>

                    <div id="collapseTwo_${item.code}" <c:if test="${item.id==1}">class="collapse show"</c:if>
                         <c:if test="${item.id!=1}">class="collapse"</c:if>

                         aria-labelledby="headingTwo__${item.code}"
                         data-parent="#accordionExample">
                        <div class="card-body">
                            <div class="row">
                                <c:forEach var="les" items="${lessionModels}">

                                    <c:if test="${les.categoryId==item.id}">

                                        <!-- Single Popular Course -->
                                        <div class="col-12 col-md-6 col-lg-4">
                                            <div class="single-popular-course mb-100 wow fadeInUp"
                                                 data-wow-delay="250ms">
                                                <img src="/template/web/img/bg-img/c1.jpg" alt="">
                                                <!-- Course Content -->
                                                <div class="course-content">
                                                    <h4>${les.title}</h4>
                                                    <div class="meta d-flex align-items-center">
                                                        <a href="#">${les.createdBy}</a>
                                                        <span><i class="fa fa-circle" aria-hidden="true"></i></span>
                                                        <a href="#">${item.name}</a>
                                                    </div>
                                                    <p>
                                                        ${les.shortDescription}
                                                    </p>
                                                </div>
                                                <!-- Seat Rating Fee -->
                                                <div class="seat-rating-fee d-flex justify-content-between">
                                                    <div class="seat-rating h-100 d-flex align-items-center">
                                                        <div class="seat">
                                                            <i class="fa fa-user" aria-hidden="true"></i> 10
                                                        </div>
                                                        <div class="rating">
                                                            <i class="fa fa-star" aria-hidden="true"></i> 4.5
                                                        </div>
                                                    </div>
                                                    <div class="course-fee h-100">
                                                        <a href="<c:url value='/lession-detail?action=detail&idLession=${les.id}'/> "
                                                           class="free">Xem Bài</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </c:if>

                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>

        </div>

    </div>
</section>
</body>