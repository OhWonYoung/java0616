package interfaceEx;

public interface InterfaceEx1 {
	// �������̽��� �ɹ�
	// - final ���
	// - �߻�ż���
	// - default �ż���
	// - static �ż���
	
//	int num1; �Ϲ� �ɹ� ��� �Ұ�.
	public static final int MAXINUM =100; // �ѹ��� �ʱ�ȭ, final �ʵ常 ��밡��
	// �߻�ż��� -> �ݵ�� �������̵�� ����
//	public abstract void abstractMethod();// �߻�ż��带 ���� ���� �������̽��� ������
	void abstractMethod();// public abstract ��������
	
	
	default void defaultMethod() {
		System.out.println("default �ż���");
	}
	public static void staticMethod() {
		System.out.println("static �ż���");
	}
//	public void basicMethod() {} �Ϲ� �ż��� X
	
}
