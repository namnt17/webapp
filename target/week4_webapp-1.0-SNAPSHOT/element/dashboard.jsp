<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Add Content</title>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="css/style.css" rel="stylesheet"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
</head>
<div id="layoutSidenav_nav">
    <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
        <div class="sb-sidenav-menu">
            <div class="nav">
                <a class="nav-link" href="addnewcustomer.jsp">
                    <div class="sb-nav-link-icon"><i class="fas fa-address-card"></i></div>
                    Add New Customer
                </a>
                <a class="nav-link" href="addnewmobile.jsp">
                    <div class="sb-nav-link-icon"><i class="fas fa-mobile"></i></div>
                    &nbsp;&nbsp;Add New Mobile
                </a>
                <a class="nav-link" href="listCustomer">
                    <div class="sb-nav-link-icon"><i class="fas fa-plus"></i></div>
                    &nbsp;&nbsp;Add Orders
                </a>
                <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                    <div class="sb-nav-link-icon"><i class="fas fa-sort"></i></div>
                    &nbsp;&nbsp;Sort Orders
                    <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                </a>
                <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                    <nav class="sb-sidenav-menu-nested nav">
                        <a class="nav-link" href="sort-by-name">Full Name Customer</a>
                        <a class="nav-link" href="sort-by-amount">Amount of products in order</a>
                    </nav>
                </div>
                <a class="nav-link" href="show-all-bill">
                    <div class="sb-nav-link-icon"><i class="fas far fa-edit"></i></div>
                    Show Bills
                </a>

            </div>
        </div>
        <div class="sb-sidenav-footer">
            <div class="small">Logged in as:</div>
        </div>
    </nav>
</div>



