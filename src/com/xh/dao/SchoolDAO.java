package com.xh.dao;

import com.xh.bean.School;
import com.xh.bean.SchoolExample;
import com.xh.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SchoolDAO {
    long countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(Integer scid);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(Integer scid);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    // 1对多 方法写在  1方
    List<School> selectClazzBySchoolId(Integer id);
    // 一对多对多  学校--班级--学生    省--小--县区. .，适用于下拉框
    List<School> selsectStudentBySchoolId(Integer id);


    // 三表联查 适用于 数据表格 参数就是map！！ 双 map 返回值和参数类型都是 map  俗称万能查.
    List<Map> selsectStudentByParam(Map map);


    // 1对多 方法写在  1方 查询身份证号
    List<Student> selectIdcardByStudentId(Integer id);
    // 多对多的查询  查询id 孙尚香都有哪些角色
    List<School> selectJobByName(String name);
}