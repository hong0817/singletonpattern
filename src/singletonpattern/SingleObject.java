package singletonpattern;

public class SingleObject {
	
	//创建一个私有的SingleObject对象
	private static SingleObject instance = new SingleObject();
	
	//创建私有的构造函数，该类就不会被实例化
	private SingleObject() {}
	
	//获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello love LL");
	}
	
}
