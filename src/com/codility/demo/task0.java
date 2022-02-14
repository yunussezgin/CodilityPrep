package com.codility.demo;

import java.util.Arrays;

public class task0 {

	public int solution(int[] A) {
		Arrays.sort(A);

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] < 0)
				continue;

			int diff = A[i + 1] - A[i];

			if (diff > 1)
				return A[i] + 1;
		}
		
		if (A[A.length - 1] >= 0)
			return A[A.length - 1] + 1;
		
		//System.out.println(Arrays.toString(A));
		return 1;
	}

}
