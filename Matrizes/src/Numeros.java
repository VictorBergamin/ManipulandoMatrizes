import java.util.Arrays;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        double numero[] = new double[3];
        System.out.println("Digite a quantidade de valores");

        int quantidade = valor.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o valor");
            numero[i] = valor.nextDouble();
        }

        System.out.println(numero);
        System.out.println(Arrays.toString(numero));
        Arrays.stream(numero).forEach(System.out::println);

    }
}


