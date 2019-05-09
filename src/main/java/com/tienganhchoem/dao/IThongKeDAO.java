package com.tienganhchoem.dao;

import com.tienganhchoem.model.ThongKeModel;

public interface IThongKeDAO extends GenericDAO<ThongKeModel>{
    Long countCategory();
    Long countLession();
    Long countAccount();
}
