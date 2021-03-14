# Ordena Numeros utilizando Hilos y el método de la Burbuja

### Explicación De Código Fuente

El programa que se explica a continuación implementa hilos que son fundamentales para que realice lo que se pide, mismo que a partir de datos que ingresa el usuario se imprime en una etiqueta y para posteriormente ser ordenado mediante el método de burbuja, en este ejercicio, el programa fue hecho en el entorno de programación (IDE) de NetBeans, asimismo para su compilación y ejecución se utilizó la interfaz que ya trae incorporado este programa.

Para empezar, vamos a presentar el código fuente de la clase principal la cual contiene el método main que es de donde parte el programa para su ejecución, dentro de esta clase instancia la clase Ventana y se establecen características de la ventana que aparecerá en pantalla.

![imagen](https://user-images.githubusercontent.com/71055467/111060507-0080c580-8463-11eb-886a-1a662d121d5f.png)

Ahora pasamos a la clase Ventana que hereda de la clase JFrame necesario para poder crear ventanas, asimismo implementa la interfaz ActionListener quien se encarga de ponerse a la escucha para recibir eventos de acción.

En la primera parte podemos ver la declaración de las librerías que se ocupan en esta clase.

![imagen](https://user-images.githubusercontent.com/71055467/111060512-08d90080-8463-11eb-8fe2-7107ec739787.png)

Dentro de la clase lo primero que vemos es la declaración e inicialización de variables que se utilizan en las siguientes líneas de código.

![imagen](https://user-images.githubusercontent.com/71055467/111060515-0f677800-8463-11eb-99ff-76baae0bbf33.png)

En las siguientes líneas se muestran el estado inicial de la clase o de la ventana, es decir, se encuentra el constructor de la clase, dentro de este se encuentra en primera instancia las dimensiones, el título, y la línea que ordena que una vez cerrado la ventana se termina la ejecución.

La siguiente parte se encuentra la declaración de los componentes de la ventana, los cuales son los botones, el campo de texto y las etiquetas en la cual se almacenan los datos que son introducidos por el usuario.

Después de las líneas descritas anteriormente se presenta el código que determina las dimensiones, posiciones, títulos, se habilitan los botones, se agregan a la lámina, así como la indicación de que tendrán eventos, además se indica el tipo de fuente del texto. Todo esto se indica a cada elemento que se ha creado, es por ello que aparecen líneas similares en cada componente. El código de este método se muestra en las siguientes capturas de pantalla;

![imagen](https://user-images.githubusercontent.com/71055467/111060519-17bfb300-8463-11eb-90cf-2e177d475ee5.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060521-1abaa380-8463-11eb-9d04-45c871e4ef3c.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060526-1d1cfd80-8463-11eb-941d-8d9b25db66cc.png)

El código fuente siguiente se trata del método ordenar de la clase ordenar, como su nombre lo dice se encargará de ordenar los números que el usuario ingresa, esta parte es fundamental ya que con ayuda del método de la burbuja se puede realizar el objetivo planteado, durante la ejecución del programa, se presenta por pasos para entender de la mejor como es que funciona este método de ordenamiento.

![imagen](https://user-images.githubusercontent.com/71055467/111060539-31f99100-8463-11eb-83cb-25b250ed319c.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060568-708f4b80-8463-11eb-8133-e2facf7ac7b9.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060570-7422d280-8463-11eb-94e1-584540494fa2.png)

Como hemos visto, al inicio de la clase se implementó la interfaz ActionListener, pero para hacer uso de esta interfaz, es necesario sobrescribir el método de la interfaz, es por ello que a continuación se muestra dicho método, dentro de este se hacen ciertas acciones, como por ejemplo, al momento de que el usuario digite números dentro del campo de texto, este se irán almacenando dentro de los JLabel que se encuentran dentro de la ventana, y posteriormente se irán mostrando en la ventana para que en la siguiente entrada el programa sepa que ya hay dato almacenado en esos componentes y pase al siguiente campo. Así mismo se tiene que rellenar todos los campos para que se pueda posteriormente ordenar todos los datos.

![imagen](https://user-images.githubusercontent.com/71055467/111060573-7d13a400-8463-11eb-8815-b1d0bc12f179.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060575-800e9480-8463-11eb-8b64-ac5d04dc7b41.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060579-8ac92980-8463-11eb-9646-e96630e74a9d.png)

Las líneas de código que se presentan en seguida se tratan de la clase Ordenar que a su vez hereda de la clase Thread.

En la primera parte se muestran las variables declaradas e iniciadas que serán necesarios en instrucciones posteriores, asimismo se presenta el constructor de la clase donde simplemente se inicia el arreglo del Label;

![imagen](https://user-images.githubusercontent.com/71055467/111060585-94529180-8463-11eb-880d-415370bcbd6d.png)

El lugar donde se ejecuta la acción del subproceso es sin duda el método run, como ya hemos dicho, se trata de un método que viene incluido en la clase Thread, para nuestro caso particular del programa, aquí lo que hace es una pequeña animación para que se ordenen los números que ya se han teclado por el usuario. En este subproceso mueve las etiquetas de una u otra forma dependiendo de donde se desea colocar respecto al método de la burbuja.

El código descrito se muestra en la siguiente captura;

![imagen](https://user-images.githubusercontent.com/71055467/111060588-9e749000-8463-11eb-90fd-c651de4b5ea2.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060590-a3394400-8463-11eb-92d7-5c6f5fe7a650.png)


### Ejecución del programa


Ya que hemos descrito el código fuente pasamos a la ejecución del programa, para ello lo primero que hacemos es correr dicho código y lo que se muestra es la ventana con todos los elementos que se han creado en el código, la evidencia se muestra en la siguiente imagen;

![imagen](https://user-images.githubusercontent.com/71055467/111060595-b5b37d80-8463-11eb-8590-38d9f4c05566.png)

Para que los números sean ordenados lo que tenemos que hacer es ingresarlos, para ello escribimos en el campo de texto el número de nuestro agrado y le damos en el botón de agregar para que se añade en la primera etiqueta que está del lado izquierdo, repetimos lo mismo para agregar los demás números, para ver lo que se describe, podemos visualizar la siguiente captura;

![imagen](https://user-images.githubusercontent.com/71055467/111060597-bd732200-8463-11eb-9450-e7faf9aa074f.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060599-c06e1280-8463-11eb-8b58-843799fad9be.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060600-c49a3000-8463-11eb-8bae-acefe2f3de6e.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060602-c7952080-8463-11eb-8254-55465e072a25.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060604-ca901100-8463-11eb-9868-4e50a8ace7b9.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060605-ccf26b00-8463-11eb-94de-3ca7b628a4b3.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060607-cfed5b80-8463-11eb-9acd-971f9218bd8b.png)
![imagen](https://user-images.githubusercontent.com/71055467/111060608-d2e84c00-8463-11eb-9569-487ba0570275.png)

Ya que se han agregado los cuatro números, vemos que se activa el botón de ordenar, esto quiere decir que ya podemos hacer click para que se empiece a ejecutar el método de la burbuja.

Por esta ocasión, los números se ordenan paso a paso, esto con la finalidad de comprender cómo funciona el método de la burbuja, dicho lo anterior le daremos click en el botón de ordenar y hemos capturado la pantalla justo donde se está haciendo el movimiento de cambio de posición de los Labels primeros.

![imagen](https://user-images.githubusercontent.com/71055467/111060617-daa7f080-8463-11eb-92da-72a288bfed3a.png)

Como ya hemos visto el movimiento de los elementos, ahora si mostramos como quedan ordenados en el primer paso;

![imagen](https://user-images.githubusercontent.com/71055467/111060621-e09dd180-8463-11eb-869a-2bd7c707b512.png)

Para seguir ordenando, lo que tenemos que hacer es volver a dar click en el botón y cambian de posición el primero de lado izquierdo con el primero del lado derecho.

![imagen](https://user-images.githubusercontent.com/71055467/111060623-e98ea300-8463-11eb-8a0c-d6b1caae6931.png)

Seguimos ordenando dando click en el botón y vemos que cambia de posición el número 23 con el 67, esto lo podemos ver en la captura siguiente;

![imagen](https://user-images.githubusercontent.com/71055467/111060630-f4493800-8463-11eb-939e-d76dec23cd06.png)

Si observamos, podemos darnos cuenta de que sólo faltan por ordenarse los dos últimos números que están del lado derecho, y podemos comprobarlo con la siguiente captura,

![imagen](https://user-images.githubusercontent.com/71055467/111060647-0a56f880-8464-11eb-9040-082ab813224f.png)

Ahora ya vemos que todos los números están ordenados de forma ascendente, si queremos comprobar le damos click en el botón, pero nos mostrará un mensaje diciendo que ya han sido ordenados todos los elementos, esto podemos observar en el screenshot siguiente;

![imagen](https://user-images.githubusercontent.com/71055467/111060654-15aa2400-8464-11eb-834d-d743e636d008.png)

Con lo anterior podemos finalizar el programa, y diciendo que efectivamente el método de la burbuja estuvo presente, así como la implementación de la clase Thread y su método correspondiente.
