import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int delta;
        int x1;
        int x2;

        System.out.println("Digite a equação de segundo grau, começando pelo valor de A: ");
        a = input.nextInt();
        System.out.println("Agora o valor de B: ");
        b = input.nextInt();
        System.out.println("Por fim o valor de C: ");
        c = input.nextInt();
        System.out.println("Sua equação é:"+a+"x^2 "+b+"x "+c+" = 0");

        delta = (b*b)-(4*a*c);

        System.out.println("\nO delta é: "+delta);
        input.close();

    }
}