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
    <form action="AddPrescriptionDetail" method="post">
    <div class="form-group">
        <label for="nameMe">Name of Medicine:</label>
        <select class="select form-control-lg" name="nameMe" id="nameMe">
        <option value="NULL" disabled selected>Choose Name Medicine</option>
			<%
					    List<model.bean.Medicine> list = (List<model.bean.Medicine>) request.getAttribute("listMedicine");
					    System.out.println(list);
					    if (list != null) {
					        for (int i = 0; i < list.size(); i++) {
					            model.bean.Medicine medicine = list.get(i);
					%>
			            <option value="<%= medicine.getIdMe() %>"> <%= medicine.getNameMe() %></option>
			<%
			        }
			    }
			%>


        </select>
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
</body>
</html>
