public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Pedro");
        Livro l2 = new Livro("Banana");

        Livro[] livro = {l1, l2};


        l1.verificaLivro(livro, "Banana");




    }
}