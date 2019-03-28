package com.tienganhchoem.controller.admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/admin-list-account","/admin-edit-account"})
public class AdminAccountController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        String active2="active";
        request.setAttribute("active2",active2);
        if(action!=null&& action.equals("list")){
            RequestDispatcher rd=request.getRequestDispatcher("/views/admin/account/account-list.jsp");
            rd.forward(request,response);
        }else if(action!=null && action.equals("edit")){
            RequestDispatcher rd=request.getRequestDispatcher("/views/admin/account/account-edit.jsp");
            rd.forward(request,response);
        }else {

        }

    }
}
