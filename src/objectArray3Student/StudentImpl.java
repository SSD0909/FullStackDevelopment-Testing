package objectArray3Student;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student();
		s1.rollno=12;
		s1.name="Sara";
		s1.marks=88;
		
		
		Student s2=new Student();
		s2.rollno=17;
		s2.name="Geo";
		s2.marks=69;
		
		Student s3=new Student();
		s1.rollno=10;
		s1.name="Sam";
		s1.marks=99;
		
		
		Student [] students= {s1,s2,s3};
		System.out.println("The list of Students and their marks are below ");
		for (int i=0;i<students.length;i++) {
			
			System.out.println(students[i].name+":"+students[i].marks);
			
		}
		
		
	}

}
