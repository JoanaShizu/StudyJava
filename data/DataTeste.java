package data;

public class DataTeste {
    public static void main(String[] args) {
        Data hoje = new Data();
        hoje.dia = 20;
        hoje.mes = 05;
        hoje.ano = 2023;

        System.out.println(hoje.formatarData('/'));
    }
}
