import java.util.Scanner;

public class InversionOfArray {

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
			inversionOfArray(arr);
		}
	}

	private static void inversionOfArray(int[] arr) {
		int count = 0;
		for(int i=0, j=i+1;i<arr.length-1&&j<arr.length;i++) {
			if (arr[i] > arr[j])
				count++;
			j++;
		}
		System.out.println(count);
	}

//	private static void inversionOfArray(int[] arr) {
//		int count = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			int j = i + 1;
//			while (j < arr.length) {
//				if (arr[i] > arr[j])
//					count++;
//				j++;
//			}
//		}
//		System.out.println(count);
//	}

}
