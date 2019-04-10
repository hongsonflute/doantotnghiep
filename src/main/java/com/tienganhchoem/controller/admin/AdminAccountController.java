package com.tienganhchoem.controller.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienganhchoem.model.UserModel;
import com.tienganhchoem.service.impl.UserService;
import com.tienganhchoem.utils.FormUtil;
import com.tienganhchoem.utils.HttpUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/admin-list-account", "/admin-edit-account"})
public class AdminAccountController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //admin thêm tài khoản
        //1 check xem tài khoản đã tồn tại chưa, nếu chưa có thì mới thêm, nếu có báo lỗi đã tồn tại
        UserService userService = new UserService();
        UserModel model = FormUtil.toModel(UserModel.class, request);
        String action = request.getParameter("action");
        if (action != null && action.equals("themtaikhoan")) {
            if (userService.validateAddUser(model) == true) {
                //nếu chưa tồn tại
                Long id = userService.save(model); //thêm sau đó trả lại id
                if (id != null) {
                    request.setAttribute("msg", "Thêm thành công!");
                    RequestDispatcher rd = request.getRequestDispatcher("/views/admin/account/account-edit.jsp");
                    rd.forward(request, response);
                } else if (id == null) {
                    request.setAttribute("msg", "Thêm thất bại!");
                    RequestDispatcher rd = request.getRequestDispatcher("/views/admin/account/account-edit.jsp");
                    rd.forward(request, response);
                }
            } else {
                //nếu tồn tại rồi
                request.setAttribute("msg", "Tài khoản đã tồn tại!");
                RequestDispatcher rd = request.getRequestDispatcher("/views/admin/account/account-edit.jsp");
                rd.forward(request, response);
            }
        } else if (action != null && action.equals("suataikhoan")) {
            if (userService.adminEditAccount(model) == true) {
                request.setAttribute("msg", "sửa thành công!");
                RequestDispatcher rd = request.getRequestDispatcher("/views/admin/account/account-edit.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("msg", "sửa thất bại!");
                RequestDispatcher rd = request.getRequestDispatcher("/views/admin/account/account-edit.jsp");
                rd.forward(request, response);
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String action = request.getParameter("action");
        String userId = request.getParameter("userId");
        String active2 = "active";
        request.setAttribute("active2", active2);
        if (action != null && action.equals("list")) {
            String msg = request.getParameter("msg");
            List<UserModel> userModels = new ArrayList<>();
            UserService userService = new UserService();
            userModels = userService.findAll();
            request.setAttribute("userModels", userModels);
            String thongbao = "";
            if (msg != null && msg.equals("xoathanhcong")) {
                thongbao = "Xóa Thành công";
            } else if (msg != null && msg.equals("xoathatbai")) {
                thongbao = "Xóa thất bại";
            }
            request.setAttribute("msg", thongbao);
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/account/account-list.jsp");
            rd.forward(request, response);
        } else if (action != null && action.equals("edit")) {
            if (userId != null) {
                UserService userService = new UserService();
                UserModel userModel = new UserModel();
                userModel = userService.findOne((Long.parseLong(userId)));
                request.setAttribute("userModel", userModel);
            }
            response.setContentType("text/html");
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/account/account-edit.jsp");
            rd.forward(request, response);
        } else {
            response.sendRedirect("/admin-edit-account?action=list");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        UserModel userModel = HttpUtil.of(req.getReader()).toModel(UserModel.class);
        UserService userService = new UserService();
        userService.delete(userModel.getIds());
        mapper.writeValue(resp.getOutputStream(), "{}");
    }

}
