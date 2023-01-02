package example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

	public static void main(String args[]) {

		int[] intArray = { 3, 2, 4 };
		int[] finalArray = twoSum(intArray, 6);
		System.out.print(Arrays.toString(finalArray));
	}

	public static int[] twoSum(int[] numbers, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; map.put(numbers[i], ++i))
			if (map.containsKey(target - numbers[i]))
				return new int[] { map.get(target - numbers[i]), i + 1 };
		return new int[] { 0, 0 };
	}

//		for (int i = 0; i < nums.length; i++) {
//
//			for (int j = i + 1; j < nums.length; j++) {
//
//				if (target == (nums[i] + nums[j])) {
//					return new int[] { i, j };
//				}
//
//			}
//
//		}
//
//		return null;
//
//	}

}