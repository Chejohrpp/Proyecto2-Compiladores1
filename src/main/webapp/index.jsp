<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MAKE CAPTCHA</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <style>
            textarea{
            background: url(http://i.imgur.com/2cOaJ.png);
            background-attachment: local;
            background-repeat: no-repeat;
            
            }
            #exampleFormControlTextarea1{
                padding-left: 35px;
                padding-top: 10px;
                border-color:#ccc;
                font-size:11px;
                line-height: 1.5;
            }
                .inputfile {
                    width: 0.1px;
                    height: 0.1px;
                    opacity: 0;
                    overflow: hidden;
                    position: absolute;
                    z-index: -1;
            }
            .inputfile + #labelFile {
                /*font-size: 17px;
                font-weight: 700;   
                display: inline-block;*/

                max-width: 80%;
                font-size: 1.25rem;
                font-weight: 700;
                text-overflow: ellipsis;
                white-space: nowrap;
                cursor: pointer;
                display: inline-block;
                overflow: hidden;
                padding: 0.625rem 1.25rem;
                font-size: 30px;
                 background-color: #87EAC5;
                 color: red;
            }

            .inputfile:focus + #labelFile {
                background-color: #68DAB0;
            }

            .inputfile + #labelFile:hover {
                background-color: #68DAB0;
            }

            .inputfile + #labelFile {
                    cursor: pointer; /* "hand" cursor */
            }

            .inputfile:focus + #labelFile {
                    outline: 1px dotted #000;
            }
            .nav-link{
                cursor: pointer;
            }

        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">MAKE CAPTCHA</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Generador de Captcha
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" onclick="limpiar()">Nuevo</a></li>
                        <li><a class="dropdown-item" href="#" onclick="">Guardar</a></li>
                      <li><a class="dropdown-item" href="#">Guardar Como</a></li>
                      <li><a class="dropdown-item" href="#">
                              <form action="MostrarContBrowser" method="POST" enctype="multipart/form-data">
                                <div class="box">
                                    <input type="file" name="archivoGCIC" id="file-4" class="inputfile inputfile-3" data-multiple-caption="{count} files selected" />
                                    <label for="file-4"><span>Abrir un documento...&hellip;</span></label>
				</div>
                                <input class="btn btn-primary" type="submit" value="Enviar Archivo">
                            </form>
                      </a></li>
                      <li><hr class="dropdown-divider"></li>
                      <li><a class="dropdown-item" href="javascript:close_window();">Salir</a></li>
                    </ul>
                  </li>
                  <li class="nav-item">
                      <a class="nav-link active" onclick="showListaSimbolos()">Tabla de simbolos</a>
                  </li>
                  <li class="nav-item">
                      <form id="form1" action="ReportCaptcha" method="post">
                        <a class="nav-link active" href="javascript:;" onclick="document.getElementById('form1').submit();">Reporte de Utilización de los Captchas</a>
                    </form>                                            
                  </li>
                  <li class="nav-item">
                      <form id="formLista" action="ListaCaptcha" method="post">
                        <a class="nav-link active" href="javascript:;" onclick="document.getElementById('formLista').submit();">Listado de Todos los Captchas Generados</a>
                    </form>
                  </li>
                </ul>
              </div>
            </div>
          </nav>
    <pre></pre>
        <div class="container">               
         <div class="row">
            <div class="col">
              <%-- Editor de texto --%>
              <form action="VerificarFileGCIC" method="POST" enctype="multipart/form-data; charset=utf-8">
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="31" wrap="off" name="txt">
                    ${texto}
                </textarea>
                <pre></pre>
                <input type="submit" class="btn btn-primary" value="EnviarGramatica">
            </form>
            </div>
              <c:if test="${mostrar == 1}">                  
                <div class="col">             
                  <div class="row" id="listaSimbolos">
                      <%-- Tabla Simbolos --%>
                      <table class="table table-bordered  table-hover table-sm">
                    <thead class="thead-dark">
                    <tr class="table-primary">
                      <th scope="col">Posicion</th>
                      <th scope="col">Identificador</th>
                      <th scope="col">Tipo</th>
                      <th scope="col">Valor</th>
                      <th scope="col">Modo</th>
                      <th scope="col">Procedimiento</th>
                      <th scope="col">No.Ejecucion</th>
                    </tr>
                  </thead>
                  <tbody>                      
                 <c:forEach items="${listaSimbolos}" var="sym">                          
                          <tr>
                            <th scope="row">${sym.posicion}</th>
                            <td>${sym.identificador}</td>
                            <td>${sym.tipo}</td>
                            <td>${sym.valor}</td>
                            <td>${sym.modo}</td>
                            <td>${sym.procedimiento}</td>
                            <td>${sym.noEjecucion}</td>
                          </tr>
                    </c:forEach>                  
                  <%--  <tr>
                       <th scope="row">1</th>
                       <td>Texto</td>
                       <td>String</td>
                       <td>Hola muy buenas, como les....</td>
                       <td>Global</td>
                       <td>PROCESS_write()</td>
                       <td>22</td>
                     </tr>                 
                  </tbody> --%>
                  
                </table>
                    </div>
                 <c:if test="${success == 0}">
                  <div class="row">
                      <pre></pre>
                    <%-- Errores --%>                   
               <div class="alert alert-danger" role="alert">
                Hubo Errores de compilacion
              </div>
               <table class="table table-bordered  table-hover table-sm">
                    <thead class="thead-dark">
                    <tr class="table-danger">
                      <th scope="col">Tipo de Error</th>
                      <th scope="col">Linea</th>
                      <th scope="col">Columna</th>
                      <th scope="col">Descripcion</th>
                      <th scope="col">Solucion</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach items="${listaErrores}" var="error">                          
                          <tr>
                            <th scope="row">${error.tipoError}</th>
                            <td>${error.linea}</td>
                            <td>${error.columna}</td>
                            <td>${error.descripcion}</td>
                            <td>${error.solucion}</td>
                          </tr>
                      </c:forEach>
                  </tbody>
                </table>                   
                  </div>
                </c:if>
                </div>
            </c:if>  
          </div>                    
          <c:if test="${success == 1}">
                <pre></pre>
                <div class="alert alert-success" role="alert">
                        <p>Creado correctamente el Captcha</p>
                        <p>Link: </p>
                        localHost:8080/P2C1/ShowCaptcha?id=${ID}                        
                </div>    
            </c:if>            
        </div>
      <script src="https://cdn.jsdelivr.net/npm/jquery@3.2.1/dist/jquery.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
      <script>
          function limpiar(){
              document.getElementById("exampleFormControlTextarea1").value = "";
          }
          function close_window() {
            if (confirm("Seguro que quierre cerrar la pestaña?")) {
              this.window.close();
            }
          }
      </script>
      <script>
       function showListaSimbolos() {
         var x = document.getElementById("listaSimbolos");
         if (x.style.display === "none") {
           x.style.display = "block";
         } else {
           x.style.display = "none";
         }
       }
       </script>
      <script>
          'use strict';

        ;( function ( document, window, index )
        {
                var inputs = document.querySelectorAll( '.inputfile' );
                Array.prototype.forEach.call( inputs, function( input )
                {
                        var label	 = input.nextElementSibling,
                                labelVal = label.innerHTML;

                        input.addEventListener( 'change', function( e )
                        {
                                var fileName = '';
                                if( this.files && this.files.length > 1 )
                                        fileName = ( this.getAttribute( 'data-multiple-caption' ) || '' ).replace( '{count}', this.files.length );
                                else
                                        fileName = e.target.value.split( '\\' ).pop();

                                if( fileName )
                                        label.querySelector( 'span' ).innerHTML = fileName;
                                else
                                        label.innerHTML = labelVal;
                        });

                        // Firefox bug fix
                        input.addEventListener( 'focus', function(){ input.classList.add( 'has-focus' ); });
                        input.addEventListener( 'blur', function(){ input.classList.remove( 'has-focus' ); });
                });
        }( document, window, 0 ));
      </script>
    </body>
</html>
