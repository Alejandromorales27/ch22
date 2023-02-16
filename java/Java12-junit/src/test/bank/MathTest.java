package test.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.generation.math.Math;

class MathTest {

	Math math= new Math();
	
	@Test
	void sumaTest(){
		assertEquals(10, math.suma(8, 2),"Suma de 1 unidad");
		assertEquals(1000, math.suma(700,300),"suma de centenas");
		assertEquals(100_000, math.suma(8_000, 92_000),"suma de millares");
		assertEquals(-10, math.suma(-12, 2),"suma de unidad negativa");
		assertEquals(-1000, math.suma(-400, -600),"suma de centanas");
		assertEquals(-100_000, math.suma(-200_000, 100_000),"suma de millares negativos");
		
	}
	
	@Test
	@DisplayName("sumatoria de numeros de puntos flotantes")void sumaDoubleTest(){
		double delta=0.1;
		assertEquals(10.2,math.suma(10.1, 0.1));
		assertEquals(10.3,math.suma(10.1, 0.2),delta);
		assertEquals(10.4,math.suma(10.1, 0.3));
		assertEquals(10.5,math.suma(10.1, 0.4));

	}
}
