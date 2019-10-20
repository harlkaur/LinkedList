import java.util.Scanner;

public class GoodPairs {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			System.out.println(goodPairs(arr));
		}
	}

	private static int goodPairs(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length-1; j++) {
				if (arr[i] != arr[j]) {
					count++;
				}
			}
		}
		return count;
	}

}
