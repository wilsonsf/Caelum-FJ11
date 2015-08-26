public class PessoaFisica {
    private String cpf;

    private PessoaFisica(String cpf) {
        if (valida(cpf))
            this.cpf = cpf;
        // else 
        //     throw Exception
    }
    
    public boolean valida(String cpf) {
        //Varios testes
        return true;
        // else
        // return false;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    public void setCPF(String cpf) {
        if (valida(cpf))
            this.cpf = cpf;
    }
}
