package com.codility.demo;

import java.util.Arrays;

public class task0 {

	public int solution(int[] A) {
		Arrays.sort(A);
		int counter = 1;
		int beforeCounter = -1;

		for (int i = 0; i < A.length; i++) {

			if (A[i] < 1)
				continue;

			if (A[i] != counter) {

				if (beforeCounter == -1) {
					return 1;
				} else if (A[i] == counter + 1) {
					counter += 1;
					beforeCounter = counter;
				} else {
					return counter + 1;
				}

			} else {
				beforeCounter = A[i];
			}

		}

		// System.out.println(Arrays.toString(A));
		return beforeCounter == -1 ? 1 : beforeCounter + 1;
	}

}
