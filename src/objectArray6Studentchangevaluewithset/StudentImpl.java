package objectArray6Studentchangevaluewithset;

public class StudentImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student[]students=new Student[3];

for(int i=0; i<3;i++) {
	
	students[i]=new Student();
	students[i].setAge(10);
	students[i].setName("Manna");
}

students[2].setAge(11);
students[2].setName("Bianca");

for (int j=0; j<3;j++)
{
	System.out.println(students[j].toString());

}
}

}
