package sorting;

import java.util.Arrays;

public class MergSort {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 3, 31, 2, 5, 3, 29 };
		System.out.println("Before :" + " " + Arrays.toString(a));
		mergSort(a, 0, a.length - 1);
		System.out.println("After  :" + " " + Arrays.toString(a));
	}

	private static void mergSort(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r) {
			int m = (l + r) / 2;
			mergSort(a, l, m);
			mergSort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}

	private static void merge(int[] a, int l, int m, int r) {
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for (i = 0; i < n1; i++) {
			L[i] = a[l + i];
		}
		for (i = 0; i < n2; i++) {
			R[i] = a[m + 1 + i];
		}

		i = 0;
		j = 0;
		k = l;

		while (i < n1 && j < n2) {
			
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} 
			else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}
	}
}
