package interfaceEx;

interface In1{
	void in1();
}
class A {
	
}
class B extends A implements In1{

	@Override
	public void in1() {
		System.out.println("�������̽� �߻�ż��� In1����");
	}
	
}
public class InhertanceEx extends B{

	public static void main(String[] args) {
		
		
	}
}
