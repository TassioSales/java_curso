public class LoopDoWhile {
    public static void main(String[] args) {
        int i = 0;
        int max = 10;
        System.out.println("Contando até " + max);
        while (i <= max) {
            System.out.println("O valor de i e: " + i);
            i++;
        }
        System.out.println("O valor final de i e: " + i);
        do {
            i++;
            System.out.println("O valor de i e: " + i);
        } while (i < 15);
        System.out.println("O valor final de i e: " + i);
        System.out.println("Fim");
    }
}
