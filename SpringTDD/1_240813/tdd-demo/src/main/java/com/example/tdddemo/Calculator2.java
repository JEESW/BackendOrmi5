package com.example.tdddemo;

public class Calculator2 {

	public int addTwoIntegers(int a, int b) {
		if (willAdditionOverflow(a, b)) {
			if (a > 0) {
				return Integer.MIN_VALUE;
			} else {
				return Integer.MAX_VALUE;
			}
		}
		return a + b;
	}

	private boolean willAdditionOverflow(int a, int b) {
		if (b > 0 && a > Integer.MAX_VALUE - b) {
			return true;
		}
		if (b < 0 && a < Integer.MIN_VALUE - b) {
			return true;
		}
		return false;
	}

	public int subTwoIntegers(int a, int b) {
		if (willSubtractionOverflow(a, b) == 1) {
			return Integer.MAX_VALUE;
		} else if (willSubtractionOverflow(a, b) == -1) {
			return Integer.MIN_VALUE;
		}

		return a - b;
	}

	private int willSubtractionOverflow(int a, int b) {
		if (a - b > Integer.MAX_VALUE) {
			return 1;
		}
		if (a - b < Integer.MIN_VALUE) {
			return -1;
		}
		return 0;
	}

	public int mulTwoIntegers(int a, int b) {
		if (willMultiplyOverflow(a, b) == -1) {
			return Integer.MIN_VALUE;
		} else if (willMultiplyOverflow(a, b) == 1) {
			return Integer.MAX_VALUE;
		}

		return a * b;
	}

	private int willMultiplyOverflow(int a, int b) {
		if (a * b > Integer.MAX_VALUE) {
			return 1;
		}
		if (a * b < Integer.MIN_VALUE) {
			return -1;
		}
		return 0;
	}

	public int divTwoIntegers(int a, int b) {
		if (b == 0)	return Integer.MIN_VALUE;
		if (willDivisionOverflow(a, b) == -1) {
			return Integer.MIN_VALUE;
		} else if (willDivisionOverflow(a, b) == 1) {
			return Integer.MAX_VALUE;
		}

		return a / b;
	}

	private int willDivisionOverflow(int a, int b) {
		if (a / b > Integer.MAX_VALUE) {
			return 1;
		}
		if (a / b < Integer.MIN_VALUE) {
			return -1;
		}
		return 0;
	}
}