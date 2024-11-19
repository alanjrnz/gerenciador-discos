//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GerenciarDisco estoque = new GerenciarDisco();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("0- Sair");
            System.out.println("1-Criar um novo disco.");
            System.out.println("2- Adicionar um artista");
            System.out.println("3- Exibir lista de discos.");
            System.out.println("");
            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o Titulo");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o Artista");
                    String artista = scanner.nextLine();
                    System.out.println("Digite o Ano");
                    int ano = scanner.nextInt();
                    System.out.println("Digite o Faixas");
                    String faixas = scanner.next();
                    Disco disco = new Disco(titulo,artista,faixas,ano);
                    estoque.adicionarDisco(disco);
                    break;
                case 2:
                    System.out.println("Digite o nome do Artista");
                    String nomeArt = scanner.nextLine();
                    System.out.println("Digite o genero do artista:");
                    String genero = scanner.nextLine();
                    Artista artistaf = new Artista(nomeArt,genero);
                    System.out.println(artistaf);





                    break;
                case 3:
                    estoque.listarTodos();
                    break;
            }


        }while (escolha !=0);
    }
}