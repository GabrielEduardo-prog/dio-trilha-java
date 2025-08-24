public abstract class Contacorrent implements Aconta{
    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    @Override
    public void sacar(double valor){
        saldo -= valor;

    }
    @Override
    public void depositar(double valor){
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Aconta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    

}
