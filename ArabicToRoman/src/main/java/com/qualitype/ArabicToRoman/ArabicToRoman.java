package com.qualitype.ArabicToRoman;

import java.util.List;

public class ArabicToRoman {

	public String arabicToRoman(int number) {
		if (number <= 0 || number > 4000) {
			throw new IllegalArgumentException(number + " is not in range (0,4000]");
		}

		final List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

		int i = 0;
		final StringBuilder sb = new StringBuilder();

		while (number > 0 && i < romanNumerals.size()) {
			final RomanNumeral currentSymbol = romanNumerals.get(i);
			if (currentSymbol.getValue() <= number) {
				sb.append(currentSymbol.name());
				number -= currentSymbol.getValue();
			} else {
				i++;
			}
		}

		return sb.toString();
	}
}
