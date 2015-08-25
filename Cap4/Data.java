public class Data {
    int dia, 
        mes, 
        ano;
    
    Data() {
        this.dia = 25;
        this.mes = 8;
        this.ano = 2015;
    }
    String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
