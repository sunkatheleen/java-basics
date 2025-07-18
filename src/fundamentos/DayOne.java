/*
 * Exercício: Calculadora de IMC
 * Etapa: Fundamentos
 *
 * Resumo em português:
 * Programa simples para calcular o IMC (Índice de Massa Corporal) do usuário, usando entrada de dados pelo console.
 * Neste exercício, além de praticar conceitos básicos de Java (variáveis, entrada/saída com Scanner, estrutura do programa),
 * aprendi a criar um projeto Java corretamente no IntelliJ IDEA, a organizar arquivos em packages,
 * a entender o papel de cada pasta da estrutura do projeto (src, out, .idea), a identificar e corrigir erros comuns de execução
 * e a interpretar melhor as mensagens da IDE. Isso me deixou mais segura e menos ansiosa para evoluir.
 *
 * English summary:
 * Simple program to calculate the BMI (Body Mass Index) of the user, using data input via console.
 * In this exercise, besides practicing Java basics (variables, input/output with Scanner, program structure),
 * I learned how to properly create a Java project in IntelliJ IDEA, organize files in packages,
 * understand the purpose of each project folder (src, out, .idea), identify and fix common execution errors,
 * and better interpret IDE messages. This made me feel more confident and less anxious about learning.
 */


package fundamentos;

import java.util.Scanner; // Importa a ferramenta para ler o que o usuário digitar

public class DayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um leitor para receber os dados do usuário

        System.out.print("Digite seu peso em kg: "); // Mostra mensagem
        double peso = sc.nextDouble(); // Lê o número digitado e guarda na variável 'peso'

        System.out.print("Digite sua altura em metros: "); // Mostra mensagem
        double altura = sc.nextDouble(); // Lê o número digitado e guarda na variável 'altura'

        double imc = peso / (altura * altura); // Calcula o IMC

        System.out.printf("Seu IMC é: %.2f\n", imc); // Mostra o resultado com 2 casas decimais

        sc.close(); // Fecha o leitor de dados
    }
}
