<%@ taglib prefix="x" uri="http://Custom-Tag/example-of-tag" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>
    <body>
        <h1>Index Page</h1>
        <%-- <x:pro /> 
        ______________________________
        <x:pro > </x:pro>
        ______________________________
        <x:pro >12</x:pro>
        ______________________________
       <x:pro ><%= 34%></x:pro> 
        ______________________________
        <x:pro >${88}</x:pro>
        ______________________________

        <x:pro>
            <c:out value="ami tumake" />
        </x:pro>

        --%>

    <h1>

        -------------------------------------
    </h1>
        <h2>for attribute</h2>
        <%-- <x:pro name="${'aryyyy'}" age="<%= 12 %>" /> --%>
        <%-- <x:pro name="${'aryyyy'}" age="${66}" />--%>
        <x:pro name="${'aryyyy'}" />
    </body>
</html>