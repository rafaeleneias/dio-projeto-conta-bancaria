import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int NumeroConta;
        String Agencia;
        String NomeCliente;
        double Saldo;

        System.out.print("Digite o número de sua conta: ");
        NumeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número da agência: ");
        Agencia = sc.nextLine();

        System.out.print("Digite o seu nome: ");
        NomeCliente = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        Saldo = sc.nextDouble();

        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + 
        ", conta " + NumeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
