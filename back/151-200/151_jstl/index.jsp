<%@ page import="java.util.HashMap" %>

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

    <a href="next.jsp">Next Page</a>

    <% 
        String[] ramayan = {"ram", "lakshman", "bharat", "shatrughan"};
        String[] mahabharat = {"yudhishthir", "arjun", "bheem", "nakul-sahdev"};
        String[] guptwansh = {"chandragupt", "bindusar", "bimbisar", "ashoka"};

        HashMap<String,String[]> map = new HashMap<>();

        map.put("ramayan", ramayan);
        map.put("mahabharat", mahabharat);
        map.put("guptwansh", guptwansh);

        session.setAttribute("pracheenkal", map);

    %>
</body>
</html>