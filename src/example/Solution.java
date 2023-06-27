package example;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int gcd = 0;
		if (a > b && a > c) {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		} else if (b > a && b > c) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

		int m = (a < b ? a : b);
		m = (m < c ? m : c);
		for (int i = m; i > 0; i--) {
			if (a % i == 0 && b% i == 0 && c % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println("The code to open the box is " + gcd);
	}
}