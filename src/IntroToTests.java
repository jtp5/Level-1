

import static org.junit.Assert.*;

import org.junit.Test;

public class IntroToTests {

	@Test
	public void test() {
		assertEquals(7, add(3,4));
		assertEquals(25, squareNum(5));
		assertEquals("Hi Bob", giveGreeting("Bob"));
		assertEquals("Hi Bob!!!", giveEnthusiasticGreeting("Bob"));
		assertTrue(isWeekend("Saturday"));
		assertFalse(isWeekend("Tuesday"));
		assertEquals("A", getGrade(95));
		assertEquals("B", getGrade(88));
		assertEquals("C", getGrade(72));
		assertEquals("D", getGrade(61));
		assertEquals("F", getGrade(41));
		assertEquals("stuffstuffstuff", repeatString("stuff", 3));
		assertEquals("stuff*-*stuff*-*stuff", repeatStringWithSeperator("stuff", "*-*", 3));
	}
	int add(int x, int y){
		return x+y;
	}
	int squareNum(int x){
		return x*x;
	}
	String giveGreeting(String x){
		return "Hi " + x;
	}
	String giveEnthusiasticGreeting(String x){
		return "Hi " + x + "!!!";
	}
	boolean isWeekend(String day){
		if(day.equals("Saturday") || day.equals("Sunday")){
			return true;
		}
		else{
		return false;
		}
		}
	String getGrade(int x){
		if(x >= 90){
			return "A";
		}
		else if(x >= 80 && x < 90){
			return "B";
		}
		else if(x >= 70 && x < 80){
			return "C";
		}
		else if(x >= 60 && x < 70){
			return "D";
		}
		else{
			return "F";
		}
	}
	String repeatString(String x, int y){
		String z = "";
		for (int i = 0; i < y; i++) {
			z += x;
		}
		return z;
	}
	String repeatStringWithSeperator(String x, String y, int z){
		String t = "";
		for (int i = 0; i < z; i++) {
			if(i <= z-2){
				t += x;
				t += y;
			}
			else{
				t += x;
			}
		}
		return t;
	}
}
