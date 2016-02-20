package com.project;

public class Bus extends CSuper {	
	//子类重写父类的way方法
	public void way(){
		System.out.println(name + "交通工具运输的方式是[陆地]，承载的人数是：" + people);
	}
}
