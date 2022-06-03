import java.util.Scanner;

public class Atividade2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o numerador: ");
    int numerador1 = entrada.nextInt();
    System.out.println("Digite o denominador: ");
    int denominador1 = entrada.nextInt();

    int result = dividir (numerador1,denominador1,1);
    System.out.println("O resultado é: " + result);

    entrada.close();

  }

  public static int dividir(int numerador, int denominador, int c) {
    if (numerador > 1) {
      c++;
      return dividir(numerador - denominador, denominador, c);
    } else {
      return c;
      // c = a quantidade de vezes que a função recursiba foi chamada
    }
  }
}
