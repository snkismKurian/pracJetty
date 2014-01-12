package utils;

import java.util.List;

import constants.PointNumberType;

public class ContestOfPrograming {
	
	/** エラーメッセージ */
	private String errorMessage;

	public static int pointA = 0;
	public static int pointB = 0;

	public ContestOfPrograming() {
		pointA = 0;
		pointB = 0;
	}
	
	@Override 
	public String toString() {
		return String.format("error : %s", getErrorMessage());
	}
	
	/**
	 * カードゲームのアレンジ
	 * @param playerA 
	 * @param playerB
	 * @return
	 */
	public String CardGameArrange(final List<Integer> playerA, final List<Integer> playerB) {
		if (playerA.isEmpty() || playerB.isEmpty())
			return doError("null");
		if(isOutOfNumberRange(playerA) || isOutOfNumberRange(playerB))
			return doError("range");
		if (isDuplicate(playerA) || isDuplicate(playerB))
			return doError("duplicate");
		
		int i = 0;
		for (int cardA : playerA)
		{
			final int cardB = playerB.get(i); i++;
			if (cardA >= cardB)
				pointA += compareToBigOrSmallOrEquals(cardA, cardB);
			else if (cardA <= cardB)
				pointB += compareToBigOrSmallOrEquals(cardA, cardB);
		}
		return String.format(
				"1Player : %d <br> 2Player : %d <br> Winner : %s", pointA, pointB
				, pointA > pointB ? "pointA" : pointA < pointB ? "pointB" : "draw");
	}

	/**
	 * エラー時の処理
	 * @param message
	 * @return
	 */
	private String doError(final String message) {
		setErrorMessage(message);
		return toString();
	}

	/**
	 * <b>カードAとカードBの比較
	 * <table border=1 style="text-align:center">
	 * <tr><td>不等号</td><td>@return</td>
	 * <tr><td>==</td><td>cardA</td></tr>
	 * <tr><td>< or ></td><td>cardA + cardB</td></tr>
	 * </table>
	 * @param cardA
	 * @param cardB
	 */
	private int compareToBigOrSmallOrEquals(final int cardA, final int cardB) {
		return cardA == cardB ? cardA : cardA + cardB;
	}

	/**
	 * 範囲外エラー
	 * @param player
	 * @return
	 */
	private boolean isOutOfNumberRange(final List<Integer> player) {
		for (int card : player) {
			if (card < PointNumberType.Slime.getValue()
					|| card > PointNumberType.God.getValue())
				return true;
		}
		return false;
	}
	
	/**
	 * 重複エラー
	 * @param player
	 * @return
	 */
	private boolean isDuplicate(final List<Integer> player) {
		int i = 0;
		for (int card : player) {
			if (player.indexOf(card) != i)
				return true;
			i++;
		}
		return false;
	}

	
	/**
	 * アクセサ
	 */
	
	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
