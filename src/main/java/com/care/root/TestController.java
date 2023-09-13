package com.care.root;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("test_socket")
	public String testSocket(HttpSession session) {
		session.setAttribute("nick", "에이에이");
		return "test_socket";
	}
	@GetMapping("socket")
	public String socket() {
		return "socket";
	}
}
