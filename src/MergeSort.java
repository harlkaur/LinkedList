
public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7 };
		MergeSort mObj = new MergeSort();
		mObj.sort(arr, 0, arr.length - 1);

		System.out.println(" Printing data after sorting the array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	private void sort(int[] arr, int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;

			sort(arr, beg, mid);
			sort(arr, mid + 1, end);

			merge(arr, beg, mid, end);
		}
	}

	private void merge(int[] arr, int beg, int mid, int end) {

		// finding sizes of two arrays to be merged
		int n1 = mid - beg + 1;
		int n2 = end - mid;

		// create temp arrays
		int temp1[] = new int[n1];
		int temp2[] = new int[n2];

		for (int i = 0; i < n1; i++)
			temp1[i] = arr[beg + i];
		for (int j = 0; j < n2; j++)
			temp2[j] = arr[mid  +1+ j];

		int i = 0, j = 0;
		int k = beg;
		while (i < n1 && j < n2) {
			if (temp1[i] <= temp2[j]) {
				arr[k] = temp1[i];
				i++;
			} else {
				arr[k] = temp2[j];
				j++;
			}
			k++;
		}

		// copy remaining elements
		while (i < n1) {
			arr[k] = temp1[i];
			k++;
			i++;

		}

		while (j < n2) {
			arr[k] = temp2[j];
			k++;
			j++;
		}

	}
}
