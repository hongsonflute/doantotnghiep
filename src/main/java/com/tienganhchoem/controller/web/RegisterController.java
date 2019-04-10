package com.tienganhchoem.controller.web;

import com.tienganhchoem.dao.impl.UserDAO;
import com.tienganhchoem.model.UserModel;
import com.tienganhchoem.security.AuthenticationFilter;
import com.tienganhchoem.service.impl.UserService;
import com.tienganhchoem.utils.FormUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/dang-ky", "/admin-addUser"})
public class RegisterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //MỤC ĐÍCH ĐỂ XỬ LÝ KHI NGƯỜI DÙNG ĐĂNG KÝ TÀI KHOẢN
        String action = request.getParameter("action");
        UserDAO userDAO = new UserDAO();
        UserService userService = new UserService();
        UserModel model = FormUtil.toModel(UserModel.class, request);
        if (userDAO.validate(model) == true) {
            //if ở trên nhằm kiểm tra xem username đã có trong DB chưa?
            //if==true nghĩa là chưa có. thì bắt đầu đăng ký:
            if (action != null && action.equals("register")) {
                model.setRoleId((long) 3);
                model.setCreatedBy(model.getUserName());
                Long id = userService.save(model); //đăng ký sau đó trả lại id
                if (id != null) {
                    UserModel userModel = new UserModel();//khai báo model mới
                    userModel = userService.findOne(id); //truyền model mới bằng model đc find bằng id từ DB.

                    //đã có model mới đăng ký lấy ra từ DB. thực hiện xử lý quyền của nó rồi trả về trang tương ứng:
                    String url = AuthenticationFilter.of(userModel.getUserName(), userModel.getPassword()).urlRedirect(request);
                    response.sendRedirect(request.getContextPath() + url);
                } else {
                    request.setAttribute("msg", "Đăng ký thất bại!");
                    RequestDispatcher rd = request.getRequestDispatcher("/views/web/register.jsp");
                    rd.forward(request, response);
                }
            }

            if (action != null && action.equals("addUser")) {
                Long id = userService.save(model); //đăng ký sau đó trả lại id
                if (id != null) {
                    request.setAttribute("msg", "Thêm thành công!");
                    RequestDispatcher rd = request.getRequestDispatcher("/views/admin/account/account-edit.jsp");
                    rd.forward(request, response);
                } else {
                    request.setAttribute("msg", "Thêm thất bại!");
                    RequestDispatcher rd = request.getRequestDispatcher("/view/admin/account/account-edit.jsp");
                    rd.forward(request, response);
                }
            }
        } else {
            request.setCharacterEncoding("utf-8");
            request.setAttribute("msg", "Lỗi đăng ký.Tài khoản đã tồn tại!");
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/register.jsp");
            rd.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("register")) {
            //trả về trang đăng ký
            String activeBtnRegister = "btn active";
            request.setAttribute("activeBtnRegister", activeBtnRegister);
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/register.jsp");
            rd.forward(request, response);
        } else {
            response.sendRedirect("/dang-ky?action=register");
        }
    }
}
