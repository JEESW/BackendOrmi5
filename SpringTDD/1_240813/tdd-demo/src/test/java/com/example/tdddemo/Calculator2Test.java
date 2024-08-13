package com.example.tdddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Calculator2Test {

	private Calculator2 calculator;

	@BeforeEach
	void setUp() {
		calculator = new Calculator2();
	}

	@DisplayName("양수 더하기")
	@Test
	void testAddTwoIntegersTwoPositiveNumbers() {
		int result = calculator.addTwoIntegers(3, 4);
		Assertions.assertThat(result).isEqualTo(7);
	}

	@DisplayName("음수 더하기")
	@Test
	void testTwoNegativeNumbers() {
		int result = calculator.addTwoIntegers(-3, -4);
		Assertions.assertThat(result).isEqualTo(-7);
	}

	@DisplayName("양수와 음수 더하기")
	@Test
	void testAddPositiveAndNegativeNumber() {
		int result = calculator.addTwoIntegers(3, -4);
		Assertions.assertThat(result).isEqualTo(-1);
	}

	@DisplayName("0 더하기")
	@Test
	void testAddTwoIntegersZero() {
		int result = calculator.addTwoIntegers(3, 0);
		Assertions.assertThat(result).isEqualTo(3);
	}

	@DisplayName("덧셈 오버 플로우 테스트하기")
	@Test
	void testAddTwoIntegersWithOverflow() {
		assertEquals(Integer.MIN_VALUE, calculator.addTwoIntegers(Integer.MAX_VALUE, 1),
			"Adding 1 to MAX_VALUE should result in MIN_VALUE due to overflow");
	}

	@DisplayName("양수 빼기")
	@Test
	void testSubTwoIntegersTwoPositiveNumbers() {
		int result = calculator.subTwoIntegers(3, 4);
		Assertions.assertThat(result).isEqualTo(-1);
	}

	@DisplayName("음수 빼기")
	@Test
	void testSubTwoNegativeNumbers() {
		int result = calculator.subTwoIntegers(-3, -4);
		Assertions.assertThat(result).isEqualTo(1);
	}

	@DisplayName("양수와 음수 빼기")
	@Test
	void testSubPositiveAndNegativeNumber() {
		int result = calculator.subTwoIntegers(3, -4);
		Assertions.assertThat(result).isEqualTo(7);
	}

	@DisplayName("0 빼기")
	@Test
	void testSubTwoIntegersZero() {
		int result = calculator.subTwoIntegers(3, 0);
		Assertions.assertThat(result).isEqualTo(3);
	}

	@DisplayName("뺄셈 오버 플로우 테스트하기")
	@Test
	void testSubTwoIntegersWithOverflow() {
		assertEquals(Integer.MAX_VALUE, calculator.subTwoIntegers(Integer.MIN_VALUE, 1),
			"Adding 1 to MAX_VALUE should result in MIN_VALUE due to overflow");
	}
	@DisplayName("양수 곱셈")
	@Test
	void testMulTwoIntegersTwoPositiveNumbers() {
		int result = calculator.mulTwoIntegers(3, 4);
		Assertions.assertThat(result).isEqualTo(12);
	}

	@DisplayName("음수 곱셈")
	@Test
	void testMulTwoNegativeNumbers() {
		int result = calculator.mulTwoIntegers(-3, -4);
		Assertions.assertThat(result).isEqualTo(12);
	}

	@DisplayName("양수와 음수 곱셈")
	@Test
	void testMulPositiveAndNegativeNumber() {
		int result = calculator.mulTwoIntegers(3, -4);
		Assertions.assertThat(result).isEqualTo(-12);
	}

	@DisplayName("0 곱셈")
	@Test
	void testMulTwoIntegersZero() {
		int result = calculator.mulTwoIntegers(3, 0);
		Assertions.assertThat(result).isEqualTo(0);
	}

	@DisplayName("곱셈 오버 플로우 테스트하기")
	@Test
	void testMulTwoIntegersWithOverflow() {
		assertEquals(-2, calculator.mulTwoIntegers(Integer.MAX_VALUE, 2),
			"Adding 1 to MAX_VALUE should result in MIN_VALUE due to overflow");
	}

	@DisplayName("양수 나누기")
	@Test
	void testDivTwoIntegersTwoPositiveNumbers() {
		int result = calculator.divTwoIntegers(3, 4);
		Assertions.assertThat(result).isEqualTo(0);
	}

	@DisplayName("음수 나누기")
	@Test
	void testDivTwoNegativeNumbers() {
		int result = calculator.divTwoIntegers(-3, -4);
		Assertions.assertThat(result).isEqualTo(0);
	}

	@DisplayName("양수와 음수 나누기")
	@Test
	void testDivPositiveAndNegativeNumber() {
		int result = calculator.divTwoIntegers(4, -4);
		Assertions.assertThat(result).isEqualTo(-1);
	}

	@DisplayName("0 나누기")
	@Test
	void testDivTwoIntegersZero() {
		int result = calculator.divTwoIntegers(3, 0);
		Assertions.assertThat(result).isEqualTo(Integer.MIN_VALUE);
	}
}