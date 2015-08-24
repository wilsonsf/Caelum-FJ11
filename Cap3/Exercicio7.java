import java.util.Scanner;

class Exercicio7 {
    public static void main (String [] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        x = in.nextInt();
        while (x != 1) {
            if (x % 2 == 0)
                x /= 2;
            else 
                x = 3*x+1;
            
            System.out.print(x + " -> ");
        }
        System.out.println(x);
    }
}
