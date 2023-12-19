package model.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bean.Medicine;

public class MedicineDAO {
	Connection conn = null;
	Statement st = null;
	PreparedStatement preSt = null;
	public int insertMedicine(String nameMe, Double doseMin, Double doseMax, Integer frequencyMin, Integer frequencyMax, Integer daydoseMin, Integer daydoseMax) throws SQLException, ClassNotFoundException {
		if (conn == null)
			conn = ConnectDatabase.getMySQLConnection();
		try {
			st = (Statement) conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int result = 0;
		String sql = "INSERT INTO cnpm.medicine (nameMe, doseMin, doseMax, frequencyMin, frequencyMax, daydoseMin, daydoseMax) VALUES (?,?, ?, ?,?,?,?)";
		preSt = (PreparedStatement) conn.prepareStatement(sql);
		preSt.setString(1, nameMe);
		preSt.setDouble(2, doseMin);
		preSt.setDouble(3, doseMax);
		preSt.setInt(4, frequencyMin);
		preSt.setInt(5, frequencyMax);
		preSt.setInt(6, daydoseMin);
		preSt.setInt(7, daydoseMax);
		result = preSt.executeUpdate();
		System.out.println("Ketqua" + result);
		return result;
	}
	public int deleteMedicine(Integer idMe) throws ClassNotFoundException, SQLException {
		int result = 0;
		if (conn == null)
			conn = ConnectDatabase.getMySQLConnection();
		String sql = "Delete From cnpm.Medicine where idMe= ?";
		PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
		pstm.setInt(1, idMe);
		result = pstm.executeUpdate();
		return result;
	}

	public List<Medicine> getAllMedicines() throws ClassNotFoundException {
	    List<Medicine> medicine = new ArrayList<>();

	    try {
	        conn = ConnectDatabase.getMySQLConnection();
	        String sql = "SELECT * FROM Medicine"; 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        ResultSet rs = pstm.executeQuery(); 

	        while (rs.next()) {
	            int idMe = rs.getInt("idMe");
	            String nameMe = rs.getString("nameMe");
	            Double doseMin = rs.getDouble("doseMin");
	            Double doseMax = rs.getDouble("doseMax");
	            Integer frequencyMin = rs.getInt("frequencyMin");
	            Integer frequencyMax = rs.getInt("frequencyMax");
	            Integer dayDoseMin = rs.getInt("dayDoseMin");
	            Integer dayDoseMax = rs.getInt("dayDoseMax");

	            Medicine medicine1 = new Medicine(idMe, nameMe, doseMin, doseMax, frequencyMin, frequencyMax,dayDoseMin,dayDoseMax);
	            medicine.add(medicine1);
	        }
	        rs.close(); 
	        pstm.close(); 
	        conn.close(); 
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		return medicine;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MedicineDAO medicineDAO = new MedicineDAO();
		medicineDAO.getAllMedicines();
		System.out.println(medicineDAO);
	}
}
