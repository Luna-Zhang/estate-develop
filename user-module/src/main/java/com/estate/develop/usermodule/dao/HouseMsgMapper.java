package com.estate.develop.usermodule.dao;

import com.estate.develop.usermodule.entity.HouseMsg;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HouseMsg record);

    int insertSelective(HouseMsg record);

    HouseMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HouseMsg record);

    int updateByPrimaryKey(HouseMsg record);
}