//  Conversão: Converta Celsius para Fahrenheit.

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples2 {
    public static void main(String[] args) {

        Scanner temperatura = new Scanner(System.in);
        System.out.println("Escreva a temperatura em Cº para convertermos em Fº: ");
        int tempCelsius = temperatura.nextInt();
        double tempFarenheit = (tempCelsius * 1.8) + 32;

        System.out.println(tempCelsius + "Cº em Farenheit é " + tempFarenheit + "Fº");
    }
}
