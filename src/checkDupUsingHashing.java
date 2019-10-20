import java.util.HashMap;

public class checkDupUsingHashing {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 4, 5, 8, 1 };
		int count = 1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], count + 1);
				System.out.println(" Duplicates found at element " + arr[i] + " at index " + i);
				break;
			} else
				map.put(arr[i], count);
		}
	}

}
