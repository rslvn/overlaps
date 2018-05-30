/**
 * 
 */
package com.example.test;

/**
 * @author resulav
 *
 */
public class SO1Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 1, 12, 42, 70, 36, -4, 43, 15 };
		int[] B = { 5, 15, 44, 72, 36, 2, 69, 24 };

		int overlaps = solution(A, B);
		System.out.println(overlaps);
	}

	private static int solution(int[] A, int[] B) {

		int result = 0;

		if (A == null || B == null || A.length < 2 || A.length != B.length) {
			return result;
		}

		int overlaps = 0;
		String matched = "";

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if ((B[i] >= A[j] && B[i] <= B[j]) || (B[j] >= A[i] && B[j] <= B[i])) {
					overlaps++;

					String iPair = A[i] + "-" + B[i];
					String jPair = A[j] + "-" + B[j];

					if (!matched.contains(iPair)) {
						matched += iPair + ",";
					}

					if (!matched.contains(jPair)) {
						matched += jPair + ",";
					}
				}

				System.out.printf("(%d,%d) (%d,%d) overlaps: %d", A[i], B[i], A[j], B[j], overlaps);
				System.out.println();
			}
		}

		int notOverlaps = 0;
		for (int i = 0; i < A.length; i++) {
			String pair = A[i] + "-" + B[i];
			if (!matched.contains(pair)) {
				notOverlaps++;
			}
		}

		return overlaps + notOverlaps;
	}

}
