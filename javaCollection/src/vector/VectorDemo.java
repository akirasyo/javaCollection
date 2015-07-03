package vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		String[] heroes = {"iron", "thor", "hawk"};
		Vector<String> avengers = new Vector<String>();
		// ���Ϳ� �迭�� ��Ҹ� ���� addElement()
		for (int i = 0; i < heroes.length; i++) { // �迭�� ���Ϳ� �Ű� ����.
			avengers.addElement(heroes[i]);
		}
		// thor �� �����ϴ��� üũ�ϴ� ����
		String thor = "thor";
		if (avengers.contains(thor)) {
			int idx = avengers.indexOf(thor);
			System.out.println("�丣��"+idx+"��° ����Դϴ�.");
		} else {
			System.out.println("�丣�� �����ϴ�.");
		}
		/*
		 * ù ��° ���(��� element) ������ removeElementAt(0); �����
		 * ������ �ε����� 0���� �����Ѵ�.
		 * 0�� �� ù ��° �����
		 */
		avengers.removeElementAt(0);
		// ���ʹ� �迭�� �ٸ��� size() �� ��ü ����� ������ ������
		for (int i = 0; i < avengers.size(); i++) {
			System.out.println(avengers.elementAt(i));
		}
	}
}
