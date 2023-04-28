import java.io.IOException;
import java.util.Scanner;
 
     
 /**
  * IMPORTANT: 
  *      O nome da classe deve ser "Main" para que a sua solução execute
  *      Class name must be "Main" for your solution to execute
  *      El nombre de la clase debe ser "Main" para que su solución ejecutar
  */
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