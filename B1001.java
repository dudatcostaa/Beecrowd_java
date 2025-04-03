import java.io.IOException;
import java.util.Scanner;

public class B1001 { // para submeter: public class Main
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
       
        int a = input.nextInt();
        int b = input.nextInt();

        int soma = a + b;

        System.out.printf("X = %d%n", soma);

    }
 
}