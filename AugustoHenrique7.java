/*
7. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1/1 + 1/2 + 1/3 + ... + 1/N. O valor
de N deve ser positivo e fornecido pelo usuário.
*/

import java.util.Scanner;
  public class AugustoHenrique7 {
    public static void main (String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    int N;  
    double H = 0;
      
    System.out.print("Digite um número:\n");
    N = scr.nextInt();
    
      for(int i = 1; i <= N; i++) {
      H = H + 1.0/i;  
      System.out.println("1/" +i);
      }  
    
    System.out.printf("A soma é igual a: %.2f\n", H);
    }
  }