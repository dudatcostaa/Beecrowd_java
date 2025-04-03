import java.io.IOException;
import java.util.Scanner;

public class B1154 { // para submeter: public class Main
 
    public static void main(String[] args) throws IOException {
        
            double soma = 0;
            double quantidade = 0;

            Scanner input = new Scanner(System.in);

            while (true) {
                int idade = input.nextInt();

                if (idade < 0){
                    break;
                }
                soma += idade;
                quantidade++;

            }
        
            if (quantidade > 0) {
                System.out.printf("%.2f%n", soma/quantidade);
            }
    }
} 