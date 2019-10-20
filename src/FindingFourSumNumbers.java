import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FindingFourSumNumbers {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int targetSum = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			findingFourSumNumbers(arr, targetSum);
			System.out.println(" ");
		}
	}

	private static void findingFourSumNumbers(int[] arr, int targetSum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Arrays.sort(arr);
		int count = 0;
		// inserting elements into hashmap
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
				map.put(arr[i], 1);
		}

		// checking for
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					int finalTargetSum = targetSum - arr[i] - arr[j] - arr[k];
					if (map.containsKey(finalTargetSum)) {
						if ((finalTargetSum <= arr[i]) && (arr[i] <= arr[j]) && (arr[j] <= arr[k])) {
							if ((finalTargetSum == arr[i]) || (finalTargetSum == arr[j])
									|| (finalTargetSum == arr[k])) {
								if (map.get(arr[i]) > 1) {
									count++;
									System.out.print(
											finalTargetSum + " " + arr[i] + " " + arr[j] + " " + arr[k] + " " + "$");
								}
							} else {
								count++;
								System.out
										.print(finalTargetSum + " " + arr[i] + " " + arr[j] + " " + arr[k] + " " + "$");
							}

						}

					}
//					map.put(arr[i], 1);
				}
			}
		}
		if (count == 0) {
			System.out.println("-1");
		}
	}

}
