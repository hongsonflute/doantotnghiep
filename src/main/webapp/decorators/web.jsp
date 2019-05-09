<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title><dec:title default="Trang chủ"/></title>
    <!-- Title -->
    <title>| Home</title>
    <script src="/global/js/validate.js">
    </script>
    <!-- Favicon -->
    <link rel="icon" href="<c:url value='/template/web/img/core-img/favicon.ico'/>"/>

    <!-- Stylesheet -->
    <link rel="stylesheet" href="<c:url value='/template/web/style.css'/>"/>
    <link href="/template/admin/css/themify-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="<c:url value='/template/web/css/style-by-son.css'/>"/>

</head>
<body>
<!-- header -->
<%@ include file="/common/web/header.jsp" %>
<!-- header -->

<div class="container">
    <dec:body/>
</div>

<!-- footer -->
<%@ include file="/common/web/footer.jsp" %>
<!-- footer -->


<!-- ##### All Javascript Script ##### -->
<!-- jQuery-2.2.4 js -->
<script src="/template/web/js/jquery/jquery-2.2.4.min.js"></script>
<!-- Popper js -->
<script src="/template/web/js/bootstrap/popper.min.js"></script>
<!-- Bootstrap js -->
<script src="/template/web/js/bootstrap/bootstrap.min.js"></script>
<!-- All Plugins js -->
<script src="/template/web/js/plugins/plugins.js"></script>
<!-- Active js -->
<script src="/template/web/js/active.js"></script>
<script src="/global/js/xulygame.js"></script>
<script src="/global/js/xulytracnghiem.js"></script>
</body>
</html>