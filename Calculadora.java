import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer
        System.out.println("Escolha a operação:");
        String op = sc.nextLine();

        switch (op) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
}