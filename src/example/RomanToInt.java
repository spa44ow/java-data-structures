package example;

public class RomanToInt {

	public static void main(String args[]) {

		int data = romanToInt("X");
		System.out.print(data);
	}

	public static int romanToInt(String s) {
		if (s.length() == 0)
			return 0;

		if (s.length() > 1) {
			if (s.substring(0, 2).equals("CM"))
				return 900 + romanToInt(s.substring(2));
			if (s.substring(0, 2).equals("CD"))
				return 400 + romanToInt(s.substring(2));
			if (s.substring(0, 2).equals("XC"))
				return 90 + romanToInt(s.substring(2));
			if (s.substring(0, 2).equals("XL"))
				return 40 + romanToInt(s.substring(2));
			if (s.substring(0, 2).equals("IX"))
				return 9 + romanToInt(s.substring(2));
			if (s.substring(0, 2).equals("IV"))
				return 4 + romanToInt(s.substring(2));
		}

		if (s.charAt(0) == 'M')
			return 1000 + romanToInt(s.substring(1));
		if (s.charAt(0) == 'D')
			return 500 + romanToInt(s.substring(1));
		if (s.charAt(0) == 'C')
			return 100 + romanToInt(s.substring(1));
		if (s.charAt(0) == 'L')
			return 50 + romanToInt(s.substring(1));
		if (s.charAt(0) == 'X')
			return 10 + romanToInt(s.substring(1));
		if (s.charAt(0) == 'V')
			return 5 + romanToInt(s.substring(1));
		if (s.charAt(0) == 'I')
			return 1 + romanToInt(s.substring(1));

		return 0;
	}

}
