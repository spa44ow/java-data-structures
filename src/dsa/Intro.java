package dsa;

public class Intro {

	public static void main(String[] args) {
		int numb[] = { 1, 2, 3 };
		// O(1)
		System.out.print(numb[0]);
		printLine(numb);
		printLoop(numb);

	}

	public static void printLine(int[] num) {
		// O(2)
		System.out.print(num[1]);
		System.out.print(num[2]);
	}

	public static void printLoop(int[] num) {

		// O(1 + n +1) OR O(2+n)
		System.out.println();// O(1)
		for (int i = 0; i < num.length; i++) {// O(n)
			System.out.print(num[i]);// O(1)
		}

		System.out.println();
	}

	public static void printLoops(int[] num) {

		// O(n+n) or O(2n)
		for (int i = 0; i < num.length; i++) {// O(n)
			System.out.print(num[i]);// O(1)
		}
		for (int i = 0; i < num.length; i++) {// O(n)
			System.out.print(num[i]);// O(1)
		}

	}

	public static void printLoops(int[] num, String[] names) {

		// O(n+m) or O(n)
		for (int i = 0; i < num.length; i++) {// O(n)
			System.out.print(num[i]);// O(1)
		}
		for (int i = 0; i < names.length; i++) {// O(m)
			System.out.print(names[i]);// O(1)
		}

	}

	public static void printLoopsNested(int[] nums, String[] names) {

		// O(n^2) or O(n*n) runs in quadric time
		for (int num : nums) {// O(n)

			for (String name : names) {// O(n)
				System.out.print(name + " , " + num);// O(1)
			}

		}
	}

}
