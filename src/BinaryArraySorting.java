import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinaryArraySorting {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
			for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strs[i]); 
			}
			sorting(arr);
			System.out.println(" ");
		}
	}

	private static void sorting(int[] arr) {
		int k = 0;
		int temp;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			switch (temp) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			default:
				break;
			}
		}

		for (k = 0; k < count0; k++) {
			System.out.print("0" + " ");
		}
		for (k = 0; k < count1; k++) {
			System.out.print("1" + " ");
		}
		for (k = 0; k < count2; k++) {
			System.out.print("2" + " ");
		}
	}

}
