package singletonpattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		//���캯��SingleObject()��˽�еģ����ɼ��ģ�����new����
		//SingleObject object = new SingleObject();
		
		//��ȡΨһ�Ŀ��ö���
		SingleObject object = SingleObject.getInstance();
		//���÷�������ʾ��Ϣ
		object.showMessage();
		
	}
	
}
