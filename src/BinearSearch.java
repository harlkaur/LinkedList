
public class BinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 4, 5, 8, 9 };
		int data = 2;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (data == arr[mid]) {
				System.out.println(" Element found at " + mid);
				break;
			}
			else if (data < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
	}

}
