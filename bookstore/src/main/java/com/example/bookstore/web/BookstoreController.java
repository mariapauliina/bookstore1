package com.example.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookstoreController {
	@RequestMapping("/index")
	@ResponseBody
	public String kotisivu() {
	return "This is main pageee! Welcome to the bookstore!!";
}
}