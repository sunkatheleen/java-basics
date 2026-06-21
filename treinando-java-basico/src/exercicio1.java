/* 1. Soma Simples
Escreva um programa em Java que leia dois números inteiros e imprima a soma deles.
*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.println("Escreva dois números inteiros de 1 a 100 para saber o resultado de suas somas. Primeiro número: ");
        int num1 = i.nextInt();

        System.out.println("Escreva o segundo número: ");
        int num2 = i.nextInt();

        int sum = num1 + num2;

        System.out.print(num1 + "+" + num2 + "=" + sum);

    }

}
