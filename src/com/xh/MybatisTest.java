package com.xh;

import com.xh.bean.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {


    private SqlSession sqlSession;
    @Before //  在@Test注解之前 执行的方法  提取重复的代码
    public void before() throws Exception {
        // 加载并读取 xml
        String path = "SqlMapConfig.xml";
        //  导包 import org.apache.ibatis.io.Resources;
        InputStream is = Resources.getResourceAsStream(path);
        // sql 链接的 工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        System.out.println("sqlSession = " + sqlSession); //sqlSession = org.apache.ibatis.session.defaults.DefaultSqlSession@71423665

    }
    // #1.查询customer表工资在5000-7000之间的客户信息，要求列标题显示姓名、性别、学历、工资。
    @Test
    public void test01(){
        //select  cname 姓名,sex 性别,education 学历,sal 工资 from customer where sal between 5000 and 7000
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andSalBetween(5000,7000);
        List<Customer> customers = sqlSession.selectList("com.xh.dao.CustomerDAO.selectByExample", example);
        for (Customer customer : customers) {
           System.out.println("customer = " + customer.getCname()+","+
                    customer.getSex()+","+
                    customer.getEducation()+","+
                    customer.getSal());
        }
        sqlSession.close();
    }

    //#2.查询customer表所有专科客户中工资最高的前三名客户信息。（5分）
    @Test
    public void test02(){
        //select * from customer where education = "专科" order by sal desc  limit 3
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andEducationEqualTo("专科"); // 查询前三条
        example.setOrderByClause("sal desc");
        example.setLimit(3);
        List<Customer> customers = sqlSession.selectList("com.xh.dao.CustomerDAO.selectByExample", example);
        for (Customer customer : customers) {
            System.out.println("customer = " + customer);
        }
        sqlSession.close();
    }

    //#3.查询customer表名字中包含‘明’的客户信息。
    @Test
    public void test03(){
        //select * from customer where cname like '%明%'
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andCnameLike("%明%");
        List<Customer> customers = sqlSession.selectList("com.xh.dao.CustomerDAO.selectByExample", example);
        for (Customer customer : customers) {
            System.out.println("customer = " + customer);
        }
        sqlSession.close();
    }
    //#4.查询customer表名字中最后一个字为 ‘刚’的客户信息
    @Test
    public void test04(){
        //select * from customer where cname like '%刚%'
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andCnameLike("%刚%");
        List<Customer> customers = sqlSession.selectList("com.xh.dao.CustomerDAO.selectByExample", example);
        for (Customer customer : customers) {
            System.out.println("customer = " + customer);
        }
        sqlSession.close();
    }

    //#5.查询customer表所有工资高于‘赵嘉欣’的客户信息。
    @Test
    public void test05(){
        //select * from customer where  sal > 5000
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andSalGreaterThan(5000);
        List<Customer> customers = sqlSession.selectList("com.xh.dao.CustomerDAO.selectByExample", example);
        for (Customer customer : customers) {
            System.out.println("customer = " + customer);
        }
        sqlSession.close();
    }

    //6.联合查询所有的业务员姓名、部门名、客户名字、客户性别、客户工资、客户贷款额信息。（5分）
    @Test
    public void test06(){
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();

        sqlSession.close();
    }

    //查询“汽车贷款部”的所有业务员姓名、性别、年龄，同时按照年龄由高到低排列。（要求查询条件为汽车贷款部）
    @Test
    public void test07(){
        // select e.ename,e.sex,e.age from dept d,emp e where d.deptno=e.deptno and d.dname = "汽车贷款部" oredr by age desc
        EmpExample example = new EmpExample();
        EmpExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("age desc");
        criteria.andDeptnoEqualTo(1);
        List<Emp> emps = sqlSession.selectList("com.xh.dao.EmpDAO.selectByExample", example);
        for (Emp emp : emps) {
            System.out.println("emp = " + emp.getEname()+","
                    +emp.getSex()+","
                    +emp.getAge());
        }
        sqlSession.close();
    }

    //11.修改客户‘赵峰刚’的电话为18728392567。
    @Test
    public void test11(){
        //update customer set tel='18728392567' where cname='赵峰刚'
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andTelEqualTo("18728392567");
        criteria.andCnameEqualTo("赵峰刚");
        sqlSession.update("com.xh.dao.CustomerDAO.updateByExampleSelective",example);
        sqlSession.close();
    }
    //12.修改所有工资大于5000且贷款额大于50万的客户备注信息为金标客户
    @Test
    public void test12(){
        // update  customer set remarks = '金标客户' where sal > 5000 and money > 500000
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andRemarksEqualTo("金标客户");
        criteria.andSalGreaterThan(5000);
        criteria.andMoneyGreaterThan(500000);
        sqlSession.update("com.xh.dao.CustomerDAO.updateByExample",example);
        sqlSession.commit();
        sqlSession.close();
    }

    //13请删除名字为‘刘国华’的客户信息
    @Test
    public void test13(){
        //delete from customer where cname='刘国华'
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andCnameEqualTo("刘国华");
        int delete = sqlSession.delete("com.xh.dao.CustomerDAO.deleteByExample", example);
        System.out.println("delete = " + delete);
        sqlSession.commit();
        sqlSession.close();
    }

    // 按照id 查找城市
    @Test
    public void test14(){
        List<City> cities = sqlSession.selectList("com.xh.dao.CityDao.selectAreasByCityId", 2);
        for (City city : cities) {
            System.out.println("city = " + city);
        }
        sqlSession.close();
    }


    // 按照name 查找城市
    @Test
    public void test15(){
        List<City> cities = sqlSession.selectList("com.xh.dao.CityDao.selectAreasByCityName","郑州");
        for (City city : cities) {
            System.out.println("city = " + city);
        }
        sqlSession.close();
    }

    //作业2: 写出2个表 ，city， -- .3.. 区表中原区，管城区， 升发区。 5出 1对多的动态sql|
    @Test
    public void test16(){
        Map map = new HashMap();
        map.put("name","经开区");
        List<Map> map1 = sqlSession.selectList("com.xh.dao.CityDAO.dongTai", map);
        for (Map map2 : map1) {
            System.out.println("map2 = " + map2);
        }
        sqlSession.close();
    }

    //  一对多 的查询  写出 学校--学生--班级 的  1 对多  对多的 查询
    @Test
    public void test17(){
        List<Object> objects = sqlSession.selectList("com.xh.dao.SchoolDAO.selectClazzBySchoolId", 1);
        for (Object object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }

    //  多对多 的数据查询  写出 学校--学生--班级 的   多条查询
    @Test
    public void test18(){
        List<Object> objects = sqlSession.selectList("com.xh.dao.SchoolDAO.selsectStudentBySchoolId", 3);
        for (Object object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }

    //  多对多 的数据查询  写出 学校--学生--班级 的   多条查询
//    @Test
//    public void test18_1(){
//        Map map = new HashMap();
//      //  map.put("id",2);
//        map.put("name","清华大学");
//        List<Object> objects = sqlSession.selectList("com.xh.dao.SchoolDAO.selsectStudentByParam", map);
//        for (Object object : objects) {
//            System.out.println("object = " + object);
//        }
//        sqlSession.close();
//    }



    //  一对多 的查询  写出 人和 身份证的 查询。
    @Test
    public void test19(){
        List<Student> studentList = sqlSession.selectList("com.xh.dao.SchoolDAO.selectIdcardByStudentId", 6);
        for (Student student : studentList) {
            System.out.println("student = " + student);
        }
        sqlSession.close();
    }
    //  多对多 ---- 可以看作是  带中间表 的 一对多 它是由 2个1对多组成的
    @Test
    public void test20(){
        List<Object> objects = sqlSession.selectList("com.xh.dao.SchoolDAO.selectJobByName", "班长");
        for (Object object : objects) {
            System.out.println("object = " + object);
        }
        sqlSession.close();
    }
}
