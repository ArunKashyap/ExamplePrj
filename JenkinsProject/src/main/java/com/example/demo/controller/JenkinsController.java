/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arun.kashyap
 *
 */
@RestController
public class JenkinsController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Diamond is a Great Tool!";
	}

}
