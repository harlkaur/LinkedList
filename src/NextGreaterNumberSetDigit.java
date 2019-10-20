import java.util.Arrays;

public class NextGreaterNumberSetDigit {

	public static void main(String[] args) {
//     	int no = 34976; /// 36479 // working for this input
   	int no = 26963;// 1243 // working for this input
//		int no = 4312; // 4321 // working
//		int no = 534112; // 534121 // working
//		int no = 534976; // working //536479
//	int no = 218765; // 251678 // working
//	int no = 143; // working //314
//    int no = 431; // working

		String str = String.valueOf(no);
		char[] arr = new char[10];
		int k = 0;
		int count = 0;
		int i = str.length() - 1;
		int j = str.length() - 1;
		boolean flag = false;
		for(int c=0;c<str.length();c++) {
			for (i = str.length() - 1; i > 0; i--) {
				j = i-c;
				if ((c < i) && (str.charAt(i - 1-c) < str.charAt(j))) {
					count++;
					char x = str.charAt(j);
					char y = str.charAt(i - 1-c);
					char temp = x;
					x = y;
					y = temp;
					arr[k++] = x;
					str = charRemoveAt(str, i - 1-c);
					flag = true;
					break;
				} else if((c < i)) {
					arr[k++] = str.charAt(i - 1-c);
					str = charRemoveAt(str, i - 1-c);
				}
				
			}
			if(flag)
				break;
			str = String.valueOf(no);
			for(int ii=0;ii<k;ii++) {
				arr[ii] = ' ';
			}
			k=0;
				
		}
		char temp[] = new char[k];
		for(int ii=0; ii<k ; ++ii) {
			temp[ii] = arr[ii];
		}
		Arrays.sort(temp);
		if (count <= 0)
			System.out.print("not possible");
		else {
			for (int ii = 0; ii < str.length() ; ii++) {
				System.out.print(str.charAt(ii));
			}
			for (int ii = 0; ii < k ; ii++) {
				System.out.print(temp[ii]);

			}
		}
	}

	private static String charRemoveAt(String str, int i) {
		return str.substring(0, i) + str.substring(i + 1);
	}

}
