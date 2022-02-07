package Q7;

import java.util.Arrays;

public class SearchArray {
public  boolean searchArray(int[] arr,int toCheckValue) {
	Arrays.sort(arr);
	for(int k :arr) {
		if(k==toCheckValue) {
			return true;
		}
		
	}
	return false;
}
}
