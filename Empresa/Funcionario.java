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
    private int identificador;
    private static int contadorGlobal = 0;
    
    private Funcionario () {
        Funcionario.contadorGlobal++;
        this.identificador = Funcionario.contadorGlobal;
        this.nome = this.departamento = this.rg = "";
        this.dataDeEntrada = new Data();
    }
    
    public Funcionario (String nome) {
        this();
        this.nome = nome;
    }
    
    public Funcionario (double salario) {
        this();
        this.salario = salario;
    }
    
    public Funcionario (String nome, double salario) {
        this(nome);
        this.salario = salario;
    }
    
    
    /**
     * Imprime valores no console da aplicação
     *
     * @deprecated use {@link toString()} instead.  
     */
    
    @Deprecated
    public String mostra() {
        return  "Matrícula: " + this.identificador +
                "\nNome: " + this.nome +
                "\nDepartamento: " + this.departamento +
                "\nData de Entrada: " + this.dataDeEntrada.formatada() +
                "\nRG: " + this.rg +
                "\nSalário: " + this.salario;
    }   
    

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Matrícula: " + this.identificador)
           .append("\nNome: " + this.nome)
           .append("\nDepartamento: " + this.departamento)
           .append("\nData de Entrada: " + this.dataDeEntrada)
           .append("\nRG: " + this.rg)
           .append("\nSalário: " + this.salario);
        
        return str.toString();
    }
    
    // Getters e Setters
    public void setAumento(double valor) {
        this.salario += valor;
    }

    public double getGanhoAnual() {
        return this.salario * 12;
    }
    
    public int getIdentificador () {
        return this.identificador;
    }
    public String getNome () {
        return this.nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getDepartamento () {
        return this.departamento;
    }
    
    public void setDepartamento (String departamento) {
        this.departamento = departamento;
    }
    
    public String getRG () {
        return this.rg;
    }
    
    public void setRG (String rg) {
        this.rg = rg;
    }
    
    // Salario deve ser inicializado na Allocação
    // Mas e se Toinha do RH errar o salário do cara, como ela faz a correção?
    // Remover esses obriga a criação de um outro objeto e copia dos valores 
    public void setSalario (double salario) {
        this.salario = salario;
    }
    
    public double getSalario () {
        return this.salario;
    }
    
    public Data getDataDeEntrada() {
        return this.dataDeEntrada;
    }
    
    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
}
