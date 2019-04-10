package com.tienganhchoem.controller.web;

import com.tienganhchoem.model.CategoryModel;
import com.tienganhchoem.model.LessionModel;
import com.tienganhchoem.model.UserModel;
import com.tienganhchoem.security.AuthenticationFilter;
import com.tienganhchoem.service.impl.CategoryService;
import com.tienganhchoem.service.impl.LessionService;
import com.tienganhchoem.utils.FormUtil;
import com.tienganhchoem.utils.SessionUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/trang-chu","/dang-nhap","/dang-xuat","/lien-he"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if (action != null && action.equals("login")) {
            //trả về trang đăng nhập
            String activeBtnLogin="btn active";
            req.setAttribute("activeBtnLogin",activeBtnLogin);
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/login.jsp");
            rd.forward(req, resp);
        }
        else if(action !=null && action.equals("loginFalse")){
            //trả về trang đăng nhập
            String activeBtnLogin="btn active";
            req.setAttribute("activeBtnLogin",activeBtnLogin);
            req.setAttribute("msg","Đăng nhập thất bại!");
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/login.jsp");
            rd.forward(req, resp);
        }
        else if (action != null && action.equals("logout")) {
            //xóa session và trả về trang chủ hoặc trang login
            SessionUtil.getInstance().removeValue(req, "USERMODEL");
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/login.jsp");
            rd.forward(req, resp);
        }
        else if (action != null && action.equals("about")) {
            //trả về trang thông tin liên hệ
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/about.jsp");
            rd.forward(req, resp);
        }
        else {
            //lấy ra những thứ cần hiển thị trong trang chủ
            CategoryService categoryService=new CategoryService();
            List<CategoryModel> categoryModels=categoryService.findAll();
            req.setAttribute("categoryModels",categoryModels);
            LessionService lessionService =new LessionService();
            List<LessionModel> lessionModels=lessionService.findTop3ByCategoryId();
            req.setAttribute("lessionModels",lessionModels);
            RequestDispatcher rd = req.getRequestDispatcher("/views/web/web-home.jsp");
            rd.forward(req, resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserModel model = FormUtil.toModel(UserModel.class, req);
        String url= AuthenticationFilter.of(model.getUserName(),model.getPassword()).urlRedirect(req);
        resp.sendRedirect(req.getContextPath()+url);
    }
}
