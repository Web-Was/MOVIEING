package com.kosmo.movieing.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {
	
	@RequestMapping("/Movieing/Member/SignUp.mov")
	public String movieMain() {
		return "member/SignUp.tiles";
	}

}
