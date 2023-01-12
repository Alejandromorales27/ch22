console.log("sesionjs02")

/* funciones declaradas/FUNCIONES DEFINIDAS

una caracteristica de las funciones declaradas es que tienen hoisting(elevacion)

*/

//const suma 6+7;

console.log(multiplica(5,10))

function multiplica(a,b) {

    return a*b
};

/* funciones expresadas 

las funciones expresadas son funciones que son declaradas dentro de la asignacion de una variable

estas funciones pueden ser anonimas esto quiere decir que no tienen nombre

las funciones expresadas no tienen hoisting(elevacion)

*/


/**
 * suma dos valores
 * @param {number} a primer operador para suma
 * @param {number} b segundo operador suma
 * @returns resulado de a + b
 */
const suma = function(a,b){return a+b
}

console.log(suma(4, 6));

/* las funciones autoinvocadas (selft-invoking)

estas funciones se ejecutan en su definicion pueden ser anonimas

*/

(function saludo(){

    console.log("hola me estoy autoinvocando")

})()

/* funcion flecha

una funcion flecha(arrow function) son similares a las funciones expresadas, pero no requiere la palabra function, ademas si solo tiene una instrucción y es el retorno no requiere la instruccion return y las llaves, no tienen elevación

*/

const restaExpresada = function (a,b){
    return a-b;
}

const resta = (a,b)=> a -b


const exponente = (a, b)=>{
    const result =a**b;return result

}
console.log(exponente(2,4))

/* si se tiene un parametro de entrada no se requiere los parentesis */

const exponenteAlCuadrado= a => a**2
console.log(exponenteAlCuadrado(4))

/* funciones con parametro inicializados
ayuda a evitar errores en la funcion por si el usario no completa los parametros con los argumentos

*/

function divide(a=3, b=1) {
    return a/b;
    
}

console.log(divide())

/* rest parameters
 el parametro rest nos permiten representar una serie de valores indefinidos en los argumentos como un array

 el parametro rest siempre debe ir al final de todo los parametros
*/

function sumatoriaIndefinida(a,b, ...restoDatos){
    let sumatoria =a +b
    
    for (let i = 0; i < restoDatos.length; i++) {
        sumatoria += restoDatos[i];
        
    }
    return sumatoria
}
console.log(sumatoriaIndefinida(2,3,4,6,7))

/* funciones recursivas 

una funcion que se llama a si misma 
un factorial un numero multiplicado por todos sus antecesores
!3=3*2*1
*/

function factorialConCicloFor(a) {

    let factor=1
    for (i = 1 ; i <= a; i++) {
        factor*=i;
        
    }

    return factor;
    
}

function factorialConRecursion(a) {
    if(a<1)return 1;
    return a * factorialConRecursion(a-1)
    
}

console.log(factorialConRecursion(5))


/* a tendre el valor de 5 a es valor a 1 donde retorna a -1 donde esta seria 4 y asi sucesivamente hasta llegar a 1 luego se regresa y ya multiplicando hasta resolver el total de la funcion*/


function saludo(cantidad,iteracion=1) {
    console.log("saludo" + iteracion)
    if(iteracion>=cantidad)return 1;
    return saludo(cantidad, iteracion+1);
}

saludo(10)

