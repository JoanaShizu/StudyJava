package capitulo4_e_6;

/*[Métodos static] Crie uma classe chamada Util com os métodos:
a. ehPar( ): recebe um inteiro e retorna verdadeiro, se o número for par,
ou falso, se for ímpar.
b. ehNegativo( ): recebe um inteiro e retorna verdadeiro se ele for menor
que zero, ou falso, caso contrário.
c. maior( ): recebe dois números do tipo double e retorna o maior deles. */
public class Util {
    public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;

    }

    public static boolean ehNegativo(int numero) {
        if (numero < 0) {
            return true;
        }
        return false;

    }

    public static double maior(double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public static void main(String[] args) {
        int numero = -9;

        System.out.println(ehPar(numero));
        System.out.println(ehNegativo(numero));
        System.out.println(maior(numero, 2));
    }
}
