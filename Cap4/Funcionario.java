class Funcionario extends Object {
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
    
    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de Entrada: " + this.dataDeEntrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Salário: " + this.salario);
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
