import java.util.Scanner;

public class CountZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			
			int[] arr = { 0, 0, 0, 0, 0 };
			int count = noOfZeros(arr);
			System.out.println(count);
		}
	}

	private static int noOfZeros(int[] arr) {
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		return count;
	}

}
