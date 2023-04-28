
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
 public class Desafio1012 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        double A, B, C, areaT, areaTra, areaQ, areaR, raio;

        A = leia.nextDouble();
        B = leia.nextDouble();
        C = leia.nextDouble();
        areaT = (A*C)/2;//a
        raio = 3.14159*(Math.pow(C, 2));//b
        areaTra = ((A+B)*C)/2;//c
        areaQ = Math.pow(B, 2);//d
        areaR = A*B;//e

        DecimalFormat deci = new DecimalFormat("0.000");
        System.out.println("TRIANGULO: "+ deci.format(areaT)
                          +"\nCIRCULO: "+ deci.format(raio)
                          +"\nTRAPEZIO: "+ deci.format(areaTra)
                          +"\nQUADRADO: "+ deci.format(areaQ)
                          +"\nRETANGULO: "+ deci.format(areaR));
        
        leia.close();
  
     }
 }