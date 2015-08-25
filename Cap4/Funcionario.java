class Funcionario {
    String  nome,
            departamento,
            dataDeEntrada,
            rg;
    double  salario;
    
    void recebeAumento(double valor) {
        this.salario += valor;
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }
}
