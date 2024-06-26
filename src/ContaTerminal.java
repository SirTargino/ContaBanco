import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, insira o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Agora, insira seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por fim, diga quando quer depositar em sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente.toUpperCase() + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "  + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}