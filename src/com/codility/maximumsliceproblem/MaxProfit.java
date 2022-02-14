package com.codility.maximumsliceproblem;

public class MaxProfit {

	public int solution(int[] A) {
		int globalMaxSum = 0;
		int localMaxSum = 0;
		for (int i = 1; i < A.length; i++) {
			int d = A[i] - A[i - 1];
			localMaxSum = Math.max(d, localMaxSum + d);
			globalMaxSum = Math.max(localMaxSum, globalMaxSum);
		}
		return globalMaxSum;
	}

}
