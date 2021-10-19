/**
 * @author Matvii Yermakov
 * @date 19-10-2021
 * @brief lab03
 */

package lab03;

/**
 * lab03
 */

public class lab03 {

	/**
	 * Main
	 * @param args String arguments
	 */
	
	public static void main(String [] args) {
		
		StringBuilder str = new StringBuilder("Hello");
		
		StringPrint.symAlphaOut(str);
	}
	
}

/**
 * StringPrint
 */

class StringPrint{
	
	/**
	 * symAlphaOutput
	 * @param str
	 */
	
	public static void symAlphaOut(StringBuilder str) {
		
		for(int i = 0; i < str.toString().length(); i++)
			System.out.print(str.charAt(i) + "  ");
		
		System.out.print("\n");
		
		for(int i = 0; i < str.toString().length(); i++) {
			
			int j = str.charAt(i);
			
			if(j < 97)
				if(j < 10)
					System.out.print(j - 65 + "  ");
				else
					System.out.print(j - 65 + "  ");
			else
				if(j >= 10)
					System.out.print(j - 96 + " ");
				else
					System.out.print(j - 96 + " ");
		}
		
	}
}
