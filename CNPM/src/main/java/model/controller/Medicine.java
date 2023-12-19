package model.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.modeler.modules.ModelerSource;

import model.dao.*;
import model.bean.*;
/**
 * Servlet implementation class Custome
 */
@WebServlet("/Medicine")
public class Medicine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Medicine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MedicineDAO medicineDAO = new MedicineDAO();
        try {
            List<model.bean.Medicine> list = medicineDAO.getAllMedicines(); 
            request.setAttribute("listMedicine", list);
            request.getRequestDispatcher("medicine.jsp").forward(request, response);
        } catch (ClassNotFoundException e ){
            e.printStackTrace();
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
