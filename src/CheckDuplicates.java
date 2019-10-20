
public class CheckDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 0, 4, 5, 8, 9 };
		boolean result = checkDuplicates(arr);
		System.out.println(result);
	}

	private static boolean checkDuplicates(int[] arr) {
		boolean result = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(" Duplicates found for element " + arr[i] + " at index : " + i);
					result = true;
				}
			}
		}
		return result;
	}

}
