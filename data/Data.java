package data;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 0;
        mes = 0;
        ano = 0;
    }

    Data(int ano) {
        this.dia = 1;
        this.mes = 1;
        this.ano = ano;
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatarData(char separador) {
        String retorno = "" + dia + separador + mes + separador + ano;
        return retorno;
    }
}
