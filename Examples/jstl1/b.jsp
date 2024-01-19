<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <%-- 
    
    <% 
    TreeMap<String, String[]> map = (TreeMap)session.getAttribute("people"); 
        Set<String> set = map.keySet();
            for(String key : set){
                %>
                <%
                String[] arr = map.get(key);
            for(String x : arr){
                %>
                <%= x %>
                
                <% } %>
                
                
    <% } %>
    --%>

    
    <%-- 
    %%%%
    <c:forEach var="entry" items = "${people}" varStatus="n">

          <c:out value="${entry.value[n.count]}" /> 
          <%-- <c:forEach var="arrobj" items="${entry.value}" >
                    <c:out value="${arrobj}" />
                    
                </c:forEach>
                --%>

    </c:forEach> 
    %%%%%
    --%>
</body>
</html>