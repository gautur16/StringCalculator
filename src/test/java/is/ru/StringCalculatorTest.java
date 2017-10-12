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
}