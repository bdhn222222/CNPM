package model.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Medicine;
import model.dao.MedicineDAO;
import model.dao.PrescriptionDetailDAO;

/**
 * Servlet implementation class AddPrescriptionDetail
 */
@WebServlet("/AddPrescriptionDetail")
public class AddPrescriptionDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPrescriptionDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer idPreDetail = Integer.parseInt(request.getParameter("idPreDetail"));
		Integer idCus = Integer.parseInt(request.getParameter("idCus"));
		Integer idMe = Integer.parseInt(request.getParameter("idMe"));
		Double dose = Double.parseDouble(request.getParameter("dose"));
		Integer frequency = Integer.parseInt(request.getParameter("frequency"));
		Integer duration = Integer.parseInt(request.getParameter("duration"));
		MedicineDAO medicineDAO = new MedicineDAO();
		PrescriptionDetailDAO prescriptionDetailDAO = new PrescriptionDetailDAO();

		try {
			List<Medicine> list = medicineDAO.getAllMedicines();
			System.out.println(list);
			request.setAttribute("listMedicine", list);
			prescriptionDetailDAO.addPrescriptionDetail(idPreDetail, idCus, idMe, dose, frequency, duration);

			request.getRequestDispatcher("addPrescriptionDetail.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
