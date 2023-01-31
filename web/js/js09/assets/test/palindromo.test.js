const {palindromo}=require('../js/palindromo');

/* "Ana" R:true
    "Bob" R: true
    "Radar" R: true
    "Reconocer" R: true
    "Nos quejamos" R: false
    "Saoko" R: false
    "Somos o no somos" R: true
 */


test("prueba de que ana es palindromo",()=>{
    expect(palindromo("ana")).toBe(true);
} )