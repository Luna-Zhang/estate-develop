package com.estate.develop.usermodule.dao;

import com.estate.develop.usermodule.entity.Agency;

public interface AgencyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Agency record);

    int insertSelective(Agency record);

    Agency selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Agency record);

    int updateByPrimaryKey(Agency record);
}