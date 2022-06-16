package org.java.abstractEx;

public class Abstract1Sub extends Abstract1{
//public **abstract** class Abstract1Sub extends Abstract1
//추상 클래스가 되거나 구현을 해야한다.	
	
	//추상클래스만 강제로 무조건 만들어야한다. m1은 안해도 됨
	@Override
	public void abstractMethod1() {
		System.out.println("Abstract1 추상매서드 구현");
	}

}
