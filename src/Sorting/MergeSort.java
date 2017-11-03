package Sorting;

public class MergeSort {
		
	public void merge(int [] arr, int [] leftArr, int [] rightArr){		
		int leftSize= leftArr.length;
		int rightSize= rightArr.length;
		int i,j,k;
		i=j=k=0;
		
		while ( (i <leftSize) && (j < rightSize) ){
			if (leftArr[i]<= rightArr[j] ){
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;			
			}
			k++;	
		}
		while (i <leftSize){
			arr[k] = leftArr[i];
			i++;
			k++;	
		}
		while (j <rightSize){
			arr[k] = rightArr[j];
			j++;
			k++;	
		}	
	}
	
	public void mergesortArray( int [] arr){
		if ( (arr==null) || ( arr.length<2) )
			return ;
		int size = arr.length;
		int mid = (size)>>1;
		int [] leftArr = new int [mid];
		int [] rightArr = new int [size-mid]; 
		
		for (int i=0; i < mid;i++){
			leftArr[i]=arr[i];
		}
		
		for (int i=mid; i < size;i++){
			rightArr[i-mid]=arr[i];
		}
		mergesortArray(leftArr);
		mergesortArray(rightArr);
		merge(arr,leftArr,rightArr);
	}
	
}
