import java.util.Scanner;
import java.util.Stack;

public class LeadersInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			leadersInArray(arr);
			System.out.println();
		}
	}

	private static void leadersInArray(int[] arr) {
		int max = arr[arr.length - 1];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[arr.length - 1]);
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] >= max) {
				max = arr[i];
				stack.push(arr[i]);
			}
		}

		while(!stack.isEmpty()) {
			System.out.print(stack.peek() + " ");
			stack.pop();
		}
	}
}
