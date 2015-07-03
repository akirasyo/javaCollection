package hashMap;

public class Member {
	private String name; 
	private String addr;
	private String age;
	private String id;
	private String password;
	
	public Member() {
		this("","","","","");
	}
	
	public Member(String id, String password, String name, String age,
			String addr) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
