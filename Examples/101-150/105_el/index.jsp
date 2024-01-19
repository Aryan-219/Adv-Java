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

    <form action="next.jsp">
        Food Selection: <br><br>

        Samosa: <input type="checkbox" name="food" value="samosa"> <br><br>
        Jalebi: <input type="checkbox" name="food" value="jalebi"> <br><br>
        Poha: <input type="checkbox" name="food" value="poha"> <br><br>

        City Selection: <br><br>

        <select name="city" multiple>
            <option>Jabalpur</option>
            <option>Jaipur</option>
            <option>Kanpur</option>
            <option>Nagpur</option>
            <option>Raipur</option>
            <option>Badlapur</option>
            <option>Gorakhpur</option>
        </select>

        <input type="submit" value="Save">
    </form>
</body>
</html>