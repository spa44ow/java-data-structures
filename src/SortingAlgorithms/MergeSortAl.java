package SortingAlgorithms;

public class MergeSortAl {

	public static void main(String ars[]) {

		int[] arr = { 76, 12, 42, 34, 52, 99, 41, 56, 60, 1, 90 };

		int[] sorted_arr = mergeSortImpl(arr);

		System.out.println(sorted_arr);

	}

	private static int[] mergeSortImpl(int[] arr) {
		
		if (arr == null || arr.length <= 1) {
            return null; // Base case: the array is already sorted or empty
        }

		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		System.arraycopy(arr, 0, left, 0, left.length);
		System.arraycopy(arr, 0, right, 0, right.length);

		return null ;
	}

}
