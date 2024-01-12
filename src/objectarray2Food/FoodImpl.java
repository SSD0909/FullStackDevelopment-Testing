package objectarray2Food;

public class FoodImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Food[] refrigerator = new Food[4];
		
		Food food1= new Food("Lo Mein");
		Food food2= new Food("Pizza");
		Food food3= new Food("Fried Chicken");
		Food food4= new Food("Noodles");
		
		//refrigerator[0]=food1;
		//refrigerator[1]=food2;
		//refrigerator[2]=food3;
		//refrigerator[3]=food4;
		
		Food[] refrigerator = {food1,food2,food3,food4};
		
		for (Food ref:refrigerator) {
		System.out.println(ref.name);
		}
		

	}

}
