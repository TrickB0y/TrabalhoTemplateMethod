package test;

import main.ContaCorrente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaCorrenteTest {

    @Test
    void deveRetornarValorDepositado() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(500);
        assertEquals(500, conta.getSaldo());
    }

    @Test
    void deveRetornarSaldoCorretoAposSaque() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(500);
        conta.sacar(250);
        assertEquals(250, conta.getSaldo());
    }

    @Test
    void deveRetornarSaldoCorretoAposEnviarPix() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(500);
        conta.enviarPix(200);
        assertEquals(300, conta.getSaldo());
    }

    @Test
    void deveRetornarSaldoCorretoAposReceberPix() {
        ContaCorrente conta = new ContaCorrente();
        conta.receberPix(200);
        assertEquals(200, conta.getSaldo());
    }

    @Test
    void deveRetornarValorCorretoDaFatura() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(500);
        assertEquals(12.0, conta.gerarFatura());
    }
}
