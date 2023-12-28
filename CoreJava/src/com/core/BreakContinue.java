package com.core;

import java.util.*;

public class BreakContinue {
	public static void main(String[] args) {
		// BREAK & CONTINUE
		int i = 1;
		while (true) {
			if (i == 3) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
			if (i > 5) break;
		}
	}
}
