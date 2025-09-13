package com.example.CseSbJenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/home")public String rocks() {
	return "Welcome to springboot";
}
}
