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
	
	/**
	 * 階乗<br>
	 * 再起処理なし
	 * @param number
	 * @return 解答
	 */
	public static long offRecursion(int number) {
		long answer = 1;
		while (number > 1) {
			answer = answer * number;
			number--;
		}
		return answer;
	}
	
	/**
	 * 階乗<br>
	 * 再起処理あり
	 * @param number
	 * @return 解答
	 */
	public static long onRecursion(int number) {
		return number > 0 ? number * onRecursion(number - 1) : 1;
	}
	
	/**
	 * xとyの最大公約数
	 * @param x
	 * @param y
	 * @return
	 */
	public static int euclid(int x, int y) {
		return y == 0 ? x : euclid(y, x % y);
	}

//	public static String b_ainF_ck(String chr, PrintWriter out) {
//		int p = 0;
//		int[] m = new int[]{};
//		int i = 0;
//		String result = null;
//		while (i == chr.length()) {
//			int pc = 0;
//			switch (chr.charAt(i)) {
//			case '>' : p++; break;
//			case '<' : if(p>0)p--; break;
//			case '+' : m[p]++; break;
//			case '-' : m[p]--; break;
//			case '.' : out.print(result); break;
//			case '[' : if (m[p] == 0) {int tmp = 0;
//				for (int j = pc; j < chr.length(); i++) {
//					if(chr.charAt(j) == '[')tmp++;
//					if(chr.charAt(j) == 0)break;tmp--;};break;}
//			case ']' : ; break;
//			}
//		i++;
//		}
//		return null;
//	}
}
