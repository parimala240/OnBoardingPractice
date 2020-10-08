package Overriding;

import OverLoading.TestOverload2;

public class TestMainRide1 {

	public static void main(String[] args) {
		TestOverride1 tobj12= new TestOverride1();
		TestOverride2 tobj2= new TestOverride2();
		TestOverride1 tobj1= new TestOverride2();
		
		
		tobj1.jump();
		tobj2.jump();
		
		System.out.println(tobj1.speed);
		/*tobj1.walk();
		System.out.println();
		tobj1.run();
		System.out.println();
		tobj1.jump();
		System.out.println();
		tobj1.fly();
		System.out.println();
		tobj1.cook();
		System.out.println();
		tobj2.jump();
		
		System.out.println();
		tobj12.jump();*/
		

	}

}
