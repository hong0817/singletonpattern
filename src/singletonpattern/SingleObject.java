package singletonpattern;

public class SingleObject {
	
	//����һ��˽�е�SingleObject����
	private static SingleObject instance = new SingleObject();
	
	//����˽�еĹ��캯��������Ͳ��ᱻʵ����
	private SingleObject() {}
	
	//��ȡΨһ���õĶ���
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello love LL");
	}
	
}
