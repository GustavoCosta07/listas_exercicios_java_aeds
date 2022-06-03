package Lista1;
public class Atividade3Lista {

    public static void main(String[] args) {

        int apartamentos = 75;

        Float diariaPromocional = 250.35f;
        Float diariaComum = diariaPromocional + diariaPromocional * 25/100 ;
        System.out.printf("O valor da diária promocional é: %.2f reais",  diariaPromocional);
        Float ocupacao80 = (float) (apartamentos * 80 / 100);
        Float valorArrecadoEm80PorCento = (float) (ocupacao80 * diariaPromocional);
        System.out.printf("\n o valor total arrecadado com 80 porcento de ocupação" +
                " e diária promocional é de : %.2f reais", valorArrecadoEm80PorCento);
        Float ocupacao50 = (float) (apartamentos * 50 / 100);
        Float valorArrecadoEm50PorCento = (float) (ocupacao50 * diariaComum);
        System.out.printf(" \n o valor total arrecadado com 50 porcento de ocupação com diária normal é de : %.2f reais", valorArrecadoEm50PorCento );
        System.out.println("A diferença entre os valores arrecadados é de: " + (valorArrecadoEm80PorCento - valorArrecadoEm50PorCento));
    }
}