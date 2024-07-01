import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        while (true) {
            System.out.println("Digite um nome (ou 'sair' para terminar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo (M/F):");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                femininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
            }
        }

        System.out.println("Grupo Masculino(M):");
        for (String nome : masculinos) {
            System.out.println(nome);
        }

        System.out.println("Grupo Feminino(F):");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
