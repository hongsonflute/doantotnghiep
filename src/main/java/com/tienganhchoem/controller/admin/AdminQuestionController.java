package com.tienganhchoem.controller.admin;

import com.tienganhchoem.model.AnswerModel;
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
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/admin-list-question","/admin-edit-question"})
public class AdminQuestionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] contents=request.getParameterValues("title");
        String[] thumbnails=request.getParameterValues("thumbnail");
        String[] linkMp3s=request.getParameterValues("linkMp3");
        int[] mang={1,2,3};
        //1 câu hỏi
        //4 đáp án
        QuestionModel questionModel=new QuestionModel();
        questionModel.setContent(contents[0]);
        AnswerModel answerModelA=new AnswerModel();
        AnswerModel answerModelB=new AnswerModel();
        AnswerModel answerModelc=new AnswerModel();
        AnswerModel answerModelD=new AnswerModel();
        List<AnswerModel> answerModels=new ArrayList<>();
        answerModels.add(answerModelA);
        answerModels.add(answerModelB);
        answerModels.add(answerModelc);
        answerModels.add(answerModelD);
        for (AnswerModel list: answerModels) {
            for (String content: contents) {
                list.setContent(content);
            }
        }

        request.setAttribute("co",contents);

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
