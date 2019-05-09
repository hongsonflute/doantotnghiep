package com.tienganhchoem.controller.admin;

import com.tienganhchoem.model.LessionModel;
import com.tienganhchoem.model.QuestionModel;
import com.tienganhchoem.service.impl.LessionService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/admin-list-question","/admin-edit-question"})
public class AdminQuestionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        QuestionModel questionModel =new QuestionModel();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action!=null&& action.equals("list")){
            String active4="active";
            request.setAttribute("active4",active4);
            RequestDispatcher rd=request.getRequestDispatcher("/views/admin/question/question-list.jsp");
            rd.forward(request,response);
        }else if(action!=null && action.equals("edit")){
            LessionService lessionService=new LessionService();
            List<LessionModel> lessionModels=lessionService.findAll();
            request.setAttribute("listLession",lessionModels);
           /* String active6="active";
            request.setAttribute("active6",active6);*/
            RequestDispatcher rd=request.getRequestDispatcher("/views/admin/question/question-edit.jsp");
            rd.forward(request,response);
        }else {

        }
    }
}
