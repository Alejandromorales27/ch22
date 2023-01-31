// creacion de objetos

const frutasColor={
    fresa:"roja", 
    piña:"amarillo",
    pepino:"verde",
    naranja: "verde-amarilla"
}

//formas de leer un objeto
console.log(frutasColor.fresa);
console.log(frutasColor["pepino"])
const colorFrutaNaranja="naranja"
console.log(frutasColor[colorFrutaNaranja])
frutasColor[colorFrutaNaranja]="amarillo anaranjado"
console.log(frutasColor[colorFrutaNaranja])

for (let frutaColor in frutasColor)//para leer las claves
console.log("clave",frutaColor, frutasColor[frutaColor])

/* for (let frutaColor of frutasColor)//valores del objeto
console.log("valor",frutaColor); */

//uso de Symbol

const oculto = Symbol();

const datosAutomovil={
    modelo:"vochito",
    fabricante:"vw",
    [oculto] : 250_000
}

for (let clave in datosAutomovil)
console.log("Dato", datosAutomovil[clave])


console.log("dato Oculto: " + datosAutomovil[oculto])

localStorage.setItem("automovil", JSON.stringify(datosAutomovil))

/* SOLICITUD DE JAIME */
const words=[ 'hello', 'world', 'javascript']
const capitalizedWords=words.map(word=> word[0].toUpperCase() + word.slice(1));
console.log(capitalizedWords);//mayusculas

//--------------------------------------------
/* se instanciado un objeto del tipo array */

const miArray=[5,7,8,14];
const myArrayWithConstructor = new Array (5,7,8,14)//este es otro metodo
 /* leyendo una propiedad del objeto myArray*/
// propiedad de longitud, las propiedades son caracteristicas del objeto estos no  llevan parentesis
miArray.length
 // metodo para ordenar SORT en minisculas.
 
/* usando el metodo para extraer el 7 y 8 */

miArray.slice(1,3)//se pusieron los indices de los arreglos
console.log(miArray.slice(1,3))/* una accion un metodo y esta funcion tiene parametros
si no se le indica el parametro final se extraer al partir del primer indice
 */

