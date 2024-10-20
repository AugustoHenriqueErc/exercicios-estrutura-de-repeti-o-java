/*
9. Faça um programa que calcule e imprima a soma e a média de N números digitados pelo usuário. O valor
de N deve ser fornecido pelo usuário.
*/

import java.util.Scanner;
  public class AugustoHenrique9 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    int N;    
    double soma, med, num;

    soma = 0;
      
    System.out.print("Digite quantos números quer somar\n");
      N = scr.nextInt();
  
      for(int i = 1; i <= N; i++) {
      System.out.printf("Digite o %d º número\n", i);
      num = scr.nextDouble();
      soma = soma + num;
      }  
      
    med = soma / N;

    System.out.printf("A soma dos %d númeors é: %.2f\nA média dos %d é %.2f", N, soma, N, med);
    scr.close();
    }
  }