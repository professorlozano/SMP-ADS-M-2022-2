<%-- 
    Document   : index
    Created on : 29/09/2022, 10:07:07
    Author     : logon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String msg = "Unicsul";
            out.println("<font color = 'red'>");
            for(int i=0;i < 10;i++){
                out.println(msg +"<br>");
            }
            out.println("</font>");
        %>
    </body>
</html>
