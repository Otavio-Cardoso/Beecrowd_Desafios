import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
     
 /**
  * IMPORTANT: 
  *      O nome da classe deve ser "Main" para que a sua solução execute
  *      Class name must be "Main" for your solution to execute
  *      El nombre de la clase debe ser "Main" para que su solución ejecutar
  */
 public class Desafio1011 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        double raio, pi = 3.14159, volume;

        raio = leia.nextDouble();
        volume = (4.0/3.0)*(pi*(Math.pow(raio, 3)));
        DecimalFormat deci = new DecimalFormat("0.000");
        System.out.println("VOLUME = "+ deci.format(volume));
        
        leia.close();
  
     }
 }