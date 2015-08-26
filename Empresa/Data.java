public class Data {
    public int dia;
    public int mes; 
    public int ano;
    
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2015;
    }
    public String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
