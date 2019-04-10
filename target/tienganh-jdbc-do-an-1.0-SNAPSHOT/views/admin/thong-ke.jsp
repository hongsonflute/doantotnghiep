<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Thống kê hệ thống</title>
</head>
<body>
<div class="row">
    <div class="col-lg-3 col-sm-6">
        <div class="card">
            <div class="content">
                <div class="row">
                    <div class="col-xs-5">
                        <div class="icon-big icon-warning text-center">
                            <i class="ti-wallet"></i>
                        </div>
                    </div>
                    <div class="col-xs-7">
                        <div class="numbers">
                            <p>TỔNG CHỦ ĐỀ</p>
                            5
                        </div>
                    </div>
                </div>
                <div class="footer">
                    <hr/>
                    <div class="stats">
                        <i class="ti-reload"></i> Updated now
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="col-lg-3 col-sm-6">
        <div class="card">
            <div class="content">
                <div class="row">
                    <div class="col-xs-5">
                        <div class="icon-big icon-warning text-center">
                            <i class="ti-wallet"></i>
                        </div>
                    </div>
                    <div class="col-xs-7">
                        <div class="numbers">
                            <p>TỔNG BÀI HỌC</p>
                            25
                        </div>
                    </div>
                </div>
                <div class="footer">
                    <hr/>
                    <div class="stats">
                        <i class="ti-reload"></i> Updated now
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="col-lg-3 col-sm-6">
        <div class="card">
            <div class="content">
                <div class="row">
                    <div class="col-xs-5">
                        <div class="icon-big icon-warning text-center">
                            <i class="ti-wallet"></i>
                        </div>
                    </div>
                    <div class="col-xs-7">
                        <div class="numbers">
                            <p>TỔNG CÂU HỎI</p>
                            45
                        </div>
                    </div>
                </div>
                <div class="footer">
                    <hr/>
                    <div class="stats">
                        <i class="ti-reload"></i> Updated now
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="col-lg-3 col-sm-6">
        <div class="card">
            <div class="content">
                <div class="row">
                    <div class="col-xs-5">
                        <div class="icon-big icon-warning text-center">
                            <i class="ti-wallet"></i>
                        </div>
                    </div>
                    <div class="col-xs-7">
                        <div class="numbers">
                            <p>TỔNG ĐÁP ÁN</p>
                            105
                        </div>
                    </div>
                </div>
                <div class="footer">
                    <hr/>
                    <div class="stats">
                        <i class="ti-reload"></i> Updated now
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="row">
    <div class="col-md-6">
        <div class="card">
            <div class="header">
                <h4 class="title">TÀI KHOẢN TRONG HỆ THỐNG</h4>
                <p class="category">Biểu đồ tài khoản trong hệ thống</p>
            </div>
            <div class="content">
                <div id="chartPreferences" class="ct-chart ct-perfect-fourth"></div>

                <div class="footer">
                    <div class="chart-legend">
                        <i class="fa fa-circle text-info"></i> Học sinh
                        <i class="fa fa-circle text-danger"></i> Admin
                        <i class="fa fa-circle text-warning"></i> Giáo viên
                    </div>
                    <hr>
                    <div class="stats">
                        <i class="ti-timer"></i> Update Everyday
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
