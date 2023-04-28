import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
 public class Desafio1014 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        int kms;
        double litros, calc;

        kms = leia.nextInt();
        litros = leia.nextDouble();
        calc = kms / litros;

        DecimalFormat deci = new DecimalFormat("0.000");
        System.out.println(deci.format(calc) + " km/l");
        
        leia.close();
  
     }
 }