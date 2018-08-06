package com.woniu.supmans.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.supmans.bean.Msg;
import com.woniu.supmans.bean.staff.Merch;
import com.woniu.supmans.bean.staff.Sold;
import com.woniu.supmans.bean.staff.Staff;
import com.woniu.supmans.dao.staff.StaffMapper;
import com.woniu.supmans.service.AdminService;
import com.woniu.supmans.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private StaffService staffService;

//    /admin/savestaff

    @RequestMapping("/staff/soldinfoa")
    public String staffGetSoldInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //        引入PageHelper插件,传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
//        开始进行分页查询
        List<Sold> soldInfo = staffService.getSoldInfo();
//        System.out.println(merches);
//        使用PageInfo包装查询后的解结果,再将包装后的结果交给页面,传入连续显示的页数
        PageInfo page = new PageInfo<Sold>(soldInfo, 5);
        model.addAttribute("pageInfosold", page);
        return "a-soldpage";
    }

    @RequestMapping("/staff/allinfoa")
    public String staffGetStaffAllInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //        引入PageHelper插件,传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
////        开始进行分页查询
        List<Merch> merches = staffService.getAll();
//        System.out.println(merches);
//        使用PageInfo包装查询后的解结果,再将包装后的结果交给页面,传入连续显示的页数
        PageInfo page = new PageInfo<Merch>(merches, 5);
        model.addAttribute("pageInfo", page);
        return "a-staffpage";
    }

    @RequestMapping("/staff/stockinfoa")
    public String staffGetStockInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //        引入PageHelper插件,传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
//        开始进行分页查询
        List<Merch> merches = staffService.getAll();
//        System.out.println(merches);
//        使用PageInfo包装查询后的解结果,再将包装后的结果交给页面,传入连续显示的页数
        PageInfo page = new PageInfo<Merch>(merches, 5);
        model.addAttribute("stockInfo", page);
        return "a-stockpage";
    }

    @RequestMapping("/admin/deleteStaff/{id}")
    @ResponseBody
    public Msg delStaff(@PathVariable Integer id){
        if (adminService.delStaff(id)){
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    @RequestMapping("/admin/updateStaffinfo/{staffid}")
    @ResponseBody
    public Msg getMerchInfo(Staff staff) {
        if (adminService.updateStaffInfo(staff)) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    @RequestMapping(value = "/staff/getstaffinfo/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Msg getStaffInfo(@PathVariable("id") Integer id) {
        Staff staff = adminService.getStaffInfo(id);
        return Msg.success().add("StaffInfo", staff);
    }

    @RequestMapping("/admin/savestaff")
    @ResponseBody
    public Msg saveStaffInfo(@Valid Staff staff){
        if (adminService.saveStaff(staff)){
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }

    @RequestMapping("/admin/allsinfo")
    public String staffGetAllInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //        引入PageHelper插件,传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
////        开始进行分页查询
        List<Staff> merches = adminService.getStaffAllInfo();
//        System.out.println(merches);
//        使用PageInfo包装查询后的解结果,再将包装后的结果交给页面,传入连续显示的页数
        PageInfo page = new PageInfo<Staff>(merches, 5);
        model.addAttribute("pageInfoStaff", page);
        return "adminpage";
    }

    @RequestMapping("/admin/login")
    public String AdminLogin(String adminnum, String adminpass){
        if (adminService.login(adminnum,adminpass)){

            return "toadminpage";
        }else {
            return null;
        }
    }
}
