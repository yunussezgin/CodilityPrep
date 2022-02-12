package com.codility;

public class CyclicRotation {

	public int[] solution(int[] A, int K) {
		int[] result = new int[A.length];
		for (int i = 0; i < result.length; i++) {
			result[(i + K) % A.length] = A[i];
		}
		return result;
	}

}
