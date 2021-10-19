/**
 * @author Matvii Ermakov
 * @version 0.1
 * @brief lab1
 */

package lab1;

/** 
 * lab1
 */

public class lab1 {
	
	/**
	 * Main
	 * @param args String[] args
	 */
	
	public static void main(String [] args) {
		
		int even = 0,
			odd = 0,
			ones = 0;
		
		/* student's record book number in decimal is 243 */
		int studRecBookHex = 0xF3;
		String[] studRecBookHexStr = Integer.toBinaryString(studRecBookHex).split("");
		
		/* number phone in decimal is 962830819 */
		int phoneNum = 962830819;
		String[] phoneNumStr = Integer.toBinaryString(phoneNum).split("");
		
		/* 19 in binary */
		int phoneNumBin = 0b10011;
		String[] phoneNumBinStr = Integer.toBinaryString(phoneNumBin).split("");
		
		/* 3819 in octal */
		int phoneNumOctal = 07353;
		String[] phoneNumOctalStr = Integer.toBinaryString(phoneNumOctal).split("");
		
		/* student number in journal */
		int numberInList = 5;
		numberInList--;
		numberInList %= 26;
		numberInList++;
		String[] numberInListStr = Integer.toBinaryString(numberInList).split("");
		
		/* symbol */
		char symbol = (char)(64 + numberInList);
		String[] symbolStr = Integer.toBinaryString(symbol).split("");
		
		/* 2. EVEN OR ODD */
		
		if(studRecBookHex % 2 == 0)
			even++;
		else
			odd++;
		
		if(phoneNum % 2 == 0)
			even++;
		else
			odd++;
		
		if(phoneNumBin % 2 == 0)
			even++;
		else
			odd++;
		
		if(phoneNumOctal % 2 == 0)
			even++;
		else
			odd++;
		
		if(numberInList % 2 == 0)
			even++;
		else
			odd++;
		
		if(symbol % 2 == 0)
			even++;
		else
			odd++;

		/* 3. HOW MANY 1 IN VALUES IN BINARY */
		
		for(String str : studRecBookHexStr) {
			if(str.compareTo("1") == 0)
				ones++;
		}
		
		for(String str : phoneNumStr) {
			if(str.compareTo("1") == 0)
				ones++;
		}
		
		for(String str : phoneNumBinStr) {
			if(str.compareTo("1") == 0)
				ones++;
		}
		
		for(String str : phoneNumOctalStr) {
			if(str.compareTo("1") == 0)
				ones++;
		}
		
		for(String str : numberInListStr) {
			if(str.compareTo("1") == 0)
				ones++;
		}
		
		for(String str : symbolStr) {
			if(str.compareTo("1") == 0)
				ones++;
		}
		
	}
	
}
