package oops.java;

public class Constructor {
	/*Constructor(){  // Default Constructor...!
		System.out.println("hello world");
	}*/
	String name;
	int age;
	
	Constructor(String name, int age){  // Parameterize Constructor...!
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Constructor c1 = new Constructor("Ashish", 20);
		
	}
}
