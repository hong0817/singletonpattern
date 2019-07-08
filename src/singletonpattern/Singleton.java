package singletonpattern;

public class Singleton {

//	//1������ʽ���̲߳���ȫ
//	//����һ��˽�е�Singleton����
//	private static Singleton instance;
//	//����˽�еĹ��캯��������Ͳ��ᱻʵ����
//	private Singleton() {}
//	
//	//��ȡΨһ���õĶ���
//	public static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
	
//	//2.����ʽ���̰߳�ȫ
//	//����һ��˽�е�Singleton����
//	private static Singleton instance;
//	//����˽�еĹ��캯��������Ͳ��ᱻʵ����
//	private Singleton() {}
//	
//	//��ȡΨһ���ö���
//	public static synchronized Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		
//		return instance;
//	}

	
//	//3.����ʽ
//	//����һ��˽�е�Singleton����
//	private static Singleton instance;
//	//����˽�еĹ��캯��������Ͳ��ᱻʵ����
//	private Singleton() {}
//	public static Singleton getInstance() {
//		return instance;
//	}
	
	
//	//4.˫����/˫��У����
//	//����һ��˽�е�Singleton����
//	private volatile static Singleton singleton;
//	//����˽�еĹ��캯��������Ͳ��ᱻʵ����
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

	
//	//5.�Ǽ�ʽ/��̬�ڲ���
//	private static class SingletonHolder{
//		private static final Singleton INSTANCE = new Singleton();
//	}
//	private Singleton() {}
//	public static final Singleton getInstance() {
//		return SingletonHolder.INSTANCE;
//	}

	
//	//6.ö��
//	public enum Singleton{
//		INSTANCE;
//		public void whateverMethod() {
//			
//		}
//	}
	
}











