
public class PowerofFour {

	public static void main(String[] args) {
		int x = 75;
		int result = powerOfFour(x);
		System.out.println(result);
	}

	private static int powerOfFour(int x) {
		while (x > 2) {
			if (x % 4 == 0) {
				x = x / 4;
			}else {
				return 0;
			}
		}
		if (x == 1)
			return 1;
		else
			return 0;
	}

}
