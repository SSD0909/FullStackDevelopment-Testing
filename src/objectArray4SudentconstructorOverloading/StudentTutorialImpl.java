package objectArray4SudentconstructorOverloading;

public class StudentTutorialImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sam=new Student();
		Student sara=new Student(9,"Sara");
		Student ann=new Student();
		//Student[]students=new Student[3];
		//students[0]=sam;
	    //students[1]=sara;
	    //students[2]=ann;
	Student []students= {sam,sara, ann};
	//if the set method is not called you can assign the array element value to the object as in line 24
	//students[0].setStudentNameandAge(10, "SAM");
	//students[0]=new Student(10, "SAM");
	//if value is not passed in the constructor then default constructor will run and get the default values
	//Array of objects is the array which contains references to teh objects
	students[0].introduce();
	students[1].introduce();
	students[2].setStudentNameandAge(11, "ANN");
	students[2].introduce();

	}

}
