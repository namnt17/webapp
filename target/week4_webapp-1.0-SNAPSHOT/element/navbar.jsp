<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <!-- Navbar Brand-->
    <a class="navbar-brand ps-3" href="index.html">CMS</a>
    <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
        <div class="input-group">
            <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..."
                   aria-describedby="btnNavbarSearch"/>
            <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
        </div>
    </form>
    <!-- Navbar-->
    <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown"
               aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                <c:if test="${sessionScope.mail == null}">
                    <li><a class="dropdown-item"><i class="fas fa-user"></i> Please login</a></li>
                </c:if>
                <c:if test="${sessionScope.mail != null}">
                    <li><a class="dropdown-item" href="EditProfile.jsp"><i class="fas fa-user"></i> Profile</a></li>
                </c:if>
                <li>
                    <hr class="dropdown-divider"/>
                </li>

                <c:if test="${sessionScope.mail == null}">
                    <li><a class="dropdown-item" href="login.jsp"><i class="fas fa-sign-out-alt"></i>Login</a></li>
                </c:if>
                <c:if test="${sessionScope.mail != null}">
                    <li><a class="dropdown-item" href="logout"><i class="fas fa-sign-out-alt"></i>Logout</a></li>
                </c:if>
            </ul>
        </li>
    </ul>
</nav>


