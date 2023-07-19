package com.rsmj99.sequence.services;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

	public int getNumberByIndex(int index) {
		var current = 0;
		var previous = 1;
		var next = index;
		for (int i = 2; i <= index; i++) {
			next = current + previous;
			current = previous;
			previous = next;
		}
		return next;
	}

}
