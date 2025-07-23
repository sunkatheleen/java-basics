// Área: Calcule a área de um retângulo.
//

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples3 {
    public static void main (String[] args) {

        Scanner calculo = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um retângulo? digite qual é o valor da base: ");
        double base = calculo.nextDouble();

        System.out.println("Agora digite a altura: ");
        double altura = calculo.nextDouble();

        double area = base * altura;

        System.out.println("A área desse retãngulo é: " + area + "cm²");

    }
}
