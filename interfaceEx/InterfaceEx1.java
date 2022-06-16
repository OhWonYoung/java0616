package interfaceEx;

public interface InterfaceEx1 {
	// 인터페이스의 맴버
	// - final 상수
	// - 추상매서드
	// - default 매서드
	// - static 매서드
	
//	int num1; 일반 맴버 사용 불가.
	public static final int MAXINUM =100; // 한번만 초기화, final 필드만 사용가능
	// 추상매서드 -> 반드시 오버라이드로 구현
//	public abstract void abstractMethod();// 추상매서드를 위해 보통 인터페이스를 생성함
	void abstractMethod();// public abstract 생략가능
	
	
	default void defaultMethod() {
		System.out.println("default 매서드");
	}
	public static void staticMethod() {
		System.out.println("static 매서드");
	}
//	public void basicMethod() {} 일반 매서드 X
	
}
