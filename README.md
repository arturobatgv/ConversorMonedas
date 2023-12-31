<h1 align="center"><p align="center"> CHALLENGE ALURA: CONVERTER </p>
<img src="src/imagenes/imagenesReadme/PortadaConverter.png">
</h1>
<p align="center">
<img src="src/imagenes/imagenesReadme/relaease-date-july.svg">
<img src="src/imagenes/imagenesReadme/conversor-unidades.svg">
<a href = "https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html"><img src="src/imagenes/imagenesReadme/java-swing.svg"></a>
<a href = "https://currencyfreaks.com/documentation.html"><img src="src/imagenes/imagenesReadme/using-currencyfreaks.api.svg" ></a>
<a href = "https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html"><img src="src/imagenes/imagenesReadme/java-hashmap.svg"></a>
</p>

## Introduccion
<p>El proyecto <strong>Converter</strong> fue creado para cumplir con un desafío impuesto por las empresas Alura y Oracle. El objetivo del desafío era crear un conversor de monedas con Java Swing. En este proyecto se crearon cuatro conversores: <strong>un conversor de monedas o divisas, un conversor de peso, un conversor de distancia y un conversor de temperatura</strong>. Cada uno de los conversores fue creado con una interfaz intuitiva para el usuario y con un diseño bonito.</p>

## Descripción del proyecto


<p>La aplicación de escritorio <strong>Converter</strong> es una herramienta que contiene cuatro programas en uno. Cada uno de los programas realiza una conversión diferente: conversión de monedas o divisas, conversión de peso, conversión de distancia y conversión de temperatura.</p>

<p align="center"><img src="src/imagenes/imagenesReadme/converter.png"></p>

<p>El conversor de monedas utiliza una API llamada <em>currencyfreaks.api</em> para extraer los valores de las monedas de todo el mundo al momento. El conversor de unidades de peso y distancia utilizan la misma lógica, utilizando un <em>HashMap</em> de la librería util de Java, en el cual se creó un diccionario de datos con los valores de cada una de las unidades a convertir específicas. Por último, el conversor de temperatura funciona con métodos donde están las fórmulas de cada una de las conversiones.</p>

## Estado del proyecto

La aplicación de escritorio <strong>Converter</strong> está en funcionamiento, pero se encuentra en espera de actualizaciones. Se está trabajando en mejorar el código para lanzar nuevas versiones 👨🏼‍💻👨🏼‍🔧. La API utilizada para extraer los valores de las monedas de todo el mundo al momento se llama <em>currencyfreaks.api</em>. Desafortunadamente, esta API tiene una licencia gratuita que restringe muchos servicios. Por ejemplo, solo te otorga 1000 llamadas a la API y actualiza las monedas cada 12 horas ⚠️. Esto significa que va retrasado por 12 horas en la actualización de las monedas. Además, solo te otorga las consultas como moneda base los USD, por lo que se tuvo que implementar diferentes algoritmos para que te retorne los cambios de monedas especificados en el desafío. Esto afecta el performance del proyecto 😔.

## Características de la aplicación y demostración
<strong>Converter</strong> cuenta con 7 interfaces que tienen un diseño amigable con el usuario, con indicaciones claras y concisas, flexibles y atractivas para el usuario. Estas interfaces las puedes utilizar para navegar dentro de la aplicación la cual te brinda 4 distintos tipos de conversores.

<p align="center"><img src="src/imagenes/imagenesReadme/interfaces.gif"></p>

<p>Al entrar al programa verás las siguientes Interfaces:</p>

1) **Interfaz Principal**

La interfaz principal de **Converter** muestra cuatro recuadros que contienen los cuatro conversores que contiene el programa. Para empezar a hacer conversiones, el usuario debe hacer clic en el recuadro del conversor seleccionado.
<p align="center"><img src="src/imagenes/imagenesReadme/interfazPrincipal.gif"></p>

<a name="distancia"></a>

2) **Interfaz Distancia** 

En esta interfaz se muestra el conversor de distancia. Para convertir un peso, el usuario debe ingresar el peso a convertir y seleccionar la conversión deseada haciendo clic en el menú desplegable que contiene las unidades de medida de peso (`kilogramos`, `gramos`, `miligramos`, `libras`, `onzas` y `toneladas`).

