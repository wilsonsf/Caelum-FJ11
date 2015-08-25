public class Funcionario {
    String  nome,
            departamento,
            rg;
    double  salario;
    Data dataDeEntrada;
    
    Funcionario () {
        this.nome = this.departamento = this.rg = "";
        this.dataDeEntrada = new Data();
    }
    
    Funcionario (String nome) {
        this.departamento = this.rg = "";
        this.dataDeEntrada = new Data();
        this.nome = nome;
    }
    
    Funcionario (String nome, double salario) {
        this.departamento = this.rg = "";
        this.dataDeEntrada = new Data();
        this.nome = nome;
        this.salario = salario;
    }
    
    void recebeAumento(double valor) {
        this.salario += valor;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }
    
    /**
     * Imprime valores no console da aplicação
     *
     * @deprecated use {@link toString()} instead.  
     */
    
    @Deprecated
    String mostra() {
        return  "Nome: " + this.nome +
                "\nDepartamento: " + this.departamento +
                "\nData de Entrada: " + this.dataDeEntrada.formatada() +
                "\nRG: " + this.rg +
                "\nSalário: " + this.salario;
    }   
    

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nNome: " + this.nome)
           .append("\nDepartamento: " + this.departamento)
           .append("\nData de Entrada: " + this.dataDeEntrada)
           .append("\nRG: " + this.rg)
           .append("\nSalário: " + this.salario);
        
        return str.toString();
    }
}
