package com.tienganhchoem.controller.web;

import com.tienganhchoem.model.*;
import com.tienganhchoem.service.impl.CategoryService;
import com.tienganhchoem.service.impl.CommentService;
import com.tienganhchoem.service.impl.LessionService;
import com.tienganhchoem.service.impl.ThanhTichService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/list-lession", "/lession-detail"})
public class LessionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String idLession = request.getParameter("idLession");
        LessionService lessionService = new LessionService();
        CategoryService categoryService = new CategoryService();
        if (action != null && action.equals("listAll")) {

            //lấy ra những thứ cần hiển thị trong trang lession(hiển thị tất cả danh mục bài học trong hệ thống)
            List<CategoryModel> categoryModels = categoryService.findAll();
            request.setAttribute("categoryModels", categoryModels);
            List<LessionModel> lessionModels = lessionService.findAll();
            request.setAttribute("lessionModels", lessionModels);
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/lession.jsp");
            rd.forward(request, response);
        } else if (action != null && action.equals("detail")) {

            boolean tangview = lessionService.tangView(Long.parseLong(idLession));
            if (tangview == true) {
                LessionModel lessionModel = lessionService.findOne(Long.parseLong(idLession));
                List<LessionModel> lessionModels=lessionService.findByCategoryId(lessionModel.getCategoryId());
                CommentService commentService=new CommentService();
                List<CommentModel> commentModels= commentService.getAllByLessionId(Long.parseLong(idLession));
                ThanhTichService thanhTichService=new ThanhTichService();
                HttpSession ss=request.getSession();
                UserModel userModel=(UserModel) ss.getAttribute("USERMODEL");
                List<ThanhTichModel> thanhTichModels=thanhTichService.findByUserId(userModel.getId());
                request.setAttribute("lessionModels",lessionModels);
                request.setAttribute("lessionModel", lessionModel);
                request.setAttribute("commentModels",commentModels);
                request.setAttribute("thanhTichModels",thanhTichModels);
                RequestDispatcher rd = request.getRequestDispatcher("/views/web/lession-detail.jsp");
                rd.forward(request, response);
            } else {
                response.sendRedirect("/trang-chu");
            }
        } else {
            response.sendRedirect("/trang-chu");
        }
    }
}
