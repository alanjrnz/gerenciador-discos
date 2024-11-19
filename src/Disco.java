import java.util.ArrayList;
import java.util.List;
public class Disco {
    private String titulo;

    private String faixas;
    private int ano;
    private List<Artista> artistas;

    public Disco(String titulo,String faixas, int ano) {
        this.titulo = titulo;
        this.faixas = faixas;
        this.ano = ano;
        this.artistas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getFaixas() {
        return faixas;
    }

    public void setFaixas(String faixas) {
        this.faixas = faixas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public String toString() {
        String artistasStr = "Sem artistas associados.";


        if (!artistas.isEmpty()) {
            artistasStr = "Artistas: ";
            for (Artista artista : artistas) {
                artistasStr += artista.getNome() + ", ";
            }
            // Remove a última vírgula e espaço extra
            artistasStr = artistasStr.substring(0, artistasStr.length() - 2);
        }

        return "********************"+
                "\nTítulo: " + titulo + "\n" +
                "Faixas: " + faixas + "\n" +
                "Ano: " + ano + "\n" +
                artistasStr + "\n" +
                "********************";
    }




}
