package com.tienganhchoem.controller.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tienganhchoem.model.UploadFileModel;
import com.tienganhchoem.model.UserModel;
import com.tienganhchoem.utils.HttpUtil;
import com.tienganhchoem.utils.UploadFileUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;

@WebServlet(urlPatterns = {"/upload-file"})
public class UploadFileAPI extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        UploadFileModel uploadFileModel =  HttpUtil.of(req.getReader()).toModel(UploadFileModel.class);
        byte[] decodeBase64 = Base64.getDecoder().decode(uploadFileModel.getBase64().getBytes());
        UploadFileUtil uploadFileUtil= new UploadFileUtil();
        uploadFileUtil.writeOrUpdate(decodeBase64, "/thumbnail-lession/"+uploadFileModel.getName());

        mapper.writeValue(resp.getOutputStream(), uploadFileModel);
    }
}
