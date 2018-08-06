package com.woniu.supmans.test;

import com.woniu.supmans.bean.admin.Admin;
import com.woniu.supmans.bean.staff.*;
import com.woniu.supmans.dao.admin.AdminMapper;
import com.woniu.supmans.dao.staff.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/*
 * 测试dao层工作
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    private TypeMapper typeMapper;

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private MerchMapper merchMapper;

    @Autowired
    private SoldMapper soldMapper;

    @Autowired
    private StockMapper stockMapper;

    @Autowired
    private AdminMapper adminMapper;

//    @Autowired
//    private EmployeeMapper employeeMapper;

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void testCrud(){
//        测试添加商品类型
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        ioc.getBean(TypeMapper.class);
//        System.out.println(typeMapper);
//        typeMapper.insertSelective(new Type(null,"饮料"));
//        typeMapper.insertSelective(new Type(null,"零食"));
//        staffMapper.insertSelective(new Staff(null,"zhangsan","zhangsan"));
//        merchMapper.insertSelective(new Merch(null,"和其正","XXXXX","2018-04-28","2018-07-28","5",1,"100"));
//        soldMapper.insertSelective(new Sold(null,1,"10","50",1));
//        stockMapper.insertSelective(new Stock(null,2,1));\
//        adminMapper.insertSelective(new Admin(null,"admin","admin"));
//        测试员工，插入数据
//        employeeMapper.insertSelective(new Employee(null,"jerry","M","Jerry@woniu.com", 1));
//        批量插入多个员工
//        for (){
//            employeeMapper.insertSelective(new Employee(null,"jerry","M","Jerry@woniu.com", 1));
//        }

//        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);


    }
}
