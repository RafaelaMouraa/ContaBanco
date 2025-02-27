import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agencia?");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta?");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente?");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta?");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e o número da sua conta é " + numero + " e seu saldo é de " + saldo);
       
    }
}
