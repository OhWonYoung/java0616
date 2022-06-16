package org.java.abstractEx;

public class Abstract1Main {

	public static void main(String[] args) {
//		new Abstract1(); 객체를 생성하지 못한다.
		
//		Abstract1Sub a1 = new Abstract1Sub();
		//다형성
		Abstract1 a1 = new Abstract1Sub();
		a1.abstractMethod1();
		
		
	}
}
