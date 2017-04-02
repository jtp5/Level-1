import static org.junit.Assert.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.junit.Test;

public class TestString {

	@Test
	public void test1() {
		assertEquals("wpaafnfclaekses", weaveStrings("waffles", "pancakes"));
	}
	@Test
	public void test2(){
		assertEquals("Mntvrst" , removeVowels("MountEverest"));
	}
	@Test
	public void test3(){
		assertEquals("toboRtoboR", reverseRepeat("Robot"));
	}

	String weaveStrings(String x, String y) {
		String answer = "";
		for (int i = 0; i < x.length(); i++) {
			if (i <= x.length()) {
				answer += x.charAt(i);
			}
			if (i <= y.length()) {
				answer += y.charAt(i);
			}
		}
		if (y.length() > x.length()) {
			answer += y.substring(x.length(), y.length());
		}
		System.out.println(answer);
		return answer;
	}

	String removeVowels(String x) {
		String answer = "";
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) != 'a' && x.charAt(i) != 'e' && x.charAt(i) != 'i' && x.charAt(i) != 'o'
					&& x.charAt(i) != 'u' && x.charAt(i) != 'A' && x.charAt(i) != 'E' && x.charAt(i) != 'I' && x.charAt(i) != 'O'
					&& x.charAt(i) != 'U') {
				answer += x.charAt(i);
			}
		}
		System.out.println(answer);
		return answer;
	}
	String reverseRepeat(String x){
		String answer = "";
		for (int i = x.length() - 1; i >= 0; i--) {
			answer += x.charAt(i);
		}
		answer += answer;
		System.out.println(answer);
		return answer;
	}

}
