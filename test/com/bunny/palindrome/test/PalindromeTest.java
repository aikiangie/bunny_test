package com.bunny.palindrome.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bunny.palindrome.PalindromeResult;
import com.bunny.palindrome.PalindromeUtils;

public class PalindromeTest {
	
	
	@Test
	public void testIsPalindrome() {
		assertEquals(true,PalindromeUtils.isPalindrome("eye"));
		assertEquals(false,PalindromeUtils.isPalindrome("eyes"));
		assertEquals(true,PalindromeUtils.isPalindrome("101"));
		assertEquals(false,PalindromeUtils.isPalindrome("1011"));
		assertEquals(false,PalindromeUtils.isPalindrome("aAaA"));
	}

	@Test
	public void testFind() {
		PalindromeResult result = PalindromeUtils.find(1, 1000000);
		assertEquals(19,result.getPalindromeCount().intValue());
		result = PalindromeUtils.find(1, 10);
		assertEquals(5,result.getPalindromeCount().intValue());
	}

}
