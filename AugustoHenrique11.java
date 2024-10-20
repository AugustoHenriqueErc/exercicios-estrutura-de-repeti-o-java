/*
11. Faça um programa que leia a nota e o nome de N alunos na prova de algoritmos e imprima a maior e a
menor nota computada e qual aluno tirou tais notas. Além disso, calcule e imprima também a soma e a
média de todas as notas.
  */

import java.util.Scanner;
  public class AugustoHenrique11 {
    public static void main(String []args) {
    Scanner scr = new Scanner(System.in, "ISO-8859-1");

    int N;
    double nota, maiorNota = 0, menorNota = 0, total = 0, med;
    String nome, alunoMaior = "null", alunoMenor = "null";
      
    System.out.print("Digite o número N de alunos\n");
    N = scr.nextInt();

      for(int i = 1; i <= N; i++) {
      System.out.print("Digite a nome e nota do aluno\n");
      scr.nextLine();
      nome = scr.nextLine();
      nota = scr.nextDouble();
      total = total + nota;  
        if(i == 1) {
        maiorNota = nota;
        alunoMaior = nome;
        menorNota = nota;
        alunoMenor = nome;
        }
        else {
          if(nota > maiorNota) {
          maiorNota = nota;
          alunoMaior = nome;  
          }
          else if(nota < menorNota) {
          menorNota = nota;
          alunoMenor = nome;
          }
        }
      }
       
    med = total/N;
      
    System.out.printf("O aluno com a maior nota é:\n%s\nNota:%.2f\nO aluno com a menor nota é:\n%s\nNota:%.2f\nA média da turma é:%.2f", alunoMaior, maiorNota, alunoMenor, menorNota, med);
    }
  }