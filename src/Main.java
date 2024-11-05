//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciarDisco estoque = new GerenciarDisco();
        Disco album = new Disco("Morte do Slim Shady","Eminem","Rap",2021);
        Disco discoMM = new Disco("Mamonas Assasinas", "Banda Mamonas Assassinas","Heavy metal, baião e música brega romântica",1995 );

        estoque.adicionarDisco(album);
        estoque.adicionarDisco(discoMM);
        estoque.listarTodos();




    }
}