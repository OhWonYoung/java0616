package interfaceEx;

//인터페이스는 다중상속 가능 
public interface InterfaceEx3Sub extends InterfaceEx3, InterfaceEx4{
	
	//인터페이스간에서는 extends로 다중상속가능
//	public abstract void abstractMethod1();
	void abstractMethod3();
}
