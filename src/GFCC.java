import java.util.Scanner;

public class GFCC {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int data = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}

			System.out.print(firstOccurrance(arr, data) );
			if(firstOccurrance(arr, data) != -1)
				System.out.print( " " + lastOccurrance(arr, data));
		}
	}

	private static int lastOccurrance(int[] arr, int data) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((mid == high || (data < arr[mid + 1])) && (data == arr[mid])) {
//				System.out.println(" Last occurrances is at index:  " + mid);
				return mid;
			} else if (data >= arr[mid]) {
				low = mid + 1;
			} else if (data < arr[mid]) {
				high = mid - 1;
			}

		}
		return -1;
	}

	private static int firstOccurrance(int[] arr, int data) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((low == mid || (data > arr[mid - 1])) && (data == arr[mid])) {
//				System.out.println(" first occuarrance found at index: " + low);
				return mid;
			} else if (data <= arr[mid]) {
				high = mid - 1;
			} else if (data > arr[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}

}
