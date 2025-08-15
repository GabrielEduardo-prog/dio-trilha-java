import java.util.Scanner;

public class ContaTerminal {
   public ContaTerminal() {
   }

   public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Por favor, digite o número da Agência !");
      String agencia = scanner.nextLine();
      System.out.println("Por favor, digite o número da Conta !");
      int numeroConta = Integer.parseInt(scanner.nextLine());
      System.out.println("Por favor, digite o seu primeiro nome !");
      String primeironome = scanner.nextLine();
      System.out.println("Por favor, digite o seu sobrenome !");
      String sobrenome = scanner.nextLine();
      System.out.println("Por favor, digite o saldo da conta !");
      double saldo = Double.parseDouble(scanner.nextLine());
      System.out.println("Olá " + primeironome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
      scanner.close();
   }
}