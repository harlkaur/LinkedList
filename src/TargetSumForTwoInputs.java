import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TargetSumForTwoInputs {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] arr = { 1, 2, 3, 9, 4 };
		int target = 16;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 1);
			if (map.containsKey(target - arr[i])) {
				System.out.println(" Element found at index : " + i);
				break;
			}
		}

		Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
