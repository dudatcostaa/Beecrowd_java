import java.io.IOException;
import java.util.Scanner;

public class B1036 { // para submeter: public class Main
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == 0){
            System.out.printf("Impossivel calcular%n");
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0){
                System.out.printf("Impossivel calcular%n");
            } else {
                double raizdelta = Math.sqrt(delta);
                double raiz1 = (-b + raizdelta) / (2 * a);
                double raiz2 = (-b - raizdelta) / (2 * a);
    
                System.out.printf("R1 = %.5f%n", raiz1);
                System.out.printf("R2 = %.5f%n", raiz2);
            }
        }
    }
}