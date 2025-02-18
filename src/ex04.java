import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de pares que deseja dividir:");
        int n = scanner.nextInt();

        for (int i = 0; i < n ; i++) {

            System.out.println("Digite o dividendo:");
            int x = scanner.nextInt();

            System.out.println("Digite o divisor:");
            int y = scanner.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível");
            } else {
                double result = (double) x / y;
                System.out.println("Resultado:");
                System.out.printf("%.1f%n", result);
            }
        }
        scanner.close();
    }
}