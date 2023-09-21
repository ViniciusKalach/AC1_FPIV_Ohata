package teste;

/*import calculadora.Divisao;
import calculadora.Multiplicacao;
import calculadora.Soma;
import calculadora.Subtracao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import junit.framework.Assert;

public class CalculadoraJUnitTest {
	
	private int som;
	private int sub;
	private int div;
	private int mul;
	
	private final Soma soma = new Soma();
	private final Subtracao subtra = new Subtracao();
	private final Multiplicacao multi = new Multiplicacao();
	private final Divisao divi = new Divisao();

	
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
	
	//-------
	// TESTES DE FUNCIONALIDADE DA CLASSE MULTIPLICACAO
	//-------
	
	//Cenário de teste 1: Multiplicacao de dois valores.
	@Test
	public void MultiplicarDoisValoresPositivos() {
		mul = multi.multiplicar(3, 2);
		Assert.assertEquals(6, som);
	}
    
    //Cenário de teste 2: Multiplicacao de dois valores, sendo um deles 0.
	@Test
	public void MultiplicarComUmZero() {
		mul = multi.multiplicar(3, 0);
		Assert.assertEquals(0, som);
	}
    
    //Cenário de teste 3: Multiplicacao de dois valores, sendo que ambos são 0.
	@Test
	public void MultiplicarAmbosZeros() {
		mul = multi.multiplicar(0, 0);
		Assert.assertEquals(0, som);
	}
    
    //Cenário de teste 4: Multiplicacao de dois valores, sendo um deles negativo.
	@Test
	public void MultiplicarComUmNegativo() {
		mul = multi.multiplicar(3, -1);
		Assert.assertEquals(-3, som);
	}
    
    //Cenário de teste 5: Multiplicacao de dois valores, sendo ambos negativo.
	@Test
	public void MultiplicarAmbosNegativos() {
		mul = multi.multiplicar(-3, -1);
		Assert.assertEquals(3, som);
	}
    
    //Cenário de teste 6: Multiplicacao de dois valores, sendo um negativo e o outro 0.
	@Test
	public void MultiplicarUmNegativoComUmZero() {
		mul = multi.multiplicar(-3, 0);
		Assert.assertEquals(0, som);
	}
	
	//-------
	// TESTES DE FUNCIONALIDADE DA CLASSE DIVISAO
	//-------
	
	//Cenário de teste 1: Divisao de dois valores, sendo ambos pares.
	@Test
	public void DividirDoisValoresPares() {
		mul = multi.multiplicar(4, 2);
		Assert.assertEquals(2, som);
	}
    
    //Cenário de teste 2: Divisao de dois valores, sendo ambos primos.
	@Test
	public void DividirDoisValoresPrimos() {
		mul = multi.multiplicar(3, 1);
		Assert.assertEquals(3, som);
	}
    
    //Cenário de teste 3: Divisao de dois valores, um número primo por um par.
	@Test
	public void DividirUmPrimoPorUmPar() {
		mul = multi.multiplicar(3, 2);
		Assert.assertEquals(1.5, som);
	}
    // O resultado por haver a obrigacao de ser inteiro não consta com a realidade, para não causar confusao no cliente seria 
    // interessante que houvesse uma mensagem de retorno explicando que o valor é aproximado.
    
    //Cenário de teste 4: Divisao de dois valores, um número qualquer por 0.
	@Test
	public void DividirPorZero() {
		mul = multi.multiplicar(4, 0);
		Assert.assertEquals("Erro", som);
	}
    // Qualquer número divido por 0 constará erro. Seria interessante que houvesse uma resposta ao cliente explicando o erro.

}*/
