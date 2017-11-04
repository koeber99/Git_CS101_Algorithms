package searching;

public class KadaneAlg_MaxSubarray {
//Find Largest Sum Contiguous Subarray	
	
	//Kadane's Algorithm
	//Time O(n) space O(1)
	public int getLargestSumOfSubarray(int []arr ){		
		int largestSum = arr[0];
		int currentMax= arr[0];
		
		for (int i=1; i < arr.length;i++){
			currentMax=Math.max(arr[i], arr[i]+currentMax);
			largestSum=Math.max(largestSum,currentMax);		
		}
		return largestSum; 	
	}
	

	//Brute Force
	//Time O(n^2) space O(1)
	public int getLargestSumBrute (int [] arr){
		int largestSum = Integer.MIN_VALUE;
		int size = arr.length;
		
		for ( int i=0; i < size;i++){
			int sum =0;
			for(int j=i ; j<size;j++){
					sum+=arr[j];		
				if (sum>largestSum){
					largestSum=sum;
				}
			}
		}
		return largestSum;
	}	
}