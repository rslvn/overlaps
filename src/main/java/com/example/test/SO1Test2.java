/**
 * 
 */
package com.example.test;

/**
 * @author resulav
 *
 */
public class SO1Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree t1 = new Tree(5, new Tree(3, new Tree(20, null, null), new Tree(21, null, null)),
				new Tree(10, new Tree(1, null, null), null));

		Tree t2 = new Tree(8, new Tree(2, new Tree(8, null, null), new Tree(7, null, null)), new Tree(6, null, null));

		int length = solution(t1);
		System.out.println(length);
		length = solution(t2);
		System.out.println(length);

	}

	private static int solution(Tree t) {
		return solution(t.x, t);
	}

	private static int solution(int rootValue, Tree t) {
		int height = 0;
		if (rootValue <= t.x) {
			height++;
		}
		if (t.l != null) {
			height += solution(rootValue, t.l);
		}
		if (t.r != null) {
			height += solution(rootValue, t.r);
		}
		return height;
	}

	public static class Tree {
		public int x;
		public Tree l;
		public Tree r;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public Tree getL() {
			return l;
		}

		public void setL(Tree l) {
			this.l = l;
		}

		public Tree getR() {
			return r;
		}

		public void setR(Tree r) {
			this.r = r;
		}

		public Tree(int x, Tree l, Tree r) {
			super();
			this.x = x;
			this.l = l;
			this.r = r;
		}

	}

}
