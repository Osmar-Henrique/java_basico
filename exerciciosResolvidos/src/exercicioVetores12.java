public class exercicioVetores12 {
    public static void main(String[] args) {

        int[] numeros =  {64, 25, 12, 22, 11};

        System.out.print("Antes: ");
        for (int v : numeros) System.out.print(v + " ");
        System.out.println();

        for (int i = 0; i < numeros.length-1; i++)
        {
            int iMin = i;
            for (int j = i + 1; j < numeros.length; j++)
            {
                if (numeros[j] < numeros[iMin]) iMin = j;
            }
            int temp = numeros[i];
            numeros[i] = numeros[iMin];
            numeros[iMin] = temp;
        }

        System.out.println("Depois: ");
        for (int v : numeros) System.out.println(v + " ");




    }
}
