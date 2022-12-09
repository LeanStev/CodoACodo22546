<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" >
        <script src="https://kit.fontawesome.com/f369b813cd.js" crossorigin="anonymous"></script>
        <title>Control de anime</title>

    </head>
    <body>
        <jsp:include page="WEB-INF/paginas/comunes/cabecera.jsp"/>
        <jsp:include page="WEB-INF/paginas/comunes/botonesNavegacion.jsp"/>

        <jsp:include page="WEB-INF/paginas/operaciones/listarAnimes.jsp"/>

        <jsp:include page="WEB-INF/paginas/comunes/pieDePagina.jsp"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

    </body>

    <style>

        body{

        }
        .Titulo{
            font-family: cursive;
        }
        .titulo-container{
            margin: 0 auto!important;

        }
    </style>
</html>