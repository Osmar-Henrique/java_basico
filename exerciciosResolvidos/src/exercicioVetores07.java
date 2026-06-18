public class exercicioVetores07 {
    public static void main(String[] args) {

        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};
        double somaNotas=0, media, acimaMedia=0, notasAcima=0;
        int contador=0;


        for (int i = 0; i < notas.length; i++)
        {
            somaNotas += notas[i];
            contador++;
        }

        System.out.println("A soma das notas é: " + somaNotas);
        media = somaNotas/contador;
        System.out.println("A média do aluno é: " + media);

        for (double n : notas)
        {
            if (n > media)
            {
                acimaMedia++;
            }
        }
        System.out.println("O total de notas acima da média foi de: " + acimaMedia + " notas");
    }
}
