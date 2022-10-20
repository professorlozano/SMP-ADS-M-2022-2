<%@page import="java.util.ArrayList"%>
<%@page import="Business.Global"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function Cadastrar(){
                document.frmAgenda.submit();
            }
        </script>
    </head>
    <body>
        <h1>Agenda</h1>
        <form name="frmAgenda" action="FormularioAgenda" method="get">
            <div>
                <div>Contato</div>
                <div><input type="text" name="contato"/></div>
            </div>
            <div>
                <div>
                    Telefone
                </div>
                <div>
                    <input type="tel" name="telefone"/>
                </div>
            </div>
            <div>
                <div><button type="button" name="btnCadastrar" onclick="Cadastrar()">Cadastrar</button>
            </div>
        </form>      
        <div>
            <br/>
            <h2>Contatos Cadastrados</h2>
            <%
            for(int ind=0;ind< Global.agenda.size();ind++){
                out.print(Global.agenda.get(ind).getNome() + " - " + Global.agenda.get(ind).getTelefone() + "<br/>"); 
            }
            %>
        </div>
    </body>
</html>
