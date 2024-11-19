import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarDisco implements IDisco{
    private List<Disco> discos;

    public GerenciarDisco(){
        this.discos = new ArrayList<>();
    }

    @Override
    public void adicionarDisco(Disco disco) {
    discos.add(disco);
    }
    public List<Disco> getDiscos() {
        return discos;
    }
    @Override
    public void removerDisco(String disco) {
    discos.remove(disco);
    }

    @Override
    public void listarTodos() {

        for (Disco disco : discos) {
          System.out.println(disco);

        }
    }
    public void editarDisco(int discoIndex) {
        if (discoIndex < 0 || discoIndex >= discos.size()) {
            System.out.println("Disco não encontrado.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Disco disco = discos.get(discoIndex);

        System.out.println("O que você deseja editar?");
        System.out.println("1- Título");
        System.out.println("2- Faixas");
        System.out.println("3- Ano");

        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n

        switch (escolha) {
            case 1:
                System.out.println("Digite o novo título:");
                String novoTitulo = scanner.nextLine();
                disco.setTitulo(novoTitulo);
                break;
            case 2:
                System.out.println("Digite as novas faixas:");
                String novasFaixas = scanner.nextLine();
                disco.setFaixas(novasFaixas);
                break;
            case 3:
                System.out.println("Digite o novo ano:");
                int novoAno = scanner.nextInt();
                disco.setAno(novoAno);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Disco atualizado: " + disco);
    }




}




