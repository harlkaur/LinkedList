
public class LastOccurrances {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 3, 3, 3, 3, 6, 7 };
		int low = 0;
		int high = arr.length - 1;
		int data = 3;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((mid == high || (data < arr[mid + 1])) && (data == arr[mid])) {
				System.out.println(" Last occurrances is at index:  " + mid);
				break;
			} else if (data >= arr[mid]) {
				low = mid + 1;
			} else if (data < arr[mid]) {
				high = mid - 1;
			}

		}
	}
}
