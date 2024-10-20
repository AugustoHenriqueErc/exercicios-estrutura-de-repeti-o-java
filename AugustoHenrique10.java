/*
Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores
digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.
*/
import java.util.Scanner;
  public class AugustoHenrique10 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    int N;
    double num, maior, menor;

    maior = 0;  
    menor = 0;
      
    System.out.print("Digite um número N referente a quantidade de números a serem comparados\n");
    N = scr.nextInt();
  
      for (int i = 1;i <= N;i++) {
      System.out.print("Digite um número\n");
      num = scr.nextDouble();
        if (i == 1) {
        maior = num;
        menor = num;  
        }
        else {
          if (num > maior) {
          maior = num;
          }  
          else if (num < menor) {
          menor = num;
          }
        }  
      }
    System.out.printf("O maior número é %.2f\nO menor número é %.2f", maior, menor);
    }
  }