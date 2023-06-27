package dataStructures;

import java.util.Arrays;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {

		System.out.println(calculate(Arrays.asList(100, 2, 864, 4)) + calculateTwo(Arrays.asList(100, 2, 864, 4)));

	}

	public static Integer calculate(List<Integer> list) {

		Integer result = list.stream().reduce(0, (a, b) -> a + b);

		return result;

	}

	public static Integer calculateTwo(List<Integer> list) {

		Integer result = list.stream().mapToInt(Integer::intValue).sum();

		return result;
	}

}
