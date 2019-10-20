import java.util.Scanner;

public class FacingTheSun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			System.out.println(facingTheSun(arr));
		}
	}

	private static int facingTheSun(int[] arr) {
		int max = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length ; i++) {
			if (arr[i] > max) {
				count++;
				max = arr[i];
			}
		}
		return count;
	}
}
