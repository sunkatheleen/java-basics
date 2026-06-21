// Maior número: Mostre qual dos dois números informados é o maior.

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = entrada.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número entre " + num1 + "e " + num2 + " é o " + num1);
    }   else {
        System.out.println("O maior número entre " + num1 + "e " + num2 + " é o " + num2);
    }
}
}