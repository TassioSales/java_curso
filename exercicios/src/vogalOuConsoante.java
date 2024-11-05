import java.util.Scanner;

public class vogalOuConsoante {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma letra: ");
        //colocar a letra em minusculo
        char letra = scan.next().toLowerCase().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
        }
    }
}
