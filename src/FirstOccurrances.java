
public class FirstOccurrances {

	public static void main(String[] args) {
		int[] arr = { 1,1,1,1,1,3, 3, 3, 3, 20, 4, 1, 0 };
		int low = 0;
		int high = arr.length - 1;
		int data = 3;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((low == mid ||  (data > arr[mid - 1]) )  &&   (data == arr[mid])) {
				System.out.println(" first occuarrance found at index: " + low);
				break;
			} else if (data <= arr[mid]) {
				high = mid - 1;
			} else if (data > arr[mid]) {
				low = mid + 1;
			}
		}
	}

}
