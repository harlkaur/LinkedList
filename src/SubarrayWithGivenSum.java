import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int targetSum = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			subarray(arr, targetSum);
		}
	}

	private static void subarray(int[] arr, int targetSum) {
		int i = 0;
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
			while (sum >= targetSum) {
				if (sum == targetSum) {
					System.out.println((i + 1) + " " + (j + 1));
					return;
				}
				sum = sum - arr[i];
				i++;
			}
		}
		System.out.println("-1");
	}
}
