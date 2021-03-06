package com.springboot.racemanage.service;

import com.springboot.racemanage.po.Teamer;

import java.util.List;

public interface TeamerService {
    int insert(Teamer pojo);

    int insertSelective(Teamer pojo);

    int insertList(List<Teamer> pojo);

    int update(Teamer pojo);

    Integer countByStuUuid(String stuUuid);
}
