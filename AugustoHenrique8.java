/*
8. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N. O
valor de N deve ser positivo e fornecido pelo usuário.
*/

import java.util.Scanner;
  public class AugustoHenrique8 {
    public static void main (String []args) {  
    Scanner scr = new Scanner(System.in, "ISO-8859-1");
  
    int n; 
    double h = 0;
      
    System.out.print("Digite um número\n");
    n = scr.nextInt();
      
      for(double i = 1; i <= n; i = i + 1) {
        if(i % 2 == 0) {
        System.out.printf("1/%.0f\n", i);
        h = h - 1/i;
        }
        else {
        System.out.printf("1/%.0f\n", i);
        h = h + 1/i;
        }
      }  
        
    System.out.printf("A soma é:\n%.2f", h);
    scr.close();
    }
  }