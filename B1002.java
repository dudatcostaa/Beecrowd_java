import java.io.IOException;
import java.util.Scanner;

public class B1002 { // para submeter: public class Main
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);
    }
 
}
