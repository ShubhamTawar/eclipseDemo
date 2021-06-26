package epam.junitpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckForEvenTest {
	
	@Test
	void testEven() {
		CheckEven obj = new CheckEven();
		boolean result = obj.check(2);
		assertEquals(true, result);
	}

}
