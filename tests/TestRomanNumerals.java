import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void testConvertRomanNumberOne() {
		int number;
		RomanNumerals romanNumber = new RomanNumerals();
		number = romanNumber.convertToInteger("I");
		assertEquals("I roman number must return 1", 1, number);
		
	}

	@Test
	public void testValueConverter() {
		int number1;
		int number5;
		int number10;
		RomanNumerals romanNumber = new RomanNumerals();
		number1 = romanNumber.valueConverter("I");
		number5 = romanNumber.valueConverter("V");
		number10 = romanNumber.valueConverter("X");
		assertEquals("III roman number must return 1",1,number1);
		assertEquals("III roman number must return 5",5,number5);
		assertEquals("III roman number must return 10",10,number10);
		
	}
	@Test
	public void testpreviousNumberCounter() {
		String number1 = "I";
		String number2 = "I";
		
		boolean comparison;
		RomanNumerals romanNumber = new RomanNumerals();
		comparison = romanNumber.previousNumberComperator(number1, number2);
		assertTrue("Previous number is same as curren number",comparison );
	}
	@Test
	public void testConvertToInteger() {
		int number;
		int number2;
		RomanNumerals romanNumber = new RomanNumerals();
		number = romanNumber.convertToInteger("III");
		number2 = romanNumber.convertToInteger("VI");
		System.out.println(number);
		assertEquals("III roman number must return 3",3,number);
		assertEquals("VI roman number must return 6",6,number2);
	}

}
