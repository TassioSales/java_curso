import java.util.Scanner;

public class positivoOuNegativo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("positivo");
        } else if (num < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("zero");
        }
    }
}
