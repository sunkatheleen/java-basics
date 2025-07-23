// Soma: Some dois números informados pelo usuário.
//

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples1 {
    public static void main(String[] args) {
        System.out.println("Informe dois números inteiros para somá-los, escreva o primeiro abaixo:");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Escreva o segundo número:");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos números " + num1 + " + " + num2 + " é: "+ soma);
    }
}