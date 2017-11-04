package Basic_Math_Functions;

import java.util.*;

public class Prime_Num_And_Factors {
	public static boolean isPrime(int inputInt){		
		if ( (inputInt<2))
			return false;
		
		if ( (inputInt==2))
			return true;		
		if ( (inputInt % 2==0) )
			return false;
		int square=(int)Math.sqrt(inputInt);
		for(int i=3; i<=square;i+=2){
			if (inputInt%i==0)
				return false;
		     }
		return true;
		}
	
	//Need better method to find next prime Num	
	public static int findNextPrime(int inputInt){	
		int nextPrime= inputInt;
		
		if (nextPrime <2)
			return 2;
		
		if (inputInt==Integer.MAX_VALUE)
			throw new IllegalStateException();
		
		if (nextPrime % 2==0|| isPrime(nextPrime))
			nextPrime++;
			
		while (true){
			if (isPrime(nextPrime))
				return nextPrime;
			
			nextPrime=nextPrime+2;
		}
	}
	
	public static void printPrimeFractors (int input){
		
		if (input <=1){
			System.out.println("-1");
			return ;
		}
				
		Map <Integer,Integer> primeNumMap = new LinkedHashMap <Integer,Integer> ();
		int primeNum=2;
		
		System.out.println("The prime factors of "+input+" are:");
		System.out.print(input+" = ");
		int count;
		while (input>1){
			if (isPrime(input) ){
				count = (primeNumMap.containsKey(input))?   primeNumMap.get(input):0;
				count++;				
				primeNumMap.put(input, count);
				break;
			} else if (input% primeNum==0){
				count = (primeNumMap.containsKey(primeNum))?   primeNumMap.get(primeNum):0;
				count++;				
				primeNumMap.put(primeNum, count);
				input=input/primeNum;
			}else{				
				primeNum=findNextPrime(primeNum);
			}
		}
				
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Integer, Integer> entry: primeNumMap.entrySet()){			
			String temp = (entry.getKey()+ "^"+entry.getValue());
			sb.append(temp);
			sb.append(" x ");			
		}
		
		String str = sb.substring(0, sb.length()-2);
		System.out.println(str);
	}
}
