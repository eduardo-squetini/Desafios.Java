package desafio_aula08;

public class Desafio_aula08 {

    public static void main(String[] args) {
        int[] valoresFib = new int[10];
        double media = 0;
        valoresFib[0] = 1;
        valoresFib[1] = 1;

        for (int i = 2; i < 10; i++) {
            valoresFib[i] = valoresFib[i - 1] + valoresFib[i - 2];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("elemento[" + i + "] = " + valoresFib[i]);
            media += valoresFib[i];
        }

        media /= valoresFib.length; // Calcula a média

        System.out.println("A média vale: " + media);
    }
}
