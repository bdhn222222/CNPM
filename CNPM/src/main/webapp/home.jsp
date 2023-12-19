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

<header></header>
<br>

<div class="row">
    <div class="container">
        <h3 class="text-center">List of Users</h3>
        <hr>
        <div class="container text-left">
            <a href="addCustome.jsp" class="btn btn-success">Add New Custome</a>
        </div>
        <br>
        <table class="table card-table table-striped table-hover">
            <thead>
                <tr>
                    <th style="font-weight: bold;">ID</th>
                    <th style="font-weight: bold;">Name</th>
                    <th style="font-weight: bold;">Indentity</th>
                    <th style="font-weight: bold;">SickName</th>
                    <th style="font-weight: bold;">Address</th>
                    <th style="font-weight: bold;">Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<model.bean.Custome> listCustome = (List<model.bean.Custome>) request.getAttribute("listCustome");
                    if (listCustome != null) {
                        for (model.bean.Custome custome : listCustome) {
                %>
                            <tr>
                                <td><%= custome.getIdCus() %></td>
                                <td><%= custome.getNameCus() %></td>
                                <td><%= custome.getindentityCus() %></td>
                                <td><%= custome.getnameSick() %></td>
                                <td><%= custome.getAddressCus() %></td>
                                <td>
                                    <button type="button" class="btn btn-outline-success btn-outline-rounded btn-sm my-0"
                                            onclick="moreInfo()">
                                                Edit Prescription
                                    </button>
                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                     <button type="button" class="btn btn-outline-success btn-outline-rounded btn-sm my-0"
                                            onclick="moreInfo()">
                                                Seen Prescription
                                    </button>
                                     &nbsp;&nbsp;&nbsp;&nbsp;
                                    <button type="button" class="btn btn-outline-success btn-outline-rounded btn-sm my-0"
                                            onclick="window.location.href='/CNPM/DeleteCustome?idCus=<%= custome.getIdCus()%> '">
                                                Delete
                                    </button>
                                     &nbsp;&nbsp;&nbsp;&nbsp;
                                    <button type="button" class="btn btn-outline-success btn-outline-rounded btn-sm my-0"
                                            onclick="window.location.href='addPrescriptionDetail.jsp'">
                                                Insert Prescription
                                    </button>
                                </td>
                            </tr>
                <%
                        }
                    }
                %>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
