import java.util.Arrays;
import java.util.Scanner;

public class NextgreaterNumSetDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if (t == 0 || t > 100) {
			String no = String.valueOf(t);
			int length = no.length();
			char[] arr = no.toCharArray();
			nextGreaterNumSetDigit(arr, length);
		}
		String no = null;
		while (t-- > 0) {
			if (!sc.hasNext()) {
				no = String.valueOf(t);
			} else {
				no = sc.next();
			}
			int length = no.length();
			char[] arr = no.toCharArray();
			nextGreaterNumSetDigit(arr, length);
			System.out.println();
		}
	}

	private static void nextGreaterNumSetDigit(char[] arr, int length) {
		int i;
		for (i = length - 1; i > 0; i--) {
			if (arr[i] > arr[i - 1])
				break;
		}
		if (i == 0)
			System.out.println("not possible");
		else {
			char x = arr[i - 1];
			int min = i;
			// find smallest digit to right side
			for (int j = i + 1; j < length; j++) {
				if (arr[j] > x && arr[j] < arr[min]) {
					min = j;
				}
			}
			// swapping x and min
			char temp = arr[i - 1];
			arr[i - 1] = arr[min];
			arr[min] = temp;

			// sorting the remaining array
			Arrays.sort(arr, min, length);
			for (i = 0; i < length; i++)
				System.out.print(arr[i]);
		}

	}

}
