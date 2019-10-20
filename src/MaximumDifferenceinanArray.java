import java.util.Scanner;

public class MaximumDifferenceinanArray {
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
			findingMaxValue(arr);
		}
	}

	private static void findingMaxValue(int[] arr) {
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int max = 0;
		left[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			left[i] = Math.min(left[i-1],arr[i]);
		}
		
		for(int i=0;i<left.length-1;i++) {
			System.out.println(left[i]);
		}
		
	}

//	private static void findingMaxValue(int[] arr) {
//		// finding max element from left
//		int max = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			if ((arr[i] < arr[i + 1]) && (arr[i + 1] > max)) {
//				max = arr[i + 1];
//			}
//		}
//
//		// finding min element from right
//		int min = Integer.MAX_VALUE;
//		for (int i = arr.length - 1; i > 0; i--) {
//			if ((arr[i - 1] < arr[i]) && ((arr[i - 1] - arr[i]) < min)) {
//				min = arr[i - 1];
//			}
//		}
//		System.out.println(max - min);
//	}

}
