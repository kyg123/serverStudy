package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/add")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		*/
		
		//1. 입력받고
		
		String input1 = request.getParameter("first");
		String input2 = request.getParameter("second");
		
		
		
		//2. 로직처리
		int result = Integer.parseInt(input1) + Integer.parseInt(input2);
		
		//3. 출력
		//response.setContentType("text/plain; charset=utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		out.println(result);
		//out.println("<h1>" + result + "</h1>");
		out.flush();
		out.close();
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
