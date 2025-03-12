import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double far;
        double cel;

        System.out.println("Digite a temperatura em Celsius");
        cel = input.nextDouble();

        far = (cel * 9/5)+32;

        System.out.println("A temperatura em Fahrenheit é: "+far);

        input.close();


    }
}