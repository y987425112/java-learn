package com.ydy.webflux.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ydy.webflux.vo.StudentVo;

@RestController
@RequestMapping("/")
public class StudentController {
	
	
	@RequestMapping("/getStudent")
	public StudentVo getStudent(String code) {
		StudentVo studentVo=new StudentVo();
		studentVo.setCode("123");
		studentVo.setName("小明");
		return studentVo;
	}

}
