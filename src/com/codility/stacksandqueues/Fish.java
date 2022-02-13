package com.codility.stacksandqueues;

import java.util.Stack;

public class Fish {

	public int solution(int[] A, int[] B) {
		Stack<Integer> stack = new Stack<>();
		int survivors = 0;
		for (int i = 0; i < A.length; i++) {
			int weight = A[i];
			if (B[i] == 1) {
				stack.push(weight);
			} else {
				int weighDown = stack.isEmpty() ? -1 : stack.pop();
				while (weighDown != -1 && weighDown < weight) {
					weighDown = stack.isEmpty() ? -1 : stack.pop();
				}
				if (weighDown == -1)
					survivors += 1;
				else
					stack.push(weighDown);
			}
		}
		return survivors + stack.size();
	}

}
