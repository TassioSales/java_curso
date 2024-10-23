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
    }
}
