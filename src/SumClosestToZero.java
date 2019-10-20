import java.util.Arrays;

public class SumClosestToZero {

	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 70, -80, 85 };
		printSum(arr);
	}

	private static void printSum(int[] arr) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int sum = 0;
		int min_sum = Integer.MAX_VALUE;
		while (left < right) {
			sum = arr[left] + arr[right];
			if (Math.abs(sum) < Math.abs(min_sum)) {
				min_sum = sum;
			}
			if (sum < 0)
				left++;
			else if (sum > 0)
				right--;
		}
		System.out.println("min_sum is : " + min_sum + " left element : " + arr[left] + " right : " + arr[right]);
	}

}
