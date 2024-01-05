package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public ResponseEntity<String> GetSample() {
		return ResponseEntity.ok("Hello world");
	}
	
	@GetMapping("/jpn")
	public ResponseEntity<String> GetSample_jpn() {
		return ResponseEntity.ok("Hello japan");
	}

}
