/* console.log("promesas js07")

const myPromise=new Promise( (resolve,reject)=>{
    const isOnline = false;
    if (isOnline)
    resolve("promesa resuelta, esta en linea");
    else
    reject("promesa rechazada");
})

console.log("antes de la promesa"); */
/* console.log(myPromise()) las promesas no se ejecuentan de esta forma*/
//consumiendo la promesa con .them y .catch
/* then es cuando la promes este resuelta y catch cuando sea rechacada */
//response obtendra lo que esta dentro de los parentesis
/* myPromise.then((response)=>{}).catch((error)=>{}); */
/* myPromise.then((response)=>{
    console.log(response);
})
.catch((error)=>{
    console.log(error);
});
console.log("despues de la promesa"); */
//promesa de enviar un arreglo y multiplica por 2
//[2,5,7]=>[4,10,14]=>[10,14]
//devolver solo los mayores de 6
/* const datos=[2,5,7]
const datosDuplicados=datos.map((element)=>element*2) */
//lo que hace map for ech te itera los elementos y map hace los
//mismo itera cada uno de los elementos y lo que hagas ahi devuelve un
//nuevo arreglo
/* datosFiltrador = datosDuplicados.filter(number=>number>5)
console.log(datosDuplicados)
console.log(datosFiltrador)
const ProcesoReducido = datos.map((element)=>element*2).filter(number=>number>5) 
console.log(ProcesoReducido)

 */
const filtrarArrglo = (datos )=>{
    return new Promise((resolve, reject)=>{
        const ProcesoReducido = datos.map((element)=>
        element*2).filter(number=>number>5)
        if(ProcesoReducido.length)
        resolve (ProcesoReducido)
        else
        reject("tu arreglo no contiene numeros mayores a 5");

    })
    return solucion;
}

filtrarArrglo([2,4,7])

.then( response=> console.log(response))
.catch( error=> console.warn(error) );

filtrarArrglo([2,1,0])
.then( response=> console.log(response))
.catch( error=> console.warn(error) );

function filtrarConPromesa(){

    filtrarArrglo([2,4,7])

.then( response=> console.log(response))
.catch( error=> console.warn(error) );

filtrarArrglo([2,1,0])
.then( response=> console.log(response))
.catch( error=> console.warn(error) );
}

filtrarConPromesa()

//consumiendo promesas con asyn y await

async function filtrarPromesaConAwait(){
    console.log("funcion con asyn y await")
 console.log(await filtrarArrglo([2,4,7,10]))
 console.log("termina la funcion con asyn y await")
}
//filtrarPromesaConAwait()
//la promesa trabaja de forma sincrona
//muy importante que la funcion esea asyng
async function filtrarPromesaConAwaitTryCatch(){
    const ref
    try{
//en este bloque se tratara de resolver la promesa
        console.log("funcion con asyn y await")
        console.log(await filtrarArrglo([1,0,2,1,10]))
       
       }
        
    catch(error){
        //en este bloque se tratara el reject que genere la promesa
        console.log("noooooo se que poner")
        console.warn(error)
    }

    finally{
        console.log("termina la funcion con asyn y await")
    }
}

