package Basic_Math_Functions;

public class IsPowerOf {
	
	
	//Run Time O(1)
	public static boolean isPowerOfFour (int num){
		return ( (num >0)&&   ((num& (num-1))==0) && (num-1)%3==0   ) ;
	}
	
	//Run Time O(1)
	public static boolean isPowerOfEight (int num){
		return ( (num >0)&&   ((num& (num-1))==0) && (num-1)%7==0   ) ;
	}

}
