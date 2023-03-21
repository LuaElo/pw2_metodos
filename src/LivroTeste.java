public class LivroTeste {

    public static void main(String[] args) {

       Livro meuLivro =  new Livro();
       meuLivro.nome = "O Hobbit";
       meuLivro.preco = 50.99;
       meuLivro.paginas = 521;
       meuLivro.resumo = "bla bla bla bla bla";
       meuLivro.autor = "Eloah";

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro();
        livroFavorito.nome = "Escola do bem e do mau";
        livroFavorito.resumo = "tem uma escola do bem e a outra do mau";
        livroFavorito.paginas = 345;
        livroFavorito.preco = 45.00;
        livroFavorito.autor = "Luara";

        livroFavorito.exibirDados();




    }
}
