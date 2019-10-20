import java.util.HashSet;
import java.util.Iterator;

public class ThreeSumUsingHashing {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 1 };
		int data = 122;
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int sum = data - arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (set.contains(sum - arr[j])) {
					System.out.println(" Target sum is found " + arr[i] + " : " + arr[j] + " : " + (sum - arr[j]));
					break;
				}
				set.add(arr[j]);
			}
		}

		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}

}
