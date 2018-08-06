package com.woniu.supmans.service;

import com.woniu.supmans.bean.staff.*;
import com.woniu.supmans.dao.staff.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.AssertFalse;
import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private MerchMapper merchMapper;

    @Autowired
    private TypeMapper typeMapper;

    @Autowired
    private SoldMapper soldMapper;

    @Autowired
    private StockMapper stockMapper;

    public Merch getMerchInfo(Integer id) {
        return merchMapper.selectByPrimaryKey(id);
    }

    public boolean staffLogin(String staffnumber, String staffpassword) {
        boolean result = false;
        StaffExample staffExample = new StaffExample();
        StaffExample.Criteria criteria = staffExample.createCriteria();
        criteria.andStaffnumberEqualTo(staffnumber);
//        long count = staffMapper.countByExample(staffExample);
        List<Staff> staffList = staffMapper.selectByExample(staffExample);
        Staff staff = null;
        if (staffList.size() > 0 && staffList.size() < 2) {
            for (Staff s : staffList
                    ) {
                staff = s;
            }
        }

        if (staff == null){
            result = false;
        } else {
            if (staffpassword.equals(staff.getStaffpassword())){
                result = true;
            }
        }

        return result;
    }

    public List<Merch> getAll() {
        return merchMapper.selectByExampleWithType(null);
    }

    public boolean saveMerch(Merch merch) {
        if (merchMapper.insertSelective(merch) != 0){
            return true;
        } else {
            return false;
        }
    }

    public List<Type> getType() {
        return typeMapper.selectByExample(null);
    }

    public boolean deleteMerch(Integer id) {
        if (merchMapper.deleteByPrimaryKey(id) != 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean updateMerchInfo(Merch merch) {
        if (merchMapper.updateByPrimaryKeySelective(merch) != 0){
            return true;
        }else {
            return false;
        }
    }

    public List<Sold> getSoldInfo() {
        return soldMapper.selectByExampleWithMerch(null);
    }

    public List<Merch> getMerch() {
        return merchMapper.selectByExample(null);
    }

    public boolean saveSold(Sold sold) {
        if (soldMapper.insertSelective(sold) != 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean delSold(Integer id) {
        if (soldMapper.deleteByPrimaryKey(id) != 0){
            return true;
        }else {
            return false;
        }
    }

    public Sold getSoldInfoByid(Integer id) {
        return soldMapper.selectByPrimaryKey(id);
    }

    public boolean updateSoldInfo(Sold sold) {
        if (soldMapper.updateByPrimaryKeySelective(sold) != 0){
            return true;
        } else {
            return false;
        }
    }

    public List<Stock> getStockInfo() {
        return stockMapper.selectByExampleWithMType(null);
    }

    public boolean delStock(Integer id) {
        if (stockMapper.deleteByPrimaryKey(id) != 0){
            return true;
        } else {
            return false;
        }
    }
}
