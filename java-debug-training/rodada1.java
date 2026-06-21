// O dev queria verificar se a idade era 18 e liberar o acesso, mas o resultado nunca sai errado. Qual é o erro aqui?

// 📌 Código de exemplo:
public class DetetiveBug {
    public static void main(String[] args) {
        int idade = 18;

        // O dev quer verificar se idade é igual a 18
        if (idade = 18) {
            System.out.println("Você é maior de idade.");
        }
    }
}

// 🧠 Raciocínio:
O erro está no if (idade = 18), pois está atribuindo o valor 18 à variável em vez de comparar. Deveria ser idade == 18.

// 🐞 Bug identificado:
Uso de '=' (atribuição) em vez de '==' (comparação) no if.

// ✅ Correção:
public class DetetiveBug {
    public static void main(String[] args) {
        int idade = 18;

        if (idade == 18) {
            System.out.println("Você é maior de idade.");
        }
    }
}

// ℹ️ Observações:
// Nenhuma observação adicional nesta rodada.
