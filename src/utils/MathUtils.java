package utils;

public class MathUtils {
	
	/**
	 * FizzBuzz
	 * @param number 任意の数'|n|>0'まで計算
	 * @return 数字＋(fizz)(buzz)
	 */
	public static String fizzbuzz(int number) {
		if (Integer.signum(number) == 0)
			return "blank";
		
		StringBuffer phrase = new StringBuffer();
		if (Integer.signum(number) < 0)
			number = (int) Math.sqrt(Math.pow(number, 2));
		for (int i = 1; i <= number; i++) {
			phrase.append(i);
			if (i % 3 == 0 || i % 5 == 0) {
				if (i % 3 == 0)
					phrase.append("fizz");
				if (i % 5 == 0)
					phrase.append("buzz");
			}
			phrase.append("<br>");
		}
		return phrase.toString();
	}

}
