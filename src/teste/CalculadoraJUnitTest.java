package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import junit.framework.Assert;

import calculadora.Soma;
import calculadora.Subtracao;

public class CalculadoraJUnitTest {
	
	private int som;
	private int sub;
	private int div;
	private int mul;
	
	private final Soma soma = new Soma();
	private final Subtracao subtra = new Subtracao();

	
	//-------
	// TESTES DE FUNCIONALIDADE DA CLASSE SOMA
	//-------
	
	//Cenário de teste 1: Soma de dois valores.
	@Test
	public void SomarDoisNumerosPositivos() {
		som = soma.somar(2, 5);
		Assert.assertEquals(7, som);
	}
    
    //Cenário de teste 2: Soma de dois valores, sendo um deles 0.
	@Test
	public void SomarComUmZero() {
		som = soma.somar(2, 0);
		Assert.assertEquals(2, som);
	}
    
    //Cenário de teste 3: Soma de dois valores, sendo que ambos são 0.
	@Test
	public void SomarComAmbosZeros() {
		som = soma.somar(0, 0);
		Assert.assertEquals(0, som);
	}
    
    //Cenário de teste 4: Soma de dois valores, sendo um deles negativo.
	@Test
	public void SomarComUmNegativo() {
		som = soma.somar(3, -1);
		Assert.assertEquals(2, som);
	}
    
    //Cenário de teste 5: Soma de dois valores, sendo ambos negativos.
	@Test
	public void SomarComDoisNegativos() {
		som = soma.somar(-3, -1);
		Assert.assertEquals(-4, som);
	}
    
    //Cenário de teste 6: Soma de dois valores, sendo um deles negativo e o outro um 0.
	@Test
	public void SomarComUmNegOutroZero() {
		som = soma.somar(0, -1);
		Assert.assertEquals(-1, som);
	}
	
	//-------
	// TESTES DE FUNCIONALIDADE DA CLASSE SUBTRACAO
	//-------
	
	//Cenário de teste 1: Subtracao de dois valores.
	@Test
	public void SubtrairDoisValoresPositivos() {
		sub = subtra.subtrair(3, 2);
		Assert.assertEquals(1, som);
	}
    
    //Cenário de teste 2: Subtracao de dois valores, sendo um deles 0.
	@Test
	public void SubtrairComUmZero() {
		sub = subtra.subtrair(3, 0);
		Assert.assertEquals(3, som);
	}
    
    //Cenário de teste 3: Subtracao de dois valores, sendo que ambos são 0.
	@Test
	public void SubtrairComDoisZeros() {
		sub = subtra.subtrair(0, 0);
		Assert.assertEquals(0, som);
	}
    
    //Cenário de teste 4: Subtracao de dois valores, sendo o primeiro deles negativo.
    //Observacao: na subtracao a ordem dos fatores altera o produto quando se envolve números negativos.
	@Test
	public void SubtrairUmNegativoUmPositivo() {
		sub = subtra.subtrair(-1, 1);
		Assert.assertEquals(-2, som);
	}
    
    //Cenário de teste 5: Subtracao de dois valores, sendo o segundo deles negativo.
	@Test
	public void SubtrairComSegundoNegativo() {
		sub = subtra.subtrair(1, -1);
		Assert.assertEquals(2, som);
	}
    
    //Cenário de teste 6: Subtracao de dois valores, sendo ambos negativos.
	@Test
	public void SubtrairComAmbosNegativos() {
		sub = subtra.subtrair(-3, -1);
		Assert.assertEquals(-2, som);
	}
    
    //Cenário de teste 7: Subtracao de dois valores, sendo o primeiro deles negativo e o segundo um 0.
	@Test
	public void SubtrairComPrimeiroNegativoSegundoZero() {
		sub = subtra.subtrair(0, -1);
		Assert.assertEquals(1, som);
	}
    
    //Cenário de teste 8: Subtracao de dois valores, sendo o primeiro 0 e o segundo negativo.
	@Test
	public void SubtrairComPrimeiroZeroSegundoNegativo() {
		sub = subtra.subtrair(-1, 0);
		Assert.assertEquals(1, som);
	}

}
