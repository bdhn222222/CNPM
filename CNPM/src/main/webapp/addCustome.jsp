<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Custome</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">
        <h1>New Custome 's Information</h1>
        <form action="AddCustome" method="post">
            <div class="form-group">
                <label for="nameCus">Customer's Name</label>
                <input type="text" class="form-control" id="nameCus" name="nameCus" required>
            </div>
            <div class="form-group">
                <label for="indentityCus">Customer's Indentity</label>
                <input type="tel" class="form-control" id="indentityCus" name="indentityCus" required>
            </div>
            <!-- Trong addCustome.jsp -->
			<div class="form-group">
                <label for="addressCus">Customer's Address</label>
                <input type="text" class="form-control" id="addressCus" name="addressCus" required>
            </div>
            <div class="form-group">
                <label for="indentityCus">Customer's SickName</label>
                <input type="tel" class="form-control" id="nameSick" name="nameSick" required>
            </div>

            <button type="button" onclick="location.href='/CNPM/Custome'" class="btn btn-outline-success">Back</button>
            <button type="submit" class="btn btn-primary  btn-success"  onclick="moreInfo()"> Add Custome</button>
        </form>
    </div>

    <!-- Bootstrap JS and Popper.js -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
            integrity="sha384-xBuQ/xzmlj8kAAo1zKAZ2sLOgK/x+9aUK6ZI/fy+4lPPi/JjanssspfUH5G9FifA"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
            integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+EmmebXsdVtcRHEl/8JcFngdPaX6st+w0J3"
            crossorigin="anonymous"></script>
	<
</body>
</html>
