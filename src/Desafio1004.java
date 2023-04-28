import java.io.IOException;
import java.util.Scanner;
 
 public class Desafio1004 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        int A, B, SOMA;

        A = leia.nextInt();
        B = leia.nextInt();
        SOMA = A+B;

        System.out.println("SOMA = " + SOMA);
        
        leia.close();
  
     }
 }