package calculadora;

import calculadora.Soma;
import org.junit.jupiter.api.Test;
 
public class calculadoraJUnitTest {
    
    @Test
    public void SomarDoisNumerosPositivos(){
        Soma s = new Soma();
        int soma = s.somar(2, 5);
    }
}
