package com.estate.develop.usermodule.dao;

import com.estate.develop.usermodule.entity.Community;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);
}