package oops.java;

public class Class_Objects {
	
	String name;
	int age;
	String city;
	
	public Class_Objects(String name, int age, String  city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Student name is " + this.getName() + ", age is " + this.getAge() + " and city is " + this.getCity());
	}
	
	public static void main(String[] args) {
		Class_Objects Ashish = new Class_Objects("Ashish", 25, "Gandhinagar");
		
		System.out.println(Ashish.toString());
	}
}
