package model.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MedicineDAO;
import model.dao.PrescriptionDetailDAO;

/**
 * Servlet implementation class PrescriptionDetail_Servlet
 */
@WebServlet("/PrescriptionDetail_Servlet")
public class PrescriptionDetail_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrescriptionDetail_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MedicineDAO medicineDAO = new MedicineDAO();
        PrescriptionDetailDAO prescriptionDetailDAO = new PrescriptionDetailDAO();
        try {
            List<model.bean.Medicine> list = medicineDAO.getAllMedicines();
            request.setAttribute("listMedicine", list);
            request.getRequestDispatcher("addPrescriptionDetail.jsp").forward(request, response);
        } catch (ClassNotFoundException  e) {
            e.printStackTrace();
            // Xử lý ngoại lệ ở đây, ví dụ: hiển thị thông báo lỗi hoặc chuyển hướng đến trang lỗi
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
