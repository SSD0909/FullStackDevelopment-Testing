package objectArray8EmployeeMethodOverriding;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object emp= new Employee();
		Object addr=new Address();
		
		// there is a class name Object in java 
		Object []emps= {emp,addr};
		
		for (Object e:emps) {
			
			System.out.println(e);
		}
	}

}
