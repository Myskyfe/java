/**
 * @author Matvii Yermakov
 * @date 20-10-2021
 * @brief lab04
 */

package lab04;

import java.util.Scanner;

import lab04.StringPrint;

/**
 * lab03
 */

public class lab04 {

	/**
	 * Main
	 * @param args String arguments
	 */
	
	public static void main(String [] args) {
		
		String s = "";
		
		boolean debugFlag = false;
		
		while (true)
			if(debugFlag == true)
				debugFlag = ConsoleDebug.debugOn(s, debugFlag);
			else
				debugFlag = ConsoleDebug.debugOff(s, debugFlag);
		
	}
	
}

/**
 * ConsoleDebug extends StringPrint
 */

class ConsoleDebug extends StringPrint{
	
	/**
	 * debugOff
	 * @param s
	 * @param debugFlag
	 */
	
	public static boolean debugOff(String s, boolean debugFlag) {
		
		while (true) {
			
			System.out.print("Enter a command: ");
			
			Scanner sc1 = new Scanner(System.in);
			
			s = sc1.nextLine();
			
			if(s.equals(":start")) {
				
				System.out.print("Enter a string: ");
				
				Scanner sc = new Scanner(System.in);
				
				StringBuilder str = new StringBuilder(sc.nextLine());
				
				symAlphaOut(str, debugFlag);
				
			}else if(s.equals(":help")) {
				
				System.out.println("\nProgram info: \n");
				System.out.println("Author: Matvii Yermakov");
				System.out.println("Brief: that program is for show the number of each letter by alphabet");
				System.out.println("Version: 0.1");
				
				System.out.println("\nCommands info: \n");
				System.out.println(":start - for starting program");
				System.out.println(":help - for instructions");
				System.out.println(":q! - exit from programm");
				System.out.println(":debug - paramentical command");
				System.out.println(":debug parametrs: ");
				System.out.println("\t&on - for debugging programm on");
				System.out.println("\t&off - for debugging programm off\n\n");
				
			}else if(s.equals(":q!")) {
				System.out.println("Program finished");
				System.exit(0);
			}else if(s.equals(":debug &on")) {
				System.out.println("===== Debug On =====");
				return true;
			}
			 else if(s.equals(":debug &off")){
				System.out.println("===== Debug Off =====");
				return false;
			}
			else {
				System.out.println("Wrong command. Try again!");
			}
			
		}
		
	}
	
	/**
	 * debugOn
	 * @param s
	 * @param debugFlag
	 */
	
	public static boolean debugOn(String s, boolean debugFlag) {
		
		System.out.print("\nString s = '" + s + "'\nboolean debugFlag = " + debugFlag + "\n");
		
		while (true) {
			
			System.out.print("Enter a command: ");
			
			Scanner sc1 = new Scanner(System.in);
			
			s = sc1.nextLine();
			
			System.out.print("\nString s = '" + s + "'\nboolean debugFlag = " + debugFlag + "\n");
			System.out.print("Scanner sc1 = " + sc1 + "\n\n");
			
			if(s.equals(":start")) {
				
				System.out.print("Enter a string: ");
				
				Scanner sc = new Scanner(System.in);
				
				StringBuilder str = new StringBuilder(sc.nextLine());
				
				symAlphaOut(str, debugFlag);
				
				System.out.print("\nString s = '" + s + "'\nboolean debugFlag = " + debugFlag + "\n");
				System.out.print("Scanner sc1 = " + sc1 + "\n" + "Scanner sc = " + sc + "\n");
				
			}else if(s.equals(":help")) {
				
				System.out.println("\nProgram info: \n");
				System.out.println("Author: Matvii Yermakov");
				System.out.println("Brief: that program is for show the number of each letter by alphabet");
				System.out.println("Version: 0.1");
				
				System.out.println("\nCommands info: \n");
				System.out.println(":start - for starting program");
				System.out.println(":help - for instructions");
				System.out.println(":q! - exit from programm");
				System.out.println(":debug - paramentical command");
				System.out.println(":debug parametrs: ");
				System.out.println("\t&on - for debugging programm on");
				System.out.println("\t&off - for debugging programm off\n\n");
				
			}else if(s.equals(":q!")) {
				System.out.println("Program finished");
				System.exit(0);
			}else if(s.equals(":debug &on")) {
				System.out.println("===== Debug On =====");
				System.out.print("\nString s = '" + s + "'\nboolean debugFlag = " + "true" + "\n");
				System.out.print("Scanner sc1 = " + sc1 + "\n");
				return true;
			}
			 else if(s.equals(":debug &off")) {
				System.out.println("===== Debug Off =====");
				System.out.print("\nString s = '" + s + "'\nboolean debugFlag = " + "false" + "\n");
				System.out.print("Scanner sc1 = " + sc1 + "\n");
				return false;
			 }
			else {
				System.out.println("Wrong command. Try again!");
			}
			
		}
		
	}
	
}

/**
 * StringPrint
 */

class StringPrint{
	
	/**
	 * symAlphaOutput
	 * @param str
	 * @param debugFlag
	 */
	
	public static void symAlphaOut(StringBuilder str, boolean debugFlag) {
		
		if(debugFlag == true) {
			
			for(int i = 0; i < str.toString().length(); i++) {
				System.out.print(str.charAt(i) + "  ");
			}
			
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
			
			System.out.println("");
			
			for(int i = 0; i < str.toString().length(); i++) {
				int j = str.charAt(i);
				System.out.print("j = " + j + "\t");
			}
			
			System.out.println("");
			
			System.out.print("");
			for(int i = 0; i < str.toString().length(); i++) {
				System.out.print("i = " + i + "\t");
			}
			System.out.print("\n\n");
			
		}
		else {
			
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
		
		System.out.println("");
		
	}
}
