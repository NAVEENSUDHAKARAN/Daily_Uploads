package com.chainsys.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("Name");
		String date = request.getParameter("DOB");
		String empId = request.getParameter("EmpID");
		int number = Integer.parseInt(empId);
		PrintWriter out = response.getWriter();
		out.println("Name : " + name);
		out.println("Date : " + date);
		out.println("Employee ID : " + number);
		System.out.println(name);
		System.out.println(date);
		System.out.println(number);

		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add(name);
		arrList.add(date);
		arrList.add(empId);
		System.out.println("Array List : " + arrList);
		
		response.sendRedirect("Display.html");
	;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
