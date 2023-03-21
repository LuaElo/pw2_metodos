public class Livro {

    String nome;
    String resumo;
    double preco;
    int paginas;
    String autor;

    void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Resumo: " + resumo);
        System.out.println("Numero de Paginas: " + paginas);
        System.out.println("Nome do autor(a): " + autor);
        System.out.println("-------");
    }
}
 