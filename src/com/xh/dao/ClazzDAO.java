package com.xh.dao;

import com.xh.bean.Clazz;
import com.xh.bean.ClazzExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClazzDAO {
    long countByExample(ClazzExample example);

    int deleteByExample(ClazzExample example);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByExample(ClazzExample example);

    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);
}