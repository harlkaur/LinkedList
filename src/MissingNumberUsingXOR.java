import java.util.Scanner;

public class MissingNumberUsingXOR {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n - 1; ++i) {
				arr[i] = sc.nextInt();
			}
			System.out.println(missingNumber(arr));
		}

	}

	private static int missingNumber(int[] arr) {
		int X = 0, Y = 0;
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			X = X ^ arr[i];
		}
		for (int i = 0; i <= n; i++) {
			Y = Y ^ i;
		}
		return (X ^ Y);
	}

}
