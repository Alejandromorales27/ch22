console.log("Sesión js05")


/* operador de asignacion */
{
    let espaniol = ingles = rumano = turco = vasco = chino = true;

}

console.log("Francisco habla ingles = " + ingles);
console.log("Francisco habla rumano = " + rumano);
console.log("Francisco habla turco = " + turco);
console.log("Francisco habla vasco = " + vasco);
console.log("Francisco habla chino = " + chino);

let estadoDimutoMexico = "tlaxcala"

/* operadores aritmetico 
multiplicacion 
*/
let metrosCuadrados = 10*30; //300
//dos terrenos
/* metrosCuadrados = metrosCuadrados*2; */

/* se puuede ocupara operadores simplificados */

metrosCuadrados*=2

//division
//dividimos el terreno entre los 3 hijos
metrosCuadrados /=3 

console.log("m2 de 3 terrenos" + metrosCuadrados)

//residuo %
//quiero saber si los metrosCuadrados son multiplo de 2
let esMultiplo2=metrosCuadrados% 2 === 0 ? "si":"no;"
console.log("¿La cantidad es multiplo de 2? " + esMultiplo2)

//resta - 
let precioTerrerno =90000
let precioM2 = precioTerrerno/300 
console.log("Precio del Metro cuadrado: " + precioM2 + " pesitos")

let cantidadPagada = 30000;
let cantidadRestante = precioTerrerno - cantidadPagada;
console.log("cantidad restante " +  cantidadRestante)
// se abono 10,000
console.log("cantidad restante " +  (cantidadRestante-=10000))
//suma 
// cobro la generacion de escrituras(8% costo del terreno)
const costoEscrituras= precioTerrerno*0.08;
console.log("cantidad restante " +  (precioTerrerno +costoEscrituras))
//concatenacion de strings

let nombre="alan ";
nombre += "garcia";
console.log("Nombre personas ch22 " + nombre)

/* operadores de incremento y decremento 
preincremento ++variable
postincremento variable ++
predecremento -- variable
postdecremento variable--
se incrementa o decrementa en una unidad
*/

let numClavosParaMiCasa = 100;
numClavosParaMiCasa++
console.log("numero de clavos" + numClavosParaMiCasa)
++numClavosParaMiCasa
console.log("numero de clavos" + numClavosParaMiCasa)
console.log("numero de clavos" + numClavosParaMiCasa++)
console.log("numero de clavos" + ++numClavosParaMiCasa)

/* ------------------------ */

let respuestaExamen = 95;
//agragamos punto extra
console.log("resultado final:" + respuestaExamen++)

respuestaExamen=82;

do{
console.log("resultado " + respuestaExamen)
}while(++respuestaExamen <= 100)
console.log("resultado final " + respuestaExamen)

let nivelSuenio = 99;
if (nivelSuenio++ === 100) console.log("me voy a mimir en la sesion");
console.log("nivel de sueño " + nivelSuenio)

let x = 10;
x = x + 1;
console.log(x);

/* postincremento */

let y = 10;
console.log(y);
y = y + 1;

/* -------------- */

x=3
y=x++
console.log("x: " + x + "y" + y)

x=3
y=++x
console.log("x: " + x + "y:" + y)

/* operadores relacionales 

 <= menor o igual que
 >=mayor o igual que
 < menor que
 > mayor que

*/
let numPerfumes = 10;
if (numPerfumes >= 10 ) console.log("que elegancia la de francia")

/* operadores de igualdad

== operador igual 
=== estrictamente igual
!= diferente que
!== estrictamente diferente que 

*/

let numMatriculaPavel ="10025"

if (numMatriculaPavel==10025) console.log("pavel esta aprobado");
if (numMatriculaPavel===10025) console.log("pavel esta en nivel fase 5");
if (numMatriculaPavel>=10025) console.log("pavel esta en el cucei");

 /* operadores logicos 
 // &&AND || OR 
 */

 let numRebosos = 3;
 let teGustaReboso=false
 let vivesENElExtrangero=false
 if(numRebosos>5 || teGustaReboso)console.log("te regalo un reboso de oaxaca")

 if(numRebosos>0 || teGustaReboso && vivesENElExtrangero)
 console.log("te vendo mi reboso en dolares")
 /* operadores de cortocircuito
 
 OP1 && OP2 SI OP1=TRUE, SE REALIZA EL RESULTADO EN OP2
 */
let online = true
let mensaje = "estamos en linea"
let respuesta = online && mensaje;
console.log("respuesta " + respuesta)

let edadPersona = 18;
mensaje = "puede votar";
console.log("la persona puede votar? " + (edadPersona>=18 && mensaje))

//OP1 || OP2 SI OP1 =TRUE, SE REALIZA EL RESULTADO DE OP1

let isOnline = true
let isActive = true

if(isOnline){
    if(isActive)
        console.log("estamos in")
}

if (isOnline && isActive)
    console.log("estamos in con and")

isOnline && isActive && console.log("esto es con el and") 

let edadMiSobrina= 15;
console.log(edadMiSobrina>18 && "puede votar")
let numDeQuesadillasAcomer = "3";
let guisado ="huitlacoche"
console.log("monse comera quesadilla de: "+ (numDeQuesadillasAcomer && guisado))
let nombreConductor="pax"
let tieneLicenciaConducir = true;
let edadConductor=50;

const seRentaAuto = nombreConductor && tieneLicenciaConducir && edadConductor<60;
console.log("resultado " + seRentaAuto)

const datosQuesadilla={
    tortilla:"maiz",
    tieneQueso:true,
    pica:"poquito"
}

const picaLaQuesadilla=datosQuesadilla.pica && "pica mucho"
console.log(picaLaQuesadilla)