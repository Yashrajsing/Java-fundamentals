package precourse;


	import java.util.*;
	import java.lang.*;
	 
	public class evennumbers{
	  
	    static int evenSum(int n)
	    {
	        int curr = 2, sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += curr;
	 
	            curr +=0;
	        }
	        return sum;    
	    }
	    
	    public static void main(String argc[])
	    {
	        int n = 6;
	        System.out.println(evenSum(n));
	    }
	 
	}
	 

