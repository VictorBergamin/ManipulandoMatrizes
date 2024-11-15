import java.util.Scanner;

public class ArmazenamentoVetor {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        double sal[] = new double[10];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o salário: ");
            sal[i] = valor.nextDouble();
        }

        for (int i = 0; i < 3; i++){
            System.out.println("\nFuncionario" + (i+1) + " salario " + sal[i]);
        }
    }
}
