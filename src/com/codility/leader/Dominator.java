package com.codility.leader;

public class Dominator {

	public int solution(int[] A) {
		int consecutiveSize = 0;
		int candidate = 0;
		for (int item : A) {
			if (consecutiveSize == 0) {
				candidate = item;
				consecutiveSize += 1;
			} else if (candidate == item) {
				consecutiveSize += 1;
			} else {
				consecutiveSize -= 1;
			}
		}

		int occurence = 0;
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				occurence++;
				index = i;
			}
		}
		return occurence > A.length / 2.0 ? index : -1;
	}

}
