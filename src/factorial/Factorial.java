package factorial;

public class Factorial {

    public static void main(String[] args) {

        int numero;
        int factorial;

        numero = 8;

        int i;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (i = numero; i >= 1; i--) {
                factorial = factorial * i;
            }
        }

        System.out.println(factorial);

    }

}
