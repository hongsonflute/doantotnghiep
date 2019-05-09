package com.tienganhchoem.controller.web;

import com.tienganhchoem.model.CommentModel;
import com.tienganhchoem.service.impl.CommentService;
import com.tienganhchoem.utils.FormUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/binhluan"})
public class CommentController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String action=req.getParameter("action");
        String idCommentDelete=req.getParameter("idCommentDelete");
        CommentModel commentModel= FormUtil.toModel(CommentModel.class,req);
        CommentService commentService=new CommentService();
        if(action!=null&&action.equals("thembinhluan")){
            Long kqLuu=commentService.save(commentModel);
            if(kqLuu!=null){
                resp.sendRedirect("lession-detail?action=detail&idLession="+commentModel.getLessionId());
            }else {
                resp.sendRedirect("trang-chu");
            }

        }
        else if(action!=null&& action.equals("xoabinhluan")){
           boolean kqXoa= commentService.delete(Long.parseLong(idCommentDelete));
           if (kqXoa==true){
               resp.sendRedirect("lession-detail?action=detail&idLession="+commentModel.getLessionId());
           }else {
               resp.sendRedirect("trang-chu");
           }
        }
        else {
            resp.sendRedirect("trang-chu");
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
