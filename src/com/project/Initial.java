package com.project;

/**测试类**/
public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//父类的引用指向子类对象
		CSuper c1 = new Bus();
		CSuper c2 = new Boat();
		CSuper c3 = new Plane();
		
		c1.name = "公交车";
		c2.name = "轮船";
		c3.name = "飞机";
		
		c1.people = 40;
		c2.people = 200;
		c3.people = 500;
		
		c1.way();
		c2.way();
		c3.way();
	}

}
