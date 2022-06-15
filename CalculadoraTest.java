package Engenhariadesoft;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calc;

	@BeforeEach
	void setUp() {
		calc = new Calculadora();
	}
@Test

void testSomaNegativoMaisPositivo() {
	  assertEquals(0,calc.soma(2, -2));
	  
	  
	  
}
void testSubtracao() {
	  assertEquals(0,calc.subtracao(2, 3));
	  
	  

}



void testMultiplicacao() {
	  assertEquals(0,calc.multiplicacao(2, 3));
	  
}
	  void testDivisao() {
		  assertEquals(0,calc.divisao(10, 2));
	      
	  
	  
}
}