const getUsersFetch = (url) => {
    fetch(url)
        .then(response => {
            console.log("Status " + response.status);
            return response.json();
        })
        .then(data => {
            console.log(data);
        })
        .catch(error => console.log(error));
}

const getUsersAxios = (url) => {
    axios.get(url)
      .then( response => {
          console.log("Status" + response.status)
          console.log(response.data)
      })
      .catch( error =>  console.log(error));

     
  };
/*  async function getUsersAxiosAwait(url){
    const {data} = await (await axios.get(url))
    console.log(data)
    // Hacer una soliitud get con Axios, usanso Async y Await
    }  */
    
const getUsersAxiosAwait= async (url)=>{
   
    try{
    const response = await axios.get(url);

    console.log(response.data.data)
    return response.data;
    }
catch(error){
    console.log(error)
}

}
    





  const postUserAxios = () =>{
    axios.post('https://reqres.in/api/users', {
        name: "Pax",
        job: "CEO"
    })
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });
}



  




  


 async function solicitudGet( provider, page  ){
    const url = `https://reqres.in/api/users?page=${page}`;
    if (provider === 'fetch')getUsersFetch(url);  

    else if(provider==='axios')getUsersAxios(url);
    else if (provider === "axios-await")(await getUsersAxiosAwait(url));
    else console.warn("no especificaste provedor");
    
}
