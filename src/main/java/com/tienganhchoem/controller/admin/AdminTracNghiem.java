package com.tienganhchoem.controller.admin;

import com.tienganhchoem.model.LessionModel;
import com.tienganhchoem.model.TracNghiemModel;
import com.tienganhchoem.service.impl.LessionService;
import com.tienganhchoem.service.impl.TracNghiemService;
import com.tienganhchoem.utils.FormUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/admin-trac-nghiem"})
public class AdminTracNghiem extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LessionService lessionService=new LessionService();
        List<LessionModel> lessionModels=lessionService.findAll();
        req.setAttribute("lessionModels",lessionModels);
        RequestDispatcher rd=req.getRequestDispatcher("views/admin/question/tracnghiem.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        TracNghiemModel tracNghiemModel= FormUtil.toModel(TracNghiemModel.class,req);
        TracNghiemService tracNghiemService=new TracNghiemService();
        Long kq=tracNghiemService.save(tracNghiemModel);
        if (kq!=null){
            req.setAttribute("msg","thêm câu hỏi thành công");
            LessionService lessionService=new LessionService();
            List<LessionModel> lessionModels=lessionService.findAll();
            req.setAttribute("lessionModels",lessionModels);
            RequestDispatcher rd=req.getRequestDispatcher("views/admin/question/tracnghiem.jsp");
            rd.forward(req,resp);
        }
        else {
            req.setAttribute("msg","thêm câu hỏi thất bại");
            RequestDispatcher rd=req.getRequestDispatcher("views/admin/question/tracnghiem.jsp");
            rd.forward(req,resp);
        }
    }
}
