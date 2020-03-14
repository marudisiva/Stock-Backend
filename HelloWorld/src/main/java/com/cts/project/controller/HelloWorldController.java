package com.cts.project.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/Hello")
public String Hello() {
	return "helloworld";
}
}
