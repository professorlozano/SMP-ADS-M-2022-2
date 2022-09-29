<%-- 
    Document   : index
    Created on : 29/09/2022, 10:17:32
    Author     : logon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{border: 1px black solid;}
            td{background-color: #ccf;}
        </style>
    </head>
    <body>
        <h1>Projeto 5</h1>
        <table>
            <%
                int contador = 1;
                for(int i=0; i<15;i++){ %>
                    <tr>
                        <%
                            for(int j=0; j<15;j++){%>
                                <td><%=contador++%></td>
                            <%}%>
                    </tr>
                <%}%>            
        </table>
    </body>
</html>
