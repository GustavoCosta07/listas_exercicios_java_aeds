package Lista2;
import java.util.Scanner;

public class Atividade6Lista2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int produtosComLucroMenoresQue10PorCento = 0;
        int produtosComLucroMaioresQue20PorCento = 0;
        int produtosComLucroMenorOuIgualQue20PorCento = 0;
        int encerrarPrograma = 1;
        Float totalCompra = 0f;
        Float totalVenda = 0f;

        do {
            System.out.println("Olá comerciante, Por quanto você comprou o produto 'X'? ");
            Float produtoCompra = entrada.nextFloat();
            totalCompra = totalCompra + produtoCompra;
            System.out.println("Olá comerciante, Por quanto você vendeu o produto 'X'? ");
            Float produtoVenda = entrada.nextFloat();
            totalVenda = totalVenda + produtoVenda;
            Float precoDoProdutoComMais20PorCento = (produtoCompra * 20 / 100) + produtoCompra;
            Float precoDoProdutoComMais10PorCento = (produtoCompra * 10 / 100) + produtoCompra;
            if (produtoVenda <= precoDoProdutoComMais20PorCento) {
                produtosComLucroMenorOuIgualQue20PorCento++;
            } else if (produtoVenda > precoDoProdutoComMais20PorCento) {
                produtosComLucroMaioresQue20PorCento++;
            }
            
            if (produtoVenda < precoDoProdutoComMais10PorCento) {
                produtosComLucroMenoresQue10PorCento++;
            }
            System.out.println("Deseja Encerrar o Programa? se sim Digite 1, Se não Digite 2 ");
            encerrarPrograma = entrada.nextInt();
        } while (encerrarPrograma == 1);
        if (encerrarPrograma != 1) {
            System.out.println("Olá comerciante, A quantidade de produtos Com Lucro Menor Que 10% é "
                    + produtosComLucroMenoresQue10PorCento);
            System.out.println("Olá comerciante, A quantidade de produtos Com Lucro Maior Que 20% é "
                    + produtosComLucroMaioresQue20PorCento);
            System.out.println("Olá comerciante, A quantidade de produtos Com Lucro Menor ou igual Que 20% é "
                    + produtosComLucroMenorOuIgualQue20PorCento);
            System.out.println("Seu total de gastos com compras foi de " + totalCompra);
            System.out.println("Seu total de gastos com Vendas foi de " + totalVenda);
        }

        entrada.close();
    }
}