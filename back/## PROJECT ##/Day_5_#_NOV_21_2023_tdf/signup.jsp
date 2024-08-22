<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: Sign-Up ::</title>
    
    <link rel="icon" href="static/images/tdf_logo.ico">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">

    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
</head>
<body>
    <div class="container-fluid">
        <!-- ############################### -- Header -- ###################################-->
        <c:import url="header.jsp" />
        
        <!-- ############################### -- Page Body -- ###################################-->
        <div class="row" style="margin-bottom: 100px;">
            <div class="col-1"></div>
            <div class="col-10">
                <h3 class="my-3 py-3 bg-light text-primary text-center rounded-2">Sign-Up</h3>

                <form action="signup.do" method="post" class="w-50 m-auto p-5 border rounded" style="background-color: #ddd;">
                    <div class="mb-3">
                        <label for="full_name" class="form-label">Full Name</label>
                        <input type="text" class="form-control" id="full_name" name="full_name">
                        <div class="form-text">Please Enter Your Full Name</div>
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="email">
                        <div class="form-text">Please Enter Valid Email</div>
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" class="form-control" id="password" name="password">
                        <div class="form-text">Please Enter Valid Password</div>
                    </div>
                    <div class="mb-3">
                        <label for="country" class="form-label">Country</label>
                        <select id="country_list" class="form-select" id="country" name="country">
                            <c:forEach var="country" items="${countries}">
                                <option value="${country.countryId}">${country.name}</option>
                            </c:forEach>                           
                        </select>
                        <div class="form-text">Enter Phone Without Country Code</div>
                    </div>
                    <div class="mb-3">
                        <label for="phone" class="form-label">Contact Number</label>
                        <input type="number" class="form-control" id="phone" name="phone">
                        <div class="form-text">Enter Phone Without Country Code</div>
                    </div>
                    
                    <div class="g-recaptcha mb-3" data-sitekey="6LeDNhUpAAAAAFN6P3iDlLhyA_JZeSXN4Ql5orCF"></div>

                    <input type="submit" value="SignUp" class="btn btn-primary">
                </form>
            </div>
            <div class="col-1"></div>
        </div>
        
        <!-- ############################### -- Footer -- ###################################-->
        <c:import url="footer.jsp" />
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>