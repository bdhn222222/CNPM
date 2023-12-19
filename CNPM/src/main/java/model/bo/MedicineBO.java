package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.bean.Medicine;
import model.dao.MedicineDAO;

public class MedicineBO {
    public List<Medicine> getAllMedicines() throws ClassNotFoundException, SQLException {
        List<Medicine> medicineList = new ArrayList<>();
        MedicineDAO medicineDAO = new MedicineDAO(); // Tạo đối tượng MedicineDAO

        // Gọi phương thức từ đối tượng đã tạo
        medicineList = medicineDAO.getAllMedicines();
        return medicineList;
    }
}

