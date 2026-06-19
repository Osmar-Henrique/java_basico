public class exercicioVetores09 {
    public static void main(String[] args) {

        int[] v = {12, 5, 33, 7, 28, 14, 9};

        for (int i = 0; i < v.length;i++)
        {
            if (v[i] == 28)
            {
                System.out.println("Valor encontrado no índice [" + i + "]");
            }
            else
            {
                System.out.println("Valor indisponível, valor encontrado é: " + v[v.length-1]);
            }
        }
    }
}

/* int[] v = { 12, 5, 33, 7, 28, 14, 9 };
int alvo = 28;
int posicao = -1;

for (int i = 0; i < v.length; i++) {
    if (v[i] == alvo) {
        posicao = i;
        break;   // para ao encontrar
    }
}

System.out.println(posicao == -1
    ? "Não encontrado"
    : "Encontrado em v[" + posicao + "]");  // v[4] */