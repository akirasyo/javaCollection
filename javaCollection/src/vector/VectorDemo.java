package vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		String[] heroes = {"iron", "thor", "hawk"};
		Vector<String> avengers = new Vector<String>();
		// 벡터에 배열의 요소를 저장 addElement()
		for (int i = 0; i < heroes.length; i++) { // 배열을 벡터에 옮겨 담음.
			avengers.addElement(heroes[i]);
		}
		// thor 가 존재하는지 체크하는 로직
		String thor = "thor";
		if (avengers.contains(thor)) {
			int idx = avengers.indexOf(thor);
			System.out.println("토르는"+idx+"번째 멤버입니다.");
		} else {
			System.out.println("토르는 없습니다.");
		}
		/*
		 * 첫 번째 멤버(요소 element) 삭제는 removeElementAt(0); 사용함
		 * 벡터의 인덱스도 0부터 시작한다.
		 * 0이 곧 첫 번째 요소임
		 */
		avengers.removeElementAt(0);
		// 벡터는 배열과 다르게 size() 가 전체 요소의 갯수를 리턴함
		for (int i = 0; i < avengers.size(); i++) {
			System.out.println(avengers.elementAt(i));
		}
	}
}
