<%-- 
    Document   : listaCaptcha
    Created on : 11/05/2021, 02:37:36
    Author     : sergi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Captchas</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
 
    </head>
    <body>
        <pre></pre>
        <div class="container">
            <div class="container">
            <table class="table table-bordered  table-hover table-sm">
                    <thead class="thead-dark">
                    <tr class="table-primary">
                      <th scope="col">Id del captcha</th>
                      <th scope="col">Nombre del captcha</th>
                      <th scope="col">Link</th>
                    </tr>
                  </thead>
                  <tbody>                      
                 <c:forEach items="${lista}" var="list">                          
                          <tr>
                            <th scope="row">${list.id}</th>
                            <td>${list.nombreCaptcha}</td>
                            <td><a href="http://localhost:8080/P2C1/ShowCaptcha?id=${list.id}">http://localhost:8080/P2C1/ShowCaptcha?id=${list.id}</a></td>
                          </tr>
                   </c:forEach>                  
               </table>
        </div>
        </div>
    </body>
</html>
