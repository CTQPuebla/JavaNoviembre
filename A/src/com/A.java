package com;

public class A {
	public static void main(String[] agr) {

		int[] arr = { 0, 12, 7, 3, 2, 3, 19, 6, 0, 1, 72, -3, 9 };

		boolean flag = true;
		int test = 9;
		while (flag) {
			arr[test] = arr[12] - arr[12];
			test = test - 2;

			if (test == arr[3]) {

				flag = false;
				break;
			}

		}
		System.out.print(arr[5] + " " + arr[7] + " " + arr[9]);

	}
}