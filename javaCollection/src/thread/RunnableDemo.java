package thread;
 /*run() ȣ���� Ŭ���� ������ �޼ҵ��� start() �̴�.
 �̰��� ȣ���ϴ� ������ �����尡 �۾��� �����ϴ� ��
 �ʿ��� ȣ�⽺�� �� ������ ����
 run() �� ȣ���ؼ� ������ ȣ�⽺�ÿ�
 run() �� �����Ų��.
 ��, �����带 ������ Ŭ������ start() �� ���� �����ؾ� �Ѵ�.*/
public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new RunnableImpl();
		Thread thr = new Thread(r); // r �� �Ķ���ͷ� �������� ����
		thr.start();
		// SCJP ���� �� ������ ����
	}
}
