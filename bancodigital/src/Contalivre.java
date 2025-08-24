public class Contalivre extends Contacorrent{

    public static int SEQUENCIAL = 1;

    public Contalivre(){
        super.agencia = Contacorrent.AGENCIA_PADRAO;
        super.numero =  SEQUENCIAL++;
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Livre ===");
        System.out.println("Agência: " + super.agencia);
        System.out.println("Número: " + super.numero);
        System.out.printf("Saldo: %.2f%n", super.saldo);
    }

}
