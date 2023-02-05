package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TipFinder;

/**
 * @author Bradh 
 * CIS175 23290 Java II Spring 2023
 * Feb 4, 2023
 */

/**
 * Servlet implementation class getTipInfoServlet
 */
@WebServlet("/getTipInfoServlet")
public class getTipInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTipInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		double check;
		
		String amountInput = request.getParameter("baseAmount");
		String tipInput = request.getParameter("tipPercentage");
		
		try {
		    check = Double.parseDouble(amountInput);
		}
		catch (NumberFormatException e) {
		    amountInput = "0";
		}
		
		try {
		    check = Double.parseDouble(tipInput);
		}
		catch (NumberFormatException e) {
		    tipInput = "0";
		}
		
		TipFinder tp = new TipFinder(Double.parseDouble(amountInput), Double.parseDouble(tipInput));
		
		request.setAttribute("userTip", tp);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(tp.toString());
		writer.close();
	}

}
