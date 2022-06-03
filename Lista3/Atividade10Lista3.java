package Lista3;
import java.util.Scanner;

public class Atividade10Lista3 {
    public static char obterCategoria(int idade) {
        char categoria = ' ';
        if (idade >= 5 && idade <= 7) {
            categoria = 'F';
        }else if (idade >= 8 && idade <= 10) {
            categoria = 'E';
        }else if (idade >= 11 && idade <= 13) {
            categoria = 'D';
        }else if (idade >= 14 && idade <= 15) {
            categoria = 'C';
        }else if (idade >= 16 && idade <= 17) {
            categoria = 'B';
        }else if (idade >= 18){
            categoria = 'A';
        }
        return categoria;
    }

    public static void main(String[] args) {
        System.out.println("Digite sua idade: ");
        Scanner entrada = new Scanner (System.in);
        char categoria = obterCategoria(entrada.nextInt());
        System.out.println("A sua categoria é: " + categoria);
        entrada.close();
    }
}
