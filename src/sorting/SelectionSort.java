package sorting;

/*
   Runtime: O(N^2)
   Space:  O(1)
   
   Selection sort is a simple Algorithm, but inefficient.
   Find the smallest element using a linear scan and move it to the front
   (swapping it with the front element). Then, find the second smallest
   and move it, again doing a linear Scan. Continue doing this until all the elements
   are in place


 */

public class SelectionSort {
	
	public int [] sortIntArray(int [] arr){
		if (arr==null|| arr.length==0)
			return arr;
		
		for (int i=0;i<arr.length;i++){
			int min=i;
			
			for (int j=i+1;j<arr.length;j++){
				if (arr[j] <arr[min])
					min=j;
			}
			if ( min!=i){
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
				}
		}	
		return arr;
	}


}