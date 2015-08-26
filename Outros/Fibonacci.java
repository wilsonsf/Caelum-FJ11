class Fibonacci {
    int calculaFibonacci(int i) {
        return ( i == 0 ? 0 : ( i == 1) ? 1 : this.calculaFibonacci(i-1) + this.calculaFibonacci(i-2) );
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


//             6
//           /   \ 
//        5       4 (...)
//      /   \
//     4       3
//    / \     / \
//   3   2   2   1
//  / \ / \ / \
//  2 1 1 0 1 0  
// / \
// 1 0 
