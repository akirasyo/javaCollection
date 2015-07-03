package thread;

public class AtmUser implements Runnable {
	Atm atm;
	String name;
	
	public AtmUser() {
		this(null, "");
	}
	
	public AtmUser(Atm atm, String name) {
		super(); // 부모의 기능을 가져다 쓰기 위해 부모의 생성자를
				 // 자식의생성자 내부에 호출함
		this.atm = atm;
		this.name = name;
	}

	@Override
	public void run() {
		atm.withdraw(name);
		
	}
	
}
