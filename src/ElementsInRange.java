import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ElementsInRange {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int range1 = sc.nextInt();
			int range2 = sc.nextInt();
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			if(elementsInRange(arr, range1, range2))
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

	private static boolean elementsInRange(int[] arr, int range1, int range2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 1);
		}

		for (int i = range1; i <= range2; i++) {
			if (!map.containsKey(i)) {
				return false;
			}
		}
		return true;
	}

}
