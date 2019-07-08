package singletonpattern;

public class Singleton {

//	//1、懒汉式，线程不安全
//	//创建一个私有的Singleton对象
//	private static Singleton instance;
//	//创建私有的构造函数，该类就不会被实例化
//	private Singleton() {}
//	
//	//获取唯一可用的对象
//	public static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
	
//	//2.懒汉式，线程安全
//	//创建一个私有的Singleton对象
//	private static Singleton instance;
//	//创建私有的构造函数，该类就不会被实例化
//	private Singleton() {}
//	
//	//获取唯一可用对象
//	public static synchronized Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		
//		return instance;
//	}

	
//	//3.饿汉式
//	//创建一个私有的Singleton对象
//	private static Singleton instance;
//	//创建私有的构造函数，该类就不会被实例化
//	private Singleton() {}
//	public static Singleton getInstance() {
//		return instance;
//	}
	
	
//	//4.双检锁/双重校验锁
//	//创建一个私有的Singleton对象
//	private volatile static Singleton singleton;
//	//创建私有的构造函数，该类就不会被实例化
//	private Singleton() {}
//	public static Singleton getSingleton() {
//		if(singleton == null) {
//			synchronized(Singleton.class) {
//				if(singleton == null) {
//					singleton = new Singleton();
//				}
//			}
//		}
//		return singleton;
//	}

	
//	//5.登记式/静态内部类
//	private static class SingletonHolder{
//		private static final Singleton INSTANCE = new Singleton();
//	}
//	private Singleton() {}
//	public static final Singleton getInstance() {
//		return SingletonHolder.INSTANCE;
//	}

	
//	//6.枚举
//	public enum Singleton{
//		INSTANCE;
//		public void whateverMethod() {
//			
//		}
//	}
	
}











