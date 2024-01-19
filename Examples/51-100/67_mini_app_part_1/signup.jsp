<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>:: SignUp ::</title>

    <link rel="stylesheet" href="static/css/common.css">
    <link rel="stylesheet" href="static/css/form.css">
</head>
<body>
    <div id="main_page_body">
        <%@ include file="header.jsp" %> 
        
        <div id="menu"></div> 
        
        <div id="main_body">
            <form action="signup.do" method="post">
                <table id="form_box">
                    <tr>
                        <th>
                            <label for="unm">User Name :</label>
                        </th>
                        <td>
                            <input type="text" id="unm" required name="user_name">
                        </td>
                    </tr>
                    <tr>
                        <th>
                            <label for="eml">Email :</label>
                        </th>
                        <td>
                            <input type="text" id="eml" name="email" pattern="\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}">
                        </td>
                    </tr>
                    <tr>
                        <th>
                            <label for="pwd">Password :</label>
                        </th>
                        <td>
                            <input type="password" required id="pwd" name="password">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="SignUp">
                        </td>
                    </tr>
                </table>
            </form>
        </div> 

        <%@ include file="footer.jsp" %> 
    </div>

    <script>
        const user_name = document.getElementById('unm');
        const email = document.querySelector('#eml');
        const password = document.getElementById('pwd');

        const forms = document.forms;
        // console.log(user_name.toString());
        // console.log(email);
        // console.log(password);

        // console.log(user_name.value);
        // console.log(email.value);
        // console.log(password.value);

        // console.log(forms[0]);

        function validateForm() {
            let flag = true;
            
            let regexExp = new RegExp('[A-Za-z ]{2,10}');
            // if(!regexExp.test(user_name.value)) {
            //     flag = false;
            // }

            flag = regexExp.test(user_name.value);
            console.log(flag);

            return flag;
        }

        forms[0].onsubmit = validateForm; 
    </script>
</body>
</html>