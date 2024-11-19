import java.util.ArrayList;
import java.util.List;

public class GerenciarDisco implements IDisco{
    private List<Disco> discos;

    public GerenciarDisco(){
        this.discos = new ArrayList<>();
    }



    @Override
    public void adicionarDisco(Disco disco) {
    discos.add(disco);
    }

    @Override
    public void removerDisco(String disco) {
    discos.remove(disco);
    }

    @Override
    public void listarTodos() {

        for (Disco disco : discos) {
            System.out.println("Titulo: " + disco.getTitulo() + " | Nome Artista: " + disco.getArtista() + " | Faixas:"+ disco.getFaixas() + " | Lançado em "+ disco.getAno() );

        }

    }
}
