package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 3, 31, 2, 5, 31, 29 };
		System.out.println("Before :" + " " + Arrays.toString(a));
		quickSort(a, 0, a.length - 1);
		System.out.println("After  :" + " " + Arrays.toString(a));
	}

	private static void quickSort(int[] a, int l, int h) {

		if (l < h) {
			int pi = partition(a, l, h);
			quickSort(a, l, pi - 1);
			quickSort(a, pi + 1, h);
		}

	}

	private static int partition(int[] a, int l, int h) {

		int pivot = a[h];
		int i = l - 1;
		for (int j = l; j < h; j++) {
			if (a[j] < pivot) {
				i++;
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		int t = a[i + 1];
		a[i + 1] = a[h];
		a[h] = t;

		return i + 1;
	}
}
