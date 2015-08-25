class Fibonacci {
    int calculaFibonacci(int i) {
        if (i == 0)
            return 0;
        else if (i == 1) 
            return 1;
        else
            return this.calculaFibonacci(i-1) + this.calculaFibonacci(i-2);
    }
}

class TestaFibonacci {
    public static void main (String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.print(resultado + " ");
        }
        System.out.println();
    }
}
