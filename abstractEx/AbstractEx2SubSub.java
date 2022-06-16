package org.java.abstractEx;

public class AbstractEx2SubSub extends AbstractEx2Sub {

	@Override
	public void abstractMethod2(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	@Override
	public void abstractMethod1() {
		System.out.println("추상매서드 구현 AbstractMethod1 구현");
	}
	public void basic() {
		System.out.println("기본매서드");
	}
	
}
