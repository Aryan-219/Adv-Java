<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Page</h1>

    <hr>

    <% Cookie[] arr = request.getCookies(); %>

    <p>
        <b><%= arr[0].getName() %></b>: <i><%= arr[0].getValue() %></i>
    </p>
    <p>
        <b><%= arr[1].getName() %></b>: <i><%= arr[1].getValue() %></i>
    </p>
    <p>
        <b><%= arr[2].getName() %></b>: <i><%= arr[2].getValue() %></i>
    </p>

    <hr>

    <p>
        <b>${cookie.name.name}</b>: <i>${cookie.name.value}</i>
    </p>
    <p>
        <b>${cookie.age.name}</b>: <i>${cookie.age.value}</i>
    </p>
    <p>
        <b>${cookie.JSESSIONID.name}</b>: <i>${cookie.JSESSIONID.value}</i>
    </p>


    <hr>


    <p>
        ${cookie}
    </p>

    <hr>

    <p>
        ${cookie.name}
    </p>
    <p>
        ${cookie.age}
    </p>
    <p>
        ${cookie.JSESSIONID}
    </p>
</body>
</html>