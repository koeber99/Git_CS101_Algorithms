package Searching;

public class BinarySearchAlg {
	
	public static void main (String [] args){
		
		int []arr = { 11,22,30,30,34,44,47,47,47,55,55,55,66,77};
		int targetValue=58;
		
		int index =getLowerBound(arr,targetValue);
		int indexUpper =getUpperBound(arr,targetValue);
		System.out.println("Lower Bound value of "+targetValue+", value= "+arr[index]);
		System.out.println("Upper Bound value of "+targetValue+", value= "+arr[indexUpper]);
		
	}
		
	//Time O(logN) Space(1)
	public static int binarySearch(int [] arr, int x){		
		int low=0;
		int high=arr.length-1;		
		
		while(low<=high){
			int mid=(low+high)>>1;
			if( x> arr[mid])
				low=mid+1;
			else if(x<arr[mid])
				high=mid-1;
			else
				return mid;
		}
		return -1; //Value not found
	}

	//Time O(logN) Space(logN) space due to recursive function
	public static int binarySearchRec(int [] arr,int x, int low,int high){		
		if (low >high)
			return -1;//Value not found
		
		int mid=(low+high)>>1;	
		
		if (x>arr[mid])	
			return binarySearchRec(arr,x, mid+1,high);
		else if (x<arr[mid])			
			return binarySearchRec(arr,x, low,mid-1);
		else
			return mid;	
	}
	
 
public static int closestValueBinarySearch (int [] arr, int target){
	if ( arr==null)
		return -1;
	
	int low =0;
	int high=arr.length-1;
	int mid;
	
	if (target<=arr[low] )  return low;
	if (target>=arr[high]) return high; 
	
	while (low<=high){
		mid = (low+high)/2;
		if ( target>arr[mid]){
			low=mid+1;
		}else if (target<arr[mid]){
			high=mid-1;
		}else{
			return mid;
		}
	}
	
 if (Math.abs(arr[high]-target) <Math.abs(arr[low]-target)  )
	 return high;
 else
	 return low;
}



//Upper bound vs. Lower bound
public static int getLowerBound(int [] arr, int target){
	if ( arr==null)
		return -1;
	
	int low =0;
	int high=arr.length-1;
	int mid;
	
	if (target<=arr[low] )  return low;
	if (target>=arr[high]) return high; 
	
	while (low<=high){
		mid = (low+high)/2;
		if ( target>arr[mid]){
			low=mid+1;
		}else if (target<arr[mid]){
			high=mid-1;
		}else{
			return mid;
		}
	}
	 return high;
}

public static int getUpperBound(int [] arr, int target){
	if ( arr==null)
		return -1;
	
	int low =0;
	int high=arr.length-1;
	int mid;
	
	if (target<arr[low] )  return low;
	if (target>arr[high]) return high; 
	
	while (low<=high){
		mid = (low+high)/2;
		if ( target>arr[mid]){
			low=mid+1;
		}else if (target<arr[mid]){
			high=mid-1;
		}else{
			return mid;
		}
	}
	 return low;
   }
}