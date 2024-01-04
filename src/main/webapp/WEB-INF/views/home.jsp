<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>This is the Home Page</h2>
<p>Home Page is really Simple</p>
<%
    String msg = (String) request.getAttribute("message");
    List<String> f = (List<String>) request.getAttribute("friends");
%>

<h1>Name is <%= msg %></h1>


<% for(String friend : f) { %>
    <h1><%=friend%></h1>
    <% } %>


    </body>
</html>