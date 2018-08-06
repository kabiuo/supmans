package com.woniu.supmans.dao.staff;

import com.woniu.supmans.bean.staff.Sold;
import com.woniu.supmans.bean.staff.SoldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoldMapper {
    long countByExample(SoldExample example);

    int deleteByExample(SoldExample example);

    int deleteByPrimaryKey(Integer soldid);

    int insert(Sold record);

    int insertSelective(Sold record);

    List<Sold> selectByExample(SoldExample example);

    List<Sold> selectByExampleWithMerch(SoldExample example);

    Sold selectByPrimaryKey(Integer soldid);

    int updateByExampleSelective(@Param("record") Sold record, @Param("example") SoldExample example);

    int updateByExample(@Param("record") Sold record, @Param("example") SoldExample example);

    int updateByPrimaryKeySelective(Sold record);

    int updateByPrimaryKey(Sold record);
}