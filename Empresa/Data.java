public class Data {
    private int dia;
    private int mes; 
    private int ano;
    
    public Data() {}
    
    public Data(int dia, int mes, int ano) {
        this();
        if (validaData(dia,mes,ano)) {
            
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        // else
        //     throw Exception
    }
    public String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public static boolean validaData (Data data) {
        return true;
    }
    
    private boolean validaData (int dia, int mes, int ano) {
        // if ( alguma coisa) 
        //     return false;
        // else 
            return true;
    }
    
    // Getters & Setters
    public int getDia() {
        return this.dia;
    }
    
    public void setDia(int dia) {
        if (validaData(dia, this.mes, this.ano))
            this.dia = dia;
        // else 
        //    throw Exception
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public void setMes(int mes){
        if (validaData(this.dia, mes, this.ano))
            this.mes = mes;
        // else 
        //    throw Exception
    }
        
    public int getAno(){
        return this.ano;
    }
    
    public void setAno(int ano){
        if (validaData(dia, this.mes, this.ano))
            this.ano = ano;
        // else 
        //    throw Exception
    }
}
