/**
 * 
 */
package com.example.test;

/**
 * @author resulav
 *
 */
public class SO1Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 4, -1, 3, 2 };
		int length = solution(a);
		System.out.println(length);
	}

	private static int solution(int[] a) {
		if (a == null) {
			return -1;
		}

		if (a.length <= 2 || a[0] != 1) {
			return -1;
		}

		int previousIndex = 0;
		int index = 0;

		while (a[index] != -1) {
			previousIndex = index;
			index = a[index];
			System.out.printf("p: %d, i: %d", previousIndex, index);
			System.out.println();
		}

		return previousIndex;
	}

}
