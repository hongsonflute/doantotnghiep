package com.tienganhchoem.controller.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienganhchoem.model.LessionModel;
import com.tienganhchoem.service.impl.LessionService;
import com.tienganhchoem.utils.FormUtil;
import com.tienganhchoem.utils.HttpUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

@WebServlet(urlPatterns = {"/admin-list-lession", "/admin-edit-lession"})
public class AdminLessionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        LessionModel lessionModel = FormUtil.toModel(LessionModel.class, request);
        LessionService lessionService = new LessionService();
        if (action != null && action.equals("update")) {
            boolean kq = lessionService.update(lessionModel);
            if (kq == true) {
                request.setAttribute("msg", "cập nhật thành công!");
                RequestDispatcher rd = request.getRequestDispatcher("/views/admin/lession/lession-edit.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("msg", "cập nhật thất bại!");
                RequestDispatcher rd = request.getRequestDispatcher("/views/admin/lession/lession-edit.jsp");
                rd.forward(request, response);
            }
        } else if (action != null && action.equals("addnew")) {

            lessionModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
            if (lessionService.save(lessionModel) != null) {
                request.setAttribute("msg", "Thêm thành công!");
                RequestDispatcher rd = request.getRequestDispatcher("/views/admin/lession/lession-edit.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("msg", "Thêm thất bại!");
                RequestDispatcher rd = request.getRequestDispatcher("/views/admin/lession/lession-edit.jsp");
                rd.forward(request, response);
            }
        } else {
                response.sendRedirect("/admin-home");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String msg = request.getParameter("msg");
        String idLession = request.getParameter("idLession");
        if (action != null && action.equals("list")) {
            LessionService lessionService = new LessionService();
            List<LessionModel> lessionModels = lessionService.findAll();
            request.setAttribute("lessionModels", lessionModels);
            String active3 = "active";
            request.setAttribute("active3", active3);
            String thongbao = "";
            if (msg != null && msg.equals("xoathanhcong")) {
                thongbao = "Xóa Thành công";
            } else if (msg != null && msg.equals("xoathatbai")) {
                thongbao = "Xóa thất bại";
            }
            request.setAttribute("msg", thongbao);

            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/lession/lession-list.jsp");
            rd.forward(request, response);
        } else if (action != null && action.equals("edit")) {
            if (idLession != null) {
                LessionService lessionService = new LessionService();
                LessionModel lessionModel = new LessionModel();
                lessionModel = lessionService.findOne((Long.parseLong(idLession)));
                request.setAttribute("lessionModel", lessionModel);
            }
            String active5 = "active";
            request.setAttribute("active5", active5);
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/lession/lession-edit.jsp");
            rd.forward(request, response);
        } else {

        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        LessionModel lessionModel = HttpUtil.of(req.getReader()).toModel(LessionModel.class);
        LessionService lessionService = new LessionService();
        boolean kqXoa=lessionService.delete(lessionModel.getIds());
        if(kqXoa==true) {
            mapper.writeValue(resp.getOutputStream(), "xoathanhcong");
        }
        else {
            mapper.writeValue(resp.getOutputStream(),"xoathatbai");
        }

    }
}
