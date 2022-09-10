package UnitTesting.HW21UnitTesting;

public class UnitTesting {
	int[] array;
	int[][] matrix;

	UnitTesting(int[] array) {
		this.array = array;
	}

	UnitTesting(int[][] matrix) {
		this.matrix = matrix;
	}

	public static double findArithmeticMean(int[] nums) {
		double sum = 0;

		for (int num : nums) {
			sum += num;
		}

		return sum / nums.length;
	}

	public static boolean checkingArrayForSquare(int[][] nums) {
		if (nums.length == nums[0].length)
			return true;
		else
			return false;
	}

}
