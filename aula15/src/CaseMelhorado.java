import java.util.Scanner;

public class CaseMelhorado {

    // Função para traduzir o dia da semana em texto
    public static String tradutorDiaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda";
            case 3:
                return "Terça";
            case 4:
                return "Quarta";
            case 5:
                return "Quinta";
            case 6:
                return "Sexta";
            case 7:
                return "Sábado";
            default:
                return "Inválido";
        }
    }

    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scan = new Scanner(System.in);

        // Pedir ao usuário para digitar um número de 1 a 7
        System.out.print("Digite um número de 1 a 7: ");
        int diaSemana = scan.nextInt();

        // Traduzir o dia da semana e exibir no console
        System.out.println(tradutorDiaSemana(diaSemana));

        // Fecha o scanner
        scan.close();
    }
}
