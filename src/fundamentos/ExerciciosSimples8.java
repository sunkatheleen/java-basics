// Positivo ou negativo: Informe se um número é positivo ou negativo.

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = entrada.nextDouble();

        if (numero >= 0) {
            System.out.println("O número " + numero + " é positivo.");
        }
        else {
            System.out.println("O número " + numero + " é negativo.");
        }
    }
}
