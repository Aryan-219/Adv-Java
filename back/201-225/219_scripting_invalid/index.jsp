<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        p {
            border: 2px solid green;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <%! int x = 5; %>
    

    <%= x %>

    <hr>

    <% for(int i=0;i<x;i++) { %>
        <p>hello <%= i %></p>
    <% } %>

</body>
</html>