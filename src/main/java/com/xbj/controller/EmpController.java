package com.xbj.controller;

import com.xbj.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Resource
    private EmpService empService;
    @GetMapping("/list")
    public String getAllEmp(Model model){
        List<Map> list = empService.getAllEmp();
        model.addAttribute("list",list);
        return "emp_list";
    }
}
