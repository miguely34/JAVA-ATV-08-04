import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero :");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro numero :");
        int num2 = scanner.nextInt();

        Calculadora calc = new Calculadora();
        int resultado = calc.soma(num1,num2);

        System.out.println("A soma é: "+ resultado);
        scanner.close();

    }
}