<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: Sign-In ::</title>
    
    <link rel="icon" href="static/images/tdf_logo.ico">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">

    <link rel="stylesheet" href="static/css/form.css">  

    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
</head>
<body>
    <div class="container-fluid">
        <!-- ############################### -- Header -- ###################################-->
        <c:import url="header.jsp" />

        <c:if test="${signin_err_msg != null}">
            <div class="row justify-content-center">
                <div class="col-lg-8 alert alert-danger">
                    <c:out value="${signin_err_msg}" />
                </div>
            </div>
        </c:if>
        
        <!-- ############################### -- Page Body -- ###################################-->
        <div class="row justify-content-center" style="margin-bottom: 100px;">
            <div class="col-lg-4 col-md-6">
                <h3 class="my-3 py-3 bg-light text-primary text-center rounded-2">Sign-In</h3>

                <form action="signin.do" method="post" class="m-auto p-5 border rounded form_style" style="background-color: #ddd;">
                    
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
                    
                    
                    <!-- <div class="g-recaptcha mb-3" data-sitekey="6LeDNhUpAAAAAFN6P3iDlLhyA_JZeSXN4Ql5orCF"></div> -->

                    <input type="submit" value="SignIn" class="btn btn-primary">
                </form>
            </div>
        </div>
        
        <!-- ############################### -- Footer -- ###################################-->
        <c:import url="footer.jsp" />
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>