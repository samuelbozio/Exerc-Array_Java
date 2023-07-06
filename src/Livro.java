public class Livro {

    private String nome;

    public Livro(String nome) {
        this.nome = nome;

    }


    public void verificaLivro(Livro[] livros, String nome) {

        for (Livro livro : livros) {

            if (livro != null && (livro.getNome().equals(nome)))
                System.out.println(getNome());
            else System.out.println("Não encontrado.");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
