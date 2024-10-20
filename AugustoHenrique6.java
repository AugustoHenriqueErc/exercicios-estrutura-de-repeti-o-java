/*
Faça um programa que calcule e imprima a soma e a média dos N primeiros números positivos. Soma = 1
+ 2 + 3 + ... + N
*/

import java.awt.Dialog;
import java.util.Scanner;
  public class AugustoHenrique6 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");
  
    int n, num = 1;
    double med, soma = 0;
      
    System.out.print("Digite um número N\n");
    n = scr.nextInt();
    
      do{
      System.out.println(num);
      num++;
      soma = soma + num;  
      } while(num < n);
  
    med = soma / n;
    System.out.printf("A média é %.2f \nA soma é: %.2f", med, soma);
      
    }
  }