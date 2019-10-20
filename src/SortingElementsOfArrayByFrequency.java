import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Pair {

	int key, value;

	Pair() {

	}

	Pair(int f, int s) {
		key = f;
		value = s;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}

}

public class SortingElementsOfArrayByFrequency {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; ++i) {
				arr[i] = sc.nextInt();
			}
			sortByFrequency(arr);
			System.out.println(" ");
		}

	}

	private static void sortByFrequency(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int arr2[] = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
				map.put(arr[i], 1);
		}

		Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
		ArrayList<Pair> p = new ArrayList<Pair>();
		while (iter.hasNext()) {
			Map.Entry<Integer, Integer> entry = iter.next();
			Pair pair = new Pair(entry.getKey(), entry.getValue());
			p.add(pair);
			arr2[k++] = entry.getValue();

		}

		Collections.sort(p, new Comparator<Pair>() {
			@Override
			public int compare(Pair p1, Pair p2) {

				if (p1.value > p2.value)
					return -1;
				else if (p1.value == p2.value) {
					if (p1.key > p2.key)
						return 1;
					else
						return -1;
				}

				return 1;
			}
		});

		for (int i = 0; i < p.size(); ++i) {
			Pair pair = p.get(i);
			for (int j = 0; j < pair.value; ++j) {
				System.out.print(pair.key + " ");
			}
		}
	}

}
