import java.util.Scanner;

public class MaxDiff {

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
			findingMax(arr);
		}
	}

	private static void findingMax(int[] arr) {
		int max = 0;
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			left[i] = Math.min(left[i-1],arr[i]);
		}
		right[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			right[i] = Math.max(arr[i],right[i+1]);
		}
		for(int l=0,r=0;l<left.length&&r<right.length;l++,r++) {
			max = Math.max(max,(right[r] - left[l]));
		}
		if(max == 0)
			max=-1;
		System.out.println(max);
	}

//	private static void findingMax(int[] arr) {
//		int max = -1;
//		for (int i = 0; i < arr.length - 1; i++) {
//			int j = arr.length-1;
//			while(i<j) {
//				if ((arr[i] < arr[j]) && ((arr[j] - arr[i]) > max))
//					max = (arr[j] - arr[i]);
//				j--;
//			}
//		}
//		System.out.println(max);
//	}

//	private static void findingMax(int[] arr) {
//		int max = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			int j = i + 1;
//			while (j < arr.length) {
//				if ((arr[i] < arr[j]) && ((arr[j] - arr[i]) > max))
//					max = (arr[j] - arr[i]);
//				j++;
//			}
//		}
//		System.out.println(max);
//	}
}
