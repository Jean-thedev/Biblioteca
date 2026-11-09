public class Livro {
    private String autor;
    private String titulo;
    private int quantidadePaginas;
    private boolean disponivel = true;

    public Livro(String autor, String titulo, int quantidadePaginas){
        this.autor = autor;
        this.titulo = titulo;
        this.quantidadePaginas = quantidadePaginas;
        this.disponivel = true;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    

    






}
