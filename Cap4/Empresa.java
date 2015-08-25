public class Empresa {
    String nome,
           cnpj;
    Funcionario [] empregados;
    
    boolean adiciona(Funcionario f_) {
        for(int i = 0; i < empregados.length; i++) {
            if (empregados[i] == null) {
                empregados[i] = f_;
                return true;
            }
        }
        return false;
    }
    
    String mostraEmpregados(){
        StringBuilder str = new StringBuilder();
        for(Funcionario f : this.empregados){
            if (f != null) {
                str.append("Nome: " + f.nome + "(" + f.salario + ")")
                   .append("\n"); 
            }
        }
        
        return str.toString();
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
