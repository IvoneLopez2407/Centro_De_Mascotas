<%-- 
    Document   : CONTROLADOR
    Created on : 15/04/2023, 8:01:21 p. m.
    Author     : WORKING
--%>

<%@page import="CONTROLADOR.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
         import="java.util.*, MODELO.*"
         %>
<html>
<head>
    <title>Consultar Mascotas</title>
    <link href="consultarmascotas.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <form action="index.html" method="post">
        
    <h1>Lista de Mascotas 
        <a href="index.html" class="btn">Menu Principal</a>
    </h1>
    
    </form>
    <form class="formgen">
        
    
       <%
    
    session = request.getSession();

    
    Canino canino = (Canino) session.getAttribute("caninoGuardado");
    Felino felino = (Felino) session.getAttribute("felinoGuardado");
    
    
    
    
                
                    String prom = "";
                    if (canino != null && felino != null){

                    prom = "Promedio de edad de las macotas: "+
                    (canino.sumaedades()+felino.sumaedades()) /
                    ((double)canino.obtenerCantidad()+(double)felino.obtenerCantidad());
                    out.println(prom+"<br>");

                   }else if (canino != null && felino == null){
                   prom= "Promedio de edad de las macotas: " + canino.calcularPromedioEdad();
                   out.println(prom+"<br>");
                    }else if (canino == null && felino != null){
                    prom = "Promedio de edad de las macotas: " + felino.calcularPromedioEdad();
                    out.println(prom+"<br>");
                    }

                   if ( canino != null){
                   String cantCan = "Numero de Caninos: "+canino.obtenerCantidad();
                    out.println(cantCan+"<br>");
                    }

                    if (felino != null){
                    String canFel = "Numero de Felinos: "+felino.obtenerCantidad();
                    out.println(canFel+"<br>");
                    }


                    %>
    <hr><br>                
    <h2>Caninos: </h2>
    
                    <%
    
    
    if (canino != null && canino.getListaCanino().size()!= 0) {
      
      
      Iterator it = canino.getListaCanino().iterator();
                while ( it.hasNext() ) { 
                Object objeto = it.next(); 
                Canino can = (Canino)objeto; 
                
                out.println(can+"<hr><br>"); 
                }
                
           %>
      
          <%
            } else {

          %>
              <p>No hay caninos registrados.</p>
          <%
            }
        %>
            <h2>Felinos: </h2>
            <%
            if (felino != null && felino.getListaFelino().size()!=0){
            Iterator it2 = felino.getListaFelino().iterator();

            while(it2.hasNext()){
            Object objetod = it2.next(); 
            Felino fel = (Felino)objetod;

            out.println(fel+"<hr><br>");
            }
            
        }else{


          %>
          <p>No hay felinos registrados</p>
          <%
              }
              %>
        </form>
            
    
        
</body>
</html>
