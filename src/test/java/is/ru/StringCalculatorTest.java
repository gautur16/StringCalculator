package	is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {
	@Test
	public void shouldReturnZeroOnEmpty() {
		assertEquals(0, StringCalculator.Add(""));
	}

	public void shouldReturnOneNumber() {
		assertEquals(1, StringCalculator.Add("1"));
	}

	public void shouldReturnSumOnTwoNumbers() {
		assertEquals(3, StringCalculator.Add("1,2"));
	}

	public void shouldReturnSumOfMultipleNumbers() {
		assertEquals(6, StringCalculator.Add("1,2,3"));
	}

	public void shouldReplaceNewLineWithComma() {
		assertEquals(6, StringCalculator.Add("1\n2,3"));
	}
	
	public void shouldThrowExceptionIfNegativeNumbersAreUsed() {
		StringCalculator.Add("-1,-2,3,4,-5");
	}
	
	public void shouldJustReturnNumbersLessThan1000() {
		assertEquals(2, StringCalculator.Add("2,1001"));
	}
}