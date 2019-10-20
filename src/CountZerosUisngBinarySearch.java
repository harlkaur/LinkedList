
public class CountZerosUisngBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1 ,1 ,1, 1, 1, 1, 1, 1, 1, 0, 0, 0  };

		int index1 = firstOccurrance(arr);
		int index2 = lastOccurrance(arr);
		System.out.println(" index1 : " + index1);
		System.out.println(" index2: " + index2);
		System.out.println((index2 - index1)+1);

	}

	private static int lastOccurrance(int[] arr) {
		int low = arr[0];
		int high = arr.length - 1;
		int mid = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == 0) {
				low = mid + 1;
				if (high == mid && arr[mid] == 0) {
					System.out.println(" last index is : " + mid);
					return mid;
				}
			} else
				low = mid + 1;
		}
		return mid;
	}

	private static int firstOccurrance(int[] arr) {
		int low = arr[0];
		int high = arr.length - 1;
		int mid = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == 0) {
				high = mid - 1;
				if ((low == mid) && arr[mid] == 0) {
					System.out.println(" 0th count starts from " + mid);
					return mid;
				} else if ((arr[mid - 1]) != 0 && arr[mid] == 0) {
					System.out.println(" 0th count starts from " + mid);
					return mid;
				}
			} else
				low = mid + 1;
		}
		return mid;
	}

}
