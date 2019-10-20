
public class ThreeSumUsingSorting {

	public static void main(String[] args) {

		// after sorting the array
		int[] arr = { 2, 3, 4, 6, 7, 8, 9 };
		int sum = 12;

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] == sum) {
					System.out.println(" Target sum " + sum + " is found : at indexes : " + arr[i] + " : " + arr[j] + " : " + arr[k]);
					break;
				} else if (arr[i] + arr[j] + arr[k] < sum)
					j++;
				else
					k--;
			}
		}
		System.out.println(" Target sum not found: ");
	}

}
