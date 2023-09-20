<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
</head>
<body>
    <h1>Hello, JSP!</h1>
    
    <%-- Java code embedded within JSP --%>
    <%
        String name = "John";
        out.println("Welcome, " + name);
    %>
    
    <p>This is a simple JSP example.</p>
</body>
</html>
