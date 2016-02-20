package com.project;
/**
 * 多态练习（继承、重写、父类引用指向子类对象）：
 * 交通工具：公交车（陆地40人）、船（海上200人）、飞机（天空500人）
 * 创建3个的生活当中的交通工具，并且同时查看它们的运输客人方式
 * */

//父类
public class CSuper {
	public String name;
	public int people;
	
	public void way(){
		System.out.println(name + "交通工具运输的方式，承载的人数是：" + people);
	}
}
