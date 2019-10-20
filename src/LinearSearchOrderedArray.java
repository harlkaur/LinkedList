
public class LinearSearchOrderedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 4, 5, 8, 9 };
		int data = 2;
		int i = 0;
		while (i < arr.length && arr[i] <= data) {
			if (data == arr[i]) {
				System.out.println(" Element found at " + i);
				break;
			}
			i++;
		}
	}

}
