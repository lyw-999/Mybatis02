package com.xh.dao;

import com.xh.bean.Idcard;
import com.xh.bean.IdcardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IdcardDAO {
    long countByExample(IdcardExample example);

    int deleteByExample(IdcardExample example);

    int deleteByPrimaryKey(Integer cardid);

    int insert(Idcard record);

    int insertSelective(Idcard record);

    List<Idcard> selectByExample(IdcardExample example);

    Idcard selectByPrimaryKey(Integer cardid);

    int updateByExampleSelective(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByExample(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByPrimaryKeySelective(Idcard record);

    int updateByPrimaryKey(Idcard record);
}