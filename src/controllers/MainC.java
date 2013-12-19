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
import utils.MathUtils;
import constants.PointNumberType;

public class MainC extends HttpServlet {
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
			
			out.println("It's running!<br><br>");
			out.println(MathUtils.fizzbuzz(-34));
			
			out.println("<br><br>It's running!<br><br>");
			List<List<Integer>> list = setListOfCard();
			out.println(new ContestOfPrograming().CardGameArrange(list.get(0), list.get(1)));
			
			out.println("<br><br>It's running!<br><br>");
			out.println(MathUtils.offRecursion(25));
			out.println("<br><br>It's running!<br><br>");
			out.println(MathUtils.onRecursion(25));
			out.println("<br><br>It's running!<br><br>");
			out.println(MathUtils.euclid(36, 72));
		} finally {
			IOUtils.closeQuietly(out);
		}
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
