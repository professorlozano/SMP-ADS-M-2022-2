<%-- 
    Document   : index
    Created on : 29/09/2022, 09:38:33
    Author     : logon
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primeira pagina JSP</title>
    </head>
    <body>
        <%
            out.println("Hello World!!!");
        %>
        <br>
        <%=new Date()%>
    </body>
</html>
