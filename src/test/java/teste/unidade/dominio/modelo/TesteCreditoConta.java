package teste.unidade.dominio.modelo;

import conta.sistema.dominio.modelo.Conta;
import conta.sistema.dominio.modelo.NegocioException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;

@DisplayName("Regra de Crédito de Conta")
public class TesteCreditoConta {

    BigDecimal cem = new BigDecimal(100);
    Conta contaValida;

    @BeforeEach
    void preparar () {
        contaValida = new Conta(1, cem, "Rebeca");
    }

    @Test
    @DisplayName("valor crédito nulo como obrigatório.")
    void teste1(){
        try {
            contaValida.creditar(null);
            fail("valor credito obrigatório.");

        }catch(NegocioException e) {
            assertEquals(e.getMessage(), "Valor crédito é obrigatório.");
        }

    }


}
