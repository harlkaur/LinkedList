
public class MissingUsingXORGate {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
		int missing_Number = arr[0];
		for (int i = 1; i < arr.length; i++) {
			missing_Number = missing_Number ^ (arr[i]);
		}
		System.out.println(" missing_Number: " + missing_Number);
	}

}
