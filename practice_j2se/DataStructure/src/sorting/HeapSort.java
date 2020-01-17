package sorting;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 3, 31, 2, 5, 3, 29 };
		System.out.println("Before :" + " " + Arrays.toString(a));
		heapSort(a);
		System.out.println("After  :" + " " + Arrays.toString(a));
	}

	private static void heapSort(int[] a) {
		int n = a.length;

		for (int i = (n / 2) - 1; i >= 0; i--) {
			heapify(a, n, i);
		}
		for (int i = n - 1; i >= 0; i--) {
			int t = a[0];
			a[0] = a[i];
			a[i] = t;
			heapify(a, i, 0);
		}

	}

	private static void heapify(int[] a, int n, int i) {
		int largest = i;

		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && a[l] > a[largest])
			largest = l;
		if (r < n && a[r] > a[largest])
			largest = r;

		if (largest != i) {
			int t = a[largest];
			a[largest] = a[i];
			a[i] = t;
			heapify(a, n, largest);
		}
	}
}
