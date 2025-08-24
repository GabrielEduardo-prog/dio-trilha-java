public class ContaCorrente extends Contacorrent {

    public static int SEQUENCIAL = 1;

    public ContaCorrente() {
        super.agencia = Contacorrent.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Agência: " + super.agencia);
        System.out.println("Número: " + super.numero);
        System.out.printf("Saldo: %.2f%n", super.saldo);
    }
}
