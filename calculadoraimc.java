import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        // Declarar as variáveis
        Scanner scanner = new Scanner(System.in);
        double peso = 0;
        double altura = 0;

        // Solicitar os dados do usuário e tratar exceções
        try {
            System.out.print("Digite o seu peso (kg): ");
            peso = scanner.nextDouble();

            System.out.print("Digite a sua altura (m): ");
            altura = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Por favor, insira valores numéricos válidos.");
            System.exit(1);
        }

        // Calcular o IMC
        double imc = peso / (altura * altura);

        // Mostrar o IMC
        System.out.println("O seu IMC é: " + imc);

        // Exibir a classificação do IMC usando switch case
        String classificacao;
        switch ((int) imc / 5) {
            case 0:
                classificacao = "Você está abaixo do peso.";
                break;
            case 1:
                classificacao = "Você está com peso normal.";
                break;
            case 2:
                classificacao = "Você está com sobrepeso.";
                break;
            case 3:
                classificacao = "Você está com obesidade grau I.";
                break;
            case 4:
                classificacao = "Você está com obesidade grau II.";
                break;
            default:
                classificacao = "Você está com obesidade grau III.";
        }

        System.out.println(classificacao);
    }
}