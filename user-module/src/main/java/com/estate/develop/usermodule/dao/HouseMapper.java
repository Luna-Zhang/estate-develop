package com.estate.develop.usermodule.dao;

import com.estate.develop.usermodule.entity.House;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}