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
    <title>Form Content</title>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet"/>
    <link href="css/style.css" rel="stylesheet"/>
    <script src="//code.jquery.com/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
</head>
<body class="sb-nav-fixed">
<!--Navbar-->
<c:import url="element/navbar.jsp"/>
<div id="layoutSidenav">
    <!--DashBoard-->
    <c:import url="element/dashboard.jsp"/>
    <!--form content--->
    <div id="layoutSidenav_content">
        <main id="form-content">
            <div class="container-fluid px-4">
                <h1 class="mt-4">Add Order</h1>
                <hr>
                <div class="card mb-4">
                    <div class="card-header">
                        Add Order For Customer Forms
                    </div>
                    <div class="card-body">
                        <table  class="table table-striped">
                            <thead>
                            <tr>
                                <th>Mã KH</th>
                                <th>Họ và Tên</th>
                                <th>Địa chỉ</th>
                                <th>Nhóm KH</th>
                                <th>Hành Động</th>
                            </tr>
                            </thead>
                            <tbody id="content">
                            <c:forEach items="${listCustomer}" var="c">
                                <tr>
                                    <td>${c.id}</td>
                                    <td>${c.name}</td>
                                    <td>${c.address}</td>
                                    <td>${c.group}</td>
                                    <td><a href="getAllMobile?id=${c.id}"><button class="btn btn-warning">Mua Hàng</button></a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
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
</style>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>

