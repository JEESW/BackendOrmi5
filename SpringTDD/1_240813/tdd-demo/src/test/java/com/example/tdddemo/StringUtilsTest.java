package com.example.tdddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringUtilsTest {
//	@Test
//	void testReverse() {
//		assertEquals("olleh", StringUtils.reverse("hello"));
//		assertEquals("", StringUtils.reverse(""));
//		assertNull(StringUtils.reverse(null));
//	}
//
//	@Test
//	void testIsPalindrome() {
//		Assertions.assertThat(StringUtils.isPalindrome("A man a plan a canal Panama")).isEqualTo(true);
//		Assertions.assertThat(StringUtils.isPalindrome("race a car")).isEqualTo(false);
//		assertFalse(StringUtils.isPalindrome("hello"));
//		assertTrue(StringUtils.isPalindrome(""));
//		assertTrue(StringUtils.isPalindrome(null));
//	}

	@ParameterizedTest
	@CsvSource({"hello,olleh", "world,dlrow", "'',''", "a,a"})
	void testReverse(String input, String expected) {
		Assertions.assertThat(expected).isEqualTo(StringUtils.reverse(input));
	}

	@ParameterizedTest
	@CsvSource({"'A man a plan a canal Panama',true",
		"'race a car',false",
		"hello,false",
		"'',true"})
	void testIsPalindrome(String input, boolean expected) {
		Assertions.assertThat(expected).isEqualTo(StringUtils.isPalindrome(input));
	}
}
