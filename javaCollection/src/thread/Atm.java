package thread;

public class Atm {
	public synchronized void withdraw(String name) { 
		/*synchronized Ű����� ����ȭ Ű����� ��Ƽ �����尡 
		�񵿱� ������ �����ϴ� �� �����ŷ� ���� �ݵ�� ����ȭ
		�ؾ��ϴ� ������ ������ ���� �� Ű���带 �޼ҵ� ����������
		�ڿ� ���δ�.*/
		System.out.println(name+" ���� ���� �����û��");
		for (int i = 0; i < 100000000; i++) {
			if (i==10000) {
				System.out.println(name+"���� ����..��");
			}
		}
		System.out.println(name+"���� �����ؼ� ����");
	}
}
