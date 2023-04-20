<%-- 
    Document   : CaninoSeleccionado
    Created on : 19/04/2023, 7:31:35 p. m.
    Author     : WORKING
--%>

<%@page import="MODELO.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mascota Seleccionada</title>
        <link href="eleminarM.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form class="mascota">
        <h1>Tu mascota:</h1>
        <%
            
            session = request.getSession();
            
            Canino canino = (Canino) session.getAttribute("caninoGuardado");
            Felino felino = (Felino) session.getAttribute("felinoGuardado");
            
            String tipoM = request.getParameter("tipoMascota");
            String nombreB = request.getParameter("nombreb");
                    
            String mascota ="";
            if (canino != null || felino != null ){
            if (tipoM.equalsIgnoreCase("canino")){
            mascota+= canino.eliminarCanino(nombreB);
            %>
            <p><%=mascota%></p><br> 
            <a href="index.html" class="btn">Retirar</a>
            
            <%
            }else if(tipoM.equalsIgnoreCase("felino")){
            mascota+= felino.eliminarFelino(nombreB);
            %>
            <p><%=mascota%></p>
            <a href="index.html" class="btn">Retirar</a>
            <%
            }else{
            %>
            <p>Mascota no registrada</p>
            <a href="index.html" class="btn">Registrar Mascota</a>
            <%
}
            
            }else {
            %>
            <p>Aun no hay mascotas registradas!!</p>
            <a href="index.html" class="btn">Registrar Mascota</a>
            <%
            }
            
            %>
            </form>
    </body>
</html>
