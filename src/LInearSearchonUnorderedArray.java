
public class LInearSearchonUnorderedArray {

	public static void main(String[] args) {

		int[] arr = { 9, 8, 3, 3, 2, 1, 4, 5 };
		int data = 4;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == data) {
				System.out.println(" Element found at " + i);
				break;
			}
		}
	}

}
