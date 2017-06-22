package Assignment2;

/*
 In this program I've create a class and initialize two objects of that class the print

the hash code of both.
*/
public class HashCode { // Main Class.

	public static void main(String[] args) { // Main Method.

		
		Integer int1=new Integer("100"); // Object one as Integer.
		String str=new String("Hello"); // Object two as String.
		
		//calling hash code and converting in hash code.
		
		System.out.println(int1.hashCode());// console window for object 1.
		System.out.println(str.hashCode()); //console window for object 2.

	}

	
		
	}


