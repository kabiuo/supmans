package com.woniu.supmans.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woniu.supmans.bean.Msg;
import com.woniu.supmans.bean.staff.Merch;
import com.woniu.supmans.bean.staff.Sold;
import com.woniu.supmans.bean.staff.Stock;
import com.woniu.supmans.bean.staff.Type;
import com.woniu.supmans.dao.staff.MerchMapper;
import com.woniu.supmans.dao.staff.TypeMapper;
import com.woniu.supmans.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 处理员工的所有请求
 * */
@Controller
public class StaffController {

    @Autowired
    private StaffService staffService;

    //    @RequestMapping("/staff/delstock/{id}")
//    @ResponseBody
//    public Msg delStock(@PathVariable("id") Integer id){
//        if (staffService.delStock(id)){
//            return Msg.success();
//        }else {
//            return Msg.fail();
//        }
//    }
//
    @RequestMapping("/staff/stockinfo-a")
    public String staffGetStockInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //        引入PageHelper插件,传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
//        开始进行分页查询
        List<Merch> merches = staffService.getAll();
//        System.out.println(merches);
//        使用PageInfo包装查询后的解结果,再将包装后的结果交给页面,传入连续显示的页数
        PageInfo page = new PageInfo<Merch>(merches, 5);
        model.addAttribute("stockInfo", page);
        return "stockpage";
    }

    @RequestMapping("/staff/updatesold/{soldid}")
    @ResponseBody
    public Msg updateSold(@Valid Sold sold) {
        if (staffService.updateSoldInfo(sold)) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    @RequestMapping("/staff/getsoldinfo/{id}")
    @ResponseBody
    public Msg getSoldInfo(@PathVariable("id") Integer id) {
        Sold sold = staffService.getSoldInfoByid(id);
        return Msg.success().add("soldinfo", sold);
    }

    @RequestMapping("/staff/delsold/{soldid}")
    @ResponseBody
    public Msg delSold(@PathVariable("soldid") Integer id) {
        if (staffService.delSold(id)) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    @RequestMapping("/staff/savesold")
    @ResponseBody
    public Msg saveSold(@Valid Sold sold) {
        if (staffService.saveSold(sold)) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    @RequestMapping("/staff/soldinfo")
    public String staffGetSoldInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //        引入PageHelper插件,传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
//        开始进行分页查询
        List<Sold> soldInfo = staffService.getSoldInfo();
//        System.out.println(merches);
//        使用PageInfo包装查询后的解结果,再将包装后的结果交给页面,传入连续显示的页数
        PageInfo page = new PageInfo<Sold>(soldInfo, 5);
        model.addAttribute("pageInfosold", page);
        return "soldpage";
    }

    @RequestMapping(value = "/staff/getmerchinfo/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Msg getEmpInfo(@PathVariable("id") Integer id) {
        Merch merch = staffService.getMerchInfo(id);
        return Msg.success().add("MerchInfo", merch);
    }

    @RequestMapping("/staff/updateMerchinfo/{merchid}")
    @ResponseBody
    public Msg getMerchInfo(Merch merch) {
        if (staffService.updateMerchInfo(merch)) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    @RequestMapping("/staff/deletemerch/{merchid}")
    @ResponseBody
    public Msg deleteMerch(@PathVariable("merchid") Integer id) {
        if (staffService.deleteMerch(id)) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    @RequestMapping("/merch/allinfo")
    @ResponseBody
    public Msg getMerch() {
        List<Merch> departmentList = staffService.getMerch();
        return Msg.success().add("merch", departmentList);
    }

    @RequestMapping("/type/allinfo")
    @ResponseBody
    public Msg getType() {
        List<Type> departmentList = staffService.getType();
        return Msg.success().add("depts", departmentList);
    }

    @RequestMapping("/staff/savemerch")
    @ResponseBody
    public Msg saveMerch(@Valid Merch merch) {
        if (staffService.saveMerch(merch)) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }

    @RequestMapping("/staff/allinfo")
    public String staffGetAllInfo(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        //        引入PageHelper插件,传入页码，以及每页的大小
        PageHelper.startPage(pn, 5);
////        开始进行分页查询
        List<Merch> merches = staffService.getAll();
//        System.out.println(merches);
//        使用PageInfo包装查询后的解结果,再将包装后的结果交给页面,传入连续显示的页数
        PageInfo page = new PageInfo<Merch>(merches, 5);
        model.addAttribute("pageInfo", page);
        return "homepage";
    }

    @RequestMapping("/staff/login")
    public String staffLogin(String staffnumber, String staffpassword) {
        if (staffService.staffLogin(staffnumber, staffpassword)) {
            return "tohomepage";
        } else {
            return null;
        }
    }

}
