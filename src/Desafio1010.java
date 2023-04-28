import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
 public class Desafio1010 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        int n1, n2;
        double valorpc1, valorpc2, calcpc1, calcpc2, total;

        leia.nextInt();
        n1 = leia.nextInt();
        valorpc1 = leia.nextDouble();
        leia.nextInt();
        n2 = leia.nextInt();
        valorpc2 = leia.nextDouble();
        calcpc1 = n1*valorpc1;
        calcpc2 = n2*valorpc2;
        total = calcpc1 + calcpc2;
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("VALOR A PAGAR: R$ "+ deci.format(total));
        
        leia.close();
  
     }
 }