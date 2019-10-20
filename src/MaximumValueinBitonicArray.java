/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumValueinBitonicArray {
   public static int max(int arr[]) {
		int low = 0;
		int high = arr.length - 1;
		int max = -1;
		while (low <= high) {
		
			int mid = (low + high) / 2;
			if ((arr[mid - 1]) < (arr[mid])) {
				if(mid == high) {
					max = arr[mid];
					return max;
				}
				else if (arr[mid] > (arr[mid + 1])) {
					max = arr[mid];
					return max;
				} else {
					low = mid + 1;
				}
			} else {
				high = mid - 1;
			}
		
		
		}
		return max;
   }
	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t= sc.nextInt();
		while(t--!=0)  {
		    	int n = sc.nextInt();
		    	int arr[] = new int[n];
		    	for(int i=0 ; i<n; ++i){
		    	    arr[i] = sc.nextInt();
		    	}
		    
		      System.out.println(max(arr));
		}
	}

}
