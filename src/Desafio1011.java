import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 

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