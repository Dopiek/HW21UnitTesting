package UnitTesting.HW21UnitTesting;

import org.junit.jupiter.api.*;

public class UnitTestingTest {

	@Test
	public void shouldFindArithmeticMean() {
		int[] nums = { 2, 3, 4 };

		double arithmeticMean = new UnitTesting(nums).findArithmeticMean(nums);
		Assertions.assertEquals(3, arithmeticMean);

	}

	@Test
	public void shouldCheckingArrayForSquare() {
		int[][] matrix = { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 } };
		
		boolean result = new UnitTesting(matrix).checkingArrayForSquare(matrix);
		Assertions.assertEquals(true, result);
	}
}
