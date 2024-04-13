public class Fibonacci {
    public static void main(String[] args) {
        int n = 30; // Número de elementos da série Fibonacci a serem calculados
        int[] fibonacci = new int[n];
        
        // Os dois primeiros elementos são sempre 1
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Calcular os elementos da série Fibonacci
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir os trinta primeiros elementos da série Fibonacci
        System.out.println("Os trinta primeiros elementos da série de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
