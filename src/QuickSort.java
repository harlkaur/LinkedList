
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 0, 9, 4, 5, 3, 2, 1, 6 };
		int high = arr.length - 1;
		int low = 0;
		QuickSort ob = new QuickSort();
		ob.quicksort(arr, low, high);

		System.out.println(" Displaying after quicksort algo ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	 void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quicksort(arr, low, pi - 1);
			quicksort(arr, pi + 1, high);
		}
	}

	 int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high-1; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

}
