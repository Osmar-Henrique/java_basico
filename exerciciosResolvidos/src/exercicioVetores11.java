import java.util.Scanner;

public class exercicioVetores11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] numeros = new int [3][3];

        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros.length; j++)
            {
                System.out.println("Digite o " + (j + 1) + " º número: ");
                numeros[i][j] = input.nextInt();

            }
        }
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros.length; j++)
            {
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println("\n");
        }
        System.out.println("A soma da diagonal é: " + (numeros[0][0] + numeros[1][1] + numeros[2][2]));

    }
}
