
const palindromo = (palabra) =>{
    return palabra.toLowerCase()//minisculas
    .replaceAll(" ","").split("")//replaceAll remplaza y el split separa letra por letra al hacer array
    .reverse().join("") === palabra.toLowerCase 
    ().replaceAll(" ","");
      }
          




module.exports={palindromo}