import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double weight = input.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double height = input.nextDouble();

        IMCCalculator calculator = new IMCCalculator(weight, height);
        double bmi = calculator.getBMI();

        System.out.println("Seu IMC é: " + bmi);
        System.out.println("Seu tipo de peso é: " + calculator.getWeightCategory());
    }
}



