package objectArray7Ball;

public class GameAppImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ball b1= new Ball();
//Ball b2= new Ball("white");
//b1.displayBall();
//b2.displayBall();

Ball [] list=new Ball[5];//its not creating objects
list[0]= new Ball("Red");
list[1]= new  Ball ("Grey");
list[2]= new Ball("Blue");
list[3]= new Ball("Red");
list[4]= new Ball("Yellow");


for (int i=0; i<5;i++) {
	
	list[i].displayBall();
}
	}

}
