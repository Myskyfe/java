/**
 * @author Matvii Yermakov
 * @date 17-oct-2021
 * @brief lab02
 */

package lab02;
import java.util.*;

/**
 * lab02
 */

public class lab02 {

	/**
	 * Main
	 * @param args String[] 
	 */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			boolean isPrime = true;
			Random rand = new Random();
			int n = rand.nextInt() % 10;
			
			if(n > 1) {
				if(n <= 1) isPrime = false;
			    if(n <= 3) isPrime = true;
	
			    // This is checked so that we can skip
			    // middle five numbers in below loop
			    if(n % 2 == 0 || n % 3 == 0) isPrime = false;
	
			    for(int j = 5; j * j <= n; j = j + 6)
			        if(n % j == 0 || n % (j + 2) == 0) { 
			        	isPrime = false;
			        }
			}else {
				isPrime = false;
			}
			
		    if(isPrime) {
		    	System.out.println("Number " + n + " is: prime");
		    }else {
		    	System.out.println("Number " + n + " is: not prime");
		    }
		    
			
		
		}

	}

}
