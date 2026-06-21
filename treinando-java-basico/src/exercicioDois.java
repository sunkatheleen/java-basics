/*
Leia um número inteiro e imprima "Par" se ele for par, ou "Ímpar" se for ímpar.

Fiz uma pequena alteração nesse exercício para praticar laços e repetições.
 */

import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int escolha = 1;

            while (escolha != 0) {

                System.out.println("Par ou ímpar? digite um número inteiro para continuar ou 0 para sair");
                int num = input.nextInt();
                int operacao = num % 2;

                if (operacao == 0)
                    System.out.println("O número é par pois: " + num + " divido por 2 é 0");

                else { System.out.println("O número é ímpar pois: " + num + " não é divisivel por 2");
            }
                int validaEscolha;
                validaEscolha = num;
                escolha = validaEscolha;
        }
    }
}


