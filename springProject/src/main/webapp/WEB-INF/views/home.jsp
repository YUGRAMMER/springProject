<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<ul>
<c:forEach var="user" items="${list}">
	<li>${user.user_id}</li>
</c:forEach>
</ul>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
