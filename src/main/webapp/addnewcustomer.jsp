<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>Edit Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet"/>
    <link href="css/style.css" rel="stylesheet"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js"
            crossorigin="anonymous"></script>
</head>
<body class="sb-nav-fixed">

<c:import url="element/navbar.jsp"/>

<div id="layoutSidenav">
    <c:import url="element/dashboard.jsp"/>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid px-4">
                <h1 class="mt-4">Add New Customer</h1>
                <hr>
                <div class="card mb-4">
                    <div class="card-header">
                        Add New Customer Forms
                    </div>
                    <div class="card-body">
                        <form action="addNewCustomer" method="post" id="form-login">
                            <div class="form-group" style="margin-top: 10px;">
                                <label for="fullname">Họ và tên</label>
                                <input type="text" class="form-control" id="fullname" placeholder="Enter the full name"
                                       required name="fullname">
                            </div>
                            <div class="form-group" style="margin-top: 10px;">
                                <label for="address">Địa chỉ</label>
                                <input type="text" id="address" class="form-control" name="address"
                                       placeholder="Enter the address" required>
                            </div>
                            <div class="form-group" style="margin-top: 10px;">
                                <label for="group">Nhóm KH</label>
                                <select class="custom-select my-1 mr-sm-2 form-control" id="group" required
                                        name="group">
                                    <option selected disabled>Choose...</option>
                                    <option>Mua le</option>
                                    <option>Mua buon</option>
                                    <option>Mua qua mang</option>
                                </select>
                            </div>
                            <div style="margin-top: 10px;">
                                <button type="submit" class="btn btn-primary">Submit Button</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </main>
    </div>
</div>

<style>
    .form-group input {
        width: 70%;
    }

    .form-group textarea {
        width: 70%;
    }

    .form-group select {
        width: 70%;
    }
</style>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>

</body>
</html>