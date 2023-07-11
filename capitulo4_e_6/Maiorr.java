package capitulo4_e_6;

/*[varargs] Crie um método com parâmetros de quantidade variável (inteiros).
O método deve retornar o maior dos elementos. Crie o método main( ) para testar. */
public class Maiorr {
    public static int maior(int... v) {
        int maiorNumero = -255;

        for (int i = 0; i < v.length; i++) {
            if (v[i] > maiorNumero) {
                maiorNumero = v[i];
            }
        }
        return maiorNumero;
    }

    public static void main(String[] args) {
        System.out.println(maior(3, -5, 20, 4));
    }
}