package datastructure;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 2, 9, 6 };

		int min_index;
		int temp;

		for (int i = 0; i < arr.length; i++) {
			min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min_index] > arr[j])
					min_index = j;
			}

			temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;

		}
		System.out.println(Arrays.toString(arr));
	}

}
