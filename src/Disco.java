public class Disco {
    private String titulo;
    private String artista;
    private String faixas;
    private int ano;


    public Disco(String titulo, String artista, String faixas, int ano) {
        this.titulo = titulo;
        this.artista = artista;
        this.faixas = faixas;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
}
