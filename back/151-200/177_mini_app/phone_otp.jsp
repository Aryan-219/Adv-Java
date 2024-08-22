<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: Welcome ::</title>

    <link rel="stylesheet" href="static/css/common.css">

    <style>
        #otp_box {
            width: 50%;
            margin: 100px auto;
            border: 1px solid rgb(151, 137, 137);
            padding: 40px;
            border-radius: 12px;
        }
    </style>
</head>
<body>
    <div id="main_page_body">
        <%@ include file="header.jsp" %> 
        
        <div id="menu"></div> 
        
        <div id="main_body">
            <div id="otp_box">
                <h3>Enter OTP sent to your mobile number: </h3>
                <form action="check_otp.do" method="post">
                    <input type="number" name="otp">
                    <input type="submit" value="Send">
                </form>
            </div>
        </div> 
        
        <%@ include file="footer.jsp" %> 
    </div>
</body>
</html>