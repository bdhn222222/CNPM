package model.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MedicineDAO;

/**
 * Servlet implementation class AddMedicine
 */
@WebServlet("/AddMedicine")
public class AddMedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMedicine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameMe = request.getParameter("nameMe");
		Double doseMin =  Double.parseDouble(request.getParameter("doseMin"));
		Double doseMax =  Double.parseDouble(request.getParameter("doseMax"));
		Integer frequencyMin =  Integer.parseInt(request.getParameter("frequencyMin"));
		Integer frequencyMax =  Integer.parseInt(request.getParameter("frequencyMax"));
		Integer daydoseMin =  Integer.parseInt(request.getParameter("daydoseMin"));
		Integer daydoseMax =  Integer.parseInt(request.getParameter("daydoseMax"));
		MedicineDAO medicineDAO = new MedicineDAO();
		try {
		    medicineDAO.insertMedicine(nameMe, doseMin, doseMax, frequencyMin, frequencyMax, daydoseMin, daydoseMax);
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		 catch (SQLException e) {
		    e.printStackTrace();
		}
		response.sendRedirect("Medicine");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
