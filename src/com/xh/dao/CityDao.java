package com.xh.dao;

import com.xh.bean.City;
import com.xh.bean.CityExample;

import java.util.List;
import java.util.Map;

public interface CityDao {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    //动态代理
    List<Map> dongTai(Map map);

    // 1对多 方法写在  1方
    List<City> selectAreasByCityId(Integer id);
    // 一对多 根据 name查询
    List<City> selectAreasByCityName(String name);


}
