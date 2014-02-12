package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import utils.ContestOfPrograming;
import utils.LoopProcess;
import utils.MathUtils;
import constants.PointNumberType;

public class MainC extends HttpServlet {
	
	/** ライン毎のメッセージ */
	private static final String LINE_MESSAGE = "<br><br>It's arunning!<br><br>%s";

	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
			doProcess(out, MathUtils.fizzbuzz(-34));
			List<List<Integer>> list = setListOfCard();
			doProcess(out, new ContestOfPrograming().CardGameArrange(list.get(0), list.get(1)));
			doProcess(out, MathUtils.offRecursion(25));
			doProcess(out, MathUtils.euclid(36, 72));
			doProcess(out, MathUtils.towerOfHanoi(new StringBuffer(), 3, 1, 3));
			doProcess(out, doLoopProcess().toString());
		} finally {
			IOUtils.closeQuietly(out);
		}
	}

	/**
	 * TODO ループプロセス（未実装）
	 * @return
	 */
	private Integer doLoopProcess() {
		for(;;) {
			LoopProcess loopProcess = new LoopProcess(true);
			if (loopProcess.isLoopFlg)
				return loopProcess.loopCnt;
		}
		
	}

	/**
	 * メソッド表示
	 * @param out PrintWriter
	 * @param result String
	 */
	private void doProcess(final PrintWriter out, final String result) {
		out.println(String.format(LINE_MESSAGE, result));
	}
	
	/**
	 * メソッド表示
	 * @param out PrintWriter
	 * @param result Long
	 */
	private void doProcess(final PrintWriter out, final Long result) {
		out.println(String.format(LINE_MESSAGE, result));
	}

	/**FIXME ただデータ入れてるだけなので*/
	private List<List<Integer>> setListOfCard() {
		List<Integer> playerA = new LinkedList<Integer>();
		playerA.add(PointNumberType.Slime.getValue());
		playerA.add(PointNumberType.SpiritOfLight.getValue());
		playerA.add(PointNumberType.VenomTaka.getValue());
		playerA.add(PointNumberType.HeroOfLegend.getValue());
		List<Integer> playerB = new LinkedList<Integer>();
		playerB.add(PointNumberType.Satan.getValue());
		playerB.add(PointNumberType.SnowQueen.getValue());
		playerB.add(PointNumberType.DeadOfHell.getValue());
		playerB.add(PointNumberType.Slime.getValue());
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		list.add(playerA);
		list.add(playerB);
		return list;
	}

}
