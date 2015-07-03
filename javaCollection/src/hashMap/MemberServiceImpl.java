package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService {

	Map<String, Object> map = new HashMap<String, Object>();
	Member member = new Member();

	@Override
	public void join(String name, String addr, int age, String id,
			String password) {
		member.setName(name);
		member.setAddr(addr);
		member.setAge(String.valueOf(age));
		member.setId(id);
		member.setPassword(password);
		// JSP 일 경우
		/*
		 * map.put(member.getId(), new Member(member.getId(),
		 * member.getPassword(), member.getName(),
		 * member.getAge(),member.getAddr()));
		 */
		map.put("id", member.getId());
		map.put("password", member.getPassword());
		map.put("name", member.getName());
		map.put("age", member.getAge());
		map.put("addr", member.getAddr());

	}

	@Override
	public String login(String id, String password) {
		String msg = "";
		// if 문을 true 로 주고 어떤 상황이면 true 를 반환할지를 고민
		if (map.get("id").equals(id) && map.get("Password").equals(password)) { 
			msg = "환영합니다."+member.getName()+" 님";
		} else if (map.get("id").equals(id) && !map.get("Password").equals(password)) {
			msg = "비밀번호가 잘못 되었습니다. 다시 입력하세요.";
		} else {
			msg = "입력하신 ID가 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요.";
		}
		return msg;
	}

	@Override
	public void join() {
		// TODO Auto-generated method stub

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

}
