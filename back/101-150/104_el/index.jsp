<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <!-- Case 1: -->
    <!-- <a href="next.jsp?name=jay&age=21&college=SRIT">Next Page</a> -->


    <!-- Case 2: -->
    <form action="next.jsp">
        Email: <input type="email" name="email"> <br><br>
        Company: <input type="text" name="company"> <br><br>
        Salary: <input type="number" name="salary"> <br><br>

        <input type="submit" value="Save">
    </form>
</body>
</html>