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

        System.out.println("digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura e: " + altura);

        System.out.println("digite seu peso: ");
        float peso = scan.nextFloat();
        System.out.println("Seu peso e: " + peso);

        System.out.println("Digite primero seu nome, idade, altura, peso, quantidade de filhos, se tem pets: ");
        String nome2 = scan.next();
        int idade2 = scan.nextInt();
        double altura2 = scan.nextDouble();
        float peso2 = scan.nextFloat();
        short quantFilhos = scan.nextByte();
        boolean temPet = scan.nextBoolean();

        System.out.println("Voce digitou os seguintes dados: ");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Altura: " + altura2);
        System.out.println("Peso: " + peso2);
        System.out.println("Quantidade de filhos: " + quantFilhos);
        System.out.println("Tem pet: " + temPet);


    }
}
