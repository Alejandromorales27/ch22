console.log("mensaje desde el scrip externo");

function changeColor(){

    document.getElementById("demo").style.color = "red";
}

function changeColorH2(reference,color){

    console.log(reference);
    console.log(color);
    /* document.getElementById("color").style.color=color; */
    reference.style.color="green"
}

function changeColorByClass (color){
    const colecction = document.getElementsByClassName
}