package com.tienganhchoem.controller.web;

import com.tienganhchoem.model.LessionModel;
import com.tienganhchoem.service.impl.LessionService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/list-lession", "/lession-detail"})
public class LessionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String idLession = request.getParameter("idLession");
        if (action != null && action.equals("list")) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/lession.jsp");
            rd.forward(request, response);
        } else if (action != null && action.equals("detail")) {

            LessionService lessionService = new LessionService();
            boolean tangview = lessionService.tangView(Long.parseLong(idLession));
            if (tangview == true) {
                LessionModel lessionModel = lessionService.findOne(Long.parseLong(idLession));
                request.setAttribute("lessionModel", lessionModel);
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
