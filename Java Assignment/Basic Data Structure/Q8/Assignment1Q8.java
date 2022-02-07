package Q8;

public class Assignment1Q8 {

	public static void main(String[] args) {
		int arr[]= {5,12,14,6,78,19,1,23,26,35,7,52,86,47
	};
		BubbleSort b=new BubbleSort();
		int arr1[]=b.bubbleSort(arr);
		for(int k=0;k<arr.length;k++) {
		System.out.print(arr1[k]+ " "); 
		}
}
}
