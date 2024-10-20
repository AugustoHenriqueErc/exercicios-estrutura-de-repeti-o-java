/*
12. No último ano foi realizada um estudo estatístico sobre acidentes de trânsito em 5 cidades brasileiras.
Para isso os seguintes dados foram coletados:
a) Nome da cidade (String ou char).
b) Número de veículos
c) Número de acidentes de trânsito
Com esses dados deseja-se saber:
a) O maior e o menor índice de acidentes e o nome da cidade a que pertencem
b) A razão entre quantidade de acidentes por quantidade de veículos nas 5 cidades analisadas
c) A média de veículos nas cinco cidades
d) A média de acidentes de trânsito nas cidades com menos de 200 veículos
*/

import java.util.Scanner;
  public class AugustoHenrique12 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    String cidad, cMaiorA = "null", cMenorA = "null";
    double acid, veic, razAV, medV, medA, totalV = 0, totalA = 0, maiorA = 0, menorA = 0, numCMA = 0;

      for(int i = 1;i <= 5; i++) { 
      System.out.print("Digite o nome da cidade, o número de veículos e o numero de acidentes de trânsito\n");
      cidad = scr.nextLine();
      veic = scr.nextInt();
      acid = scr.nextInt();
      scr.nextLine();
      razAV = acid/veic;
      System.out.printf("\nA razão de acidentes e veículos da cidade de %s é de %.2f\n", cidad, razAV);  

      totalV = totalV + veic;
        
        if(veic < 200) {
        totalA = totalA + acid;  
        numCMA = numCMA + 1;
        }
        if(i == 1) {
        maiorA = acid;
        menorA = acid;
        }  
        else {  
          if(acid > maiorA) {
          maiorA = acid;
          cMaiorA = cidad;
          } 
          else if(acid < menorA) {
          menorA = acid;
          cMenorA = cidad;  
          }        
        }
      }

      medA = totalA/numCMA;
      medV = totalV/5;
      
    System.out.printf("\nO maior índice de acidentes é da cidade de %s\nOcorrência:%.2f\nO menor índice de acidentes é da cidade de %s\nOcorrência:%.2f\nA média de veículos nas cinco cidades é:%.2f\nA média de acidentes de trânsito nas cidades com menos de 200 veículos é:%.2f", cMaiorA, maiorA, cMenorA, menorA, medV, medA);
    // divisao por zero na media das cidades com menos d e 200 veiculos
    scr.close();
    }
  }