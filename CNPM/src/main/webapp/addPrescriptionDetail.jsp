<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ include file="header.jsp" %>

	
<html>
<head>
<title>Prescription Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h1>Prescription Form</h1>
    <form action="/addPrescriptionDetail.jsp" method="post" onsubmit="return validateForm()">
    
    <!-- <div class="form-group">
        <label for="nameMe">Name of Medicine:</label>
        <select class="select form-control-lg" name="nameMe" id="nameMe">
        <option value="NULL" disabled selected>Choose Name Medicine</option>
			

        </select>
        </div>
         -->
         <div class="form-group">
                <label for="nameCus">Medicine's ID</label>
                <input type="text" class="form-control" id="nameSick" name="nameSick" required>
            </div>
         <div class="form-group">
                <label for="nameCus">NameSick :</label>
                <input type="text" class="form-control" id="nameSick" name="nameSick" required>
            </div>
         <div class="checkbox-group form-group">
						<label>Frequency:</label>
						<div class="form-check">
							<input type="checkbox" class="form-check-input" id="sang"
								name="tanSuat[]" value="Sáng"> <label
								class="form-check-label" for="sang">BreakFast</label>
						</div>
						<div class="form-check">
							<input type="checkbox" class="form-check-input" id="trua"
								name="tanSuat[]" value="Trưa"> <label
								class="form-check-label" for="trua">Lunch</label>
						</div>
						<div class="form-check">
							<input type="checkbox" class="form-check-input" id="toi"
								name="tanSuat[]" value="Tối"> <label
								class="form-check-label" for="toi">Night</label>
						</div>
					</div>
            <div class="form-group">
                <label for="nameCus">Dose :</label>
                <input type="text" class="form-control" id="dose" name="dose" required>
            </div>
            <div class="form-group">
                <label for="indentityCus">Frequency: </label>
                <input type="text" class="form-control" id="frequency" name="frequency" required>
            </div>
			<div class="form-group">
                <label for="addressCus">Duration</label>
                <input type="text" class="form-control" id="duration" name="duration" required>
            </div>
            

            <button type="button" onclick="location.href='/CNPM/Custome'" class="btn btn-outline-success">Back</button>
            <button type="submit" class="btn btn-primary  btn-success"  onclick="moreInfo()"> Add Prescription</button>
     
    </form>
    </div>
    
    
    
    
   
   
   
   
<script>
    function validateForm() {
        var lieuLuong = document.getElementById('lieuLuong').value;
        var soNgay = document.getElementById('soNgay').value;

        var checkboxes = document.getElementsByName('tanSuat[]');
        var selectedTanSuat = [];
        for (var i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].checked) {
                selectedTanSuat.push(checkboxes[i].value);
            }
        }

        <%--var lieuLuongMin = <%= ListDrug.getLieuLuongMin() %>;
        var lieuLuongMax = <%= ListDrug.getLieuLuongMax() %>;--%>
        var lieuLuongMin = 10;
        var lieuLuongMax = 30;

        if (selectedTanSuat.length * soNgay * lieuLuongMin <= lieuLuong
            && selectedTanSuat.length * soNgay * lieuLuongMax >= lieuLuong) {
            alert("Kê thuốc hợp lệ. Đơn thuốc đã được cập nhật.");
        } else {
            alert("Kê thuốc không hợp lệ.");
        }

        return false;
    }
</script>
</body>
</html>
