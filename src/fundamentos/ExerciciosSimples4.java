// Dobro/Triplo: Mostre o dobro e triplo de um número.

package fundamentos;
import java.util.Scanner;

public class ExerciciosSimples4 {
    public static void main (String[] args) {

        System.out.println("Digite um número para descobrir o seu dobro e triplo: ");
        Scanner entrada = new Scanner(System.in);
        double num = entrada.nextDouble();

        double dobro = num * 2;
        double triplo = num * 3;

        System.out.println("O dobro do número " + num + " é: " + dobro + " e o triplo é: " + triplo);


    }
}
