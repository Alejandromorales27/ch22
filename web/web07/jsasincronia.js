console.log("js07asincronia")

const introduccion=()=>{
    console.log("01-Bienvenido y bienvenidas a ch22")
}

const desarrollo=()=>{
    console.log("2 pasale a lo barrido")
}

const desarrolloAsincrono=(delay)=>{
    //funcion asincrona
    setTimeout(()=>console.log(`asincrono - pasale en ${delay}`),delay);
}
let idSetInterval;
setIntervalAsincrono= setIntervalAsincrono=(delay= 2000)=>{
    let contador = 0
    idSetInterval= setInterval(()=>console.log(`modos rockstar ${++contador}`),delay)
}

const stopIntervalAsincrono=()=>{
    setTimeout(()=> (clearInterval(idSetInterval),10_00))
}


const despedida = () =>{
    console.log(" 3 ahi nos vidrios, nos vienctiamos luego")
}
// programacion sincrona
introduccion()
desarrollo()
despedida()
setIntervalAsincrono(2000) 

//programacion asincrona
introduccion()
desarrolloAsincrono(2000);
desarrolloAsincrono(6000);
stopIntervalAsincrono()

despedida()// esta instruccion no espera a que finalice la funcion asincrona
let idCounter;

const refStartInterval=document.getElementById("start-interval")
const refStopInterval=document.getElementById("stop-interval")

refStartInterval.addEventListener('click', ()=>{
    let counter=0;
    refStartInterval.disabled=true
    refStopInterval.disabled=false
    idCounter = setInterval( ()=>console.log(`Contador ${++counter}`), 1000 );
} );

function stopCounter(){
    console.log("se detiene el contador")
    clearInterval(idCounter)
    refStartInterval.disabled=false
    refStopInterval.disabled=true
}