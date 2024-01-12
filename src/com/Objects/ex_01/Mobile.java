package com.Objects.ex_01;


class Mobile {
	
	String brand, color;
	int camera;
	
	
	//creating a constructor for the class to bring in the variables
	//constructor initialized----special kind of method called constructor when we call new mobile the constructor is called
	public  Mobile(String x,String c, int cam) {
		
		this.brand=x;
		this.color=c;
		this.camera=cam;
	}

}
