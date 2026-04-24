package test;

import main.ContaPoupanca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaPoupancaTest {
    @Test
    void deveRetornarValorDepositado() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(500);
        assertEquals(500, conta.getSaldo());
    }

    @Test
    void deveRetornarSaldoCorretoAposSaque() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(500);
        conta.sacar(250);
        assertEquals(250, conta.getSaldo());
    }

    @Test
    void deveRetornarRendimentosDoMes() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(1000);
        assertEquals("Valor guardado: 1000.0 com 1.0% ao mês. rendimentos: 10.0", conta.emitirRendimentosDoMes());
    }
}
