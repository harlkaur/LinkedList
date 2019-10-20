import java.util.Scanner;

public class SortingDSBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of array1 ");
		int m1 = sc.nextInt();
		int[] arr1 = new int[m1];
		System.out.println(" Enter the elements to be inserted ");
		int elements = sc.nextInt();

		System.out.println(" Enter the elements ");
		for (int i = 0; i < elements; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println(" Enter the size of array2 ");
		int m2 = sc.nextInt();
		int[] arr2 = new int[m2];
		System.out.println(" Enter the elements ");
		for (int i = 0; i < m2; i++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println(" Displaying array1 before merging ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
		System.out.println(" ");

		while (m1 > 0 || m2 > 0) {
			if (arr1[elements - 1] > arr2[m2 - 1]) {
				arr1[m1 - 1] = arr1[elements - 1];
				if (arr1[elements - 2] != -1) {
					arr1[elements - 1] = arr1[elements - 2];
					arr1[elements - 2] = 0;
				} /*
					 * else arr1[elements - 1] = 0;
					 */
			} else {
				arr1[m1 - 1] = arr2[m2 - 1];
				m2--;
			}
			m1--;
		}

		for (int i = 0; i < m1; i++) {
			if (arr1[i] == 0 && m1 != 0)
				arr1[i] = arr1[m1 - 1];
			else
				arr1[i] = arr2[m2 - 1];
		}

		// iterating array1
		System.out.println(" Displaying array1 after merging ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
	}

}
