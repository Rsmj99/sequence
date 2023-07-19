package com.rsmj99.sequence.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsmj99.sequence.services.FibonacciService;

@RestController
@RequestMapping("/fibonacci")
public class FibonacciController {

	@Autowired
	private FibonacciService fibonacciService;

	@GetMapping("/number/{index}")
	public int getNumberByIndex(@PathVariable int index) {
		return this.fibonacciService.getNumberByIndex(index);
	}
}
