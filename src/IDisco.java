import java.util.List;

public interface IDisco {
    void adicionarDisco(Disco disco);
    void removerDisco(String disco);
    void listarTodos();
    void editarDisco(int discoIndex);
}
