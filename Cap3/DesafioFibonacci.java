class DesafioFibonacci {
    public static void main(String[] args) {
        
        int anterior = 0, atual = 1;
        System.out.print("Série de Fibonacci:\n" + anterior);
        
        do {
            System.out.print(", " + atual);
            atual = atual + anterior;
            anterior = atual-anterior;
        } while (atual <= 100);
        
        System.out.println();
    }
}
