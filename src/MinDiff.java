import java.util.Scanner;

public class MinDiff {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			minDiff(arr);
		}
	}

	private static void minDiff(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] - arr[j]) < min)
					min = Math.abs(arr[i] - arr[j]);
			}
		}
		System.out.println(min);
	}
}
