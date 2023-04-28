import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
 
     
 /**
  * IMPORTANT: 
  *      O nome da classe deve ser "Main" para que a sua solução execute
  *      Class name must be "Main" for your solution to execute
  *      El nombre de la clase debe ser "Main" para que su solución ejecutar
  */
 public class Desafio1015 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        Locale.setDefault (Locale.US);
        double x1, x2, y1, y2, dist;

        x1 = leia.nextDouble();
        y1 = leia.nextDouble();
        x2 = leia.nextDouble();
        y2 = leia.nextDouble();

        dist = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));

        DecimalFormat deci = new DecimalFormat("0.0000");
        System.out.println(deci.format(dist));
        
        leia.close();
  
     }
 }