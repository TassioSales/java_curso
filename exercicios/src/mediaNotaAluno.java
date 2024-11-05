import java.util.Scanner;

public class mediaNotaAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("sua media e: " + media);

        if (media >= 7) {
            System.out.println("aprovado");
        } else if (media < 7 && media >= 5) {
            System.out.println("recuperacao");
        } else {
            System.out.println("reprovado");
        }


    }
}
