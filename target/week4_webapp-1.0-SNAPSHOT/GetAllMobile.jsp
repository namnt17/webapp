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
        <main id="form-content">
            <div class="container-fluid px-4">
                <h1 class="mt-4">All Mobiles</h1>
                <hr>
                <div class="card mb-3">
                    <div class="card-header">
                        <div class="d-flex justify-content-start">
                            All Mobile Products
                        </div>
                        <div class="d-flex justify-content-end">
                            <a href="showCart" style="text-decoration: none">Cart<span class="badge"
                                                                                       style="color: red">${cart_list.size()}</span></a>
                        </div>
                    </div>
                    <div class="row gx-4 gx-lg-5">
                        <c:forEach items="${listMobile}" var="o">
                            <div class="col-md-3 mb-3">
                                <div class="card h-100">
                                    <div class="card-body">
                                        <h5 class="card-title">${o.brand}</h5>
                                        <p class="card-text">${o.model}</p>
                                        <p class="card-text">${o.price}$</p>
                                    </div>
                                    <div class="card-footer"><a class="btn btn-primary btn-sm"
                                                                href="AddToCart?pid=${o.id}">Add to Cart</a></div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <!--Pagination-->
                    <div class="container d-flex justify-content-center">
                        <div class="pagination">
                            <nav aria-label="Page navigation example">
                                <ul class="pagination">
                                    <li class="page-item">
                                        <a class="page-link" href="#" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                    </li>
                                    <c:forEach begin="1" end="${endPage}" var="i">
                                        <li class="page-item"><a class="page-link" href="search?index=${i}">${i}</a>
                                        </li>
                                    </c:forEach>
                                    <li class="page-item">
                                        <a class="page-link" href="#" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
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
