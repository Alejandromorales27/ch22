import { Usuario } from './js08-clases.js';
import { Producto, ProductoElectronico } from './js08-clase-productos.js';

//Instanciar un objeto
const albertoFrausto = new Usuario(
    "Alberto Frausto", 
    "frausto@gmail.com", 
    "Siempre viva", 
    "55 8952 5879"
    );

console.log( albertoFrausto );
/*console.log("nombre: " + albertoFrausto.nombre);
console.log("e-mail: " + albertoFrausto.email);
console.log("direccion: " + albertoFrausto['direccion']);
console.log("telefono: " + albertoFrausto['telefono']);*/
console.log( albertoFrausto.imprimirDatos() );

const karlaArena = new Usuario(
    "Karla Arenas",
    "karla@gmail.com",
    "Av. niños héroes",
    "81 8752 4589"
)
console.log( karlaArena.imprimirDatos() );

for (let claveUsuario in karlaArena)
    console.log(claveUsuario);

const helado = new Producto(
    "Helado de Vainilla", 
    80,
    'e3259939-f0eb-4632-a46f-0a5025f713d9'
    );

for (let claveProducto in helado )
    console.log(claveProducto);

console.log( helado.nombre ); //helado de vainilla
helado.nombre = "helado de limón";
console.log( helado.nombre ); //helado de limón

karlaArena.agregarProductoACarrito( helado);
karlaArena.agregarProductoACarrito( new Producto("Pollo",110,"57553be5-d365-4287-9a6c-d3e468a71f35"));
karlaArena.agregarProductoACarrito( new Producto("Galleta",200,"09f21e1f-2821-4329-af7a-c5ba64f849f4"));

const grabadora = new ProductoElectronico(
    "LG X3000",
    5000,
    "4a63d2ab-358a-46ff-a06b-ffefe3860152",
    365
    );

karlaArena.agregarProductoACarrito( grabadora);

console.log(karlaArena.imprimirDatos());

/* fetch()
.then(Response=> Response.json())
.catch(); */

const datoJson = `{
    "name":"morpheus",
    "job":"leader",
    "skills":[
       "KunFu",
       "Capitan"
    ],
    "tripulacion":{
       "operador":"Tanque",
       "elegido":"Neo"
    },
    "vivo":true,
    "edad":45
 }`;

 console.log(JSON.parse(datoJson));

 const productosTemporada=`
 [
    {
      "nombre" : "Pantalón roto y pintado",
      "precio" : 2500,
      "imagen" : "http://mirepo.com/pantalon.jpg",
      "descripcion": "Pantalón a la moda, roto por todos lados",
      "tallas" : ["L","M","CH"]
    },
    {
      "nombre" : "Sudadera",
      "precio" : 300,
      "imagen" : "http://mirepo.com/sudarea.jpg",
      "descripcion": "Sudadera de NFL",
      "tallas" : ["Unitalla"]
    }
]`
  
const productosPagInicio = JSON.parse(productosTemporada)

console.log(productosPagInicio)

productosPagInicio.forEach( producto => 
    (console.log( `En venta ${producto.nombre} a $${producto.precio}`)
 ));

/* for (let producto in productosPagInicio){
    console.log(`en venta ${producto.nombre} a ${precio}`)
} */

localStorage.setItem("productos-inicio",JSON.stringify(productosPagInicio));
//cuando se manda asi se muestra un object objec
localStorage.setItem("FECHA-CADUCIDAD",(new Date().getTime())+60_000)