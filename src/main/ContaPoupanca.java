package main;

public class ContaPoupanca extends Conta {
    private double rendaAoMes = 0.01;

    public String emitirRendimentosDoMes() {
        double rendimentos = this.saldo *  (1 + this.rendaAoMes);
        String rendimentosDoMes = "Valor guardado: " + this.saldo + " com " + (100 * this.rendaAoMes) + "% ao mês. rendimentos: " + (rendimentos - this.saldo);
        depositar(rendimentos - this.saldo);
        return rendimentosDoMes;
    }
}
