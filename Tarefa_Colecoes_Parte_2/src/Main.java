import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> masc = new ArrayList<>();
        List<String> fem = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Informe o sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            if (sexo == 'M') {
                masc.add(nome);
            } else if (sexo == 'F') {
                fem.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' ou 'F'.");
                i--; // Permite que o usuário tente novamente
                continue;
            }
        }

        System.out.println("Lista masculina");
        System.out.println(masc);

        System.out.println("Lista feminina");
        System.out.println(fem);
    }
}
