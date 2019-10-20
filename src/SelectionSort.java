
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		int temp, index = -1;
		int min;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			index = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			if (index != -1) {
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
	}

}
