package com.example.tdddemo;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserPreTest {

	@Test
	void 사용자_이름은_2자_이상이어야합니다() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new UserPre("A"));
		Assertions.assertDoesNotThrow(() -> new UserPre("Bob"));
	}

	@Test
	void 상품_할인_금액_계산() {
		// given
		Product product = new Product("노트북", 1000000);
		Discount discount = new Discount(10);

		// when
		int discountedPrice = discount.apply(product);

		// then
		assertThat(discountedPrice).isEqualTo(900000);
	}

	@Test
	void 두_숫자의_합을_반환한다() {
		CalculatorPre calc = new CalculatorPre();
		int result = calc.add(3, 4);
		assertThat(result).isEqualTo(7);
	}

	@Test
	void 두_숫자의_곱을_반환한다() {
		CalculatorPre calc = new CalculatorPre();
		int result = calc.multiply(3, 4);
		assertThat(result).isEqualTo(12);
	}
}