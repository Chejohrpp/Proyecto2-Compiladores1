<%-- 
    Document   : reportCaptcha
    Created on : 11/05/2021, 02:25:03
    Author     : sergi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Utilizacion del captcha</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    </head>
    <body>
        <pre></pre>
        <div class="container">
            <table class="table table-bordered  table-hover table-sm">
                    <thead class="thead-dark">
                    <tr class="table-primary">
                      <th scope="col">Nombre del captcha</th>
                      <th scope="col">Cantidad de veces usadas</th>
                      <th scope="col">Cantidad de aciertos</th>
                      <th scope="col">Cantidad de fallos</th>
                      <th scope="col">Ultima Fecha de utilizacion</th>
                    </tr>
                  </thead>
                  <tbody>                      
                 <c:forEach items="${lista}" var="list">                          
                          <tr>
                            <th scope="row">${list.nombreCaptcha}</th>
                            <td>${list.cantUtilizados}</td>
                            <td>${list.cantAciertos}</td>
                            <td>${list.cantFallos}</td>
                            <td>${list.lastFecha}</td>
                          </tr>
                   </c:forEach>                  
               </table>
        </div>
    </body>
</html>
