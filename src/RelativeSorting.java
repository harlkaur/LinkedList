import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RelativeSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr1 = new int[N];
			int[] arr2 = new int[M];

			for (int i = 0; i < N; i++) {
				arr1[i] = sc.nextInt();
			}

			for (int i = 0; i < M; i++) {
				arr2[i] = sc.nextInt();
			}
			relativeSorting(arr1, arr2);
		}
	}

	private static void relativeSorting(int[] arr1, int[] arr2) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i]))
				map.put(arr1[i], map.get(arr1[i]) + 1);
			else
				map.put(arr1[i], 1);
		}
		int k = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				int count = map.get(arr2[i]);
				for (int j = 0; j < count; ++j)
					arr1[k++] = arr2[i];
				map.remove(arr2[i]);
			}
		}
		Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Integer> entry = iter.next();
			int count = entry.getValue();
			for (int j = 0; j < count; ++j)
				arr1[k++] =  entry.getKey();

		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}
