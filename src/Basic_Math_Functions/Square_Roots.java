package Basic_Math_Functions;

public class Square_Roots {
	//time:O(  n^1/2), runtime is the square root of N
	//
	//space O(1)
	public static int floorSqrt (int value){		
		if ( value <0)
			return -1;
		
		if (value==0|| value==1)
			return value;
		
		int root=1;
		int tempRoot=1;
		while ( (tempRoot*tempRoot)<=value){
			root=tempRoot;
			tempRoot++;			
		}		
		return root;
	}
	
	public static int findFloorNthRoot (int value,int n){		
		if ( value <0)
			return -1;
		
		if (value==0|| value==1)
			return value;
		
		int root=1;
		int tempRoot=1;
		while ( (Math.pow(tempRoot, n))  <=value){
			root=tempRoot;
			tempRoot++;			
		}		
		return root;
	}

	public static double findFloorNthRoot (int value,int n, double increment){		
		if ( value <0)
			return -1;
		
		if (value==0|| value==1)
			return value;
		
		double root=1;
		int tempRoot=1;
		while ( (Math.pow(tempRoot, n))  <=value){
			root=tempRoot;
			tempRoot++;			
		}
		
		if ( Math.abs(Math.pow(root, n)-value) <0.000000001){
			System.out.println("here");
			return root;
		}
		
		double tempIncrement=root+increment;
		
		while ( (Math.pow(tempIncrement, n))<=value){
			root=tempIncrement;
			tempIncrement+=increment;			
		}
		
		return root;
	}
	
	
	
	public static double sqrtIncrement(double value, double increment){		
		if ( value <0 || increment >1||increment <0)
			return -1;
		
		if (value==0|| value==1)
			return value;
		
		double root=1;
		int tempRoot=1;
		while ( (tempRoot*tempRoot)<=value){
			root=tempRoot;
			tempRoot++;			
		}
		
		if ( (Math.abs((root*root)-value) <.0000001 ))
				return root;		
		
		double tempIncrement=root+increment;
		
		while ( (tempIncrement*tempIncrement)<value){
			root=tempIncrement;
			tempIncrement+=increment;			
		}
		return root;
	}
}
