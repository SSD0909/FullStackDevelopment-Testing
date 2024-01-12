package objectArray6Studentchangevaluewithset;

public class Student {

	
	private
	String name;
	int age;
	
	public Student() {
		
	}
	
	public void setName(String name) {
		
		this.name=name;
		
	}
	public void setAge(int age) {
	this.age=age;
	
	}
	
	public String toString() {
		
		String output="Name :"+this.name+"\nAge :"+this.age;
		
		return output;
	}
}
