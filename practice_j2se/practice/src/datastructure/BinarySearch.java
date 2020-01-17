package datastructure;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(binarySearch(arr, 7, 0, arr.length - 1));

	}

	private static String binarySearch(int[] arr, int key, int l, int r) {
		int mid;
		String s;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(arr[mid]<key)
				l=mid+1;
			else if(arr[mid]>key)
				r=mid-1;
			else
				return "founed at "+mid;
		}
		return "not found";
	}

	/*private static String binarySearch(int[] arr, int key, int left, int right) {
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] == key)
				return "found at " + mid;

			if (key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;

		}

		return "Not present";
	}*/

}
