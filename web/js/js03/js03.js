console.log("sesiónjs03")

/* declaracion de bloque

esto es una declaracion de bloque en donde las variables declaradas (let, const) solo tendran alcance dentro del bloque o bloque anidados dentro del bloque


*/

const datosUsuario = {nombre:"jessica", ciudad:"CDMX"}

console.log(datosUsuario.nombre + datosUsuario.ciudad)

{
    const datosUsario = {nombre:"wicho",ciudad:"aguascalientes"}

    const numPersonas = 49

    console.log(`${datosUsario.nombre} nos saluda de ${datosUsario.ciudad}`)
}


/* sintaxis

condicion if

if(condicionVerdadera) intruccion;

if(condicionVerdadera) {
    instrucciones; if(condicionVerdadera)


}


*/

//const respuesta = confirm("¿te gusta shakira?")
//console.log(respuesta)
//let mensaje;

//if (respuesta) { 
   // let mensaje="holi como estas"
   //alert(mensaje="entonces te pongo waka waka")
//}
//else 
//alert(mensaje="entonces metalika")

/* operador ternario

operador de condional más corto que los if son como if minis
sintaxis: condicion ? condicion_verdadera : condicion _falsa;

*/


//let teamFrio= confirm ("¿te gusta el frio?")
//let mensajeTernario = teamFrio ? "hielito" : "ponche"

//console.log(`te voy a servir ${mensajeTernario}`)
let teamFrio=true
console.log(`te voy a servir: ${teamFrio ? "hielito":"ponche"}`)

let cantante = "sergio"
console.log(`tu relog es ${ cantante==="shakira" 
? "rolex": cantante==="pique" ? "casio":"el sol"}`);

/*
    let marcaReloj;
    if( cantante === 'Shakira' ) marcaReloj = "Rolex";
    else{
        if( cantante === 'Pique') marcaReloj = "Casio"
        else marcaReloj = "el sol";
    }
    console.log(`Tu reloj es ${ marcaReloj})
*/

/* condicional if, else, else if 

if(condicionVerdadera) {
    instrucciones; if(condicionVerdadera)
    else if (segundaCondicion) instruccion
    else if (terceraCondicion) instruccion
    else instruccion;
    

*/
 let nombrePersona="karla";
let marcaReloj;
    if( nombrePersona === 'Shakira' ) marcaReloj = "Rolex";
    else if( nombrePersona === 'Pique' ||
         nombrePersona==="karla") marcaReloj = "Casio"
    else if( nombrePersona === 'sergio')
         marcaReloj = "el sol"
    else marcaReloj = "uno de cars";
    
    console.log(`${nombrePersona} Tu reloj es ${ marcaReloj}`) 

    /* operadores logicos and(&&) y or (||)
    
    A     B       C
    TRUE  TRUE   TRUE
    TRUE  FALSE  FALSE
    FALSE FALSE  FALSE

    OR

     A     B       C
    TRUE  TRUE   TRUE
    TRUE  FALSE  TRUE
    FALSE TRUE  TRUE
    FALSE FALSE FALSE
    
    */


  /* condicional swich 
  
  swich(expresion){
    case valor1:
        instrucciones
        break;
    caso valor2:
        instrucciones;
        break
    caso valorn:
        instrucciones
        break;
    defaul:
        instrucciones
  }
  
  
  */

  nombrePersona = `karla`;
  marcaReloj='';

  switch(nombrePersona){
    case 'shakira':marcaReloj = 'Rolex';
            break;
    case 'pique': marcaReloj = 'casio';
            break;
    case 'sergio': marcaReloj ='el sol';
            break
    default: marcaReloj ='uno de cars';
  }

/*   console.log(`swich - ${nombrePersona} tu reloj es ${marcaReloj}`) */

/* preguntar de numero de mes del 1 al 12 y de acuerdo al mes indicado en consola la estacion del año:

mes 12,1,2 = invierno
mes 3 4 5= primavera
mes 6 7 8 = verano
mes 9 10 11=otoño

*/

/* let mes=parseInt(prompt("en que mes naciste"))
let estacion; */



/* switch(mes){
    case mes === 12||mes === 1 ||mes === 2 :estacion = 'invierno';
            break;
    case 3|| 4||5 :estacion = 'primavera';
            break;
    case 6||7||8: estacion ='verano';
            break;
    case 9||10||11: estacion ='otoño';
        break;
  } */

  /* if( mes === 1 ) estacion = "invierno y el mes enero";
    else if( mes === 2)  estacion = "invierno y el mes es febrero"
    else if( mes === 3)  estacion = "primavera y el mes es marzo"
    else if( mes === 4)  estacion = "primavera y el mes es abril"
    else if( mes === 5)  estacion = "primavera y el mes es mayo"
    else if( mes === 6)  estacion = "verano y el mes es junio"
    else if( mes === 7)  estacion = "verano y el mes es julio"
    else if( mes === 8)  estacion = "verano y el mes es agosto"
    else if( mes === 9)  estacion = "otoño y el mes es septiembre"
    else if( mes === 10)  estacion = "otoño y el mes es octubre"
    else if( mes === 11)  estacion = "otoño y el mes es noviembre"
    else estacion = "invierno y el mes es diciembre"

  console.log(`la estacion es ${estacion}`) */

  //---------Refactorizando
/* function factorial( number ){
    if( number < 1) 
        return 1;
    return number * factorial( number - 1 ) */

/* console.log("Factorial 5 = " + factorial(5) ); //120 */


/* function factorialTernario(number){
 number * factorialTernario(number-1)
} */
//let mensajeTernario = teamFrio ? "hielito" : "ponche"
let number;
function factorial(number) {
    return number <1 ? 1 :number*factorial(number-1) 
}
/* 
fifo first in first out
lifo ultimo en entrar ultimoo en salir
numero de ciclos indeterminado seria while
cuando sabemos cual es se usa for



*/
console.log(factorial(6))


