package stack;

public class StackImple implements Stack{
	/*
	 * �ڷᱸ���� �ڵ��� ���� �������̽��� �����ϸ鼭
	 * ���� �ݵ�� �޼ҵ尡 �������� ó���� ���� �δ�
	 * �迭�̳� �ڷᱸ���� �ʵ忡 �ξ�� �Ѵ�.
	 */
	private Object[] objects; // �ʵ忡 Object Ÿ���� �迭 ����
	private int pointer;
	
	public StackImple() {
		this(10);
	}	
	
	public StackImple(int capacity) {
		objects = new Object[capacity]; // �迭�� �����ϴ� �� �ּ��� �ణ�� �������� ����
		pointer = 0; // �ε��� �ʱ�ȭ�� 0 ����
	}

	@Override
	public void push(Object obj) {
		if (isFull()) {
			System.out.println("���� �뷮�� �ʰ��Ͽ����ϴ�."); 
			// ������ �� -> �� �� �ƴ϶� �� -> ������ ���̴� ����
			return;
		} else {
			objects[pointer++] = obj;
		}
		
	}

	@Override
	public Object pop() {
		if (isEmpty()) {
			System.out.println("���ÿ� ����� ��ü�� �����ϴ�.");
			return null;
		} else {
			Object obj = objects[--pointer];
			objects[pointer] = null;
			return obj;
		}
		
	}

	@Override
	public boolean isEmpty() {
	
		return pointer==0;
	}

	@Override
	public boolean isFull() {
		
		return pointer == objects.length; 
		// objects �� �迭�̹Ƿ� index ũ�Ⱚ�� ��Ÿ���� length ���
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pointer;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
