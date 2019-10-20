
public class RotatedBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1,1,3,1 };
//		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int low = 0;
		int data = 3;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((arr[mid] == data)) {
				System.out.println(" Data : " + data + " found at index : " + mid);
				break;
			} else if (arr[mid] <= arr[high]) {
				if (arr[mid] < data && data <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else {
				if ((data < arr[mid]) && data >= arr[low]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
	}

}
