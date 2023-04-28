import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
 
 public class Desafio1008 {
  
     public static void main(String[] args) throws IOException {
         
        Scanner leia = new Scanner(System.in);
        int numFunc, numHoras;
        double valorHora, salario;

        numFunc = leia.nextInt();
        numHoras = leia.nextInt();
        valorHora = leia.nextDouble();
        salario = (numHoras * valorHora);
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("NUMBER = "+ numFunc + "\nSALARY = U$ " + deci.format(salario));
        
        leia.close();
  
     }
 }