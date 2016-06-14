package com.bunny.palindrome;

/**
 * Class used for the presentation of results
 * 
 * @author Luz Angélica Jiménez Rozo
 *
 */
public class PalindromeResult {
	private Integer palindromeCount;
	private Integer cyclesPerformed;

	public Integer getPalindromeCount() {
		return palindromeCount;
	}

	public void setPalindromeCount(Integer total) {
		this.palindromeCount = total;
	}

	public Integer getCiclesPerformed() {
		return cyclesPerformed;
	}

	public void setCiclesPerformed(Integer cicles) {
		this.cyclesPerformed = cicles;
	}

	public PalindromeResult(Integer total, Integer cicles) {
		super();
		this.palindromeCount = total;
		this.cyclesPerformed = cicles;
	}

}
