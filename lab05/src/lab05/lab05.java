package lab05;

import java.util.*;

public class lab05 {
	
	
}




class Z {
	public static void m() {
		System.out.print(1);
	}
}

new Z() {
	public static void m() {
		System.out.print(2);
	}
}.m(2);