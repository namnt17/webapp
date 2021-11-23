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


<body>
<c:import url="element/navbar.jsp"/>
<div id="layoutSidenav">
    <!--DashBoard-->
    <c:import url="element/dashboard.jsp"/>
    <!--form content--->
    <div id="layoutSidenav_content">
        <div class="container-fluid">
            <h1>Cart List</h1>
            <hr>
            <p>Khách Hàng: ${sessionScope.customer.name}</p>
            <table class="mt-3" style="width: 100%;border: 1px solid black;border-collapse: collapse;">
                <tr>
                    <th style="border: 1px solid black">Products in cart: ${cart_list.size()}</th>
                    <th style="border: 1px solid black">Price</th>
                    <th style="border: 1px solid black">Quantity</th>
                    <th style="border: 1px solid black">Action</th>
                </tr>
                <c:forEach var="product" items="${cart_list}">
                    <tr style="border: 1px solid black">
                        <td style="border: 1px solid black">
                            <p>${product.brand}</p>
                            <p>ID: ${product.id}</p>
                        </td>
                        <td style="border: 1px solid black">($) ${product.price}</td>
                        <td style="border: 1px solid black">
                            <form action="" method="post" class="form-check-inline text-center">
                                <input type="hidden" name="id" class="form-check-input"/>
                                <div class="form-group d-flex justify-content-between w-50">
                                    <a class="btn btn-sm btn-primary"
                                       href="quantity-inc-dec?action=inc&id=${product.id}"><i
                                            class="fas fa-plus-square"></i></a>
                                    <input type="text" readonly class="form-control w-50" value="${product.quantity}"
                                           name="quantity"/>
                                    <a class="btn btn-sm btn-primary"
                                       href="quantity-inc-dec?action=dec&id=${product.id}"><i
                                            class="fas fa-minus-square"></i></a>
                                </div>
                            </form>
                        </td>
                        <td style="border: 1px solid black">
                            <a style="float: left;"
                               href="removeFromCart?id=${product.id}">
                                <button class="btn btn-danger">
                                    Delete
                                </button>
                            </a>
                        </td>
                    </tr>

                </c:forEach>
                <tr>
                    <td style="border: 1px solid black" colspan="4">Total: ${total}$</td>
                </tr>
            </table>
            <br>
            <br>
            <c:if test="${sessionScope.cart_list == null}">
                <button type="submit" class="btn btn-warning disabled">Submit</button>
            </c:if>

            <c:if test="${sessionScope.cart_list != null}">
                <a href="save-order">
                    <button type="submit" class="btn btn-warning">Submit</button>
                </a>
            </c:if>

        </div>
    </div>
</div>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</html>
