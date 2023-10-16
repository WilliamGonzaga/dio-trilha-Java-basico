import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
      //TODO:Conhecer e inportar a calsse Scanner
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


      //Exibir as mensagens para o nosso usuário

      // Obter pelo scanner os valores digitados no terminal


        System.out.println("Por favor, digite o número da Agencia !");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o número número da conta !");
        String Agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente !");
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo Da Conta !");
        double Saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada

        System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque");

    

    }
}
