package exception.java;

import java.util.*;

public class ExapetionHandling_Try_Catch {
	public static void main(String[] args) {
		// TRY - CATCH in EXCEPTION HANDLING
		int[] marks = {99, 98, 96};
		try {
			System.out.print(marks[5]);
		} catch (Exception exception) {
			// do something after catching
		}
		System.out.println("The name is Ashish");
		
	}
}
