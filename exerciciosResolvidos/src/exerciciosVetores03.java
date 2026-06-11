import java.util.Scanner;

public class exerciciosVetores03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * i;
        }

        for (int n : numeros) { //Esse é o FOR EACH, uma versão resumida do FOR, é apenas um artifício para impressão
            System.out.print(n + " ");      //ele evita de copiar o for inteiro


        }
        input.close();

    }
}