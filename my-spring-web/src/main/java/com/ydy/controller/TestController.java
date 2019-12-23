package com.ydy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ydy.controller.vo.UserVo;

@Controller
@RequestMapping("/test")
public class TestController {
    
    @RequestMapping(value="test.do")
    public ModelAndView test() {
        ModelAndView view=new ModelAndView("test");
        return view;
    }
    
    
    @RequestMapping(value="/getUserVo.do")
    @ResponseBody
    public UserVo getUserVo(String code,String name) {
        System.out.println("code:"+code+","+"name:"+name);
        UserVo userVo=new UserVo();
        userVo.setCode("123");
        userVo.setName("zhangsan");
        return userVo;
        
    }
    

}
