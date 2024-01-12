package objectArray1Monkeys;

public class ObjectArrayImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monkey m1=new Monkey();
		Monkey m2=new Monkey();
		Monkey m3=new Monkey();

		Monkey []monkeys= {m1,m2,m3};
		
		for (Monkey m: monkeys) {
			m.sayOhhahhAhh();
		}
	}

}
