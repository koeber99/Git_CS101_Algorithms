package Sorting;

/*

Worst case: O(n^2) 
Best case: O(n)
Space: O(1)

 Advantages
 
		1) Insertion sort is particularly useful when sorting a small # of items
		2) When array is already sorted or almost sorted, the algorithm performs
		   on o(n) time. This is because time complexity of insertion sort depends on two things: 
		  						A) # of Comparisons
		  						B) # of Swaps
		 Stable sort - doesn't change relative order of elements with equal keys
		 In-place      Only requires a constant amount of O(1) memory
		 
		 More efficient in practice then selection sort and Bubble sort
		  						
 Disadvantages		 
	Time complexity:O(n^2)   

		
		*/
public class InsertionSort {
	public void insertionSort(int [] arr){
		if (  (arr==null)  || (arr.length <=1))
			return ;
		
		for (int i=1; i < arr.length; i++){
			int key=arr[i];
			int k=i-1;
			
			while ( (k>=0) && (arr[k]>key)   ){
				arr[k+1]=arr[k];
				k--;
			}
			arr[k+1]=key;
		}
	}
}