<p align="center"><img src="src/imagenes/imagenesReadme/Desplieguecombo.gif"></p>

Una vez seleccionada la primera unidad de medida, el usuario debe seleccionar la segunda unidad de medida en el otro menú desplegable. El resultado se mostrará inmediatamente.

<p align="center"><img src="src/imagenes/imagenesReadme/resultadoDistancia.gif"></p>

Es importante mencionar que el conversor valida que el usuario haya ingresado un valor numérico para convertir. Si el usuario no ha ingresado ningún valor o si el valor ingresado no es numérico, se mostrará una alerta.

<p align="center"><img src="src/imagenes/imagenesReadme/errorDistancia.png"></p>

Además, se ha agregado un botón de inversión que permite cambiar las unidades dev medida de forma inversa para convertir en la dirección opuesta.

<p align="center"><img src="src/imagenes/imagenesReadme/inversionDistancia.gif"></p>

<p>Si el usuario desea copiar el resultado de la conversión, puede hacerlo haciendo clic en el botón “Copiar”. El resultado se copiará automáticamente al portapapeles.</p>
<a name="regresar"></a>
<p>Por último, se ha agregado un botón de color rojo que permite al usuario regresar a la interfaz principal en caso de que desee experimentar con otros conversores. Al hacer clic en el botón, aparecerá una pantalla emergente que le pedirá al usuario que confirme si desea regresar a la interfaz principal. Si el usuario desea quedarse en el conversor actual, puede hacer clic en “No” o salir del programa.</p>

<p align="center"><img src="src/imagenes/imagenesReadme/regresarDistancia.png"></p>

3) **Interfaz Peso**

Esta interfaz funciona de misma forma que la [interfaz Distancia](#distancia) esta creada con la misma lógica.
<p align="center"><img src="src/imagenes/imagenesReadme/peso.png"></p>

4) **Interfaz Moneda**

Esta interfaz te permite elegir entre dos tipos de conversores: uno que convierte `pesos mexicanos` a `dolar`, `euro`, `libra`, `yenes`; y otro que convierte estas monedas a `pesos mexicanos`. Para acceder a estos conversores, solo tienes que hacer clic en los botones que se encuentran en la parte inferior de la pantalla. 

<p align="center"><img src="src/imagenes/imagenesReadme/formularioMoneda.gif"></p>

Cabe mencionar que esta interfaz, también cuenta con un botón [regresar](#regresar) sirve de la misma forma que el anterior formulario.

<a name="pesos"></a>

5) **Interfaz pesos mexicanos a otra moneda**

En la interfaz de conversión de moneda, puedes convertir pesos mexicanos a `dolar`, `euro`, `libra`, `yenes`. Esta interfaz cambia un poco la dinámica de uso que las demás interfaces, ya que solo cuenta con un combo box para realizar las conversiones. Al seleccionar la unidad de la caja de despliegue, realizará la conversión de forma instantánea.

<p align="center"><img src="src/imagenes/imagenesReadme/pesos mexicanos.gif"></p>

Los demás botones funcionan de igual forma que la [interfaz Distancia](#distancia) esta creada con la misma lógica.

6) **Interfaz otra moneda a pesos mexicanos**

Esta interfaz funciona de misma forma que la [interfaz pesos mexicanos a otra moneda](#pesos) esta creada con la misma lógica. Solo que esta funciona de manera inversa, ya que convierte `dolar`, `euro`, `libra`, `yenes` a `pesos mexicanos`.

<p align="center"><img src="src/imagenes/imagenesReadme/otramoneda.png"></p>

7) **Interfaz temperatura**

Por último tenemos la interfaz temperatura, esta de igual forma es parecida a las demás interfaces, solo que se maneja solo con una lista desplegable como la [interfaz pesos mexicanos a otra moneda](#pesos).

<p align="center"><img src="src/imagenes/imagenesReadme/temperatura.png"></p>

## Tecnologías utilizadas

- Java 8
- Java Swing
- NetBeans

## Autores

[<img src="https://avatars.githubusercontent.com/u/129329847?s=400&u=c73b589500573ba51c005eca5ca88dee646bcceb&v=4" width=115><br><sub>Sergio Arturo González Vera</sub>](https://github.com/arturobatgv) 
