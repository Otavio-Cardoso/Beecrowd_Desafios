import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
 public class Desafio1003 {
  
     public static void main(String[] args) throws IOException {
         
         Scanner leia = new Scanner(System.in);
         double raio, area;

        raio = leia.nextDouble();
        area = Math.pow(raio, 2) * 3.14159;
        DecimalFormat deci = new DecimalFormat("0.0000");

        System.out.println("A=" + deci.format(area));
         
         leia.close();
  
     }
 }