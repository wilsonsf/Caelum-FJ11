public class Data {
    int dia, 
        mes, 
        ano;
        
    String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
