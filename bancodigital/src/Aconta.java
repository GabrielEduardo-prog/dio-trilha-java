public interface Aconta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Aconta contaDestino);
    void imprimirExtrato();
}
