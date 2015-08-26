public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario [] empregados;
    
    private Empresa() {
        this.nome = this.cnpj = "";
    }
    
    public Empresa(int n) {
        this();
        this.empregados = new Funcionario[n];
    }
    
    public String mostraEmpregados(){
        StringBuilder str = new StringBuilder();
        for(Funcionario f : this.empregados){
            if (f != null) {
                str.append(f.mostra())
                   .append("\n"); 
            }
        }
        
        return str.toString();
    }
    
    public boolean contem(Funcionario funcionario) {
        for (Funcionario empregado : this.empregados) {
            if (empregado != null && 
                empregado.getNome().compareTo(funcionario.getNome()) == 0) {
                return true;
            }   
        }
        return false;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Empresa: " + this.nome)
           .append("\nCNPJ: " + this.cnpj)
           .append("\n\nLista de Funcionários:");
        
        for(Funcionario f : this.empregados) {
            if (f != null) {
                str.append(f);
                str.append("\n------------------\n");
            }
        }
        
        return str.toString();
    }
    
    // Getters & Setters
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCNPJ() {
        return this.cnpj;
    }
    
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Funcionario[] getEmpregados() {
        return this.empregados;
    }
    
    public Funcionario getEmpregado(int posicao) {
        return this.empregados[posicao];
    }
    
    public boolean setEmpregado(Funcionario f) {
        for(int i = 0; i < this.empregados.length; i++) {
            if (this.empregados[i] == null) {
                this.empregados[i] = f;
                return true;
            }
        }
        return false;
    }
    public boolean setEmpregado(Funcionario funcionario, int posicao) {
        if (posicao >= 0 && posicao < this.empregados.length) {
            this.empregados[posicao] = funcionario;
            return true;
        }
        else {
            return false;
        }
    }
}
