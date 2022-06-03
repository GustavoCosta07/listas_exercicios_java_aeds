import java.util.Scanner;

public class Atividade3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o numerador: ");
    int numerador1 = entrada.nextInt();
    System.out.println("Digite o denominador: ");
    int denominador1 = entrada.nextInt();
    int result = dividir(numerador1, denominador1);
    System.out.println("O resto de divisão é: " + result);

    entrada.close();

  }

  public static int dividir(int numerador, int denominador) {
    if (numerador >= denominador) {
      return dividir(numerador - denominador, denominador);
    } else {
      return numerador;
    }
  }
}
