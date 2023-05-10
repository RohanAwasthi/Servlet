package com.rohan;

import java.io.IOException;

import com.nkdebug.HttpServletRequest;
import com.nkdebug.HttpServletResponse;
import com.nkdebug.RequestDispatcher;
import com.nkdebug.ServletException;

public class SampleServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
		String name = "nkdebug";
		request.setAttribute("label", name);

		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
	
}
