import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.println("Digite seu Peso: ");
        peso = input.nextDouble();

        System.out.println("Digite sua Altura: ");
        altura = input.nextDouble();

        imc = peso / (altura*altura);

        System.out.println("Seu IMC é: "+imc);


        input.close();


    }
}