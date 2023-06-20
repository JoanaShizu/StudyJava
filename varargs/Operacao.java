package varargs;

public class Operacao {
    public static int metodo(String s, int... v) {
        int total = 0;

        if (s == "SOM") {
            total = 0;
            for (int i = 0; i < v.length; i++) {
                total += v[i];
            }
        }
        if (s == "MULT") {
            total = 1;
            for (int i = 0; i < v.length; i++) {
                total *= v[i];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int x = metodo("MULT", 4, 3, 2);
        System.out.println(x);
    }
}