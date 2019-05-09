package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.IThongKeDAO;
import com.tienganhchoem.dao.impl.ThongKeDAO;
import com.tienganhchoem.service.IThongKeService;

public class ThongKeService implements IThongKeService {
    private IThongKeDAO thongKeDAO;

    public ThongKeService() {
        thongKeDAO = new ThongKeDAO();
    }
    @Override
    public Long countCategory() {

      return thongKeDAO.countCategory();
    }

    @Override
    public Long countLession() {
        return thongKeDAO.countLession();
    }

    @Override
    public Long countAccount() {

        return thongKeDAO.countAccount();
    }
}
