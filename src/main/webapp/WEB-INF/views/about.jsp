<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

<%
  String msg = (String) request.getAttribute("message");

%>

<h1> <%-- <%= msg %> --%>
${message}</h1>

<p>About Page is really Simple</p>
<c:forEach var="student" items = "${students}">
<h1> <c:out value="${student.key}" />  : <c:out value="${student.value}" /></h1>
</c:forEach>

    </body>
</html>