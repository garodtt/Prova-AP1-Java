import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num;
        double cubo;
        double quadro;

        System.out.println("Digite um numero para calcularmos o quadrado e o cubo dele");
        num = input.nextDouble();

        quadro = num*num;
        cubo = num*num*num;

        System.out.println("Quadrado: "+quadro+"\nCubo: "+cubo);

        input.close();

    }
}