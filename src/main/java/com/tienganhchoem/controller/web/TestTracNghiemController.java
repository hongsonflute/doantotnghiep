package com.tienganhchoem.controller.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienganhchoem.model.ThanhTichModel;
import com.tienganhchoem.model.TracNghiemModel;
import com.tienganhchoem.service.impl.ThanhTichService;
import com.tienganhchoem.service.impl.TracNghiemService;
import com.tienganhchoem.utils.FormUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/test-trac-nghiem"})
public class TestTracNghiemController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idBaiTracNghiem=req.getParameter("idBaiTracNghiem");
        List<TracNghiemModel> tracNghiemModels=new ArrayList<>();
        TracNghiemService tracNghiemService=new TracNghiemService();
        tracNghiemModels=tracNghiemService.findByIdBaiTracNghiem(Long.parseLong(idBaiTracNghiem));
        req.setAttribute("tracNghiemModels",tracNghiemModels);
        RequestDispatcher rd = req.getRequestDispatcher("/views/web/lamtracnghiem.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ThanhTichModel thanhTichModel=FormUtil.toModel(ThanhTichModel.class,req);
        ThanhTichService thanhTichService=new ThanhTichService();
        Long idcheck=thanhTichService.checkTonTai(thanhTichModel.getUserId(),thanhTichModel.getIdBaiTracNghiem());
        if(idcheck!=null){
           boolean kqUpdate= thanhTichService.update(idcheck,thanhTichModel);
            if(kqUpdate==true){
                ObjectMapper objectMapper=new ObjectMapper();
                objectMapper.writeValue(resp.getOutputStream(),"thanhcong");
            }else {
                ObjectMapper objectMapper=new ObjectMapper();
                objectMapper.writeValue(resp.getOutputStream(),"that bai luu");
            }
        }
        else {
            Long kq=thanhTichService.save(thanhTichModel);
            if(kq!=null){
                ObjectMapper objectMapper=new ObjectMapper();
                objectMapper.writeValue(resp.getOutputStream(),"thanhcong");
            }else {
                ObjectMapper objectMapper=new ObjectMapper();
                objectMapper.writeValue(resp.getOutputStream(),"that bai luu");
            }
        }
    }
}
