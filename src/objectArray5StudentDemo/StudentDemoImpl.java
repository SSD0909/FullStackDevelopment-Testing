package objectArray5StudentDemo;

public class StudentDemoImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDemo []students = new StudentDemo[4];
		
		students[0]=new StudentDemo("harsh",10);
		students[1]=new StudentDemo("Amit",15);
		students[2]=new StudentDemo("Harry",11);
		students[3]=new StudentDemo("Ben",12);
		
		for (int i=0;i<students.length;i++) {
			
			
			System.out.println("The name of the student is "+students[i].name+" and age is "+students[i].age);
			
		}
	}

}
