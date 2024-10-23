import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        if (idade >= 18) {
            System.out.println("E maior de idade");
        } else {
            System.out.println("E menor de idade");
        }
        //barato <= 10
        //normal 10 < valor < 15 - pede desconto
        //caro <= 15  valor 17 - pesquisar mais
        //muito caro >= 17  - muito caro sair fora

        System.out.println("Digite o valor do produto: ");
        double valor = scan.nextDouble();
        if (valor <= 10) {
            System.out.println("Barato");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Normal");
            System.out.println("Voce pode pedir desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Caro");
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro");
            System.out.println("Sair fora");
        }
    }
}
