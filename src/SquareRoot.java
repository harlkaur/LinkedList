
public class SquareRoot {

	public static void main(String[] args) {
		int x = 5;
		int result = floorSqrt(x);
		System.out.println(result);
	}

	private static int floorSqrt(int x) {
		int low = 0;
		int high = x / 2;
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (mid * mid == x) {
				return mid;
			} else if (mid * mid > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}

}
