package com.leetcode;

public class Day1_TwoSum {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 3,4 };

		int target = 7;

		int[] result = findTwoSum(arr, target);

		for(int a: result) {
			System.out.println(a);
		}

	}

	public static int[] findTwoSum(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };  //In terms of list stream use  --> list.stream().mapToInt(x -> x).toArray();
				}
			}
		}

		return new int[] {};

	}

}
