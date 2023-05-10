package com.rohan;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("n1"));
		int b = Integer.parseInt(req.getParameter("n2"));
		
		int sum = a+b;
		
		PrintWriter p = res.getWriter();
		p.println("result is "+sum);
		
       req.setAttribute("sum", sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("as");
		rd.forward(req, res);
		
	}
}
