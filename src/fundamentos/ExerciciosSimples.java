// Input/Output: Peça e mostre o nome do usuário.
//

package fundamentos;

import java.util.Scanner;

public class ExerciciosSimples {
    public static void main(String[] args) {
        System.out.println("Olá! escreva seu nome:");

        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();

        System.out.println("O seu nome é:" + userName);
    }

}
