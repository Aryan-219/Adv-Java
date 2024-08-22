<%@ page import="java.util.TreeMap" %>

  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Intro</title>
  </head>

  <body>
    <h1>This is intro to jstl</h1>

    <% 
    
    String[] arr1 = {"Aryan", "Anushk" , "Suyash", "Rohit"};
    String[] arr2 = {"Papa", "Mummy" , "Dimpu", "Mahima didi"};
    String[] arr3 = {"Bade Chacha", "Chachi" , "Golu", "Muskan"};
    
    TreeMap< String, String[] > map = new TreeMap();
    map.put("Clg", arr1);
    map.put("UpHome", arr2);
    map.put("DownHome", arr3);

    session.setAttribute("people", map);
    %>

    <a href="next.jsp">show</a>
  </body>

  </html>