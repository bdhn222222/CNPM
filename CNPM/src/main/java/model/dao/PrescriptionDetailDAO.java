package model.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bean.Medicine;
import model.bean.PrescriptionDetail;

public class PrescriptionDetailDAO {
	Connection conn = null;
	Statement st = null;
	PreparedStatement preSt = null;
	public int addPrescriptionDetail(Integer idPreDetail,  Integer idCus,Integer idMe, Double dose, Integer frequency,  Integer duration) throws SQLException, ClassNotFoundException {
		if (conn == null)
			conn = ConnectDatabase.getMySQLConnection();
		try {
			st = (Statement) conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int result = 0;
		String sql = "INSERT INTO cnpm.prescriptiondetail (idCus,idMe, dose, frequency, duration) VALUES (?,?, ?, ?)";
		preSt = (PreparedStatement) conn.prepareStatement(sql);
		preSt.setInt(1, idCus);
		preSt.setInt(2, idMe);
		preSt.setDouble(3, dose);
		preSt.setInt(4, frequency);
		preSt.setInt(5, duration);
		result = preSt.executeUpdate();
		System.out.println("Ketqua" + result);
		return result;
	}

	public List<PrescriptionDetail> getAllPrescriptionDetails() throws ClassNotFoundException {
	    List<PrescriptionDetail> prescriptionDetail = new ArrayList<>();

	    try {
	        conn = ConnectDatabase.getMySQLConnection();
	        String sql = "SELECT * FROM prescriptiondetail"; 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        ResultSet rs = pstm.executeQuery(); 

	        while (rs.next()) {
	            Integer idPreDetail = rs.getInt("idPreDetail");
	            Integer idCus = rs.getInt("idCus");
	            Integer idMe = rs.getInt("idMe");
	            Double dose = rs.getDouble("dose");
	            Integer frequency = rs.getInt("frequency");
	            Integer duration = rs.getInt("duration");

	            PrescriptionDetail prescriptionDetail1 = new PrescriptionDetail(idPreDetail,idCus, idMe, dose, frequency, duration);
	            prescriptionDetail.add(prescriptionDetail1); // Changed to prescriptionDetail.add
	        }
	        rs.close(); 
	        pstm.close(); 
	        conn.close(); 
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return prescriptionDetail; // Return the list after processing
	}

}

