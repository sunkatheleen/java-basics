// Mensagem personalizada: Peça a idade e mostre uma mensagem.

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        int anoNasc = 2025 - idade;

        System.out.println("Você nasceu por volta de: " + anoNasc);


    }
}
