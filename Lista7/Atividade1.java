import java.io.*;

public class Atividade1 {
    public static void main(String[] args) throws IOException {
        File file = new File("arquivo.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        int controle = 1;
        for (int i = 0; i < 10; i++) {
            pw.println(controle++);
        }

        pw.close();
    }
}
