package com.bwp.dao;

import com.bwp.pojo.Cat;
import com.bwp.pojo.CatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatMapper {
    long countByExample(CatExample example);

    int deleteByExample(CatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cat record);

    int insertSelective(Cat record);

    List<Cat> selectByExample(CatExample example);

    Cat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cat record, @Param("example") CatExample example);

    int updateByExample(@Param("record") Cat record, @Param("example") CatExample example);

    int updateByPrimaryKeySelective(Cat record);

    int updateByPrimaryKey(Cat record);
}