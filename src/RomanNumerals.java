
public class RomanNumerals {
	int counter;
	String[] romanNumArray;
	
	
	public int convertToInteger(String romanNum) {
		int total= 0;
		int number;
		String romanNumUpperCase = romanNum.toUpperCase();
		romanNumArray = romanNumUpperCase.split("");
		 
		
		for(int i = 0; i < romanNumArray.length; i++) {
			number = valueConverter(romanNumArray[i]);
			total += number;
			
		}
//		System.out.println(total);
		return total;
		
	}
//	public int romanNumberCounter(String romanNum) {
//		String temp;
//		do {
//			counter++;
//			temp = romanNum;
//			
//		}while(temp == romanNum);
//		return counter;
//	}
	public int valueConverter(String romanNum) {
		
		switch(romanNum) {
		case "I":
			return 1;
		case "V":
			return 5;
		case "X":
			return 10;
		case "L":
			return 50;
		case "C":
			return 100;
		case "D":
			return 500;
		case "M":
			return 1000;
		default:
			return 0;
		}
		
	}
	public boolean previousNumberComperator(String previousNumber, String currentNumber) {
		if(previousNumber == currentNumber) {
			return true;
		}
		return false;
	}
	
	
}
