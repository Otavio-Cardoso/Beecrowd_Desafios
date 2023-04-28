
import java.io.IOException;
import java.util.Scanner;

public class Desafio1002 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner leia = new Scanner(System.in);
        int A, B, X;

        A = leia.nextInt();
        B = leia.nextInt();
        X = A+B;

        System.out.println("X = " + X);
        
        leia.close();
 
    }
}