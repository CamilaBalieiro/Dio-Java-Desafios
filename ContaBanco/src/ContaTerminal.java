import java.util.Scanner;

public class ContaTerminal 
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoConta;
        int conta;
        String nomeCliente,agencia;

        System.out.println("Por favor, digite o numero da Agencia:");
        agencia = sc.nextLine();
        System.out.println("Digite a conta:");
        conta = sc.nextInt();
        System.out.println("Digite o seu nome:");
        nomeCliente = sc.next();
        saldoConta = 237.48;

        System.out.println("Ola " + nomeCliente + " obrigado por cria uma conta em nosso banco  sua agência e [ " + agencia +"],conta[" + conta + "] e seu saldo ["+ saldoConta +"] já está disponivel para saque.");



    }
}
