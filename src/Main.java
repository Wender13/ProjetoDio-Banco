import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo, para começar, digite o número da conta!");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Ótimo, agora digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Agora seu nome!");
        String nomeCliente = sc.nextLine();

        System.out.println("Para finalizar, digite o seu saldo!");
        float saldo = Float.parseFloat(sc.nextLine());
        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}