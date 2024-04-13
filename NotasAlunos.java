import java.util.Scanner;

public class NotasAlunos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 10;
        double[] notas = new double[numAlunos];
        
        // Obter as notas dos alunos
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular a média das notas
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / numAlunos;
        System.out.println("A média das notas é: " + media);

        // Contar a quantidade de notas acima e abaixo da média
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            } else if (nota < media) {
                abaixoDaMedia++;
            }
        }

        System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de notas abaixo da média: " + abaixoDaMedia);

        scanner.close();
    }
}
