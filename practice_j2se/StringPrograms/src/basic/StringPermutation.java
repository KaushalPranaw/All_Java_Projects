package basic;

public class StringPermutation {

	public static void main(String[] args) {

		String s = "abc";
		permute(s, "");
	}

	private static void permute(String s, String ans) {
		// TODO Auto-generated method stub
		if (s.length() == 0) {
			System.out.println(ans + "");
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String ros = s.substring(0, i) + s.substring(i + 1);
			permute(ros, ans + c);
		}
	}
}
