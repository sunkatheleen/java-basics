// Média: Calcule a média entre três números.

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Calcule a média entre três números, escreva o primeiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Escreva o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("Escreva o último número: ");
        int num3 = entrada.nextInt();

        int media = (num1 + num2 + num3) / 3;

        System.out.println("A média entre os números " + num1 + ", " + num2 + " e " + num3 + " é " + media);
    }
}
