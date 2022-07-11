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
    <title>Sort By Amount</title>
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
        <main id="form-content">
            <div class="container-fluid px-4">
                <h1 class="mt-4">Sort</h1>
                <hr>
                <div class="card mb-4">
                    <div class="card-header">
                        Sort By Amount Products In Cart
                    </div>
                    <div class="card-body">
                        <table class="table table-striped">
                            <thead>
                            <tr>
                                <th>ID Bill</th>
                                <th>Họ và Tên</th>
                                <th>Địa chỉ</th>
                                <th>Nhóm KH</th>
                                <th>Số lượng</th>
                                <th>Chi tiết</th>
                            </tr>
                            </thead>
                            <tbody id="content">
                            <c:forEach items="${sortByAmount}" var="c">
                                <tr>
                                    <td>${c.id}</td>
                                    <td>${c.name_kh}</td>
                                    <td>${c.address}</td>
                                    <td>${c.group}</td>
                                    <td>${c.quantity}</td>
                                    <td><a href="">
                                        <button class="btn btn-warning">Chi Tiết</button>
                                    </a></td>
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>
