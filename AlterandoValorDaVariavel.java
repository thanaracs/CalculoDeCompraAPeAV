import java.util.Scanner;

public class AlterandoValorDaVariavel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        Double valorProduto = ler.nextDouble();

        System.out.print("Informe o tipo de pagamento: \n[1] - A VISTA\n[2] - A PRAZO\n[0] - SAIR\nOPCAO: ");
        Integer tipoPagamento = ler.nextInt();

        for (int i = 0; tipoPagamento == 1 || tipoPagamento == 2; i++) {
            Boolean pagamentoAVista = tipoPagamento.equals(1);
            Double juros = 0.0;
            if (!pagamentoAVista) {
                juros = 10.00;
            }
            Double acrescimo = valorProduto * juros / 100;
            Double valorTotal = valorProduto + acrescimo;

            System.out.println("\nO valor total do produto eh: " + valorTotal);
            System.out.println("Voce deseja realizar nova compra? \n[1] SIM\n[2] NAO");
            Integer comprarNovamente = ler.nextInt();
            Boolean comprar = comprarNovamente.equals(1);
            if (comprar){
                System.out.print("\nInforme o valor do produto: ");
                valorProduto = ler.nextDouble();
                System.out.print("\nInforme o tipo de pagamento: \n[1] - A VISTA\n[2] - A PRAZO\n[0] - SAIR\nOPCAO: ");
                tipoPagamento = ler.nextInt();
            } else {
                System.out.println("Compra finalizada!");
                System.exit(0);
            }
        }
        ler.close();
    }
}
