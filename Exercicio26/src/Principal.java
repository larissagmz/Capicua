public class Principal {
    public static void main(String[] args) {

        int numero = 84;
        int numeroInvertido = 0;
        int soma = numero;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = (numeroInvertido * 10) + digito;
            numero /= 10;
            while (numero == 0) {

                soma = soma + numeroInvertido;
                if (Capicua.VerCapicua(soma)) {
                    System.out.println(soma);
                    break;
                }
                if (!Capicua.VerCapicua(soma)) {
                    numero += soma;
                    numeroInvertido = 0;
                }

            }
        }


    }
}