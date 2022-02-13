package com.codility.timecomplexity;

public class PermMissingElem {

	public int solution(int[] A) {
		long actualSum = 0;
		for (int number : A) {
			actualSum += number;
		}
		long maxNumber = A.length + 1;
		long expectedSum = (maxNumber * (maxNumber + 1) / 2);
		return (int) (expectedSum - actualSum);
	}

}
