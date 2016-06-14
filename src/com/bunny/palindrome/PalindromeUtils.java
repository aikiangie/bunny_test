package com.bunny.palindrome;

/**
 * Class used for palindrome functions
 * 
 * @author Luz Angélica Jiménez Rozo
 *
 */
public class PalindromeUtils {
	
	/**
	 * Function that determines whether a string is palindrome
	 * @param x - String to evaluate
	 * @return true or false
	 */
	public static boolean isPalindrome(String x){
		String xReverse =  new StringBuffer(x).reverse().toString();
		boolean result = x.equals(xReverse);
		return result;
	}	
	
	/**
	 * Function that determines the amount of palindromes between two integers , including Boolean form
	 * @param x - initial number
	 * @param y - final number
	 * @return PalindromeResult: total palindromes found and cicles count
	 */
	public static PalindromeResult find(int x, int y) {
		
		int cont = 0;
		int cicles = 0;
		for(int i=x;i<=y;i++){
			StringBuilder sb = new StringBuilder();
			sb.append(i);
			cicles++;
			if (isPalindrome(sb.toString()) && isPalindrome(Integer.toBinaryString(i))){
				cont++;
			}
		}
		
		return new PalindromeResult(cont,cicles);
	}
}
