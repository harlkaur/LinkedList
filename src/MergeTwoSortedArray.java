import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int arr1[] = new int[n1];
			int arr2[] = new int[n2];
			for (int i = 0; i < n1; ++i) {
				arr1[i] = sc.nextInt();
			}
			for (int i = 0; i < n2; i++) {
				arr2[i] = sc.nextInt();
			}
			mergeArrays(arr1, arr2);
			System.out.println(" ");
		}
	}

	private static void mergeArrays(int arr1[], int[] arr2) {
		int arr3[] = new int[arr1.length + arr2.length];
		int k = 0;
		int i = 0, j = 0;
		for (i = 0, j = 0; i < arr1.length && j < arr2.length; ) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i];
				i++;
			} else {
				arr3[k++] = arr2[j];
				j++;
			}
		}

		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		for (k = 0; k < arr3.length; k++) {
			System.out.print(arr3[k] + " ");
		}
	}

}
