package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class MainC extends HttpServlet {
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.println("It's running!");
		} finally {
			IOUtils.closeQuietly(out);
		}
	}

}
