<%@ page import="java.util.ArrayList" %>

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

        ArrayList<String[]> list = new ArrayList<>();

        list.add(ramayan);
        list.add(mahabharat);
        list.add(guptwansh);

        session.setAttribute("pracheenkal", list);


    %>
</body>
</html>