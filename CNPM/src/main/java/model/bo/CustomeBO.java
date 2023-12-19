package model.bo;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.dao.CustomeDAO;
import model.bean.Custome;
import java.util.List;

public class CustomeBO {
	CustomeDAO customeDAO = new CustomeDAO();
	public int insertCustome(String nameCus, String indentityCus, String nameSick, String address)
			throws ParseException, ClassNotFoundException, SQLException {
		return customeDAO.insertCustome(nameCus, indentityCus, nameSick, address);
	}
	public boolean deleteCustome(Integer id) throws ClassNotFoundException, SQLException {
		int result = customeDAO.deleteCustome(id);
		if (result != 0)
			return true;
		return false;
	}
	public List<Custome> getAllCustome() throws ClassNotFoundException, SQLException {
	    List<Custome> customeList = new ArrayList<>();
	    // Gọi đến lớp DAO để thực hiện truy vấn
		customeList = customeDAO.getAllCustome();
	    return customeList;
	}

}
