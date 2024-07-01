import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nomes separados por espaço:");
        String input = scanner.nextLine();

        String[] nomesArray = input.split(" ");
        List<String> nomesList = new ArrayList<>();

        // Adiciona nomes à lista
        Collections.addAll(nomesList, nomesArray);

        // Ordena a lista de nomes
        Collections.sort(nomesList);

        // Imprime os nomes ordenados
        System.out.println("Nomes ordenados:");
        for (String nome : nomesList) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
