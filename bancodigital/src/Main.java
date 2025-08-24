public class Main {
    public static void main(String[] args) {
        Contacorrent cc = new ContaCorrente();
        Contacorrent cl = new Contalivre();
        cc.depositar(100);
        cc.transferir(70, cl);
        cc.imprimirExtrato();
        cl.imprimirExtrato();        
    }

}
