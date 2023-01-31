const{suma}= require('../js/suma');


test("prueba de 1 + 3 es igual a 4", ()=>{
    expect(suma(1,3) ).toBe(4);
});

test("prueba de 10 + -15 es igual a -5", ()=>{
    expect(suma(10,-15) ).toBe(-5)
});

test("prueba de 1 + 3 es igual a 4", ()=>{
    expect(suma(10,1) ).toBe(11)
});

/* test("prueba de 1 + 3 es igual a 4", ()=>{
    expect(suma(10,1,1.2) ).toBeCloseTo(11.3)
}); */