
public class CountingSort {

	public static void main(String[] args) {
		int[] count = new int[10];

		int[] arr1 = { 9, 8, 3, 3, 2, 1, 4, 5 };
		int[] arr2 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr2[arr1[i]] = count[arr1[i]]++;
		}

		System.out.println(" Displaying count variable ");
		System.out.println(" ");
		for (int k = 0; k < count.length; k++) {
			System.out.print(count[k] + ", ");
		}

		System.out.println(" ");
		System.out.println(" ");

		System.out.println(" Displaying final sorted array ");
		System.out.println(" ");
		for (int k = 0; k < count.length; k++) {
			while (count[k] != 0) {
				System.out.print(k + ", ");
				count[k]--;
			}
		}
	}

}
