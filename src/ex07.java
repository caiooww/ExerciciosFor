import java.util.Scanner;

public class ex07 {
            public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            for (int i=1; i<=n; i++) {

                int primeiro = i;
                int segundo = i * i;
                int terceiro = i * i * i;
                System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
            }

            sc.close();
        }
    }