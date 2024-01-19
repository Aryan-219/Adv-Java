<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>  


<c:if test="${param.num > 75}">  
   <p>My marks is: <c:out value="${param.num}"/><p>  
<p>My marks is: <c:out value="Great"/><p>  
</c:if> 
</body>  
</html>  