
public class MinElementinRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {2 ,3 ,4 ,5 ,6 ,7 ,8, 9, 10, 1 };
		int low = 0;
		int high = arr.length - 1;
		int min = arr[low];
		while (low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] < min) {
				min = arr[mid];
			}
			else if(arr[mid] > arr[high]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		System.out.println(" Minimum element is: " + min);
	}

}
