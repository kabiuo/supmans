package com.woniu.supmans.dao.staff;

import com.woniu.supmans.bean.staff.Merch;
import com.woniu.supmans.bean.staff.MerchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchMapper {
    long countByExample(MerchExample example);

    int deleteByExample(MerchExample example);

    int deleteByPrimaryKey(Integer merchid);

    int insert(Merch record);

    int insertSelective(Merch record);

    List<Merch> selectByExample(MerchExample example);

    List<Merch> selectByExampleWithType(MerchExample example);

    Merch selectByPrimaryKey(Integer merchid);

    int updateByExampleSelective(@Param("record") Merch record, @Param("example") MerchExample example);

    int updateByExample(@Param("record") Merch record, @Param("example") MerchExample example);

    int updateByPrimaryKeySelective(Merch record);

    int updateByPrimaryKey(Merch record);
}