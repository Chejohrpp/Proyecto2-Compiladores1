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
                      <li><a class="dropdown-item" href="#">Guardar</a></li>
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
                    <a class="nav-link active" href="#">Reporte de Utilización de los Captchas</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link active" href="#">Reporte de Errores de Compilación</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link active" href="#"> Tabla de Símbolos en Tiempo Real</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link active" href="#">Listado de Todos los Captchas Generados</a>
                  </li>
                </ul>
              </div>
            </div>
          </nav>
    <pre></pre>
        <div class="container">
                <form action="VerificarFileGCIC" method="POST" enctype="multipart/form-data; charset=utf-8">
                <textarea class="form-control" id="exampleFormControlTextarea1" rows="31" wrap="off" name="txt">
                    ${texto}
                </textarea>
                <pre></pre>
                <input type="submit" class="btn btn-primary" value="EnviarGramatica">
            </form>
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
