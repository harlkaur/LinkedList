
public class MissingNumberinArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		int X = 0, Y = 0;
		int n = arr.length + 1;
		for (int i = 0; i < arr.length; i++) {
			X = X ^ arr[i];
		}

		for (int i = 1; i <= n; i++) {
			Y = Y ^ i;
		}

		System.out.println(" value of X: " + X);
		System.out.println(" Value of y: " + Y);
		System.out.println(X ^ Y);
	}

}
