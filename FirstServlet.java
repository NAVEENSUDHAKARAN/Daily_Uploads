package com.chainsys.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.ServerManager;
import com.chainsys.util.ConnectUtil;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     ServerManager manager = new ServerManager();
     UserData user = new UserData();
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegistrationSuccessful.jsp");
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String name = request.getParameter("Name");
		String date = request.getParameter("DOB");
		String empId = request.getParameter("EmpId");
		int number = Integer.parseInt(empId);
		PrintWriter out = response.getWriter();

//		UserData.setData(name, date, empId);
//		request.setAttribute("data", UserData.getData());
		
		UserDetails d = new UserDetails(name, date, empId);
		try {
			manager.insertToDB(d);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		response.sendRedirect("");
		request.getRequestDispatcher("Display.jsp").forward(request, response);
		
	}
	
	
}
