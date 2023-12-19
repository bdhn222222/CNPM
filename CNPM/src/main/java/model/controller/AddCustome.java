package model.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.CustomeDAO;

/**
 * Servlet implementation class AddCustome
 */
@WebServlet("/AddCustome")
public class AddCustome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameCus = request.getParameter("nameCus");
		String indentityCus= request.getParameter("indentityCus");
		String nameSick= request.getParameter("nameSick");
		String addressCus= request.getParameter("addressCus");
		CustomeDAO customeDAO = new CustomeDAO();
		try {
		    customeDAO.insertCustome(nameCus, indentityCus, nameSick, addressCus);
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		 catch (SQLException e) {
		    e.printStackTrace();
		}
		response.sendRedirect("Custome");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
