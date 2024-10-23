import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome e: " + nomeCompleto);

        System.out.println("Digite seu Primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome e: " + primeiroNome);

        System.out.println("digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade e: " + idade);

    }
}
