import java.util.Scanner;

public class ElementAppearingOnceUsingXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			elementAppreaingOnce(arr);
		}
	}

	private static void elementAppreaingOnce(int[] arr) {
		int X = 0;
		for (int i = 0; i < arr.length; i++) {
			X = X ^ arr[i];
		}
		System.out.println(X);
	}

}
