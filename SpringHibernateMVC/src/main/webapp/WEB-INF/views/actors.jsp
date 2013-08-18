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

<c:if test="${search == 'true'}">
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Last Updated</th>
            <th colspan="2">Actions</th>
        </tr>
        <c:if test="${empty actors}">
            <tr>
                <td colspan="4">No results found!</td>
            </tr>
        </c:if>
        <c:forEach var="actor" items="${actors}">
            <tr>
                <td>${actor.firstName}, ${actor.lastName}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
