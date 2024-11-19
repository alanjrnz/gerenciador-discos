//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;
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
            System.out.println("2- Adicionar um artista.");
            System.out.println("3- Exibir lista de discos.");
            System.out.println("4-Editar Discos.");

            escolha = scanner.nextInt();
            scanner.nextLine();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o Titulo:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o Ano:");
                    int ano = scanner.nextInt();
                    System.out.println("Digite o Faixas:");
                    String faixas = scanner.next();
                    Disco disco = new Disco(titulo,faixas,ano);
                    estoque.adicionarDisco(disco);
                    break;
                case 2:
                    System.out.println("Digite o nome do Artista:");
                    String nomeArt = scanner.nextLine();
                    System.out.println("Digite o genero do artista:");
                    String genero = scanner.nextLine();
                    Artista artistaf = new Artista(nomeArt,genero);
                    System.out.println("Escolha um disco para associar o artista:");
                    List<Disco> discos = estoque.getDiscos();
                    for (int i = 0; i < discos.size(); i++) {
                        System.out.println((i + 1) + " - " + discos.get(i).getTitulo());
                    }
                    int escolhaDisco = scanner.nextInt();
                    scanner.nextLine();

                    if (escolhaDisco > 0 && escolhaDisco <= discos.size()) {
                        Disco discoSelecionado = discos.get(escolhaDisco - 1);
                        discoSelecionado.adicionarArtista(artistaf);
                        System.out.println("Artista \"" + artistaf.getNome() + "\" foi associado ao disco \"" + discoSelecionado.getTitulo() + "\" com sucesso!");
                    } else {
                        System.out.println("Disco inválido.");
                    }
                    break;
                case 3:
                    estoque.listarTodos();
                    break;
                case 4:
                    System.out.println("Escolha o disco para editar(numero da posição):");
                    discos = estoque.getDiscos();
                    if (discos.isEmpty()) {
                        System.out.println("Nenhum disco cadastrado.");
                    } else {
                        for (int i = 0; i < discos.size(); i++) {
                            System.out.println((i + 1) + " - " + discos.get(i).getTitulo());
                        }
                    int discoEscolhido = scanner.nextInt() - 1;
                    estoque.editarDisco(discoEscolhido);
                    break;

            }


        }
    }while (escolha !=0);
}}