import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterNumberSetDigitWithScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int no = sc.nextInt();
			nextGreaterNumberSetDigit(no);
		}
	}

	private static void nextGreaterNumberSetDigit(int no) {
		String str = String.valueOf(no);
		char[] arr = new char[100000];
		int k = 0;
		int count = 0;
		for (int i = str.length() - 1; i > 0; i--) {
			int j = str.length() - 1;
			if (str.charAt(i - 1) < str.charAt(j)) {
				count++;
				char x = str.charAt(j);
				char y = str.charAt(i - 1);
				char temp = x;
				x = y;
				y = temp;
				arr[k++] = x;
				str = charRemoveAt(str, i - 1);
				break;
			} else {
				arr[k++] = str.charAt(i - 1);
				str = charRemoveAt(str, i - 1);
			}
		}
		
		char temp[] = new char[k];
		for(int i=0; i<k ; ++i) {
			temp[i] = arr[i];
		}
		Arrays.sort(temp);
		if (count <= 0)
			System.out.print("not possible");
		else {
			for (int i = 0;  i < str.length() && str.charAt(i)!='\0'; i++) {
				System.out.print(str.charAt(i));
			}
			for (int i = 0; i <k; i++) {
				System.out.print(arr[i]);

			}
		}
	}
	
	private static String charRemoveAt(String str, int i) {
		return str.substring(0, i) + str.substring(i + 1);
	}

}
