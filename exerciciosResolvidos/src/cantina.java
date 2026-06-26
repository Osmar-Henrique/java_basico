import java.util.Scanner;

public class cantina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pedido=0;
        int selecionar;
        int escolhaLanche=-1;
        int escolherBebida=-1;
        double valorBebida=0.0;
        double valorTotal =0.0;
        double valorRecebido;
        boolean cadastro = true;

        double[] valores = {3.00, 4.50, 8.00, 9.00, 10.50, 11.00, 12.50};
        String[] lanches = {"coxinha", "pastel", "misto", "pizza","hamburguer"};
        String[] bebidas = {"agua", "suco", "achocolatado"};

        do {
            pedido++;
            System.out.println("*".repeat(30));
            System.out.println("Selecione abaixo os itens do pedido: ");
            System.out.println("1- Lanches");
            System.out.println("2- Bebidas");
            System.out.println("*".repeat(30));
            selecionar = input.nextInt();

            if (selecionar == 1)
            {
                while (escolhaLanche != 0)
                {
                    System.out.println("1- " + lanches[0]);
                    System.out.println("2- " + lanches[1]);
                    System.out.println("3- " + lanches[2]);
                    System.out.println("4- " + lanches[3]);
                    System.out.println("5- " + lanches[4]);
                    System.out.println("0 para finalizar");
                    escolhaLanche = input.nextInt();

                    if (escolhaLanche == 0)
                    {
                        valorTotal = valores[2];
                    }
                    if (escolhaLanche == 1)
                    {
                        valorTotal = valores[3];
                    }
                    if (escolhaLanche == 2)
                    {
                        valorTotal = valores[4];
                    }
                    if (escolhaLanche == 3)
                    {
                        valorTotal = valores[5];
                    }
                    if (escolhaLanche == 4)
                    {
                        valorTotal = valores[6];
                    }
                }

            }
            else if (selecionar == 2)
            {
                while (escolherBebida != 0)
                {
                    System.out.println("1- " + bebidas[0]);
                    System.out.println("2- " + bebidas[1]);
                    System.out.println("3- " + bebidas[2]);
                    System.out.println("0 para finalizar");
                    escolherBebida = input.nextInt();

                    if (escolherBebida == 1)
                    {
                        valorBebida = valores[0];
                    }
                    if (escolherBebida == 2)
                    {
                        valorBebida = valores[1];
                    }
                    if (escolherBebida == 3)
                    {
                        valorBebida = valores[2];
                    }

                }

            }
        }
        while (selecionar != 0);


        if (cadastro)
        {
            System.out.println("O cliente tem direito a 10% de desconto!");

        }
        else
        {
            System.out.println("Nenhum desconto será aplicado.");
        }


        System.out.println("Insira o valor recebido pelo cliente: ");
        valorRecebido = input.nextDouble();

        System.out.println("O valor total será de: " +valorTotal);

    }
}
