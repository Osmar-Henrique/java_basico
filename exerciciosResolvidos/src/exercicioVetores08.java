public class exercicioVetores08 {
    public static void main(String[] args) {

        int[] v = {4, 17, 3, 22, 8, 15, 1, 30, 9};
        int maiorN=0, menorN =0;


        for (int i = 1; i < v.length; i++)
        {
            if (v[i] > v[maiorN])
            {
                maiorN = i;
            }
            else if (v[i] < v[menorN])
            {
                menorN = i;
            }
        }
        System.out.println("Maior: v[" + maiorN + "] = " + v[maiorN]);
        System.out.println("Menor: v[" + menorN + "] = " + v[menorN]);


    }
}
