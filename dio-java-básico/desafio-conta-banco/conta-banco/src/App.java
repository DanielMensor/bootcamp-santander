import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Criando Conta");
        System.out.println("Por favor digite o nome do Cliente:");
        conta.setNomeDoCliente(scan.nextLine());
        System.out.println("Por favor digite o nome na Agência (modelo: xxx-x):");
        conta.setAgencia(scan.nextLine());
        System.out.println("Por favor digite o numero da conta:");
        conta.setNumero(scan.nextInt());
        System.out.println("Por favor digite o saldo incial: ");// saldo deve ser inserido com virgula e não com ponto caso for decimal.
        conta.setSaldo(scan.nextDouble());

        System.out.println("Olá " + conta.getNomeDoCliente() + ", obrigado por criar uma conta em nosso banco, " + conta);
        scan.close();
    }
}
