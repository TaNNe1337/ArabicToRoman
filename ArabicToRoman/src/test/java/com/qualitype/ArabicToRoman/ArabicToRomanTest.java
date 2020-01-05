package com.qualitype.ArabicToRoman;

import org.junit.Assert;
import org.junit.Test;

public class ArabicToRomanTest {
	ArabicToRoman classUnderTest = new ArabicToRoman();

	@Test
	public void testOne() {
		Assert.assertEquals(classUnderTest.arabicToRoman(1), "I");
	}

	@Test
	public void testFour() {
		Assert.assertEquals(classUnderTest.arabicToRoman(4), "IV");
	}

	@Test
	public void testFive() {
		Assert.assertEquals(classUnderTest.arabicToRoman(5), "V");
	}

	@Test
	public void testNine() {
		Assert.assertEquals(classUnderTest.arabicToRoman(9), "IX");
	}

	@Test
	public void testFourty() {
		Assert.assertEquals(classUnderTest.arabicToRoman(40), "XL");
	}

	// C(100), CD(400), D(500), CM(900), M(1000);
	@Test
	public void testFifty() {
		Assert.assertEquals(classUnderTest.arabicToRoman(50), "L");
	}

	@Test
	public void testHundred() {
		Assert.assertEquals(classUnderTest.arabicToRoman(100), "C");
	}

	@Test
	public void testFourhundred() {
		Assert.assertEquals(classUnderTest.arabicToRoman(400), "CD");
	}

	@Test
	public void testFivehundred() {
		Assert.assertEquals(classUnderTest.arabicToRoman(500), "D");
	}

	@Test
	public void testNinehundred() {
		Assert.assertEquals(classUnderTest.arabicToRoman(900), "CM");
	}

	@Test
	public void testThousend() {
		Assert.assertEquals(classUnderTest.arabicToRoman(1000), "M");
	}

	@Test
	public void test2000() {
		Assert.assertEquals(classUnderTest.arabicToRoman(2000), "MM");
	}

	@Test
	public void test880() {
		Assert.assertEquals(classUnderTest.arabicToRoman(880), "DCCCLXXX");
	}

	@Test
	public void test8() {
		Assert.assertEquals(classUnderTest.arabicToRoman(8), "VIII");
	}
}
