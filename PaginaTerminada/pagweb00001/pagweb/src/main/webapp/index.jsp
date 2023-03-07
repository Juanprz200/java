<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/estilo.css">
    <title>formulario de la eps</title>
</head>
<body>

<div class="contenedor">
    <header class="superior">
        <div class="logo">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRQHN_A0JP_8JkmtvN5jml4TyCkFAJ0fd-3ABQN4LnMN5R8mSY-LOm5HKEjWhLJ8XHA5k&usqp=CAU">
        </div>

        <nav class="menu">
            <ul class="opcions">
                <li><a href="" target="_self">Citas</a></li>
                <li><a href="" >Medicamentos</a></li>
                <li><a href="" >Laboratorios</a></li>
                <li><a href="" >Contactenos</a></li>
            </ul>

        </nav>
    </header>
    <div class="contenedor-principal">
        <button id="flecha-izquierda" class="flecha-izquierda"><i class="fas fa-arrow-circle-left"></i> </button>
        <div class="contenedor-corousel">
            <div class="carousel">
                <div class="slider"><img src="https://simaro.co/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/B/a/Barbie-Carreras-de-Mdico-de-la-Mueca-Pelo-Rubio-con-Estetoscopio---.jpeg" alt="" whidth="800" height="400"></div>
                    <video src="https://www.youtube.com/watch?v=F8JaA_xCUsE" controls="play" whidth="700" height="400"></video>
                <div class="slider"><img src="https://cdn.milenio.com/uploads/media/2021/08/04/lanzan-coleccion-barbie-honor-cientificas.jpg" alt="" whidth="800" height="400"></div>
            </div>
        </div>
        <button id="flecha-derecha" class="flecha-derecha"><i class="fas fa arrow-circlel-right"></i> </button>
    </div>

  <div class="contenedor"></div>

<form action="servletAgenda"method="get">
    <label for="nombre">Nombre del paciente</label><br/>
    <input type="text" id="nombre" name="paciente" placeholder="nombre del paciente"><br>
    <label for="">Cedula</label><br>
    <input type="text" id="cedula" placeholder="Cedula"><br>
    <label for="eps"></label>
    <input  type="text" id="eps" placeholder="eps"><br>
    <label for="direccion"></label>
    <input type="text" id="direccion" placeholder="direccion"><br>
    <label for="especialidad"></label>
    <input type="text" id="especialidad" placeholder="direccion"><br>

    <label for=""></label>
    <input type="radio" name="sexo" value="masculino">masculino
    <input type="radio" name="sexo" value="femenino">femenino

    <label for="">Observaciones</label>
    <textarea name="observacion" id="" cols="30" rows="10"></textarea>

    <input class="boton" type="submit" name="agendamiento" value="agendar">
    <input class="boton" type="submit" name="agendamiento" value="consultar">
    <input class="boton" type="submit" name="agendamiento" value="cancelar"> <br><br>

</form>


</body>
</html>