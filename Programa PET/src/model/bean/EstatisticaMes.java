package model.bean;

/*
 * @author Lucas Vieira
 */
public class EstatisticaMes {
    
    private int total;
    private int janeiro;
    private int fevereiro;
    private int marco;
    private int abril;
    private int maio;
    private int junho;
    private int julho;
    private int agosto;
    private int setembro;
    private int outubro;
    private int novembro;
    private int dezembro;
    private String ano;
    
    public EstatisticaMes(String ano){
        this.total = 0;
        this.janeiro = 0;
        this.fevereiro = 0;
        this.marco = 0;
        this.abril = 0;
        this.maio = 0;
        this.junho = 0;
        this.julho = 0;
        this.agosto = 0;
        this.setembro = 0;
        this.outubro = 0;
        this.novembro = 0;
        this.dezembro = 0;
        this.ano = ano;
    }
    
    public EstatisticaMes(){
        
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getJaneiro() {
        return janeiro;
    }

    public void setJaneiro(int janeiro) {
        this.janeiro = janeiro;
    }

    public int getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(int fevereiro) {
        this.fevereiro = fevereiro;
    }

    public int getMarco() {
        return marco;
    }

    public void setMarco(int marco) {
        this.marco = marco;
    }

    public int getAbril() {
        return abril;
    }

    public void setAbril(int abril) {
        this.abril = abril;
    }

    public int getMaio() {
        return maio;
    }

    public void setMaio(int maio) {
        this.maio = maio;
    }

    public int getJunho() {
        return junho;
    }

    public void setJunho(int junho) {
        this.junho = junho;
    }

    public int getJulho() {
        return julho;
    }

    public void setJulho(int julho) {
        this.julho = julho;
    }

    public int getAgosto() {
        return agosto;
    }

    public void setAgosto(int agosto) {
        this.agosto = agosto;
    }

    public int getSetembro() {
        return setembro;
    }

    public void setSetembro(int setembro) {
        this.setembro = setembro;
    }

    public int getOutubro() {
        return outubro;
    }

    public void setOutubro(int outubro) {
        this.outubro = outubro;
    }

    public int getNovembro() {
        return novembro;
    }

    public void setNovembro(int novembro) {
        this.novembro = novembro;
    }

    public int getDezembro() {
        return dezembro;
    }

    public void setDezembro(int dezembro) {
        this.dezembro = dezembro;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
}
