package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.global.ex.vo.CircleVO;
import edu.global.ex.vo.GradeVO;
import edu.global.ex.vo.MemberVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	
	@GetMapping("/input")
	public String input() {
		return "input";
	}
	
	@GetMapping("/circle")
	public String grade(CircleVO circleVO) {
		return "circle";
	}
	

	
	
	@GetMapping("/")
	public String hello() {
		return "index";
	}
}
