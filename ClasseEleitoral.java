import java.util.Scanner;

public class ClasseEleitoral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        int[] idades = new int[numPessoas];

        // Obter as idades das pessoas
        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        // Verificar classe eleitoral para cada pessoa
        for (int i = 0; i < numPessoas; i++) {
            int idade = idades[i];
            String classeEleitoral;

            if (idade < 16) {
                classeEleitoral = "Não pode votar";
            } else if ((idade == 16 || idade == 17) || idade > 65) {
                classeEleitoral = "Voto facultativo";
            } else {
                classeEleitoral = "Voto obrigatório";
            }

            System.out.println("Para a pessoa " + (i + 1) + ", " + classeEleitoral);
        }

        scanner.close();
    }
}