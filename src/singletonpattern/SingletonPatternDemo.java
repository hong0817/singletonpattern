package singletonpattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		//构造函数SingleObject()是私有的，不可见的，不能new出来
		//SingleObject object = new SingleObject();
		
		//获取唯一的可用对象
		SingleObject object = SingleObject.getInstance();
		//调用方法，显示消息
		object.showMessage();
		
	}
	
}
