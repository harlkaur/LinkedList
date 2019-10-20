
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 0, 9, 4, 5, 3, 2, 1, 6 };
		int j;
		for (int i = 1; i < arr.length; i++) {
			j = i - 1;
			int temp = arr[i];
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
	}

}
