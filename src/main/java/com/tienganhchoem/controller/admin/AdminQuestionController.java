package com.tienganhchoem.controller.admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/admin-list-question","/admin-edit-question"})
public class AdminQuestionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action!=null&& action.equals("list")){
            String active4="active";
            request.setAttribute("active4",active4);
            RequestDispatcher rd=request.getRequestDispatcher("/views/admin/question/question-list.jsp");
            rd.forward(request,response);
        }else if(action!=null && action.equals("edit")){
            String active6="active";
            request.setAttribute("active6",active6);
            RequestDispatcher rd=request.getRequestDispatcher("/views/admin/question/question-edit.jsp");
            rd.forward(request,response);
        }else {

        }
    }
}
