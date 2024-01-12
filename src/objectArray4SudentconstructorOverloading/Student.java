package objectArray4SudentconstructorOverloading;
public class Student {
	private int age;
	private String name;
		//constructor with no parameters--default constructor
		Student(){
		age =13;
		name="no name";
			}
	Student(int age, String name){
		this.age =age;
		this.name=name;
			}
		void setStudentNameandAge(int age, String name){
		this.age =age;
		this.name=name;
			}
	void introduce() {
				System.out.println("Hi My name is "+name+". I'm "+age+" years old");
	}
}
