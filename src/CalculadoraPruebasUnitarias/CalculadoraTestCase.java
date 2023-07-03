package CalculadoraPruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		int	resultado = Calculadora.suma(2,3);
		Assert.assertEquals(5, resultado);
		}

	@Test
	void testMultiplicar() {
		int	resultado = Calculadora.multiplicar(2,3);
		Assert.assertEquals(6, resultado);
		}
	
	@Test
	void testDividir() {
		float resultado = Calculadora.dividir(6.0f, 2.0f);
		assertEquals(3, resultado);
		}
	
//	@Test(expected = ArithmeticException.class)
//	void testDividir() {
//		float resultado = Calculadora.dividir(6.0f, 2.0f);
//		assertEquals(6, resultado);
//		}
	//public static void main(String[] args) {
		
	//}
}
