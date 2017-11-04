package Basic_Math_Functions;
import java.math.BigInteger;
import java.util.HashMap;


public class FibinacciCalculator {

	
	//Run time O(2^n)   
	public Long calculateFibRec (Long n){
		if( n <= 2)
			return 1l;
		else{
			Long num = calculateFibRec (n-1) + calculateFibRec (n-2); 
			return num;
		}
	}
	
	
	
	//Run time O(n)   Space: O(n)
	public static HashMap <Long,Long> fibHashMapLong = new HashMap <Long,Long>();
	public Long calculateFibDP (Long n){
		
		if (fibHashMapLong.containsKey(n))
			return fibHashMapLong.get(n);
				
		if (n<=2)
			return 1L;
		else{
			Long num = calculateFibRec (n-1) + calculateFibRec (n-2); 
			return num;
		}
	}
	
	
	
	public static HashMap <BigInteger,BigInteger> fibHashMap = new HashMap <BigInteger,BigInteger>();
	
	//Run time O(n)   Space: O(n)
	public BigInteger calculateFibDP (BigInteger n){
		
		if (fibHashMap.containsKey(n))
			return fibHashMap.get(n);
		
		BigInteger low = new BigInteger("3");
		int compareValue=n.compareTo(low);
		if(compareValue==-1)
			return new BigInteger("1");
		else{
			
			BigInteger num = calculateFibDP (  n.subtract(new BigInteger("1")) ).add(calculateFibDP (  n.subtract(new BigInteger("2")))); 
			fibHashMap.put(n, num);
			return num;
		}
	}
	

	
}
