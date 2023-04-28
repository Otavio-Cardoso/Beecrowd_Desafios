import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
 public class Desafio1006 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        double A, B, C, media;

        A = leia.nextDouble();
        B = leia.nextDouble();
        C = leia.nextDouble();
        media = (A*2 + B*3 + C*5)/10;
        DecimalFormat deci = new DecimalFormat("0.0");
        System.out.println("MEDIA = " + deci.format(media));
        
        leia.close();
  
     }
 }