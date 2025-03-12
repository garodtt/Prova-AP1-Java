import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double baseT;
        double alturaT;
        double result;

        System.out.println("Digite o valor da Base do Triangulo: ");
        baseT = input.nextDouble();
        System.out.println("Digite a Altura do Triangulo: ");
        alturaT = input.nextDouble();

        result = (baseT * alturaT)/2;

        System.out.println("A área do triangulo é: "+result);

        input.close();

    }
}