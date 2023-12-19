<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ include file="header.jsp" %>
	
<html>
<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List Of Medicine</h3>
			<hr>
			<div class="container text-left">

				<a href="addMedicine.jsp" class="btn btn-success">Add Medicine </a>
			</div>
			<br>
			<table class="table ccard-table table-striped table-hover" >
				<thead>
					<tr>
						<th style ="font-weight: bold;">ID</th>
						<th style ="font-weight: bold;">Name</th>
						<th style ="font-weight: bold;">DoseMax</th>
						<th style ="font-weight: bold;">DoseMin</th>
						<th style ="font-weight: bold;">Frequency Max</th>
						<th style ="font-weight: bold;">Frequency Min</th>
						<th style ="font-weight: bold;">Day Dose Max</th>
						<th style ="font-weight: bold;">Day Dose Min</th>
						<th style ="font-weight: bold;">Action</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<%
					    List<model.bean.Medicine> list = (List<model.bean.Medicine>) request.getAttribute("listMedicine");
					System.out.println(list);
					    if (list != null) {
					        for (int i = 0; i < list.size(); i++) {
					            model.bean.Medicine medicine = list.get(i);
					%>
					            <tr>
					                <td><%= medicine.getIdMe() %></td>
					                <td><%= medicine.getNameMe() %></td>
					                <td><%= medicine.getDoseMax() %></td>
					                <td><%= medicine.getDoseMin() %></td>
					                <td><%= medicine.getFrequencyMax() %></td>
					                <td><%= medicine.getFrequencyMin() %></td>
					                <td><%= medicine.getDayDoseMax() %></td>
					                <td><%= medicine.getDayDoseMin() %></td>
					                <td>
					                   <button type="button" class="btn btn-outline-success btn-outline-rounded btn-sm my-0"
        								onclick="window.location.href='/CNPM/DeleteMedicine?idMe=<%= medicine.getIdMe()%> '">
										    Delete
										</button>

					                </td>
					            </tr>
					<%
					        }
					    }
					%>

					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>

</html>