package Lista3;
import java.util.Scanner;

public class Atividade4Lista3 {

    public static void valores(float x, float y, float z) {
        if (x == y && x == z) {
            System.out.println("Este é um Triângulo Equilátero");
        } else if (x == y && x != z) {
            System.out.println("Este é um Triângulo Isósceles");
        } else if (x == z && x != y) {
            System.out.println("Este é um Triângulo Isósceles");
        } else if (y == z && x != x) {
            System.out.println("Este é um Triângulo Isósceles");
        }else if (x != y && x != z) {
            System.out.println("Este é um Triângulo Escaleno");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

Float lado1 = entrada.nextFloat();
Float lado2 = entrada.nextFloat();
Float lado3 = entrada.nextFloat();

valores(lado1, lado2, lado3);

        entrada.close();
    }
}