<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Prescription</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>
    <div class="container mt-5">
        <h1>Add Prescription</h1>
        <form action="AddPrescription" >
            <div class="form-group">
                <label for="nameMe"> </label>
                <input type="text" class="form-control" id="nameMe" name="nameMe" required>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="doseMin">Prescription's Dose Min</label>
                    <input type="text" class="form-control" id="doseMin" name="doseMin" required>
                </div>
                <div class="form-group col-md-6">
                    <label for="doseMax">Prescription's Dose Max</label>
                    <input type="text" class="form-control" id="doseMax" name="doseMax" required>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="frequencyMin">Prescription's Frequency Min</label>
                    <input type="text" class="form-control" id="frequencyMin" name="frequencyMin" required>
                </div>
                <div class="form-group col-md-6">
                    <label for="frequencyMax">Prescription's Frequency Max</label>
                    <input type="text" class="form-control" id="frequencyMax" name="frequencyMax" required>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="daydoseMin">Prescription's Day Dose Min</label>
                    <input type="text" class="form-control" id="daydoseMin" name="daydoseMin" required>
                </div>
                <div class="form-group col-md-6">
                    <label for="daydoseMax">Prescription's Day Dose Max</label>
                    <input type="text" class="form-control" id="daydoseMax" name="daydoseMax" required>
                </div>
            </div>
            
            <button type="button" onclick = "location.href='/CNPM/Prescription'" class="btn  btn-outline-success">Back</button>
            <button type="submit" class="btn btn-primary  btn-success"  onclick="moreInfo()"> Add Prescription</button>
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
</body>
</html>
