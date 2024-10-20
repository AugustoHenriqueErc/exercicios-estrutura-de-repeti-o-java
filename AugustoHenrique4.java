/*
4. Escreva um algoritmo que receba números do usuário e imprima o triplo de cada número. O algoritmo
deve encerrar ao ser digitado o número 999. Obs.: O triplo de -999 não deve ser exibido.
*/

import java.util.Scanner;
  public class  AugustoHenrique4 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    double num, trip;

    
    System.out.print("Digite um número\n");
    num = scr.nextDouble();

    trip = 3 * num;
      if(num == 999 || num ==-999) {
        
      System.out.print("fim");  
      } 
      else {
        while(num < 999 && num > -999) {
        trip = 3 * num;
        System.out.printf("O triplo de %.2f é %.2f\n", num, trip);
        System.out.printf("\nDigite um número\n");
        num = scr.nextDouble();  
        }  
      }
      
   }
  }
