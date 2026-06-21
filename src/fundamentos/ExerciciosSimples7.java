// Conversão moeda: Mostre quanto vale um valor em reais em dólar.

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples7 {

    public static void main(String[] args) {

        double dolar = 5.58;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor em R$ para que seja convertido em dólar: ");
        double valorReal = entrada.nextDouble();

        double valorDolar = valorReal / dolar;

        System.out.printf("O valor de R$ %.2f é USD %.2f\n", valorReal, valorDolar);


    }

}
