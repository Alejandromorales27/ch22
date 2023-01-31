console.log("sesion js04")

/*


*/

const nombresCh22 = ["manuel","leonardo","melani"];
const nombresCh14 = new Array("Abue","Cori","Maga","Sebas")
console.log(nombresCh22)
console.log(nombresCh14)

const promedioEdadesCh22 = [25]
/* esta line generara 25 elementos
 */
const promedioEdadesCh14 = new Array(24)

console.log(promedioEdadesCh14.length)
console.log(promedioEdadesCh22.length)
console.log(nombresCh14.join(" "))

/* se recomienda declarar los arrays(objetos) con const
para prevenir que se cambie el tipo de dato */

const armasCh22=["manoplas","picahielo"]
console.log("lista de armas: " + armasCh22)
//cambiar un elemento de un array
armasCh22[0]="filero";
/*leer un elemento de arreglo los objetos son datos mutables*/
console.log(`jessica tiene un ${armasCh22[1]}`)
console.log(`leonardo tiene una ${armasCh22[0]}`)

let nombeClica = "los wichales";
console.log(`la variable ${nombeClica} comienza con la letra ${nombeClica[0] }`)
nombeClica[0] = "T"
/* no cambia porque un string es un dato primitivo que es inmutable
 */
console.log(`la variable ${nombeClica} comienza con la letra ${nombeClica[0] }`)

/* agregamos un nuevo item al final
 */

armasCh22[2]="machete"//
console.log(armasCh22)
armasCh22[armasCh22.length]= "macana"
armasCh22.push(`cadena`)
armasCh22.unshift(`navaja`,`desarmador` )
console.log(armasCh22)

//interar arreglos
/* 
sintaxis
for (let i = 0, i<=20 , i++) instruccion
for (instrucciones de inicio, comparacion , expresion final) instruccion
{      }

for (let i = 0; i<=20 ; i++) instruccion


*/

for (let i = 0; i < armasCh22.length; i++) {
    console.log(armasCh22[1])    
} 

function interarArreglo(elemento,indice,arrelo){

    console.log(`esto se hizo con funcion el${indice},tiene ${elemento}`)
}

armasCh22.forEach(interarArreglo);
armasCh22.forEach((elemento, indice)=> 
console.log(`el indice ${indice},tiene ${elemento}`)  )
//forin itera los indices del arreglo
for (let arma in armasCh22)
console.log(`forIn ${arma}`) 
//forof itera los elementos del arreglo
for (let arma of armasCh22)
console.log(`forof arma: ${arma}`) 


/* for (let i = 0; i < armasCh22.length; i++) {
    console.log(armasCh22[1])    
} 
 */
//iterar de forma descendente las armas

for (let i = armasCh22.length-1; i >=0; i--) {
  console.log(`armas ${armasCh22[i]}`)
}

/* para el ciclo for no es necesario indicar en inicio,
la comparacion, la expresion final*/

let iteracion=0;
for( ; ; ){
    console.log("valor de i" + iteracion)
    if (iteracion===10)break
    iteracion++

}

//la instruccion break rompe con la itereacion.
//la instruccion continue con la siguiente iteracion 

for(let i=0; i<=10; i++){
    if(i===11)break;
    console.log("for con break"+i)
}

for(let i=0; i<=10; i++){
    if(i===5)continue;
    //en el continue se rompe la iterecion pero continua con las iteraciones del for
    console.log("for con break "+i)
}


const participantes =[
    ["josé","Maria","Pedro"],//ch1      
    ["Tan","Javi","Andrea","Santi"],//ch2
    ["Melanie","Pavel"]//ch2
];
                                    //feliz cumpleaños
                                        //F     C
console.log("persona ch3(f2) 2a personaC1" + participantes[2][1]);
console.log("persona ch3(f1) 2a personaC0" + participantes[1][0]);
console.log("persona ch3(f0) 2a personaC2" + participantes[0][2]);
//usando breack en ciclos anidados cuando se encuentre a tan
let continuarIteraciones=true;
for (fila=0; fila<participantes.length; fila++){
    for (columna=0; columna<participantes[fila].length; 
        columna++){
        if(continuarIteraciones)    
        console.log(participantes[fila][columna])
        if(participantes[fila] 
            [columna]==="Tan")continuarIteraciones=false;

    }

} 

//usando break
cicloFila://estas es una etique label para que el break funcionara
for (fila=0; fila<participantes.length; fila++){
    cicloColumna:
    for (columna=0; columna<participantes[fila].length; 
        columna++){
        console.log(participantes[fila][columna])
        if(participantes[fila][columna]==="Tan")break cicloFila;

    }
} 

//utilizando continue
cicloFila:
for (let fila=0; fila<participantes.length; fila++){
    cicloColumna:
    for (let columna=0; columna<participantes[fila].length; 
        columna++){
        if(participantes[fila][columna]==="Javi") continue cicloFila;
        console.log(`[${fila}][${columna}]`)
        console.log("coontinue" + participantes[fila][columna])

    }

} 

/* ciclo while

sintaxis: (condicion_verdadera){
    intrucciones;
}
*/
/* let numeroIteracion=0
while (confirm("quieres seguir iterando")){
    console.log("iteracion n" + numeroIteracion++)
}
 */
//preguntar del 1 al 10 y saber si es el numero que penso
let numeroPensado=0
/* 
while (!confirm("es este tu numero pensado" + numeroPensado++)){
   
    if(numeroPensado===10)break
}
alert("tu numero es " + numeroPensado) */

while( !confirm(`${++numeroPensado} es tu numero?`) );

console.log("tu numero es el " + numeroPensado);

/* ciclo do-while
sintaxis:
do{
    instrucciones
}while (condicion_verdadera);

*/

let valor=10

while( valor < 5) {
    console.log("while" + valor)
    valor++
}

do{
    console.log("do while" +  valor)
    valor++
}while(valor<5);

/* fifo es first in first out
perecederos
lifo es last input first out

*/

const alimentoPerecederos = [];
//agragando una caja
alimentoPerecederos.push("manzanza lunes")
alimentoPerecederos.push("manzanas miercoles")

//sacando las de el lunes
console.log("sacando a la venta"+ alimentoPerecederos.shift())
console.log("sacando a la venta"+ alimentoPerecederos.shift())


//tenemos una ferreteria

const productos = ["desarmadores", "cemento"]
productos.push("luces navideñas")
/* SACANDO LIFO */
console.log("sacando a la venta "+ productos.pop())
console.log("sacando a la venta" + productos.pop());
