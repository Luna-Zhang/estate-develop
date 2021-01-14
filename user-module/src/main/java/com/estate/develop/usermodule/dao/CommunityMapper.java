package com.estate.develop.usermodule.dao;

import com.estate.develop.usermodule.entity.Community;

public interface CommunityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);
}