package sorting;

public class QuickSort {
	
	public void quickSort (int [] arr){
		if (arr==null|| arr.length<=1)
			return;

		quickSortHelper (arr, 0, arr.length-1);		
	}
	
	public void quickSortHelper (int [] arr, int left, int right){
		int index =partition(arr,left,right);
		
		if (left < index-1)
			quickSortHelper (arr, left, index-1);
			
		if (right > index)
			quickSortHelper (arr, index, right);	
			
		}
	
	
	public int partition(int [] arr,int left,int right){
		int pivot = arr[(left+right)/2];
		
		while (left <=right){
			while (arr[left]<pivot)left++;
			
			while (arr[right]>pivot)right--;
			
			if (left <=right){				
				swap (arr,left,right);
				left++;
				right--;
			}	
		}	
		return left;		
	}
		
	public void swap (int [] arr,int left, int right){		
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	
	
	public static void printArray(int [] arr){
		if (arr==null || arr.length==0) return;
		for (int i=0;i<arr.length;i++){
			if (i!=arr.length-1)
				System.out.print(arr[i]+", ");
			else
				System.out.print(arr[i]);			
		}
		System.out.println("");
	}
	
	//Sample Test
	public static void main (String [] args){
		int [] arr = {20,2,1,12,15,5,3,100};
		QuickSort qs = new QuickSort();
				
		System.out.println("Before Quick sort");		
		printArray(arr);
		qs.quickSort (arr);
		System.out.println("After Quick sort");
		printArray(arr);		
	}	
}
