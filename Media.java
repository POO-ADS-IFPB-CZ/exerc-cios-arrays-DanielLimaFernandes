import java.util.Scanner;

public class Media{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100]; // array para armazenar os números
        int contador = 0;
        int soma = 0;

        System.out.println("Digite números inteiros maiores ou iguais a zero. Digite um número negativo para parar.");

        // Loop para solicitar números ao usuário
        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Verificar se o número é negativo para encerrar o loop
            if (numero < 0) {
                break;
            }

            // Adicionar o número ao array e atualizar o contador e a soma
            numeros[contador] = numero;
            soma += numero;
            contador++;
        }

        // Verificar se foram digitados números válidos
        if (contador > 0) {
            // Calcular a média dos números
            double media = (double) soma / contador;

            // Exibir a quantidade de números digitados e a média
            System.out.println("Quantidade de números digitados: " + contador);
            System.out.println("Média dos números digitados: " + media);
        } else {
            // Se nenhum número válido foi digitado
            System.out.println("Nenhum número válido foi digitado.");
        }

        scanner.close();
    }
}
