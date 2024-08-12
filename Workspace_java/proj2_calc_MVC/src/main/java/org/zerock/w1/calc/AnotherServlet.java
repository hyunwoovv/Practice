package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AnotherServlet")
public class AnotherServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("AnotherServlet doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : " + text);
		response.getWriter().println("한글깨짐 확인");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("AnotherServlet doPost 실행");
	
	String text =  request.getParameter("text");
	System.out.println("text : " + text);
		
		
	}

}
