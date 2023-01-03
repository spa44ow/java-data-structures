package dsa;

//Space Complexity
public class Ox {

	public static void main(String[] args) {

		String[] strs = { "a", "b", "c", "d" };

		// O(1) space
		for (int i = 0; i < strs.length; i++) {

			System.out.println(strs[i]);

		}

		greet(strs);

	}

	public static void greet(String[] strs) {
		// O(n) space
		String[] copy = new String[strs.length];

		for (int i = 0; i < copy.length; i++) {

			System.out.println(copy[i]);

		}

	}

}
