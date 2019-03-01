package com.computershop.mapper;

import com.computershop.model.Categorytype;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategorytypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Categorytype record);

    int insertSelective(Categorytype record);

    Categorytype selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Categorytype record);

    int updateByPrimaryKey(Categorytype record);
}