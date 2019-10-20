import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NoOfOccurrances {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 1, 1, 1, 1, 2, 3, 9, 1 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
				map.put(arr[i], 1);
		}

		// iterating hashmap
		Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
