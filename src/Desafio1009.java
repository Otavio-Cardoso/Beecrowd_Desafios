import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
     
 /**
  * IMPORTANT: 
  *      O nome da classe deve ser "Main" para que a sua solução execute
  *      Class name must be "Main" for your solution to execute
  *      El nombre de la clase debe ser "Main" para que su solución ejecutar
  */
 public class Desafio1009 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        
        double salariofixo, totalDeVendas, salarioFinal;
        leia.nextLine();
        salariofixo = leia.nextDouble();
        totalDeVendas = leia.nextDouble();
        totalDeVendas = totalDeVendas * 0.15;
        salarioFinal = (totalDeVendas + salariofixo);
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("TOTAL = "+ deci.format(salarioFinal));
        
        leia.close();
  
     }
 }