package Basic_Math_Functions;

public class IsPowerOf {	
	//Run Time O(1) :  isPowerOfTwo or Zero
	public static boolean isPowerOfTwo (int num){
		return ( ((num& (num-1))==0)  ) ;
	}
	
	//Run Time O(1)  :  is number great then zero and Power Of Four
	public static boolean isPowerOfFour (int num){
		return ( (num >0)&&   ((num& (num-1))==0) && (num-1)%3==0   ) ;
	}
	
	//Run Time O(1) :is number great then zero and a Power Of Eight
	public static boolean isPowerOfEight (int num){
		return ( (num >0)&&   ((num& (num-1))==0) && (num-1)%7==0   ) ;
	}
}