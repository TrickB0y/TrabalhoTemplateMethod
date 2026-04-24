package main;

public class ContaCorrente extends Conta {
    private String chavePix;

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public void enviarPix(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void receberPix(double valor) {
        this.saldo = this.saldo + valor;
    }
}
