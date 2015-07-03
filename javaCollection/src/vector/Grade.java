package vector;

public class Grade {
	private int kor, eng, math;
	private String hak, name;
	public Grade() {
		this("","",0,0,0);
	}
	
	public Grade(String hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// �л��ο� ����Ǹ鼭 �ٷ� �й�, �̸�, ����, ����, ���� ������ �����
	
	// getter setter �� ����� �� �ʿ���� ���� ����
	
	// ������ ���Ҿ� ��µ�	

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String getTotal() {		
		return String.valueOf(kor + eng + math);
	}
	
	@Override
	public String toString() {
		return "����ǥ [�̸� : " + hak + ", �̸� :" + name + ", ���� :" + kor 
				+ ", ���� :" + eng + ", ,���� :" + math
				+ ", ���� :" + getTotal() + "] \n";
	}
}
