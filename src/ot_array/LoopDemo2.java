package ot_array;

public class LoopDemo2 {

	public static String[] getMembers() {
		String[] members = { "최진혁", "최유빈", "한이람" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
		for (String e : members) {			
			System.out.println(e + "이 상담을 받았습니다");
		}
	}

}
