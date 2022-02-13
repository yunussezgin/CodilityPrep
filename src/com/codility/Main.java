package com.codility;

import java.util.Arrays;

import com.codility.stacksandqueues.Fish;

public class Main {

	public static void main(String[] args) {
		// Perm Missing Elem
//		System.out.println(new PermMissingElem().solution(new int[] { 2, 3, 1, 5 }));
//		System.out.println(new PermMissingElem().solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
//		System.out.println(new PermMissingElem().solution(new int[] {}));

		// Tape Equilibrium
//		System.out.println(new TapeEquilibrium().solution(new int[] { 3, 1, 2, 4, 3 }));

		// Cyclic Rotation
//		System.out.println(Arrays.toString(new CyclicRotation().solution(new int[] { 7, 2, 8, 3, 5 }, 2)));
//		System.out.println(Arrays.toString(new CyclicRotation().solution(new int[] { 7, 2, 8, 3, 5 }, 5)));

		// Max Counters
//		System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 })));

		// Brackets
//		System.out.println(new Brackets().solution("()[]{}()[]{}"));
//		System.out.println(new Brackets().solution("()]]"));

		// Fish
		System.out.println(new Fish().solution(new int[] { 4, 8, 2, 6, 7 }, new int[] { 0, 1, 1, 0, 0 }));
		System.out.println(new Fish().solution(new int[] { 4, 8, 2, 6, 7 }, new int[] { 0, 1, 0, 0, 0 }));

	}

}
