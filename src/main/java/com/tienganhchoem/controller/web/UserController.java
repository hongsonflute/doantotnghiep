package com.tienganhchoem.controller.web;

import com.tienganhchoem.model.UserModel;
import com.tienganhchoem.service.impl.UserService;
import com.tienganhchoem.utils.FormUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/user"})
public class UserController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //MỤC ĐÍCH LÀ ĐỂ CẬP NHẬT THÔNG TIN CỦA USER ĐÓ:
            UserModel userModel= FormUtil.toModel(UserModel.class,request); //lấy các prameter gửi từ form truyền vào model
            UserService userService =new UserService();
            HttpSession ss=request.getSession();
            UserModel userModelss=(UserModel)ss.getAttribute("USERMODEL");
            Long idss = userModelss.getId();//lấy ra id của thằng đang đăng nhập
            if(userService.update(userModel)==true){
                //nếu nó sửa thông tin thành công thì trả lại trang với id của nó:
                response.sendRedirect("/user?userId="+idss);
            }
            else {
                PrintWriter out=response.getWriter();
                out.println("update thất bại");
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //MỤC ĐÍCH LÀ ĐỂ HIỂN THỊ THÔNG TIN USER THEO ID TRUYỀN VÀO
        UserModel model = new UserModel();
        String userIdStr = request.getParameter("userId");
        if (userIdStr == "") {
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            PrintWriter pr = response.getWriter();
            pr.println(" <h1> Không có thông tin! </h1>");
        } else {
            Long userId = Long.parseLong(userIdStr); //ép kiểu id thành Long
            HttpSession ss = request.getSession();
            UserModel userModelss = new UserModel();
            userModelss = (UserModel) ss.getAttribute("USERMODEL");
            Long idss = (Long)userModelss.getId(); //lấy id của thằng đăng nhập(chứa trong secssion)
            Long roless=userModelss.getRoleId();
            if ( idss == userId || roless ==1 || roless ==2) {
                UserService userService = new UserService();
                model = userService.findOne(userId);
                request.setAttribute("userModel", model);
                RequestDispatcher rd = request.getRequestDispatcher("/views/web/user.jsp");
                rd.forward(request, response);
            } else{
                //nếu roleid người đăng nhâp không phải admin(1) hoặc teacher(2)
                response.setCharacterEncoding("utf-8");
                response.setContentType("text/html");
                PrintWriter pr = response.getWriter();
                pr.println(" <h1> Không có thông tin! </h1>");
                //mục đích để không cho xem thông tin của user khác, nếu biết id user đó.
                //chỉ thằng login và có role khác 3 mới vào mới xem đc thông tin của nó
            }
        }
    }

}
