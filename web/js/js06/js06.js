console.log("sesion js06")


let ObtenerNombre="alex"

const encontrarElementoById=()=>{
    const element =document.getElementById("titulo");
    console.log(element.innerHTML)
/*     element.innerHTML+="manipulacion del DOM"; */
/*     element.innerHTML+= "Manipulacion del 
       <strong>DOM</strong>" */
element.innerHTML =`<h1>${element.innerHTML} <em>manipulacion</em>  del <strong>DOM</strong> por  <span><em>${ObtenerNombre}</em></span></h1>`
}

encontrarElementoById()
//CON INNER HTML PUEDO AGREGAR NUEVAS ETIQUETAS

const encontrarElementosByTagName=()=>{
    //const element=document.getElementsByTagName("p");
    const[,introRef]=document.getElementsByTagName("p")
    //obtenemos el indice 0
    //const introRef=element[0].innerHTML;
    //modificamos el contenido de introRef
    console.log(introRef.innerHTML)
    introRef.innerHTML="las <strong>quesadillas</strong> van con <em>queso</em>, es un hecho"
    
}

//funcion que me cambie a color azul las letras

const diferencialInnerHTMLInnerText = ()=>{
    const element= document.getElementById("titulo");
    console.log(element.innerHTML)
    console.log(element.innerText)
}

diferencialInnerHTMLInnerText()


const encontrarElementosByClassName = ()=>{
    const elements=document.getElementsByClassName("subtitulo")
    for(let element of elements)
    console.log(element.innerText)
}

encontrarElementosByClassName()

const EncontrarElementoQuerySelector = ()=>{
    const element = document.querySelector(".subtitulo");
    //el document.querySelectorall(.subtitulo) trae todos los elementos
    console.log(element?.innerText)
}
//mayor que funciona para encontrar a la etiqueta hija
//en este caso seria la etiqueta em y la etiqueta padre

EncontrarElementoQuerySelector()


const CrearElemento = () => {
    const newElement =document.createElement("p") 
    newElement.innerHTML=`la ch22 es bien <strong>chida</strong>
    <ul>
    <li>Diversas</li>
    <li>Listos y listas</li>
    <li>Clases de bienes raices</li>
    <li>Cholos</li>
    <li>amigables</li>
    <li>la ch22 te respalda</li>
    <li>sin problemas en quesadillas</li>
    <li>aplica: has compitas, no compitas</li>

    </ul>

    `;
    
document.getElementById("datos-generation").appendChild(newElement)
/* const nodoClonado=newElement.cloneNode(true);
 */


}

CrearElemento();