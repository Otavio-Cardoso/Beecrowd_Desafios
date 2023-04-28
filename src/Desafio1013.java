import java.io.IOException;
import java.util.Scanner;
 
 public class Desafio1013 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        int A, B, C, maior;

        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();
        maior = (A + B + Math.abs(A - B)) / 2;
        maior = (maior + C + Math.abs(maior - C)) / 2;
        System.out.println(maior + " eh o maior");
        
        leia.close();
  
     }
 }