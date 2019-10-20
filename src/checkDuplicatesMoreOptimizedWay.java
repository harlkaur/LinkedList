
public class checkDuplicatesMoreOptimizedWay {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 0, 5, 2 };
		int result = checkDuplicates(arr);
		if (result > 0)
			System.out.println(" Duplicates exist ");
		else
			System.out.println(" No Dups found ");
	}

	private static int checkDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] < 0) {
				System.out.println(" Duplicates exist at " + arr[i] + " at index: " + i);
				return 1;
			}
			arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
		}
		return -1;
	}
}
