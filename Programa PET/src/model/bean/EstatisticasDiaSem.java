package model.bean;

/**
 * @author Lucas Vieira
 */
public class EstatisticasDiaSem {

    private int total;
    private int domingo;
    private int segunda;
    private int terca;
    private int quarta;
    private int quinta;
    private int sexta;
    private int sabado;
    private String mes;

    public EstatisticasDiaSem() {

    }

    public EstatisticasDiaSem(int mes) {
        switch (mes) {
            case 0:
                this.mes = "";
                break;
            case 1:
                this.mes = "Janeiro";
                break;
            case 2:
                this.mes = "Fevereiro";
                break;
            case 3:
                this.mes = "Março";
                break;
            case 4:
                this.mes = "Abril";
                break;
            case 5:
                this.mes = "Maio";
                break;
            case 6:
                this.mes = "Junho";
                break;
            case 7:
                this.mes = "Julho";
                break;
            case 8:
                this.mes = "Agosto";
                break;
            case 9:
                this.mes = "Setembro";
                break;
            case 10:
                this.mes = "Outubro";
                break;
            case 11:
                this.mes = "Novembro";
                break;
            case 12:
                this.mes = "Dezembro";
                break;
        }

        this.domingo = 0;
        this.segunda = 0;
        this.terca = 0;
        this.quarta = 0;
        this.quinta = 0;
        this.sexta = 0;
        this.sabado = 0;
        this.total = 0;
    }

    public int getDomingo() {
        return domingo;
    }

    public void setDomingo(int doming) {
        this.domingo = doming;
    }

    public int getSegunda() {
        return segunda;
    }

    public void setSegunda(int segunda) {
        this.segunda = segunda;
    }

    public int getTerca() {
        return terca;
    }

    public void setTerca(int terca) {
        this.terca = terca;
    }

    public int getQuarta() {
        return quarta;
    }

    public void setQuarta(int quarta) {
        this.quarta = quarta;
    }

    public int getQuinta() {
        return quinta;
    }

    public void setQuinta(int quinta) {
        this.quinta = quinta;
    }

    public int getSexta() {
        return sexta;
    }

    public void setSexta(int sexta) {
        this.sexta = sexta;
    }

    public int getSabado() {
        return sabado;
    }

    public void setSabado(int sabado) {
        this.sabado = sabado;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
