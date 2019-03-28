package com.tienganhchoem.controller.admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/admin-list-lession","/admin-edit-lession"})
public class AdminLessionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action!=null&& action.equals("list")){
            String active3="active";
            request.setAttribute("active3",active3);
            RequestDispatcher rd=request.getRequestDispatcher("/views/admin/lession/lession-list.jsp");
            rd.forward(request,response);
        }else if(action!=null && action.equals("edit")){
            String active5="active";
            request.setAttribute("active5",active5);
            RequestDispatcher rd=request.getRequestDispatcher("/views/admin/lession/lession-edit.jsp");
            rd.forward(request,response);
        }else {

        }

    }
}
