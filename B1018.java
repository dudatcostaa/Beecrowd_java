import java.io.IOException;
import java.util.Scanner;

public class B1018 { // para submeter: public class Main
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        System.out.printf("%d%n", valor);

        System.out.printf("%d nota(s) de R$ 100,00%n", valor/100);
        valor %= 100;

        System.out.printf("%d nota(s) de R$ 50,00%n", valor/50);
        valor %= 50;

        System.out.printf("%d nota(s) de R$ 20,00%n", valor/20);
        valor %= 20;

        System.out.printf("%d nota(s) de R$ 10,00%n", valor/10);
        valor %= 10;

        System.out.printf("%d nota(s) de R$ 5,00%n", valor/5);
        valor %= 5;

        System.out.printf("%d nota(s) de R$ 2,00%n", valor/2);
        valor %= 2;

        System.out.printf("%d nota(s) de R$ 1,00%n", valor/1);
    }
}
