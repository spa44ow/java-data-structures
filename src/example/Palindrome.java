package example;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(isPalindrome(123321));

	}

	public static boolean isPalindrome(int x) {
		if (x > 0) {

			int revertedNumber = 0;

			while (revertedNumber < x) {
				revertedNumber = revertedNumber * 10 + x % 10;
				x /= 10;
			}

			return x == revertedNumber || x == revertedNumber / 10;

		}
		return false;

	}
}
