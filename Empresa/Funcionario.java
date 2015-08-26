 /**
  * 
  * @since 2015-08-25
  * @author Wilson de Farias
  * @version 1.1
  */

public class Funcionario {
    private String nome;
    private String departamento;
    private String rg;
    private double salario;
    private Data dataDeEntrada;
    
    public Funcionario () {
        this.nome = this.departamento = this.rg = "";
        this.dataDeEntrada = new Data();
    }
    
    public Funcionario (String nome) {
        this.departamento = this.rg = "";
        this.dataDeEntrada = new Data();
        this.nome = nome;
    }
    
    public Funcionario (String nome, double salario) {
        this(nome);
        this.salario = salario;
    }
    
    public void setAumento(double valor) {
        this.salario += valor;
    }

    public double getGanhoAnual() {
        return this.salario * 12;
    }
    
    /**
     * Imprime valores no console da aplicação
     *
     * @deprecated use {@link toString()} instead.  
     */
    
    @Deprecated
    public String mostra() {
        return  "Nome: " + this.nome +
                "\nDepartamento: " + this.departamento +
                "\nData de Entrada: " + this.dataDeEntrada.formatada() +
                "\nRG: " + this.rg +
                "\nSalário: " + this.salario;
    }   
    

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Nome: " + this.nome)
           .append("\nDepartamento: " + this.departamento)
           .append("\nData de Entrada: " + this.dataDeEntrada)
           .append("\nRG: " + this.rg)
           .append("\nSalário: " + this.salario);
        
        return str.toString();
    }
    
    // Getters e Setters
    
    void setNome (String nome) {
        this.nome = nome;
    }
    
    String getNome () {
        return this.nome;
    }
    
    void setDepartamento (String departamento) {
        this.departamento = departamento;
    }
    
    String getDepartamento () {
        return this.departamento;
    }
    
    void setRG (String rg) {
        this.rg = rg;
    }
    
    String getRG () {
        return this.rg;
    }
    
    void setSalario (double salario) {
        this.salario = salario;
    }
    
    double getSalario () {
        return this.salario;
    }
    
    void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    
    Data getDataDeEntrada() {
        return this.dataDeEntrada;
    }
}
