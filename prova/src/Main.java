import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double far;
        double cel;

        System.out.println("Digite a temperatura em Fahrenheit");
        far = input.nextDouble();

        cel = (far - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: "+cel);

        input.close();


    }
}