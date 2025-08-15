public class Main {
    public static void main(String[] args) {
        
        iPhone meuIPhone = new iPhone();
        
        System.out.println("=== TESTANDO REPRODUTOR MUSICAL ===");
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        System.out.println("\n=== TESTANDO APARELHO TELEFÔNICO ===");
        meuIPhone.ligar("(11) 99999-9999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        System.out.println("\n=== TESTANDO NAVEGADOR INTERNET ===");
        meuIPhone.exibirPagina("www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
