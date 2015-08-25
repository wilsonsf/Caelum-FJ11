public class Empresa {
    String nome,
           cnpj;
    Funcionario [] empregados;
    
    boolean adiciona(Funcionario f_) {
        for(int i = 0; i < this.empregados.length; i++) {
            if (this.empregados[i] == null) {
                this.empregados[i] = f_;
                return true;
            }
        }
        return false;
    }
    
    String mostraEmpregados(){
        StringBuilder str = new StringBuilder();
        for(Funcionario f : this.empregados){
            if (f != null) {
                str.append(f.mostra())
                   .append("\n"); 
            }
        }
        
        return str.toString();
    }
    
    boolean contem(Funcionario f) {
        for (Funcionario fEmpregado : this.empregados) {
            if (fEmpregado != null && fEmpregado.nome.compareTo(f.nome) == 0) {
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
                str.append("\n------------------");
            }
        }
        
        return str.toString();
    }
}
