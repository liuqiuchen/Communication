package com.project;

/***������*/
public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���������ָ���������
		CSuper c1 = new Bus();
		CSuper c2 = new Boat();
		CSuper c3 = new Plane();
		
		c1.name = "������";
		c2.name = "�ִ�";
		c3.name = "�ɻ�";
		
		c1.people = 40;
		c2.people = 200;
		c3.people = 500;
		
		c1.way();
		c2.way();
		c3.way();
	}

}
