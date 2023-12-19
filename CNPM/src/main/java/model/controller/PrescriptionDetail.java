package model.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Medicine;

/**
 * Servlet implementation class PrescriptionDetail
 */
@WebServlet("/PrescriptionDetail")
public class PrescriptionDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public boolean check(Medicine medicine, double dose, int frequency, int duration) {
		Double frequency_mg = dose * frequency;
		Double duration_mg = frequency_mg * duration;
        Double doseMin = medicine.getDoseMin();
        Double doseMax = medicine.getDoseMax();
        Integer frequencyMax = medicine.getFrequencyMax();
        Integer frequencyMin = medicine.getFrequencyMin();
        Double frequencyMin_mg = doseMin * frequencyMin;
        Double frequencyMax_mg = doseMax * frequencyMax;
        Integer dayDoseMin = medicine.getDayDoseMin();
        Integer dayDoseMax = medicine.getDayDoseMax();
        Double dayDoseMin_mg = frequencyMin_mg * dayDoseMin;
        Double dayDoseMax_mg = frequencyMin_mg * dayDoseMax;
        
        
        if (dose < doseMin || dose > doseMax) {
            return false; 
        }
        
        if (frequency_mg < frequencyMin_mg || frequency_mg > frequencyMax_mg) {
            return false; 
        }
        if (duration_mg < dayDoseMin_mg || duration_mg > dayDoseMax_mg) {
            return false; 
        }
        return true; 
    }

    public PrescriptionDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
