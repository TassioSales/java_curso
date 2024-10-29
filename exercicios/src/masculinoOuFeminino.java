import java.util.Scanner;

public class masculinoOuFeminino {
    // Se for M e Masculino ou F e Feminin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o sexo: ");
        char sexo = scan.next().charAt(0);
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Masculino");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Feminino");
        } else {
            System.out.println("sexo invalido");
        }
    }
}
