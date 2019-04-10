<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<div class="sidebar" data-background-color="white" data-active-color="danger">

    <!--
		Tip 1: you can change the color of the sidebar's background using: data-background-color="white | black"
		Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
	-->

    <div class="sidebar-wrapper">
        <div class="logo">
            <a href="<c:url value="/trang-chu"/> " class="simple-text">
                Trang Chủ
            </a>
        </div>

        <ul class="nav">
            <li class="${active1}">
                <a href="<c:url value='/admin-home?action=statistical'/> ">
                    <i class="ti-panel"></i>
                    <p>Thống Kê Hệ Thống</p>
                </a>
            </li>
            <li class="${active2}">
                <a href="<c:url value="/admin-list-account?action=list"/> ">
                    <i class="ti-user"></i>
                    <p>Quản Lý Tài Khoản</p>
                </a>
            </li>
            <li class="${active3}">
                <a href='<c:url value="/admin-list-lession?action=list"/> '>
                    <i class="ti-view-list-alt"></i>
                    <p>Quản Lý Bài Học</p>
                </a>
            </li>
            <li class="${active4}">
                <a href='<c:url value="/admin-list-question?action=list"/> '>
                    <i class="ti-view-list-alt"></i>
                    <p>Quản Lý Câu Hỏi</p>
                </a>
            </li>
            <li class="${active5}">
                <a href='<c:url value="/admin-edit-lession?action=edit"/> '>
                    <i class="ti-pencil-alt2"></i>
                    <p>Thêm Bài Học</p>
                </a>
            </li>
            <li class="${active6}">
                <a href='<c:url value="/admin-list-question?action=edit"/>'>
                    <i class="ti-pencil-alt2"></i>
                    <p>Thêm Câu Hỏi</p>
                </a>
            </li>
            <li class="${active7}">
                <a href='<c:url value="/admin-home?action=nottification"/> '>
                    <i class="ti-bell"></i>
                    <p>Thông Báo</p>
                </a>
            </li>
            <li class="active-pro">
                <a href='<c:url value="/admin-home?action=about"/> '>
                    <i class="ti-export"></i>
                    <p>Giới Thiệu Hệ Thống</p>
                </a>
            </li>
        </ul>
    </div>
</div>