public class Capicua {

    static boolean VerCapicua(int numero) {
        int primeiroDigito = numero;
        boolean capicua = false;

        while (primeiroDigito >= 9) {

            primeiroDigito = primeiroDigito / 10;
        }
        int ultimoDigito = numero;
        while (ultimoDigito >= 9) {
            ultimoDigito = ultimoDigito % 10;
        }
        if (primeiroDigito == ultimoDigito) {
            capicua = true;
        }
        return capicua;
    }
}
