import java.util.Scanner;

public class Sorting0n1usingBinarySearch {

	public static void main(String[] args) {

		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			sorting(arr);
			System.out.println(" ");
		}
	}

	private static void sorting(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while ((low <= high) && (mid<=arr.length-1)) {
			if (arr[mid] == 0) {
				// swap them to front
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1)
				mid++;
			else if (arr[mid] == 2) {
				// swap it to the end.
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
