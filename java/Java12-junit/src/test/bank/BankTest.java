package test.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bank.Bank;

class BankTest {

	Bank bank;
	
	@BeforeEach
	public void SetUp(){
		bank= new Bank(10_000);
	}
	@Test
	@DisplayName("retiro multiplos de 50")
	public void retiroExitoso(){
		assertEquals(9_000, bank.retiro(1000),"retiro de 1,000");
		assertEquals(8950, bank.retiro(50),"retiro de 1,000");
		assertEquals(8850, bank.retiro(100),"retiro de 1,000");
	}
		
		@Test
		@DisplayName("retiro multiplos de 50")
		public void retiroBalanceConDecimales(){
			bank.setBalance(1000.1);
			assertEquals(900.1, bank.retiro(100),"retiro de 1,000");
			assertEquals(850.1, bank.retiro(50),"retiro de 1,000");
			
			bank.setBalance(1000.20);
			assertEquals(900.2, bank.retiro(100),"retiro de 1,000");
			assertEquals(850.2, bank.retiro(50),"retiro de 1,000");
			
			bank.setBalance(1000.30);
			assertEquals(900.3, bank.retiro(100),"retiro de 1,000");
			assertEquals(850.3, bank.retiro(50),"retiro de 1,000");
			
			
		
	}
	
	@Test
	@DisplayName("retiros con excepciones")
	public void retiroConExcepcion(){
		bank.setBalance(50_000);
		assertThrows(IllegalArgumentException.class ,()->bank.retiro(20) );
		assertThrows(IllegalArgumentException.class ,()->bank.retiro(90) );
		assertThrows(IllegalArgumentException.class ,()->bank.retiro(160) );
		assertThrows(IllegalStateException.class ,()->bank.retiro(100_000) );
		Exception exception= assertThrows(IllegalArgumentException.class ,
				()->bank.retiro(7_000) );
		assertEquals("No puede retirar más de $6000", exception.getMessage());
		
	}

}
