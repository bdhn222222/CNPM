package model.dao;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.bo.*;
import model.bean.*;

public class CustomeDAO {
	Connection conn = null;
	Statement st = null;
	PreparedStatement preSt = null;
	
	public int insertCustome(String nameCus, String indentityCus, String nameSick, String addressCus) throws SQLException, ClassNotFoundException {
		if (conn == null)
			conn = ConnectDatabase.getMySQLConnection();
		try {
			st = (Statement) conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int result = 0;
		String insert = "INSERT INTO Custome (nameCus, indentityCus, nameSick, addressCus) VALUES (?,?, ?, ?)";
		preSt = (PreparedStatement) conn.prepareStatement(insert);
		preSt.setString(1, nameCus);
		preSt.setString(2, indentityCus);
		preSt.setString(3, nameSick);
		preSt.setString(4, addressCus);
		result = preSt.executeUpdate();
		System.out.println("Ketqua" + result);
		return result;
	}
	public int deleteCustome(Integer idCus) throws ClassNotFoundException, SQLException {
		int result = 0;
		if (conn == null)
			conn = ConnectDatabase.getMySQLConnection();
		String sql = "Delete From Custome where idCus= ?";
		PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
		pstm.setInt(1, idCus);
		result = pstm.executeUpdate();
		return result;
	}
	public List<Custome> getAllCustome() throws ClassNotFoundException {
	    List<Custome> customeList = new ArrayList<>();

	    try {
	        conn = ConnectDatabase.getMySQLConnection();
	        String sql = "SELECT * FROM Custome"; 
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        ResultSet rs = pstm.executeQuery(); 

	        while (rs.next()) {
	            int idCus = rs.getInt("idCus");
	            String nameCus = rs.getString("nameCus");
	            String indentityCus = rs.getString("indentityCus");
	            String addressCus = rs.getString("addressCus");
	            String nameSick = rs.getString("nameSick");

	            Custome custome = new Custome(idCus, nameCus, indentityCus, addressCus, nameSick);
	            customeList.add(custome);
	        }
	        rs.close(); 
	        pstm.close(); 
	        conn.close(); 
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return customeList;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CustomeDAO customeDAO = new CustomeDAO();
		customeDAO.deleteCustome(4);
		System.out.println(customeDAO);
	}

}



