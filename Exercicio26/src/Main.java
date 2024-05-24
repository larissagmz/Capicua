import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("capicua");
            return;
        }


        int primeiroDigito = numero;

        for (int i = 0; primeiroDigito >= 9; i++) {

            primeiroDigito = primeiroDigito / 10;
        }
        int ultimoDigito = numero;
        while (ultimoDigito >= 9) {
            ultimoDigito = ultimoDigito % 10;
        }
        if (primeiroDigito == ultimoDigito) {
            System.out.println(" e capicua");
        } else {
            System.out.println("nao e");
        }


    }
}
