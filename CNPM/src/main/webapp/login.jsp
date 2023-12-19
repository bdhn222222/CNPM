<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="model.bean.User"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="charset=UTF-8">
</head>
<body>
	<div class="container">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card card-primary">
        <div class="card-header">
          <h3 class="card-title">Login</h3>
        </div>
        <div class="card-body">
          <form role="form" action="${pageContext.request.contextPath}/Login" method="post">
          	<div class="row justify-content-center card-body"
					style="margin-bottom: 0px;">
					<div style="color: red;">${errorString}</div>
			</div>
            <div class="form-group">
            
              <label for="exampleInputEmail1">Username</label>
              <input type="text" class="form-control" name="username" placeholder="Enter username" required="required">
            </div>
            <div class="form-group">
              <label for="exampleInputPassword1">Password</label>
              <input type="password" class="form-control" name="password" placeholder="Enter password" required="required">
            </div>
            <div class="form-check">
              <input type="checkbox" class="form-check-input" id="exampleCheck1" name="rememberMe" value="Y">
              <label class="form-check-label" for="exampleCheck1">Remember Password</label>
            </div>
            <div style="margin-top: 20px;">
              <small><b>Note:</b> Username: <b>sa</b>, Password: <b>123456</b></small>
            </div>
            <div class="form-group">
              <button type="submit" class="btn btn-primary">Submit</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>
	<!-- /.content -->
	 <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>