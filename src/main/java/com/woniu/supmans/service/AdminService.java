package com.woniu.supmans.service;

import com.woniu.supmans.bean.admin.Admin;
import com.woniu.supmans.bean.admin.AdminExample;
import com.woniu.supmans.bean.staff.Staff;
import com.woniu.supmans.dao.admin.AdminMapper;
import com.woniu.supmans.dao.staff.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private StaffMapper staffMapper;

    public boolean login(String number, String password) {
        boolean result = false;
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminnumEqualTo(number);
//        long count = staffMapper.countByExample(staffExample);
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        Admin admin = null;
        if (adminList.size() > 0 && adminList.size() < 2) {
            for (Admin s : adminList
                    ) {
                admin = s;
            }
        }

        if (admin == null){
            result = false;
        } else {
            if (password.equals(admin.getAdminpass())){
                result = true;
            }
        }

        return result;
    }

    public List<Staff> getStaffAllInfo() {
        return staffMapper.selectByExample(null);
    }

    public boolean saveStaff(Staff staff) {
        if (staffMapper.insertSelective(staff) != 0){
            return true;
        } else {
            return false;
        }
    }

    public Staff getStaffInfo(Integer id) {
        return staffMapper.selectByPrimaryKey(id);
    }

    public boolean updateStaffInfo(Staff staff) {
        if (staffMapper.updateByPrimaryKeySelective(staff) != 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean delStaff(Integer id) {
        if (staffMapper.deleteByPrimaryKey(id) != 0){
            return true;
        } else {
            return false;
        }
    }
}
