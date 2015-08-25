public class Empresa {
    String nome,
           cnpj;
    Funcionario [] funcionarios;
    
    void adiciona(Funcionario f_) {
        for(Funcionario f : this.funcionarios) {
            if (f == null) {
                f = f_;
                break;
            }
        }
    }
}
