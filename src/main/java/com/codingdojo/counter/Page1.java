package com.codingdojo.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Page1 {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
				session.setAttribute("count", 0);
			}
			else {
				session.setAttribute("count", (Integer)session.getAttribute("count")+1 );
			}
		return "index.jsp";
	}
}
