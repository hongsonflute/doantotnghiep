package com.tienganhchoem.controller.web;

import com.tienganhchoem.model.QuestionAnswerModel;
import com.tienganhchoem.service.impl.QuestionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/question"})
public class QuestionController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        QuestionService questionService=new QuestionService();
        List<QuestionAnswerModel> questionAnswerModel;
       questionAnswerModel= questionService.findByLessionIdAndQuestionId(1l,1l);
       req.setAttribute("questionAnswerModel",questionAnswerModel);


    }
}
