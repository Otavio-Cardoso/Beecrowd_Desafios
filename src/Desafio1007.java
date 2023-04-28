import java.io.IOException;
import java.util.Scanner;
 
 public class Desafio1007 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        int A, B, C, D, diferenca;

        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();
        D = leia.nextInt();
        diferenca = (A*B - C*D);
        System.out.println("DIFERENCA = " + diferenca);
        
        leia.close();
  
     }
 }