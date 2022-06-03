package Lista3;
import java.util.Scanner;


public class Atividade6Lista3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valorN = entrada.nextInt();
        float somaE = 1f;
        
        
        for (int contador = 1; contador <= valorN; contador++) {
            Float resultadoFat = (float) (1/fatorial(contador));
            somaE = (float) somaE + resultadoFat;
            
    
        }

        System.out.printf("%.3f",somaE);

        entrada.close();
    }

    public static float fatorial(int num) {
        if (num >= 1){
            return num * fatorial(num - 1);
        }
        else {
            return 1;
        }
    }
}