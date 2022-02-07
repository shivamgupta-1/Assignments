package Q8;

public class BubbleSort {
	public int[] bubbleSort(int arr[]) {
		int temp;
		for(int j=0; j<arr.length;j++) {
		for(int i=1;i<arr.length-2;i++) {
			if(arr[i]<arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		}
		return arr;
	}
}
